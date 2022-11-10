package com.max.model;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class BookRowMapper implements RowMapper<Book> {

	@Override
	public Book mapRow(ResultSet rs, int rowNum) throws SQLException {
		Book book = new Book();
		book.setId(rs.getLong("id"));
		book.setName(rs.getString("name"));
		book.setAuthor(rs.getString("author"));
		book.setPages(rs.getBigDecimal("pages"));
		return book;
	}

}
