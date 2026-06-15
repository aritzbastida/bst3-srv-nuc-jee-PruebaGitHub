
package com.telefonica.bst3.srv.nuc.pruebagithub.msg.getbank;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.telefonica.tran.comarq.cc.adaptadores.XSDAdaptadorDate;
import com.telefonica.tran.comarq.cc.adaptadores.XSDAdaptadorLong;

/**
 * &lt;p&gt;Java class for GetBank_IN complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt; &amp;lt;complexType name="GetBank_IN"&amp;gt; &amp;lt;complexContent&amp;gt; &amp;lt;restriction
 * base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt; &amp;lt;sequence&amp;gt; &amp;lt;element name="Id"
 * type="{http://www.w3.org/2001/XMLSchema}integer"/&amp;gt; &amp;lt;element name="Code"
 * type="{http://www.w3.org/2001/XMLSchema}string"/&amp;gt; &amp;lt;element name="Tax"
 * type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt; &amp;lt;element name="startDate"
 * type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&amp;gt; &amp;lt;element name="endDate"
 * type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&amp;gt; &amp;lt;element name="Optional"
 * type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt; &amp;lt;element name="ProductId"
 * type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="5" minOccurs="0"/&amp;gt; &amp;lt;/sequence&amp;gt;
 * &amp;lt;/restriction&amp;gt; &amp;lt;/complexContent&amp;gt; &amp;lt;/complexType&amp;gt; &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetBank_IN", propOrder = { "id", "code", "tax", "startDate", "endDate", "optional", "productIds" })
@XmlRootElement(name = "GetBank_IN")
public class GetBank_IN implements Serializable {

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "Id", required = true, type = String.class)
    @XmlJavaTypeAdapter(XSDAdaptadorLong.class)
    @XmlSchemaType(name = "integer")
    @NotNull
    @JsonIgnore
    protected Long id;
    @XmlElement(name = "Code", required = true)
    @NotNull
    @JsonIgnore
    protected String code;
    @XmlElement(name = "Tax")
    @JsonIgnore
    protected BigDecimal tax;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(XSDAdaptadorDate.class)
    @XmlSchemaType(name = "date")
    @JsonIgnore
    protected Date startDate;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(XSDAdaptadorDate.class)
    @XmlSchemaType(name = "date")
    @JsonIgnore
    protected Date endDate;
    @XmlElement(name = "Optional")
    @JsonIgnore
    protected Boolean optional;
    @XmlElement(name = "ProductId")
    @Size(min = 0, max = 5)
    @JsonIgnore
    protected String[] productIds;

    /**
     * Gets the value of the id property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public Long getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *            allowed object is {@link String }
     * 
     */
    public void setId(Long value) {
        this.id = value;
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
     * Gets the value of the tax property.
     * 
     * @return possible object is {@link BigDecimal }
     * 
     */
    public BigDecimal getTax() {
        return tax;
    }

    /**
     * Sets the value of the tax property.
     * 
     * @param value
     *            allowed object is {@link BigDecimal }
     * 
     */
    public void setTax(BigDecimal value) {
        this.tax = value;
    }

    /**
     * Gets the value of the startDate property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public Date getStartDate() {
        return startDate;
    }

    /**
     * Sets the value of the startDate property.
     * 
     * @param value
     *            allowed object is {@link String }
     * 
     */
    public void setStartDate(Date value) {
        this.startDate = value;
    }

    /**
     * Gets the value of the endDate property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public Date getEndDate() {
        return endDate;
    }

    /**
     * Sets the value of the endDate property.
     * 
     * @param value
     *            allowed object is {@link String }
     * 
     */
    public void setEndDate(Date value) {
        this.endDate = value;
    }

    /**
     * Gets the value of the optional property.
     * 
     * @return possible object is {@link Boolean }
     * 
     */
    public Boolean isOptional() {
        return optional;
    }

    /**
     * Sets the value of the optional property.
     * 
     * @param value
     *            allowed object is {@link Boolean }
     * 
     */
    public void setOptional(Boolean value) {
        this.optional = value;
    }

    /**
     * 
     * 
     * @return array of {@link String }
     * 
     */
    public String[] getProductIds() {
        if (this.productIds == null) {
            return new String[0];
        }
        String[] retVal = new String[this.productIds.length];
        System.arraycopy(this.productIds, 0, retVal, 0, this.productIds.length);
        return (retVal);
    }

    /**
     * 
     * 
     * @return one of {@link String }
     * 
     */
    public String getProductIds(int idx) {
        if (this.productIds == null) {
            throw new IndexOutOfBoundsException();
        }
        return this.productIds[idx];
    }

    public int getProductIdsLength() {
        if (this.productIds == null) {
            return 0;
        }
        return this.productIds.length;
    }

    /**
     * 
     * 
     * @param values
     *            allowed objects are {@link String }
     * 
     */
    public void setProductIds(String[] values) {
        int len = values.length;
        this.productIds = ((String[]) new String[len]);
        for (int i = 0; (i < len); i++) {
            this.productIds[i] = values[i];
        }
    }

    /**
     * 
     * 
     * @param value
     *            allowed object is {@link String }
     * 
     */
    public String setProductIds(int idx, String value) {
        return this.productIds[idx] = value;
    }

}
