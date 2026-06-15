
package com.telefonica.bst3.srv.nuc.pruebagithub.msg.readfilerecord;

import java.io.Serializable;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Contains the rows of the file.
 * 
 * &lt;p&gt;Java class for ListTable_DTO_OUT complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt; &amp;lt;complexType name="ListTable_DTO_OUT"&amp;gt; &amp;lt;complexContent&amp;gt; &amp;lt;restriction
 * base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt; &amp;lt;sequence&amp;gt; &amp;lt;element name="TableName"
 * type="{http://www.w3.org/2001/XMLSchema}string"/&amp;gt; &amp;lt;element name="ListColumn"
 * type="{http://telefonica.com/bst3/srv/PruebaGitHub/msg/readFileRecord-v4}ListColumn_DTO_OUT"
 * maxOccurs="unbounded"/&amp;gt; &amp;lt;/sequence&amp;gt; &amp;lt;/restriction&amp;gt; &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt; &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ListTable_DTO_OUT", propOrder = { "tableName", "listColumns" })
public class ListTable_DTO_OUT implements Serializable {

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "TableName", required = true)
    @NotNull
    protected String tableName;
    @XmlElement(name = "ListColumn", required = true)
    @NotNull
    @Size(min = 1)
    @Valid
    protected com.telefonica.bst3.srv.nuc.pruebagithub.msg.readfilerecord.ListColumn_DTO_OUT[] listColumns;

    /**
     * Gets the value of the tableName property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getTableName() {
        return tableName;
    }

    /**
     * Sets the value of the tableName property.
     * 
     * @param value
     *            allowed object is {@link String }
     * 
     */
    public void setTableName(String value) {
        this.tableName = value;
    }

    /**
     * 
     * 
     * @return array of {@link com.telefonica.bst3.srv.nuc.pruebagithub.msg.readfilerecord.ListColumn_DTO_OUT }
     * 
     */
    public com.telefonica.bst3.srv.nuc.pruebagithub.msg.readfilerecord.ListColumn_DTO_OUT[] getListColumns() {
        if (this.listColumns == null) {
            return new com.telefonica.bst3.srv.nuc.pruebagithub.msg.readfilerecord.ListColumn_DTO_OUT[0];
        }
        com.telefonica.bst3.srv.nuc.pruebagithub.msg.readfilerecord.ListColumn_DTO_OUT[] retVal = new com.telefonica.bst3.srv.nuc.pruebagithub.msg.readfilerecord.ListColumn_DTO_OUT[this.listColumns.length];
        System.arraycopy(this.listColumns, 0, retVal, 0, this.listColumns.length);
        return (retVal);
    }

    /**
     * 
     * 
     * @return one of {@link com.telefonica.bst3.srv.nuc.pruebagithub.msg.readfilerecord.ListColumn_DTO_OUT }
     * 
     */
    public com.telefonica.bst3.srv.nuc.pruebagithub.msg.readfilerecord.ListColumn_DTO_OUT getListColumns(int idx) {
        if (this.listColumns == null) {
            throw new IndexOutOfBoundsException();
        }
        return this.listColumns[idx];
    }

    public int getListColumnsLength() {
        if (this.listColumns == null) {
            return 0;
        }
        return this.listColumns.length;
    }

    /**
     * 
     * 
     * @param values
     *            allowed objects are
     *            {@link com.telefonica.bst3.srv.nuc.pruebagithub.msg.readfilerecord.ListColumn_DTO_OUT }
     * 
     */
    public void setListColumns(
            com.telefonica.bst3.srv.nuc.pruebagithub.msg.readfilerecord.ListColumn_DTO_OUT[] values) {
        int len = values.length;
        this.listColumns = ((com.telefonica.bst3.srv.nuc.pruebagithub.msg.readfilerecord.ListColumn_DTO_OUT[]) new com.telefonica.bst3.srv.nuc.pruebagithub.msg.readfilerecord.ListColumn_DTO_OUT[len]);
        for (int i = 0; (i < len); i++) {
            this.listColumns[i] = values[i];
        }
    }

    /**
     * 
     * 
     * @param value
     *            allowed object is
     *            {@link com.telefonica.bst3.srv.nuc.pruebagithub.msg.readfilerecord.ListColumn_DTO_OUT }
     * 
     */
    public com.telefonica.bst3.srv.nuc.pruebagithub.msg.readfilerecord.ListColumn_DTO_OUT setListColumns(int idx,
            com.telefonica.bst3.srv.nuc.pruebagithub.msg.readfilerecord.ListColumn_DTO_OUT value) {
        return this.listColumns[idx] = value;
    }

}
