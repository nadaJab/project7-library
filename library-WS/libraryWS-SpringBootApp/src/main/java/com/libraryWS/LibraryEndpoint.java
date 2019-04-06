package com.libraryWS;

import com.library.library_ws.*;
import com.libraryWS.beans.Book;
import com.libraryWS.contract.ManagerFactory;
import com.libraryWS.contract.manager.BookManager;
import org.springframework.beans.BeanUtils;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

@Endpoint
public class LibraryEndpoint {

    public static final String NAMESPACE_URI = "http://www.library.com/library-ws";

    @Autowired
    private ManagerFactory managerFactory;

    public LibraryEndpoint() {
    }


    public LibraryEndpoint(ManagerFactory managerFactory) {
        this.managerFactory = managerFactory;
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "getBookByTitleRequest")
    @ResponsePayload
    public GetBookByTitleResponse getBookByTitle(@RequestPayload GetBookByTitleRequest request) {
        GetBookByTitleResponse response = new GetBookByTitleResponse();
        BookInfo bookInfo = new BookInfo();
        BeanUtils.copyProperties(managerFactory.getBookManager().getBookByTitle(request.getTitle()), bookInfo);
        response.setBook(bookInfo);

        return response;
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "getAllBookRequest")
    @ResponsePayload
    public GetAllBookResponse getAllBook(@RequestPayload GetAllBookRequest request) {

        GetAllBookResponse response = new GetAllBookResponse();
        List<BookInfo> bookInfoList = new ArrayList<>();
        List<Book> bookList = managerFactory.getBookManager().getAllBook();

        for (int i = 0; i < bookList.size(); i++) {
            BookInfo ob = new BookInfo();
            BeanUtils.copyProperties(bookList.get(i), ob);
            bookInfoList.add(ob);
        }
        response.getBooks().addAll(bookInfoList);
        //  String response = new String("Helllo world!!");

        return response;
    }
}
