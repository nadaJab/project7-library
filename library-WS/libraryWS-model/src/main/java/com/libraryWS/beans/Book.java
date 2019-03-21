package com.libraryWS.beans;

import java.util.Date;

public class Book {

    private Integer idBook;
    private String title;
    private BookType bookType;
    private Integer pageNb;
    private Date releaseDate;
    private Integer copiesNb;
    private Author author;
    private Editor editor;

    public Book(){

    }

    public Book(Integer idBook, String title, BookType bookType, Integer pageNb, Date releaseDate, Integer copiesNb, Author author, Editor editor) {
        this.idBook = idBook;
        this.title = title;
        this.bookType = bookType;
        this.pageNb = pageNb;
        this.releaseDate = releaseDate;
        this.copiesNb = copiesNb;
        this.author = author;
        this.editor = editor;
    }

    public Integer getIdBook() {
        return idBook;
    }

    public void setIdBook(Integer idBook) {
        this.idBook = idBook;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public BookType getBookType() {
        return bookType;
    }

    public void setBookType(BookType bookType) {
        this.bookType = bookType;
    }

    public Editor getEditor() {
        return editor;
    }

    public void setEditor(Editor editor) {
        this.editor = editor;
    }

    public Integer getPageNb() {
        return pageNb;
    }

    public void setPageNb(Integer pageNb) {
        this.pageNb = pageNb;
    }

    public Date getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(Date releaseDate) {
        this.releaseDate = releaseDate;
    }

    public Integer getCopiesNb() {
        return copiesNb;
    }

    public void setCopiesNb(Integer copiesNb) {
        this.copiesNb = copiesNb;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }
}
