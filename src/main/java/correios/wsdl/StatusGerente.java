//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.01.29 at 03:00:01 PM BRST 
//


package correios.wsdl;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for statusGerente.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="statusGerente"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Ativo"/&gt;
 *     &lt;enumeration value="Inativo"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "statusGerente")
@XmlEnum
public enum StatusGerente {

    @XmlEnumValue("Ativo")
    ATIVO("Ativo"),
    @XmlEnumValue("Inativo")
    INATIVO("Inativo");
    private final String value;

    StatusGerente(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static StatusGerente fromValue(String v) {
        for (StatusGerente c: StatusGerente.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}