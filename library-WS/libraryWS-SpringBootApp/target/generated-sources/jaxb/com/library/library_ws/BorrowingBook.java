//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.2.7 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2019.03.25 à 03:13:55 PM CET 
//


package com.library.library_ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java pour BorrowingBook complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="BorrowingBook">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="idBorrowingBook" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="borrowingDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="returnDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="isReturn" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="extension" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="user" type="{http://www.library.com/library-ws}Book"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BorrowingBook", propOrder = {
    "idBorrowingBook",
    "borrowingDate",
    "returnDate",
    "isReturn",
    "extension",
    "user"
})
public class BorrowingBook {

    protected int idBorrowingBook;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar borrowingDate;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar returnDate;
    protected boolean isReturn;
    protected boolean extension;
    @XmlElement(required = true)
    protected Book user;

    /**
     * Obtient la valeur de la propriété idBorrowingBook.
     * 
     */
    public int getIdBorrowingBook() {
        return idBorrowingBook;
    }

    /**
     * Définit la valeur de la propriété idBorrowingBook.
     * 
     */
    public void setIdBorrowingBook(int value) {
        this.idBorrowingBook = value;
    }

    /**
     * Obtient la valeur de la propriété borrowingDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getBorrowingDate() {
        return borrowingDate;
    }

    /**
     * Définit la valeur de la propriété borrowingDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setBorrowingDate(XMLGregorianCalendar value) {
        this.borrowingDate = value;
    }

    /**
     * Obtient la valeur de la propriété returnDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getReturnDate() {
        return returnDate;
    }

    /**
     * Définit la valeur de la propriété returnDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setReturnDate(XMLGregorianCalendar value) {
        this.returnDate = value;
    }

    /**
     * Obtient la valeur de la propriété isReturn.
     * 
     */
    public boolean isIsReturn() {
        return isReturn;
    }

    /**
     * Définit la valeur de la propriété isReturn.
     * 
     */
    public void setIsReturn(boolean value) {
        this.isReturn = value;
    }

    /**
     * Obtient la valeur de la propriété extension.
     * 
     */
    public boolean isExtension() {
        return extension;
    }

    /**
     * Définit la valeur de la propriété extension.
     * 
     */
    public void setExtension(boolean value) {
        this.extension = value;
    }

    /**
     * Obtient la valeur de la propriété user.
     * 
     * @return
     *     possible object is
     *     {@link Book }
     *     
     */
    public Book getUser() {
        return user;
    }

    /**
     * Définit la valeur de la propriété user.
     * 
     * @param value
     *     allowed object is
     *     {@link Book }
     *     
     */
    public void setUser(Book value) {
        this.user = value;
    }

}
