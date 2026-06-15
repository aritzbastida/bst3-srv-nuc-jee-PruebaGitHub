
package com.telefonica.bst3.srv.nuc.pruebagithub.msg.readfilerecord;

import java.io.Serializable;

import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Contains the columns of each row
 * 
 * &lt;p&gt;Java class for ListColumn_DTO_OUT complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt; &amp;lt;complexType name="ListColumn_DTO_OUT"&amp;gt; &amp;lt;complexContent&amp;gt; &amp;lt;restriction
 * base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt; &amp;lt;sequence&amp;gt; &amp;lt;element name="ColumName"
 * type="{http://www.w3.org/2001/XMLSchema}string"/&amp;gt; &amp;lt;element name="ColumnValue"
 * type="{http://www.w3.org/2001/XMLSchema}string"/&amp;gt; &amp;lt;/sequence&amp;gt; &amp;lt;/restriction&amp;gt;
 * &amp;lt;/complexContent&amp;gt; &amp;lt;/complexType&amp;gt; &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ListColumn_DTO_OUT", propOrder = { "columName", "columnValue" })
public class ListColumn_DTO_OUT implements Serializable {

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "ColumName", required = true)
    @NotNull
    protected String columName;
    @XmlElement(name = "ColumnValue", required = true)
    @NotNull
    protected String columnValue;

    /**
     * Gets the value of the columName property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getColumName() {
        return columName;
    }

    /**
     * Sets the value of the columName property.
     * 
     * @param value
     *            allowed object is {@link String }
     * 
     */
    public void setColumName(String value) {
        this.columName = value;
    }

    /**
     * Gets the value of the columnValue property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getColumnValue() {
        return columnValue;
    }

    /**
     * Sets the value of the columnValue property.
     * 
     * @param value
     *            allowed object is {@link String }
     * 
     */
    public void setColumnValue(String value) {
        this.columnValue = value;
    }

}
