package com.elibrary.daos;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import com.elibrary.models.BookModel;

/*Utkarsh
 * 
 * Implementation of BookDAO interface
 * */
@Service
public class BookDaoImpl implements BookDao{
	
	@Autowired
	private JdbcTemplate jdbcTemplate;             // jdbcTemplate Object to perform database query operations
	
	/*
	 *Method Implementation to add Book Object Information in database 
	 * */
	public int Add(BookModel book) {
		String QUERY= "insert into books(isbn,title,author,publisher,qty) values(?,?,?,?,?)";
		Object param[]= {book.getIsbn(),book.getTitle(),book.getAuthor(),book.getPublisher(),book.getQty()};
		return jdbcTemplate.update(QUERY,param);
	}
	
	/*
	 *Method implementation to find all books in database 
	 * */
	public List<BookModel> findALL() {
		String QUERY = "select * from books";
		return jdbcTemplate.query(QUERY, new BeanPropertyRowMapper<BookModel>(BookModel.class));
	}
	
	/*
	 * Method Implementation to find book by title in database
	 * */
	public BookModel findByTitle(String title) {
		String QUERY = "select * from books where title=?";
		Object param[]= {title};
		try {
		return jdbcTemplate.queryForObject(QUERY,param, new BeanPropertyRowMapper<BookModel>(BookModel.class));
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
	/*
	 * Method Implementation to remove a book match by id from database
	 * */
	public int remove(int id) {
		String QUERY = "delete from books where id=?";
		Object param[]= {id};
		return jdbcTemplate.update(QUERY,param);
	}

	

}
