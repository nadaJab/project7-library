package com.libraryWS.entity;
import javax.persistence.*;

import java.io.Serializable;

@Entity
@Table(name="book")
public class Book implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Column(name="id_book")
	private Integer idBook;

	@Column(name="title")
	private String title;

	@Column(name="release_year")
	private Integer releaseYear;

	@Column(name="author_name")
	private String authorName;

	@Column(name="copies_nb")
	private Integer copiesNb;

	@Column(name="editor_name")
	private String editorName;

	@Column(name="page_nb")
	private Integer pageNb;

	@Enumerated(EnumType.STRING)
	@Column(name="book_type")
	private String bookType;

	public Book(){
	}


	public Book(Integer idBook, String title, Integer releaseYear, String authorName, Integer copiesNb,
			String editorName, Integer pageNb, String bookType) {
		super();
		this.idBook = idBook;
		this.title = title;
		this.releaseYear = releaseYear;
		this.authorName = authorName;
		this.copiesNb = copiesNb;
		this.editorName = editorName;
		this.pageNb = pageNb;
		this.bookType = bookType;
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


	public Integer getReleaseYear() {
		return releaseYear;
	}



	public void setReleaseYear(Integer releaseYear) {
		this.releaseYear = releaseYear;
	}



	public String getAuthorName() {
		return authorName;
	}



	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}



	public Integer getCopiesNb() {
		return copiesNb;
	}



	public void setCopiesNb(Integer copiesNb) {
		this.copiesNb = copiesNb;
	}



	public String getEditorName() {
		return editorName;
	}



	public void setEditorName(String editorName) {
		this.editorName = editorName;
	}



	public Integer getPageNb() {
		return pageNb;
	}



	public void setPageNb(Integer pageNb) {
		this.pageNb = pageNb;
	}


/*
	public BookType getBookType() {
		return bookType;
	}



	public void setBookType(BookType bookType) {
		this.bookType = bookType;
	}*/

	public String getBookType() {
		return bookType;
	}


	public void setBookType(String bookType) {
		this.bookType = bookType;
	}
	


	@Override
	public String toString() {
		return "Book{" +
				"idBook=" + idBook +
				", title='" + title + '\'' +
				", bookType='" + bookType + '\'' +
				", pageNb=" + pageNb +
				", releaseYear='" + releaseYear + '\'' +
				", copiesNb=" + copiesNb +
				", author=" + authorName +
				", editor=" + editorName +
				'}';
	}

}

