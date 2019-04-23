package com.libraryWS.beans;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="book")
public class Book {

    private Integer idBook;
    private String title;
    private BookType bookType;
    private Integer pageNb;
    private Integer releaseYear;
    private Integer copiesNb;
    private String authorName;
    private String editorName;

    public Book(){
    }

    public Book(String title, BookType bookType, Integer pageNb, Integer releaseYear, Integer copiesNb, String authorName, String editorName) {
        this.title = title;
        this.bookType = bookType;
        this.pageNb = pageNb;
        this.releaseYear = releaseYear;
        this.copiesNb = copiesNb;
        this.authorName = authorName;
        this.editorName = editorName;
    }

    @Id
    @GeneratedValue
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

    public Integer getPageNb() {
        return pageNb;
    }

    public void setPageNb(Integer pageNb) {
        this.pageNb = pageNb;
    }

    public Integer getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(Integer releaseYear) {
        this.releaseYear = releaseYear;
    }

    public Integer getCopiesNb() {
        return copiesNb;
    }

    public void setCopiesNb(Integer copiesNb) {
        this.copiesNb = copiesNb;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public String getEditorName() {
        return editorName;
    }

    public void setEditorName(String editorName) {
        this.editorName = editorName;
    }

    @Override
    public String toString() {
        return "Book{" +
                "idBook=" + idBook +
                ", title='" + title + '\'' +
                ", bookType='" + bookType + '\'' +
                ", pageNb=" + pageNb +
                ", releaseDate='" + releaseYear + '\'' +
                ", copiesNb=" + copiesNb +
                ", author=" + authorName +
                ", editor=" + editorName +
                '}';
    }
}
