
package com.telefonica.bst3.srv.nuc.pruebagithub.msg.getbank;

import java.io.Serializable;

import javax.validation.Valid;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * &lt;p&gt;Java class for GetBank_OUT complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt; &amp;lt;complexType name="GetBank_OUT"&amp;gt; &amp;lt;complexContent&amp;gt; &amp;lt;restriction
 * base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt; &amp;lt;sequence&amp;gt; &amp;lt;element name="BankEntity"
 * type="{http://telefonica.com/bst3/srv/PruebaGitHub/msg/getBank-v4}BankEntity_DTO_OUT" minOccurs="0"/&amp;gt;
 * &amp;lt;/sequence&amp;gt; &amp;lt;/restriction&amp;gt; &amp;lt;/complexContent&amp;gt; &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetBank_OUT", propOrder = { "bankEntity" })
@XmlRootElement(name = "GetBank_OUT")
public class GetBank_OUT implements Serializable {

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "BankEntity")
    @Valid
    protected BankEntity_DTO_OUT bankEntity;

    /**
     * Gets the value of the bankEntity property.
     * 
     * @return possible object is {@link BankEntity_DTO_OUT }
     * 
     */
    public BankEntity_DTO_OUT getBankEntity() {
        return bankEntity;
    }

    /**
     * Sets the value of the bankEntity property.
     * 
     * @param value
     *            allowed object is {@link BankEntity_DTO_OUT }
     * 
     */
    public void setBankEntity(BankEntity_DTO_OUT value) {
        this.bankEntity = value;
    }

}
