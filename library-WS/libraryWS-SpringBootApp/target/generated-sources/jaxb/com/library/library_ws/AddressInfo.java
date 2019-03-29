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
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour AddressInfo complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="AddressInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="idAddress" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="streetNumber" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="address" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="zipCode" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="city" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddressInfo", propOrder = {
    "idAddress",
    "streetNumber",
    "address",
    "zipCode",
    "city"
})
public class AddressInfo {

    protected int idAddress;
    protected int streetNumber;
    @XmlElement(required = true)
    protected String address;
    protected int zipCode;
    @XmlElement(required = true)
    protected String city;

    /**
     * Obtient la valeur de la propriété idAddress.
     * 
     */
    public int getIdAddress() {
        return idAddress;
    }

    /**
     * Définit la valeur de la propriété idAddress.
     * 
     */
    public void setIdAddress(int value) {
        this.idAddress = value;
    }

    /**
     * Obtient la valeur de la propriété streetNumber.
     * 
     */
    public int getStreetNumber() {
        return streetNumber;
    }

    /**
     * Définit la valeur de la propriété streetNumber.
     * 
     */
    public void setStreetNumber(int value) {
        this.streetNumber = value;
    }

    /**
     * Obtient la valeur de la propriété address.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddress() {
        return address;
    }

    /**
     * Définit la valeur de la propriété address.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddress(String value) {
        this.address = value;
    }

    /**
     * Obtient la valeur de la propriété zipCode.
     * 
     */
    public int getZipCode() {
        return zipCode;
    }

    /**
     * Définit la valeur de la propriété zipCode.
     * 
     */
    public void setZipCode(int value) {
        this.zipCode = value;
    }

    /**
     * Obtient la valeur de la propriété city.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCity() {
        return city;
    }

    /**
     * Définit la valeur de la propriété city.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCity(String value) {
        this.city = value;
    }

}
