package com.libraryWS.beans;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;

@Entity
@Table(name="author")
public class Author {

    private Integer idAuthor;
    private String firstName;
    private String lastName;
    private Date birthDate;
    private String nationality;
    private ArrayList<Book> books;

    public Author(){

    }

    public Author(String firstName, String lastName, Date birthDate, String nationality) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.nationality = nationality;
    }

    @Id
    @GeneratedValue
    @Column(name = "id_author", unique = true, nullable = false)
    public Integer getIdAuthor() {
        return idAuthor;
    }

    public void setIdAuthor(Integer idAuthor) {
        this.idAuthor = idAuthor;
    }

    @Column(name = "first_name", unique = false, nullable = false)
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @Column(name = "last_name", unique = false, nullable = false)
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Column(name = "birthdate", unique = false, nullable = true)
    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    @Column(name = "nationality", unique = false, nullable = true)
    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "author")
    public ArrayList<Book> getBooks() {
        return books;
    }

    public void setBooks(ArrayList<Book> books) {
        this.books = books;
    }
}
