//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.2.7 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2019.04.06 à 09:37:00 AM CEST 
//


package com.library.library_ws;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


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

    private final static QName _GetIdBookRequest_QNAME = new QName("http://www.library.com/library-ws", "getIdBookRequest");
    private final static QName _GetIdBookResponse_QNAME = new QName("http://www.library.com/library-ws", "getIdBookResponse");

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
     * Create an instance of {@link LoginResponse }
     * 
     */
    public LoginResponse createLoginResponse() {
        return new LoginResponse();
    }

    /**
     * Create an instance of {@link UserInfo }
     * 
     */
    public UserInfo createUserInfo() {
        return new UserInfo();
    }

    /**
     * Create an instance of {@link LogoutResponse }
     * 
     */
    public LogoutResponse createLogoutResponse() {
        return new LogoutResponse();
    }

    /**
     * Create an instance of {@link GetAllBookResponse }
     * 
     */
    public GetAllBookResponse createGetAllBookResponse() {
        return new GetAllBookResponse();
    }

    /**
     * Create an instance of {@link BookInfo }
     * 
     */
    public BookInfo createBookInfo() {
        return new BookInfo();
    }

    /**
     * Create an instance of {@link LoginRequest }
     * 
     */
    public LoginRequest createLoginRequest() {
        return new LoginRequest();
    }

    /**
     * Create an instance of {@link GetBookByTitleResponse }
     * 
     */
    public GetBookByTitleResponse createGetBookByTitleResponse() {
        return new GetBookByTitleResponse();
    }

    /**
     * Create an instance of {@link LogoutRequest }
     * 
     */
    public LogoutRequest createLogoutRequest() {
        return new LogoutRequest();
    }

    /**
     * Create an instance of {@link GetBookByTitleRequest }
     * 
     */
    public GetBookByTitleRequest createGetBookByTitleRequest() {
        return new GetBookByTitleRequest();
    }

    /**
     * Create an instance of {@link EditorInfo }
     * 
     */
    public EditorInfo createEditorInfo() {
        return new EditorInfo();
    }

    /**
     * Create an instance of {@link AuthorInfo }
     * 
     */
    public AuthorInfo createAuthorInfo() {
        return new AuthorInfo();
    }

    /**
     * Create an instance of {@link BorrowingBookInfo }
     * 
     */
    public BorrowingBookInfo createBorrowingBookInfo() {
        return new BorrowingBookInfo();
    }

    /**
     * Create an instance of {@link AddressInfo }
     * 
     */
    public AddressInfo createAddressInfo() {
        return new AddressInfo();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.library.com/library-ws", name = "getIdBookRequest")
    public JAXBElement<String> createGetIdBookRequest(String value) {
        return new JAXBElement<String>(_GetIdBookRequest_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.library.com/library-ws", name = "getIdBookResponse")
    public JAXBElement<String> createGetIdBookResponse(String value) {
        return new JAXBElement<String>(_GetIdBookResponse_QNAME, String.class, null, value);
    }

}
