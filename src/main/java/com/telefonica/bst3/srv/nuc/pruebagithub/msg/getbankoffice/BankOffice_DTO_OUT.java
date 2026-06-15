
package com.telefonica.bst3.srv.nuc.pruebagithub.msg.getbankoffice;

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
 * BankOffice entity information: Branch of a bank.
 * 
 * #ESPAÑOL# SUCURSAL BANCARIA Sucursal de una entidad bancaria. Además de la codificación CCC(Código Cuenta Cliente) de
 * ámbito nacional, permite registrar el número de sucursal del BIC (Bank Identifier Code) que completa la codificación
 * de una cuenta IBAN. El BIC a nivel de sucursal está formado por 11 posiciones: BBBB -BANCO PP - país MM -población
 * XXX - sucursal banco, país y población se refieren a la sede social del banco, por lo que se guardan en ENTIDAD
 * BANCO, en la sucursal, sólo se registra el secuencial de sucursal que además es opcional. Concepto sometido a
 * vigencias Street entity information: space that allows the movement of people, animals and/or vehicles, offering
 * access to buildings, grounds, places, etc.
 * 
 * &lt;p&gt;Java class for BankOffice_DTO_OUT complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt; &amp;lt;complexType name="BankOffice_DTO_OUT"&amp;gt; &amp;lt;complexContent&amp;gt; &amp;lt;restriction
 * base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt; &amp;lt;sequence&amp;gt; &amp;lt;element name="Id"
 * type="{http://www.w3.org/2001/XMLSchema}decimal"/&amp;gt; &amp;lt;element name="BankEntityId"
 * type="{http://www.w3.org/2001/XMLSchema}decimal"/&amp;gt; &amp;lt;element name="BankOfficeBICCode"
 * type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt; &amp;lt;element name="BranchType"
 * type="{http://telefonica.com/bst3/srv/PruebaGitHub/msg/getBankOffice-v4}BranchType"/&amp;gt; &amp;lt;element
 * name="Code" type="{http://www.w3.org/2001/XMLSchema}string"/&amp;gt; &amp;lt;element name="GeographicSiteId"
 * type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&amp;gt; &amp;lt;element name="ValidFor"
 * type="{http://telefonica.com/bst3/srv/PruebaGitHub/msg/getBankOffice-v4}TimePeriod"/&amp;gt;
 * &amp;lt;/sequence&amp;gt; &amp;lt;/restriction&amp;gt; &amp;lt;/complexContent&amp;gt; &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BankOffice_DTO_OUT", propOrder = { "id", "bankEntityId", "bankOfficeBICCode", "branchType", "code",
        "geographicSiteId", "validFor" })
public class BankOffice_DTO_OUT implements Serializable {

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "Id", required = true)
    @NotNull
    protected BigDecimal id;
    @XmlElement(name = "BankEntityId", required = true)
    @NotNull
    protected BigDecimal bankEntityId;
    @XmlElement(name = "BankOfficeBICCode")
    protected String bankOfficeBICCode;
    @XmlElement(name = "BranchType", required = true)
    @NotNull
    @Pattern(regexp = "0|1|2|7|8|9")
    protected String branchType;
    @XmlElement(name = "Code", required = true)
    @NotNull
    protected String code;
    @XmlElement(name = "GeographicSiteId", type = String.class)
    @XmlJavaTypeAdapter(XSDAdaptadorLong.class)
    @XmlSchemaType(name = "integer")
    protected Long geographicSiteId;
    @XmlElement(name = "ValidFor", required = true)
    @NotNull
    @Valid
    protected TimePeriod validFor;

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
     * Gets the value of the bankEntityId property.
     * 
     * @return possible object is {@link BigDecimal }
     * 
     */
    public BigDecimal getBankEntityId() {
        return bankEntityId;
    }

    /**
     * Sets the value of the bankEntityId property.
     * 
     * @param value
     *            allowed object is {@link BigDecimal }
     * 
     */
    public void setBankEntityId(BigDecimal value) {
        this.bankEntityId = value;
    }

    /**
     * Gets the value of the bankOfficeBICCode property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getBankOfficeBICCode() {
        return bankOfficeBICCode;
    }

    /**
     * Sets the value of the bankOfficeBICCode property.
     * 
     * @param value
     *            allowed object is {@link String }
     * 
     */
    public void setBankOfficeBICCode(String value) {
        this.bankOfficeBICCode = value;
    }

    /**
     * Gets the value of the branchType property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getBranchType() {
        return branchType;
    }

    /**
     * Sets the value of the branchType property.
     * 
     * @param value
     *            allowed object is {@link String }
     * 
     */
    public void setBranchType(String value) {
        this.branchType = value;
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
     * Gets the value of the geographicSiteId property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public Long getGeographicSiteId() {
        return geographicSiteId;
    }

    /**
     * Sets the value of the geographicSiteId property.
     * 
     * @param value
     *            allowed object is {@link String }
     * 
     */
    public void setGeographicSiteId(Long value) {
        this.geographicSiteId = value;
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

}
