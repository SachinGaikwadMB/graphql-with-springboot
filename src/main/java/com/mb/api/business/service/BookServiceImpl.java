package com.mb.api.business.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.mb.api.persistance.entity.Book;
import com.mb.api.persistance.repository.BookRepository;
import com.mb.api.web.model.BookModel;

@Service
public class BookServiceImpl implements BookService
{
	@Autowired
	private BookRepository bookRepository;

	@Override
	public Book createBook(BookModel bookModel)
	{
		Book book = new Book();
		book.setTitle(bookModel.getTitle());
		book.setDescription(bookModel.getDescription());
		book.setAuthor(bookModel.getAuthor());
		book.setPublication(bookModel.getPublication());
		book.setPages(bookModel.getPages());
		book.setPrice(bookModel.getPrice());
		
		bookRepository.save(book);
		
		return bookRepository.save(book);
	}

	@Override
	public Book getBook(Integer id)
	{
		return bookRepository.findById(id).orElseThrow(() -> new RuntimeException("Not found!!"));
	}

	@Override
	public List<Book> getBooks()
	{
		return  bookRepository.findAll();
	}

}
