//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.01.29 at 03:00:01 PM BRST 
//


package correios.wsdl;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for remetenteTO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="remetenteTO"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://cliente.bean.master.sigep.bsb.correios.com.br/}pessoaTO"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="identificacao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "remetenteTO", propOrder = {
    "identificacao"
})
@XmlRootElement
public class RemetenteTO
    extends PessoaTO
{

    protected String identificacao;

    /**
     * Gets the value of the identificacao property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdentificacao() {
        return identificacao;
    }

    /**
     * Sets the value of the identificacao property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdentificacao(String value) {
        this.identificacao = value;
    }

}
