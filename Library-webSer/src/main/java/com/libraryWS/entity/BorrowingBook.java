package com.libraryWS.entity;

import java.util.Date;

public class BorrowingBook {

    private Integer idBorrowingBook;
    private Date borrowingDate;
    private Date returnDate;
    private boolean isReturn;
    private boolean extension;
    private User user;

    public BorrowingBook(){

    }

    public BorrowingBook(Date borrowingDate, Date returnDate, boolean isReturn, boolean extension) {
        this.borrowingDate = borrowingDate;
        this.returnDate = returnDate;
        this.isReturn = isReturn;
        this.extension = extension;
    }

    public Integer getIdBorrowingBook() {
        return idBorrowingBook;
    }

    public void setIdBorrowingBook(Integer idBorrowingBook) {
        this.idBorrowingBook = idBorrowingBook;
    }

    public Date getBorrowingDate() {
        return borrowingDate;
    }

    public void setBorrowingDate(Date borrowingDate) {
        this.borrowingDate = borrowingDate;
    }

    public Date getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(Date returnDate) {
        this.returnDate = returnDate;
    }

    public boolean isReturn() {
        return isReturn;
    }

    public void setReturn(boolean aReturn) {
        isReturn = aReturn;
    }

    public boolean isExtension() {
        return extension;
    }

    public void setExtension(boolean extension) {
        this.extension = extension;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
