//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.2.7 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2019.04.23 à 04:02:03 PM CEST 
//


package com.library.library_ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour BookInfo complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="BookInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="idBook" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="title" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="pageNb" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="releaseYear" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="copiesNb" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="bookType" type="{http://www.library.com/library-ws}BookTypeInfo"/>
 *         &lt;element name="authorName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="editorName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BookInfo", propOrder = {
    "idBook",
    "title",
    "pageNb",
    "releaseYear",
    "copiesNb",
    "bookType",
    "authorName",
    "editorName"
})
public class BookInfo {

    protected int idBook;
    @XmlElement(required = true)
    protected String title;
    protected int pageNb;
    protected int releaseYear;
    protected int copiesNb;
    @XmlElement(required = true)
    protected BookTypeInfo bookType;
    @XmlElement(required = true)
    protected String authorName;
    @XmlElement(required = true)
    protected String editorName;

    /**
     * Obtient la valeur de la propriété idBook.
     * 
     */
    public int getIdBook() {
        return idBook;
    }

    /**
     * Définit la valeur de la propriété idBook.
     * 
     */
    public void setIdBook(int value) {
        this.idBook = value;
    }

    /**
     * Obtient la valeur de la propriété title.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitle() {
        return title;
    }

    /**
     * Définit la valeur de la propriété title.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitle(String value) {
        this.title = value;
    }

    /**
     * Obtient la valeur de la propriété pageNb.
     * 
     */
    public int getPageNb() {
        return pageNb;
    }

    /**
     * Définit la valeur de la propriété pageNb.
     * 
     */
    public void setPageNb(int value) {
        this.pageNb = value;
    }

    /**
     * Obtient la valeur de la propriété releaseYear.
     * 
     */
    public int getReleaseYear() {
        return releaseYear;
    }

    /**
     * Définit la valeur de la propriété releaseYear.
     * 
     */
    public void setReleaseYear(int value) {
        this.releaseYear = value;
    }

    /**
     * Obtient la valeur de la propriété copiesNb.
     * 
     */
    public int getCopiesNb() {
        return copiesNb;
    }

    /**
     * Définit la valeur de la propriété copiesNb.
     * 
     */
    public void setCopiesNb(int value) {
        this.copiesNb = value;
    }

    /**
     * Obtient la valeur de la propriété bookType.
     * 
     * @return
     *     possible object is
     *     {@link BookTypeInfo }
     *     
     */
    public BookTypeInfo getBookType() {
        return bookType;
    }

    /**
     * Définit la valeur de la propriété bookType.
     * 
     * @param value
     *     allowed object is
     *     {@link BookTypeInfo }
     *     
     */
    public void setBookType(BookTypeInfo value) {
        this.bookType = value;
    }

    /**
     * Obtient la valeur de la propriété authorName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthorName() {
        return authorName;
    }

    /**
     * Définit la valeur de la propriété authorName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthorName(String value) {
        this.authorName = value;
    }

    /**
     * Obtient la valeur de la propriété editorName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEditorName() {
        return editorName;
    }

    /**
     * Définit la valeur de la propriété editorName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEditorName(String value) {
        this.editorName = value;
    }

}
