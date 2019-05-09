package com.libraryWS.webservice;

import com.library.library_ws.AddBorrowingBookRequest;
import com.library.library_ws.AddBorrowingBookResponse;
import com.library.library_ws.AddUserRequest;
import com.library.library_ws.AddUserResponse;
import com.library.library_ws.BookInfo;
import com.library.library_ws.BookTypeInfo;
import com.library.library_ws.BorrowingBookInfo;
import com.library.library_ws.ExtendBookRequest;
import com.library.library_ws.ExtendBookResponse;

import com.library.library_ws.GetAllBookRequest;
import com.library.library_ws.GetAllBookResponse;
import com.library.library_ws.GetBookByAuthorNameRequest;
import com.library.library_ws.GetBookByAuthorNameResponse;
import com.library.library_ws.GetBookByTitleAndAuthorNameRequest;
import com.library.library_ws.GetBookByTitleAndAuthorNameResponse;
import com.library.library_ws.GetBookByTitleRequest;
import com.library.library_ws.GetBookByTitleResponse;
import com.library.library_ws.LoginRequest;
import com.library.library_ws.LoginResponse;
import com.library.library_ws.ReturnBookRequest;
import com.library.library_ws.ReturnBookResponse;
import com.library.library_ws.ServiceStatus;
import com.library.library_ws.UserInfo;
import com.libraryWS.entity.Book;
import com.libraryWS.entity.BorrowingBook;
import com.libraryWS.entity.User;
import com.libraryWS.service.book.BookManager;
import com.libraryWS.service.borrowingBook.BorrowingBookManager;
import com.libraryWS.service.user.UserManager;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;


@Endpoint 
public class LibraryEndpoint{

	public static final String NAMESPACE_URI = "http://www.library.com/library-ws";

	@Autowired
	@Qualifier("bookManager")
	private BookManager bookManager;

	@Autowired
	@Qualifier("userManager")
	private UserManager userManager;
	
	@Autowired
	@Qualifier("borrowingBookManager")
	private BorrowingBookManager borrowingBookManager;
	
	static final Logger logger = LogManager.getLogger();
	

	/**
	 * method get book by title
	 * @param request
	 * @return
	 */
	@PayloadRoot(namespace = NAMESPACE_URI, localPart = "getBookByTitleRequest")
	@ResponsePayload
	public GetBookByTitleResponse getBookInfo(@RequestPayload GetBookByTitleRequest request) {
		GetBookByTitleResponse response = new GetBookByTitleResponse();
		Book bookEntity = new Book();

		bookEntity =  bookManager.getBookByTitle(request.getName());
		System.out.println(bookEntity.toString() + "!!!!");

		BookInfo bookInfo = new BookInfo();
		BeanUtils.copyProperties(bookEntity, bookInfo);
		bookInfo.setBookType(BookTypeInfo.valueOf(bookEntity.getBookType()));

		response.setBook(bookInfo);

		return response;
		/*
       // test with datainit
        BookDetailsResponse response = new BookDetailsResponse();
        response.setBook(libraryRepository.findBook(request.getName())); */


	}

	/**
	 * method get book by author name
	 * @param request
	 * @return
	 */
	@PayloadRoot(namespace = NAMESPACE_URI, localPart = "getBookByAuthorNameRequest")
	@ResponsePayload
	public GetBookByAuthorNameResponse getBookByAuthorName(@RequestPayload GetBookByAuthorNameRequest request) {

		GetBookByAuthorNameResponse response = new GetBookByAuthorNameResponse();
		List<BookInfo> bookInfoList = new ArrayList<BookInfo>();
		List<Book> bookEntityList = new ArrayList<Book>();

		bookEntityList = bookManager.getBookByAuthorName(request.getAuthorName());

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

	/**
	 * method get book by title and author name
	 * @param request
	 * @return
	 */
	@PayloadRoot(namespace = NAMESPACE_URI, localPart = "getBookByTitleAndAuthorNameRequest")
	@ResponsePayload
	public GetBookByTitleAndAuthorNameResponse getBookByAuthorName(@RequestPayload GetBookByTitleAndAuthorNameRequest request) {

		GetBookByTitleAndAuthorNameResponse response = new GetBookByTitleAndAuthorNameResponse();
		List<BookInfo> bookInfoList = new ArrayList<BookInfo>();
		List<Book> bookEntityList = new ArrayList<Book>();

		bookEntityList = bookManager.getBookByTitleAndAuthorName(request.getTitle(), request.getAuthorName());

		for (Book entity : bookEntityList) {

			BookInfo bookInfo = new BookInfo();

			BeanUtils.copyProperties(entity, bookInfo);
			bookInfo.setBookType(BookTypeInfo.valueOf(entity.getBookType()));
			bookInfoList.add(bookInfo);
		}
		response.getBooks().addAll(bookInfoList); 

		return response;
	}

	/**
	 * method get all book list
	 * @param request
	 * @return
	 */
	@PayloadRoot(namespace = NAMESPACE_URI, localPart = "getAllBookRequest")
	@ResponsePayload
	public GetAllBookResponse getAllBook(@RequestPayload GetAllBookRequest request) {

		GetAllBookResponse response = new GetAllBookResponse();

		List<BookInfo> bookInfoList = new ArrayList<BookInfo>();
		List<Book> bookEntityList = new ArrayList<Book>();

		bookEntityList = bookManager.getAllBook(); 

		for (Book entity : bookEntityList) {

			BookInfo bookInfo = new BookInfo();

			BeanUtils.copyProperties(entity, bookInfo);
			bookInfo.setBookType(BookTypeInfo.valueOf(entity.getBookType()));
			bookInfoList.add(bookInfo);
		}
		response.getBooks().addAll(bookInfoList); 

		return response;
	}

	/**
	 * method add a new user
	 * @param request
	 * @return
	 */
	@PayloadRoot(namespace = NAMESPACE_URI, localPart = "addUserRequest")
	@ResponsePayload
	public AddUserResponse addUser(@RequestPayload AddUserRequest request) {

		AddUserResponse response = new AddUserResponse();

		UserInfo newUserInfo = new UserInfo();

		User newUserEntity = new User(request.getFirstName(), request.getLastName(), request.getEmail(), request.getPassword());
		User savedUserEntity = userManager.addUser(newUserEntity);

		if(savedUserEntity == null) {
			response.setServiceStatus(ServiceStatus.CONFLICT);
		}
		else {
			BeanUtils.copyProperties(savedUserEntity, newUserInfo);
			response.setServiceStatus(ServiceStatus.SUCCESS);

		}
		response.setUser(newUserInfo);

		return response;
	}

	/**
	 * method for borrowing book by the personal of the library
	 * @param request
	 * @return
	 */
	@PayloadRoot(namespace = NAMESPACE_URI, localPart = "addBorrowingBookRequest")
	@ResponsePayload
	public AddBorrowingBookResponse addBorrowingBook(@RequestPayload AddBorrowingBookRequest request) {
		
		AddBorrowingBookResponse response = new AddBorrowingBookResponse();
		
		Book book = bookManager.getBookById(request.getIdBook());
		User user = userManager.getUserByLastNameAndEmail(request.getUserLastName(), request.getEmail());
		
		if(book == null && user == null) {
			
			response.setServiceStatus(ServiceStatus.CONFLICT);
			response.setIdBorrowingBook(0);
		}
		else {
		BorrowingBook borrowingBookEntity = borrowingBookManager.saveBorrowing(new BorrowingBook(user, book));
		
		borrowingBookEntity = borrowingBookManager.getByUserAndBook(user, book);
		
		BorrowingBookInfo borrowingBookInfo = new BorrowingBookInfo(); 
		
		BeanUtils.copyProperties(borrowingBookEntity, borrowingBookInfo);
		
		/*
		BookInfo bookInfo = new BookInfo();
		BeanUtils.copyProperties(book, bookInfo);
		borrowingBookInfo.setBook(bookInfo);
		
		UserInfo userInfo = new UserInfo();
		BeanUtils.copyProperties(user, userInfo);
		borrowingBookInfo.setUser(userInfo); */
		
		
		response.setIdBorrowingBook(borrowingBookInfo.getIdBorrowingBook());
		response.setServiceStatus(ServiceStatus.SUCCESS);
		}
		
		return response;	
	}
	
	/**
	 * method to get an extention borrowing book
	 * @param request
	 * @return
	 */
	@PayloadRoot(namespace = NAMESPACE_URI, localPart = "ExtendBookRequest")
	@ResponsePayload
	public ExtendBookResponse getExtendBook(@RequestPayload ExtendBookRequest request) {	
		ExtendBookResponse response = new ExtendBookResponse();
		
		BorrowingBook borrowingBookEntity = borrowingBookManager.getBorrowingBookById(request.getIdBorrowingBook());
		if(borrowingBookEntity.isExtension() == false) {
			//update borrowingBook
			borrowingBookEntity.setExtension(true); //borrowingBookManager
			borrowingBookManager.saveBorrowing(borrowingBookEntity);
			response.setServiceStatus(ServiceStatus.SUCCESS_EXTEND);
		}
		else {
			response.setServiceStatus(ServiceStatus.NONE_EXTEND);
		}
		
		return response;	
	}
	
	@PayloadRoot(namespace = NAMESPACE_URI, localPart = "returnBookRequest")
	@ResponsePayload
	public ReturnBookResponse returnBook(@RequestPayload ReturnBookRequest request) {	
		ReturnBookResponse response = new ReturnBookResponse();
		Book book = bookManager.getBookById(request.getIdBook());
		User user = userManager.getUserByEmail(request.getEmail());
		
		BorrowingBook borrowingBookEntity = borrowingBookManager.getBorrowingBookByBookAndUser(book, user);
		
		if(borrowingBookEntity != null) {
			borrowingBookEntity.setReturn(true);
			borrowingBookEntity.setReturnDate(Calendar.getInstance().getTime());
			borrowingBookManager.saveBorrowing(borrowingBookEntity);
			response.setServiceStatus(ServiceStatus.RETURNED);
		}
		else {
			response.setServiceStatus(ServiceStatus.CONFLICT);
		}
		
		return response;	
	}
	
	/**
	 * method login user
	 * @param request
	 * @return
	 */
	@PayloadRoot(namespace = NAMESPACE_URI, localPart = "loginRequest")
	@ResponsePayload
	public LoginResponse login(@RequestPayload LoginRequest request) {
		LoginResponse response = new LoginResponse();
				
		UserInfo userInfo = new UserInfo();

		User userEntity = userManager.getUserByEmailAndPassword(request.getEmail(), request.getPassword());
		if(userEntity == null) {
			response.setServiceStatus(ServiceStatus.CONFLICT);
			
		}
		else {
			
		BeanUtils.copyProperties(userEntity, userInfo);
		response.setServiceStatus(ServiceStatus.SUCCESS);

		}
		response.setUser(userInfo);
		return response;
	}


	public BookManager getBookManager() {
		return bookManager;
	}

	public void setBookManager(BookManager bookManager) {
		this.bookManager = bookManager;
	}

	public UserManager getUserManager() {
		return userManager;
	}

	public void setUserManager(UserManager userManager) {
		this.userManager = userManager;
	}

	public BorrowingBookManager getBorrowingBookManager() {
		return borrowingBookManager;
	}

	public void setBorrowingBookManager(BorrowingBookManager borrowingBookManager) {
		this.borrowingBookManager = borrowingBookManager;
	}

}
