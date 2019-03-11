package com.libraryWS.beans;

import java.util.Date;

public class Book {

    private Integer idBook;
    private String title;
    private String genre;
    private Integer pageNb;
    private Date releaseDate;
    private Integer copiesNb;

    public Book(){

    }

    public Book(String title, String genre, Integer pageNb, Date releaseDate, Integer copiesNb) {
        this.title = title;
        this.genre = genre;
        this.pageNb = pageNb;
        this.releaseDate = releaseDate;
        this.copiesNb = copiesNb;
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

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
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
}
