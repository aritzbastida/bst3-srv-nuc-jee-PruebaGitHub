
package com.telefonica.bst3.srv.nuc.pruebagithub.msg.readfilerecord;

import java.io.Serializable;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * &lt;p&gt;Java class for ReadFileRecord_OUT complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt; &amp;lt;complexType name="ReadFileRecord_OUT"&amp;gt; &amp;lt;complexContent&amp;gt; &amp;lt;restriction
 * base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt; &amp;lt;sequence&amp;gt; &amp;lt;element name="Action"
 * type="{http://www.w3.org/2001/XMLSchema}string"/&amp;gt; &amp;lt;element name="ListTable"
 * type="{http://telefonica.com/bst3/srv/PruebaGitHub/msg/readFileRecord-v4}ListTable_DTO_OUT" maxOccurs="unbounded"
 * minOccurs="0"/&amp;gt; &amp;lt;/sequence&amp;gt; &amp;lt;/restriction&amp;gt; &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt; &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReadFileRecord_OUT", propOrder = { "action", "listTables" })
@XmlRootElement(name = "ReadFileRecord_OUT")
public class ReadFileRecord_OUT implements Serializable {

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "Action", required = true)
    @NotNull
    protected String action;
    @XmlElement(name = "ListTable")
    @Valid
    protected com.telefonica.bst3.srv.nuc.pruebagithub.msg.readfilerecord.ListTable_DTO_OUT[] listTables;

    /**
     * Gets the value of the action property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getAction() {
        return action;
    }

    /**
     * Sets the value of the action property.
     * 
     * @param value
     *            allowed object is {@link String }
     * 
     */
    public void setAction(String value) {
        this.action = value;
    }

    /**
     * 
     * 
     * @return array of {@link com.telefonica.bst3.srv.nuc.pruebagithub.msg.readfilerecord.ListTable_DTO_OUT }
     * 
     */
    public com.telefonica.bst3.srv.nuc.pruebagithub.msg.readfilerecord.ListTable_DTO_OUT[] getListTables() {
        if (this.listTables == null) {
            return new com.telefonica.bst3.srv.nuc.pruebagithub.msg.readfilerecord.ListTable_DTO_OUT[0];
        }
        com.telefonica.bst3.srv.nuc.pruebagithub.msg.readfilerecord.ListTable_DTO_OUT[] retVal = new com.telefonica.bst3.srv.nuc.pruebagithub.msg.readfilerecord.ListTable_DTO_OUT[this.listTables.length];
        System.arraycopy(this.listTables, 0, retVal, 0, this.listTables.length);
        return (retVal);
    }

    /**
     * 
     * 
     * @return one of {@link com.telefonica.bst3.srv.nuc.pruebagithub.msg.readfilerecord.ListTable_DTO_OUT }
     * 
     */
    public com.telefonica.bst3.srv.nuc.pruebagithub.msg.readfilerecord.ListTable_DTO_OUT getListTables(int idx) {
        if (this.listTables == null) {
            throw new IndexOutOfBoundsException();
        }
        return this.listTables[idx];
    }

    public int getListTablesLength() {
        if (this.listTables == null) {
            return 0;
        }
        return this.listTables.length;
    }

    /**
     * 
     * 
     * @param values
     *            allowed objects are
     *            {@link com.telefonica.bst3.srv.nuc.pruebagithub.msg.readfilerecord.ListTable_DTO_OUT }
     * 
     */
    public void setListTables(com.telefonica.bst3.srv.nuc.pruebagithub.msg.readfilerecord.ListTable_DTO_OUT[] values) {
        int len = values.length;
        this.listTables = ((com.telefonica.bst3.srv.nuc.pruebagithub.msg.readfilerecord.ListTable_DTO_OUT[]) new com.telefonica.bst3.srv.nuc.pruebagithub.msg.readfilerecord.ListTable_DTO_OUT[len]);
        for (int i = 0; (i < len); i++) {
            this.listTables[i] = values[i];
        }
    }

    /**
     * 
     * 
     * @param value
     *            allowed object is
     *            {@link com.telefonica.bst3.srv.nuc.pruebagithub.msg.readfilerecord.ListTable_DTO_OUT }
     * 
     */
    public com.telefonica.bst3.srv.nuc.pruebagithub.msg.readfilerecord.ListTable_DTO_OUT setListTables(int idx,
            com.telefonica.bst3.srv.nuc.pruebagithub.msg.readfilerecord.ListTable_DTO_OUT value) {
        return this.listTables[idx] = value;
    }

}
