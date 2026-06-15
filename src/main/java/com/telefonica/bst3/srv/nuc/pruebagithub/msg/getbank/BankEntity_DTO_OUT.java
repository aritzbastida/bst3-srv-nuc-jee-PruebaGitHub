
package com.telefonica.bst3.srv.nuc.pruebagithub.msg.getbank;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import com.telefonica.tran.comarq.cc.adaptadores.XSDAdaptadorLong;

/**
 * BankEntity entity information: Oficial reference of a bank
 * 
 * #ESPAÑOL# BANCO Referencia oficial para cada entidad bancaria. Concepto sometido a vigencias Country entity
 * information: This is an example of a concrete Geographic Location entity.
 * 
 * &lt;p&gt;Java class for BankEntity_DTO_OUT complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt; &amp;lt;complexType name="BankEntity_DTO_OUT"&amp;gt; &amp;lt;complexContent&amp;gt; &amp;lt;restriction
 * base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt; &amp;lt;sequence&amp;gt; &amp;lt;element name="Id"
 * type="{http://www.w3.org/2001/XMLSchema}decimal"/&amp;gt; &amp;lt;element name="BankType"
 * type="{http://telefonica.com/bst3/srv/PruebaGitHub/msg/getBank-v4}BankType"/&amp;gt; &amp;lt;element name="BICCode"
 * type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt; &amp;lt;element name="Code"
 * type="{http://www.w3.org/2001/XMLSchema}string"/&amp;gt; &amp;lt;element name="CountryId"
 * type="{http://www.w3.org/2001/XMLSchema}integer"/&amp;gt; &amp;lt;element name="Name"
 * type="{http://www.w3.org/2001/XMLSchema}string"/&amp;gt; &amp;lt;element name="Origin"
 * type="{http://telefonica.com/bst3/srv/PruebaGitHub/msg/getBank-v4}Origin"/&amp;gt; &amp;lt;element name="ValidFor"
 * type="{http://telefonica.com/bst3/srv/PruebaGitHub/msg/getBank-v4}TimePeriod"/&amp;gt; &amp;lt;element
 * name="WindowPayment" type="{http://www.w3.org/2001/XMLSchema}boolean"/&amp;gt; &amp;lt;/sequence&amp;gt;
 * &amp;lt;/restriction&amp;gt; &amp;lt;/complexContent&amp;gt; &amp;lt;/complexType&amp;gt; &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BankEntity_DTO_OUT", propOrder = { "id", "bankType", "bicCode", "code", "countryId", "name", "origin",
        "validFor", "windowPayment" })
public class BankEntity_DTO_OUT implements Serializable {

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "Id", required = true)
    @NotNull
    protected BigDecimal id;
    @XmlElement(name = "BankType", required = true)
    @NotNull
    @Pattern(regexp = "BP|CA|CC|CO|ECVT|EFC|OR|SECC|SECE|SGR|SR|ST")
    protected String bankType;
    @XmlElement(name = "BICCode")
    protected String bicCode;
    @XmlElement(name = "Code", required = true)
    @NotNull
    protected String code;
    @XmlElement(name = "CountryId", required = true, type = String.class)
    @XmlJavaTypeAdapter(XSDAdaptadorLong.class)
    @XmlSchemaType(name = "integer")
    @NotNull
    protected Long countryId;
    @XmlElement(name = "Name", required = true)
    @NotNull
    protected String name;
    @XmlElement(name = "Origin", required = true)
    @NotNull
    @Pattern(regexp = "1|2")
    protected String origin;
    @XmlElement(name = "ValidFor", required = true)
    @NotNull
    @Valid
    protected TimePeriod validFor;
    @XmlElement(name = "WindowPayment")
    @NotNull
    protected boolean windowPayment;

    /**
     * Gets the value of the id property.
     * 
     * @return possible object is {@link BigDecimal }
     * 
     */
    public BigDecimal getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *            allowed object is {@link BigDecimal }
     * 
     */
    public void setId(BigDecimal value) {
        this.id = value;
    }

    /**
     * Gets the value of the bankType property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getBankType() {
        return bankType;
    }

    /**
     * Sets the value of the bankType property.
     * 
     * @param value
     *            allowed object is {@link String }
     * 
     */
    public void setBankType(String value) {
        this.bankType = value;
    }

    /**
     * Gets the value of the bicCode property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getBICCode() {
        return bicCode;
    }

    /**
     * Sets the value of the bicCode property.
     * 
     * @param value
     *            allowed object is {@link String }
     * 
     */
    public void setBICCode(String value) {
        this.bicCode = value;
    }

    /**
     * Gets the value of the code property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getCode() {
        return code;
    }

    /**
     * Sets the value of the code property.
     * 
     * @param value
     *            allowed object is {@link String }
     * 
     */
    public void setCode(String value) {
        this.code = value;
    }

    /**
     * Gets the value of the countryId property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public Long getCountryId() {
        return countryId;
    }

    /**
     * Sets the value of the countryId property.
     * 
     * @param value
     *            allowed object is {@link String }
     * 
     */
    public void setCountryId(Long value) {
        this.countryId = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *            allowed object is {@link String }
     * 
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the origin property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getOrigin() {
        return origin;
    }

    /**
     * Sets the value of the origin property.
     * 
     * @param value
     *            allowed object is {@link String }
     * 
     */
    public void setOrigin(String value) {
        this.origin = value;
    }

    /**
     * Gets the value of the validFor property.
     * 
     * @return possible object is {@link TimePeriod }
     * 
     */
    public TimePeriod getValidFor() {
        return validFor;
    }

    /**
     * Sets the value of the validFor property.
     * 
     * @param value
     *            allowed object is {@link TimePeriod }
     * 
     */
    public void setValidFor(TimePeriod value) {
        this.validFor = value;
    }

    /**
     * Gets the value of the windowPayment property.
     * 
     */
    public boolean isWindowPayment() {
        return windowPayment;
    }

    /**
     * Sets the value of the windowPayment property.
     * 
     */
    public void setWindowPayment(boolean value) {
        this.windowPayment = value;
    }

}
