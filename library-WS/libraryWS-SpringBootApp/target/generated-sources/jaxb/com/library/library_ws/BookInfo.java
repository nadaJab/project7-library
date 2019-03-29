//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.2.7 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2019.03.29 à 10:41:32 AM CET 
//


package com.library.library_ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


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
 *         &lt;element name="bookType" type="{http://www.library.com/library-ws}BookTypeInfo"/>
 *         &lt;element name="pageNb" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="releaseDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="copiesNb" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="author" type="{http://www.library.com/library-ws}AuthorInfo"/>
 *         &lt;element name="editor" type="{http://www.library.com/library-ws}EditorInfo"/>
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
    "bookType",
    "pageNb",
    "releaseDate",
    "copiesNb",
    "author",
    "editor"
})
public class BookInfo {

    protected int idBook;
    @XmlElement(required = true)
    protected String title;
    @XmlElement(required = true)
    protected BookTypeInfo bookType;
    protected int pageNb;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar releaseDate;
    protected int copiesNb;
    @XmlElement(required = true)
    protected AuthorInfo author;
    @XmlElement(required = true)
    protected EditorInfo editor;

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
     * Obtient la valeur de la propriété releaseDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getReleaseDate() {
        return releaseDate;
    }

    /**
     * Définit la valeur de la propriété releaseDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setReleaseDate(XMLGregorianCalendar value) {
        this.releaseDate = value;
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
     * Obtient la valeur de la propriété author.
     * 
     * @return
     *     possible object is
     *     {@link AuthorInfo }
     *     
     */
    public AuthorInfo getAuthor() {
        return author;
    }

    /**
     * Définit la valeur de la propriété author.
     * 
     * @param value
     *     allowed object is
     *     {@link AuthorInfo }
     *     
     */
    public void setAuthor(AuthorInfo value) {
        this.author = value;
    }

    /**
     * Obtient la valeur de la propriété editor.
     * 
     * @return
     *     possible object is
     *     {@link EditorInfo }
     *     
     */
    public EditorInfo getEditor() {
        return editor;
    }

    /**
     * Définit la valeur de la propriété editor.
     * 
     * @param value
     *     allowed object is
     *     {@link EditorInfo }
     *     
     */
    public void setEditor(EditorInfo value) {
        this.editor = value;
    }

}
