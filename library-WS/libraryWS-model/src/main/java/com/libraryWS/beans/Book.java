package com.libraryWS.beans;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="book")
public class Book {

    @Id
    @GeneratedValue
    @Column(name = "id_book", unique = true, nullable = false)
    private Integer idBook;

    @Column(name = "title", unique = true, nullable = false)
    private String title;

    @Column(name = "genre", unique = false, nullable = false)
    private String bookType;

    @Column(name = "pagesnb", unique = false, nullable = false)
    private Integer pageNb;

    @Column(name = "releasedate", unique = false, nullable = false)
    private Date releaseDate;

    @Column(name = "copiesnb", unique = false, nullable = false)
    private Integer copiesNb;

    @OneToMany(mappedBy="book", cascade=CascadeType.ALL, fetch = FetchType.LAZY)
    private Author author;

    @OneToMany(mappedBy="user", cascade=CascadeType.ALL, fetch = FetchType.LAZY)
    private Editor editor;

    public Book(){

    }

    public Book(Integer idBook, String title, String bookType, Integer pageNb, Date releaseDate, Integer copiesNb, Author author, Editor editor) {
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

    public String getBookType() {
        return bookType;
    }

    public void setBookType(String bookType) {
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
