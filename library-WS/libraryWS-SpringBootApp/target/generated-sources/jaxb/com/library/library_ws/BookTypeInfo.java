//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.2.7 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2019.03.29 à 10:41:32 AM CET 
//


package com.library.library_ws;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour BookTypeInfo.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * <p>
 * <pre>
 * &lt;simpleType name="BookTypeInfo">
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
@XmlType(name = "BookTypeInfo")
@XmlEnum
public enum BookTypeInfo {

    SCIENCE_FICTION,
    POLICIER,
    ROMAN_HISTORIC,
    HEROIC_FANTASY;

    public String value() {
        return name();
    }

    public static BookTypeInfo fromValue(String v) {
        return valueOf(v);
    }

}