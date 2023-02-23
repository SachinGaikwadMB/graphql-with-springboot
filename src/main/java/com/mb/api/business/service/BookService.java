package com.mb.api.business.service;

import java.util.List;
import com.mb.api.persistance.entity.Book;
import com.mb.api.web.model.BookModel;

public interface BookService
{
	Book createBook(BookModel bookModel);
	
	Book getBook(Integer id);
	
	List<Book> getBooks();

}
