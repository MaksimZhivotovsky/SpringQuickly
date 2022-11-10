package com.max.repository;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.max.model.Book;
import com.max.model.BookRowMapper;

import lombok.RequiredArgsConstructor;

@Repository
@RequiredArgsConstructor
public class BookRepository {

	private final JdbcTemplate jdbcTemplate;
	
	public void storeBook(Book book) {
		String sql = "INSERT INTO booksss VALUES (?, ?, ?, ?)";
		
		jdbcTemplate.update(sql,
				book.getId(),
				book.getName(),
				book.getAuthor(),
				book.getPages());
		
	}
	
	public List<Book> findAllBooks() {
		String sql = "SELECT * FROM booksss";
		
		RowMapper<Book> bookMapper = (b, i) -> {
			Book rowObject = new Book();
			rowObject.setId(b.getInt("id"));
			rowObject.setName(b.getString("name"));
			rowObject.setAuthor(b.getString("author"));
			rowObject.setPages(b.getBigDecimal("pages"));
			return rowObject;
 		};
		return jdbcTemplate.query(sql, bookMapper);
	}
	
	public Book findBookById(long id) {
		String sql = "SELECT * FROM booksss WHERE id = ?";
		return jdbcTemplate.queryForObject(sql, new BookRowMapper(), id);
	}
	
	public void changePages(long id, BigDecimal pages) {
		String sql = "UPDATE booksss SET pages = ? WHERE id = ?";
		jdbcTemplate.update(sql, pages, id);
	}
}

