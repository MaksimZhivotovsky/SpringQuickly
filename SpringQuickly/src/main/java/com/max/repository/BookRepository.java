package com.max.repository;

import java.math.BigDecimal;

import org.springframework.data.jdbc.repository.query.Modifying;
import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.max.model.Book;


@Repository
public interface BookRepository extends CrudRepository<Book, Long> {
//	@Query("SELECT * FROM books WHERE name = :name")
//	List<Book> findBookByName(String name);
	
	@Modifying
	@Query("UPDATE book SET pages = :pages WHERE id = :id")
	void changePages(long id, BigDecimal pages);
}

