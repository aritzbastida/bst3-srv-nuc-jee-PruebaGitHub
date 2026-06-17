
package com.telefonica.bst3.srv.nuc.pruebagithub.msg.readfilerecord;

import java.io.Serializable;

import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * &lt;p&gt;Java class for ReadFileRecord_IN complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt; &amp;lt;complexType name="ReadFileRecord_IN"&amp;gt; &amp;lt;complexContent&amp;gt; &amp;lt;restriction
 * base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt; &amp;lt;sequence&amp;gt; &amp;lt;element
 * name="FilePathChanged" type="{http://www.w3.org/2001/XMLSchema}string"/&amp;gt; &amp;lt;/sequence&amp;gt;
 * &amp;lt;/restriction&amp;gt; &amp;lt;/complexContent&amp;gt; &amp;lt;/complexType&amp;gt; &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReadFileRecord_IN", propOrder = { "filePathChanged" })
@XmlRootElement(name = "ReadFileRecord_IN")
public class ReadFileRecord_IN implements Serializable {

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "FilePathChanged", required = true)
    @NotNull
    protected String filePathChanged;

    /**
     * Gets the value of the filePathChanged property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getFilePathChanged() {
        return filePathChanged;
    }

    /**
     * Sets the value of the filePathChanged property.
     * 
     * @param value
     *            allowed object is {@link String }
     * 
     */
    public void setFilePathChanged(String value) {
        this.filePathChanged = value;
    }

}
