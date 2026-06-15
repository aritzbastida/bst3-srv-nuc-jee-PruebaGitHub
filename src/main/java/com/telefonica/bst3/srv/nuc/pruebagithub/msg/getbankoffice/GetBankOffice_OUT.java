
package com.telefonica.bst3.srv.nuc.pruebagithub.msg.getbankoffice;

import java.io.Serializable;

import javax.validation.Valid;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * &lt;p&gt;Java class for GetBankOffice_OUT complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt; &amp;lt;complexType name="GetBankOffice_OUT"&amp;gt; &amp;lt;complexContent&amp;gt; &amp;lt;restriction
 * base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt; &amp;lt;sequence&amp;gt; &amp;lt;element name="BankOffice"
 * type="{http://telefonica.com/bst3/srv/PruebaGitHub/msg/getBankOffice-v4}BankOffice_DTO_OUT" minOccurs="0"/&amp;gt;
 * &amp;lt;/sequence&amp;gt; &amp;lt;/restriction&amp;gt; &amp;lt;/complexContent&amp;gt; &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetBankOffice_OUT", propOrder = { "bankOffice" })
@XmlRootElement(name = "GetBankOffice_OUT")
public class GetBankOffice_OUT implements Serializable {

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "BankOffice")
    @Valid
    protected BankOffice_DTO_OUT bankOffice;

    /**
     * Gets the value of the bankOffice property.
     * 
     * @return possible object is {@link BankOffice_DTO_OUT }
     * 
     */
    public BankOffice_DTO_OUT getBankOffice() {
        return bankOffice;
    }

    /**
     * Sets the value of the bankOffice property.
     * 
     * @param value
     *            allowed object is {@link BankOffice_DTO_OUT }
     * 
     */
    public void setBankOffice(BankOffice_DTO_OUT value) {
        this.bankOffice = value;
    }

}
