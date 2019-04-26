package com.libraryWS.webservice;

import com.library.library_ws.BookInfo;
import com.library.library_ws.BookTypeInfo;
import org.springframework.stereotype.Component;
import org.springframework.util.Assert;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

@Component
public class libraryRepository {

    private static final Map<String, BookInfo> bookList = new HashMap<>();
    private ArrayList<BookInfo> list = new ArrayList<>();

    @PostConstruct
    public void initData() {

        BookInfo book = new BookInfo();
        book.setIdBook(1);
        book.setTitle("hello");
        book.setCopiesNb(2);
        book.setPageNb(25);
        book.setReleaseYear(2002);
        book.setBookType(BookTypeInfo.HEROIC_FANTASY);
        book.setAuthorName("ddddd");
        book.setEditorName("zr");

        bookList.put(book.getTitle(), book);
        list.add(book);

        book = new BookInfo();
        book.setIdBook(2);
        book.setTitle("aaaa");
        book.setCopiesNb(2);
        book.setPageNb(25);
        book.setReleaseYear(2000);
        book.setBookType(BookTypeInfo.HEROIC_FANTASY);

        bookList.put(book.getTitle(), book);
        list.add(book);

    }

    public BookInfo findBook(String title) {
        Assert.notNull(title, "The BookInfo's name must not be null");
        return bookList.get(title);
    }

    public ArrayList<BookInfo> books(){

        return list;
    }
}
