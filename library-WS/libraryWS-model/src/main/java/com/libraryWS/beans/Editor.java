package com.libraryWS.beans;

public class Editor {

    private Integer idEditor;
    private String name;
    private String city;
    private String country;

    public Editor(){

    }

    public Editor(String name, String city, String country) {
        this.name = name;
        this.city = city;
        this.country = country;
    }

    public Integer getIdEditor() {
        return idEditor;
    }

    public void setIdEditor(Integer idEditor) {
        this.idEditor = idEditor;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
