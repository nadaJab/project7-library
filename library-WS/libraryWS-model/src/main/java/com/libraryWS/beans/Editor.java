package com.libraryWS.beans;

import javax.persistence.*;
import java.util.ArrayList;

@Entity
@Table(name="editor")
public class Editor {

    private Integer idEditor;
    private String name;
    private String city;
    private String country;
    private ArrayList<Book> books;

    public Editor(){

    }

    public Editor(String name, String city, String country) {
        this.name = name;
        this.city = city;
        this.country = country;
    }

    @Id
    @GeneratedValue
    @Column(name = "id_editor", unique = true, nullable = false)
    public Integer getIdEditor() {
        return idEditor;
    }

    public void setIdEditor(Integer idEditor) {
        this.idEditor = idEditor;
    }

    @Column(name = "name", unique = true, nullable = false)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Column(name = "city", unique = false, nullable = false)
    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Column(name = "country", unique = false, nullable = false)
    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "editor")
    public ArrayList<Book> getBooks() {
        return books;
    }

    public void setBooks(ArrayList<Book> books) {
        this.books = books;
    }
}
