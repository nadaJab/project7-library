package com.libraryWS.beans;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="book")
public class Book {

    private Integer idBook;
    private String title;
    private String bookType;
    private Integer pageNb;
    private Date releaseDate;
    private Integer copiesNb;
    private Author author;
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

    @Id
    @GeneratedValue
    @Column(name = "id_book", unique = true, nullable = false)
    public Integer getIdBook() {
        return idBook;
    }

    public void setIdBook(Integer idBook) {
        this.idBook = idBook;
    }

    @Column(name = "title", unique = true, nullable = false)
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Column(name = "genre", unique = false, nullable = false)
    public String getBookType() {
        return bookType;
    }

    public void setBookType(String bookType) {
        this.bookType = bookType;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_editor", nullable = false)
    public Editor getEditor() {
        return editor;
    }

    public void setEditor(Editor editor) {
        this.editor = editor;
    }

    @Column(name = "pagesnb", unique = false, nullable = false)
    public Integer getPageNb() {
        return pageNb;
    }

    public void setPageNb(Integer pageNb) {
        this.pageNb = pageNb;
    }

    @Column(name = "releasedate", unique = false, nullable = false)
    public Date getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(Date releaseDate) {
        this.releaseDate = releaseDate;
    }

    @Column(name = "copiesnb", unique = false, nullable = false)
    public Integer getCopiesNb() {
        return copiesNb;
    }

    public void setCopiesNb(Integer copiesNb) {
        this.copiesNb = copiesNb;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_author", nullable = false)
    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }
}
