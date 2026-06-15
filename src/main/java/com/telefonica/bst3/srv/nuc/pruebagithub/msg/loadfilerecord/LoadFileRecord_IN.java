
package com.telefonica.bst3.srv.nuc.pruebagithub.msg.loadfilerecord;

import java.io.Serializable;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.telefonica.tran.comarq.cc.adaptadores.XSDAdaptadorLong;

/**
 * &lt;p&gt;Java class for LoadFileRecord_IN complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt; &amp;lt;complexType name="LoadFileRecord_IN"&amp;gt; &amp;lt;complexContent&amp;gt; &amp;lt;restriction
 * base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt; &amp;lt;sequence&amp;gt; &amp;lt;element name="Action"
 * type="{http://www.w3.org/2001/XMLSchema}integer"/&amp;gt; &amp;lt;element name="BankEntity"
 * type="{http://telefonica.com/bst3/srv/PruebaGitHub/msg/loadFileRecord-v4}BankEntity_DTO_IN" minOccurs="0"/&amp;gt;
 * &amp;lt;element name="BankOffice"
 * type="{http://telefonica.com/bst3/srv/PruebaGitHub/msg/loadFileRecord-v4}BankOffice_DTO_IN" minOccurs="0"/&amp;gt;
 * &amp;lt;element name="Record" type="{http://www.w3.org/2001/XMLSchema}string"/&amp;gt; &amp;lt;/sequence&amp;gt;
 * &amp;lt;/restriction&amp;gt; &amp;lt;/complexContent&amp;gt; &amp;lt;/complexType&amp;gt; &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LoadFileRecord_IN", propOrder = { "action", "bankEntity", "bankOffice", "record" })
@XmlRootElement(name = "LoadFileRecord_IN")
public class LoadFileRecord_IN implements Serializable {

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "Action", required = true, type = String.class)
    @XmlJavaTypeAdapter(XSDAdaptadorLong.class)
    @XmlSchemaType(name = "integer")
    @NotNull
    protected Long action;
    @XmlElement(name = "BankEntity")
    @Valid
    protected BankEntity_DTO_IN bankEntity;
    @XmlElement(name = "BankOffice")
    @Valid
    protected BankOffice_DTO_IN bankOffice;
    @XmlElement(name = "Record", required = true)
    @NotNull
    @JsonIgnore
    protected String record;

    /**
     * Gets the value of the action property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public Long getAction() {
        return action;
    }

    /**
     * Sets the value of the action property.
     * 
     * @param value
     *            allowed object is {@link String }
     * 
     */
    public void setAction(Long value) {
        this.action = value;
    }

    /**
     * Gets the value of the bankEntity property.
     * 
     * @return possible object is {@link BankEntity_DTO_IN }
     * 
     */
    public BankEntity_DTO_IN getBankEntity() {
        return bankEntity;
    }

    /**
     * Sets the value of the bankEntity property.
     * 
     * @param value
     *            allowed object is {@link BankEntity_DTO_IN }
     * 
     */
    public void setBankEntity(BankEntity_DTO_IN value) {
        this.bankEntity = value;
    }

    /**
     * Gets the value of the bankOffice property.
     * 
     * @return possible object is {@link BankOffice_DTO_IN }
     * 
     */
    public BankOffice_DTO_IN getBankOffice() {
        return bankOffice;
    }

    /**
     * Sets the value of the bankOffice property.
     * 
     * @param value
     *            allowed object is {@link BankOffice_DTO_IN }
     * 
     */
    public void setBankOffice(BankOffice_DTO_IN value) {
        this.bankOffice = value;
    }

    /**
     * Gets the value of the record property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getRecord() {
        return record;
    }

    /**
     * Sets the value of the record property.
     * 
     * @param value
     *            allowed object is {@link String }
     * 
     */
    public void setRecord(String value) {
        this.record = value;
    }

}
