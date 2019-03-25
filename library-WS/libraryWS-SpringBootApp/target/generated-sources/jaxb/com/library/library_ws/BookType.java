//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.2.7 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2019.03.25 à 03:13:55 PM CET 
//


package com.library.library_ws;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour BookType.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * <p>
 * <pre>
 * &lt;simpleType name="BookType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="SCIENCE_FICTION"/>
 *     &lt;enumeration value="POLICIER"/>
 *     &lt;enumeration value="ROMAN_HISTORIC"/>
 *     &lt;enumeration value="HEROIC_FANTASY"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "BookType")
@XmlEnum
public enum BookType {

    SCIENCE_FICTION,
    POLICIER,
    ROMAN_HISTORIC,
    HEROIC_FANTASY;

    public String value() {
        return name();
    }

    public static BookType fromValue(String v) {
        return valueOf(v);
    }

}
