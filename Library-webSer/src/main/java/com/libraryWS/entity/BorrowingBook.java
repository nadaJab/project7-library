package com.libraryWS.entity;

import java.io.Serializable;
import java.util.Calendar;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.*;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="borrowingbook")
public class BorrowingBook implements Serializable{

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id @GeneratedValue
	@Column(name="id_borrowing_book")
	private Integer idBorrowingBook;
	
	@Column(name="borrowing_date")
    private Date borrowingDate;
	
	@Column(name="return_date", nullable = true)
    private Date returnDate;
	
	@Column(name="is_return", columnDefinition = "boolean DEFAULT false")
    private boolean isReturn;
	
	@Column(name="extention", columnDefinition = "boolean DEFAULT false")
    private boolean extension;
	
    @OneToOne
    @JoinColumn(name = "id_user")
    private User user;
    
    @OneToOne
    @JoinColumn(name = "id_book")
    private Book book;
    
    
    public BorrowingBook(){

    }

    

    public BorrowingBook(User user, Book book) {
		super();
		this.user = user;
		this.book = book;
		this.extension = false;
		this.isReturn = false;
		this.borrowingDate = Calendar.getInstance().getTime();
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

	public Book getBook() {
		return book;
	}

	public void setBook(Book book) {
		this.book = book;
	}



	@Override
	public String toString() {
		return "BorrowingBook [idBorrowingBook=" + idBorrowingBook + ", borrowingDate=" + borrowingDate
				+ ", returnDate=" + returnDate + ", isReturn=" + isReturn + ", extension=" + extension + ", user="
				+ user + ", book=" + book + "]";
	}
	
	
}
