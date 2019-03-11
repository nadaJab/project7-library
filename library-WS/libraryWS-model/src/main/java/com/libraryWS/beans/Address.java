package com.libraryWS.beans;

public class Address {

    private Integer idAddress;
    private Integer streetNumber;
    private String address;
    private Integer zipCode;
    private String city;

    public Address(){

    }

    public Address(Integer streetNumber, String address, Integer zipCode, String city) {
        this.streetNumber = streetNumber;
        this.address = address;
        this.zipCode = zipCode;
        this.city = city;
    }

    public Integer getIdAddress() {
        return idAddress;
    }

    public void setIdAddress(Integer idAddress) {
        this.idAddress = idAddress;
    }

    public Integer getStreetNumber() {
        return streetNumber;
    }

    public void setStreetNumber(Integer streetNumber) {
        this.streetNumber = streetNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getZipCode() {
        return zipCode;
    }

    public void setZipCode(Integer zipCode) {
        this.zipCode = zipCode;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
