package com.libraryWS;

import com.library.library_ws.*;
import com.libraryWS.beans.Book;
import com.libraryWS.contract.manager.BookManager;
import org.springframework.beans.BeanUtils;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Endpoint
public class LibraryEndpoint {

    public static final String NAMESPACE_URI = "http://www.library.com/library-ws";

    @Autowired
    private BookManager bookManager;

    static final Logger logger = LogManager.getLogger();

    /*
    private ManagerFactory managerFactory;

    public LibraryEndpoint() {
    }

    @Autowired
    public LibraryEndpoint(ManagerFactory managerFactory) {
        this.managerFactory = managerFactory;
    } */

    /*

    private libraryRepository libraryRepository;

    @Autowired
    public LibraryEndpoint(libraryRepository libraryRepository) {
        this.libraryRepository = libraryRepository;
    } */

    //******
    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "bookDetailsRequest")
    @ResponsePayload
    public BookDetailsResponse getBookInfo(@RequestPayload BookDetailsRequest request) {

        BookDetailsResponse response = new BookDetailsResponse();
        //Book book = managerFactory.getBookManager().getBookByTitle(request.getName());
        Book book = bookManager.getBookByTitle(request.getName());

        logger.info("@@@@@" + book.toString());

        BookInfo bookInfo = new BookInfo();

        BeanUtils.copyProperties(book, bookInfo);
        response.setBook(bookInfo);
        return response;


       /* test with datainit
        BookDetailsResponse response = new BookDetailsResponse();
        response.setBook(libraryRepository.findBook(request.getName()));
        //response.setStudent(StudentRepository.findStudent(request.getName()));

        return response; */
    }


    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "getAllBookRequest")
    @ResponsePayload
    public GetAllBookResponse getAllBook(@RequestPayload GetAllBookRequest request) {

        GetAllBookResponse response = new GetAllBookResponse();



        //response.setBooks(libraryRepository.)
        /*
        List<BookInfo> movieTypeList = new ArrayList<BookInfo>();
        List<Book> movieEntityList = new ArrayList<Book>();

        //List<Book> movieEntity = managerFactory.getBookManager().getAllBook();
        Book a = new Book();
        //a.setBookType(BookType.POLICIER);

        movieEntityList.add(a);
        System.out.println("@@@@@@@" + a.toString());

        for (Book entity : movieEntityList) {
            BookInfo movieType = new BookInfo();
            BeanUtils.copyProperties(entity, movieType);
            movieTypeList.add(movieType);
        }
        response.getBooks().addAll(movieTypeList); */

        return response;

        /*
        GetAllBookResponse response = new GetAllBookResponse();
        List<Book> bookIn = new ArrayList<>();
        //bookIn.add(new Book(1, "hello", "bookType", 3, "27/09/2012", 5));
        bookIn.add(new Book());
        response.getBooks().addAll(convertBooks(bookIn));

        return response;  */
    }

    public List<BookInfo> convertBooks(List<Book> bookEntities){
        List<BookInfo> books = new ArrayList<>();

        for(int i = 0; i < bookEntities.size(); i++){
            BookInfo b = new BookInfo();
            BeanUtils.copyProperties(bookEntities.get(i), b);
            books.add(b);
        }
        return books;
    }
}
