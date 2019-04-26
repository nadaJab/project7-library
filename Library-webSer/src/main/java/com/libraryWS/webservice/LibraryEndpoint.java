package com.libraryWS.webservice;

import com.library.library_ws.BookDetailsRequest;
import com.library.library_ws.BookDetailsResponse;
import com.library.library_ws.BookInfo;
import com.library.library_ws.BookTypeInfo;
import com.library.library_ws.GetAllBookRequest;
import com.library.library_ws.GetAllBookResponse;
import com.libraryWS.entity.Book;
import com.libraryWS.service.BookManager;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import javax.inject.Inject;
import javax.inject.Named;

import java.util.ArrayList;
import java.util.List;


@Endpoint 
public class LibraryEndpoint{

	public static final String NAMESPACE_URI = "http://www.library.com/library-ws";

	@Autowired
	@Qualifier("bookManager")
	private BookManager bookManager;

	//private libraryRepository libraryRepository;

	static final Logger logger = LogManager.getLogger();


	@PayloadRoot(namespace = NAMESPACE_URI, localPart = "bookDetailsRequest")
	@ResponsePayload
	public BookDetailsResponse getBookInfo(@RequestPayload BookDetailsRequest request) {
		BookDetailsResponse response = new BookDetailsResponse();
		Book bookEntity = new Book();
		
		bookEntity =  bookManager.getBookByTitle(request.getName());
		System.out.println(bookEntity.toString() + "!!!!");

		BookInfo bookInfo = new BookInfo();
		BeanUtils.copyProperties(bookEntity, bookInfo);
		bookInfo.setBookType(BookTypeInfo.valueOf(bookEntity.getBookType()));
		
		response.setBook(bookInfo);


		/*
       // test with datainit
        BookDetailsResponse response = new BookDetailsResponse();
        response.setBook(libraryRepository.findBook(request.getName())); */

		return response;
	}


	@PayloadRoot(namespace = NAMESPACE_URI, localPart = "getAllBookRequest")
	@ResponsePayload
	public GetAllBookResponse getAllBook(@RequestPayload GetAllBookRequest request) {

		GetAllBookResponse response = new GetAllBookResponse();

		List<BookInfo> bookInfoList = new ArrayList<BookInfo>();
		List<Book> bookEntityList = new ArrayList<Book>();

		bookEntityList = bookManager.getAllBook(); 

		for (Book entity : bookEntityList) {
			System.out.println(entity.toString() + "@@@@@@");
			
			BookInfo bookInfo = new BookInfo();
			
			BeanUtils.copyProperties(entity, bookInfo);
			bookInfo.setBookType(BookTypeInfo.valueOf(entity.getBookType()));
			bookInfoList.add(bookInfo);
		}
		response.getBooks().addAll(bookInfoList); 

		return response;
	}


	public BookManager getBookManager() {
		return bookManager;
	}

	public void setBookManager(BookManager bookManager) {
		this.bookManager = bookManager;
	}


}
