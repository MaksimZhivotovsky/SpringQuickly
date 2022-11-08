package com.max.repository;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.max.model.Book;

import lombok.RequiredArgsConstructor;

@Repository
@RequiredArgsConstructor
public class BookRepository {

	private final JdbcTemplate jdbcTemplate;
	
	public void storeBook(Book book) {
		String sql = "INSERT INTO bookss VALUES (?, ?, ?)";
		
		jdbcTemplate.update(sql,
				book.getId(),
				book.getName(),
				book.getAuthor());
		
	}
	
	public List<Book> findAllBooks() {
		String sql = "SELECT * FROM bookss";
		
		RowMapper<Book> bookMapper = (b, i) -> {
			Book rowObject = new Book();
			rowObject.setId(b.getInt("id"));
			rowObject.setName(b.getString("name"));
			rowObject.setAuthor(b.getString("author"));
			return rowObject;
 		};
		return jdbcTemplate.query(sql, bookMapper);
	}
}

