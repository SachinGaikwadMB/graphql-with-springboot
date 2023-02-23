package com.mb.api.web.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;
import com.mb.api.business.service.BookService;
import com.mb.api.persistance.entity.Book;
import com.mb.api.web.model.BookModel;

//@RestController
//@RequestMapping("/api/v1/books")

@Controller
public class BookController
{
	@Autowired
	private BookService bookService;
	
	
//	@PostMapping
	@MutationMapping("createBook")
	public Book createBook(@Argument BookModel bookModel) {	
		return bookService.createBook(bookModel);	
	}
	
	//@GetMapping
	@QueryMapping("getBooks")
	public List<Book> getAllBooks() {
		return bookService.getBooks();
	}
	
//	@GetMapping("/{bookId}")
	@QueryMapping("getBook")
	public Book getBook(@Argument Integer bookId) {
		return bookService.getBook(bookId);
	}
}
