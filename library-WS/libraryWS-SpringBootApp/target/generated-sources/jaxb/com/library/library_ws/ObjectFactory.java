//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.2.7 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2019.04.23 à 04:02:03 PM CEST 
//


package com.library.library_ws;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.library.library_ws package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.library.library_ws
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetAllBookRequest }
     * 
     */
    public GetAllBookRequest createGetAllBookRequest() {
        return new GetAllBookRequest();
    }

    /**
     * Create an instance of {@link BookDetailsResponse }
     * 
     */
    public BookDetailsResponse createBookDetailsResponse() {
        return new BookDetailsResponse();
    }

    /**
     * Create an instance of {@link BookInfo }
     * 
     */
    public BookInfo createBookInfo() {
        return new BookInfo();
    }

    /**
     * Create an instance of {@link GetAllBookResponse }
     * 
     */
    public GetAllBookResponse createGetAllBookResponse() {
        return new GetAllBookResponse();
    }

    /**
     * Create an instance of {@link BookDetailsRequest }
     * 
     */
    public BookDetailsRequest createBookDetailsRequest() {
        return new BookDetailsRequest();
    }

}
