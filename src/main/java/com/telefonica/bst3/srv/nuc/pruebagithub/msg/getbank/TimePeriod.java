
package com.telefonica.bst3.srv.nuc.pruebagithub.msg.getbank;

import java.io.Serializable;
import java.util.Date;

import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import com.telefonica.tran.comarq.cc.adaptadores.XSDAdaptadorDateTimeMs;

/**
 * A base / value business entity used to represent a period of time, between two timepoints
 * 
 * &lt;p&gt;Java class for TimePeriod complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt; &amp;lt;complexType name="TimePeriod"&amp;gt; &amp;lt;complexContent&amp;gt; &amp;lt;restriction
 * base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt; &amp;lt;sequence&amp;gt; &amp;lt;element name="EndDateTime"
 * type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&amp;gt; &amp;lt;element name="StartDateTime"
 * type="{http://www.w3.org/2001/XMLSchema}dateTime"/&amp;gt; &amp;lt;/sequence&amp;gt; &amp;lt;/restriction&amp;gt;
 * &amp;lt;/complexContent&amp;gt; &amp;lt;/complexType&amp;gt; &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TimePeriod", propOrder = { "endDateTime", "startDateTime" })
public class TimePeriod implements Serializable {

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "EndDateTime", type = String.class)
    @XmlJavaTypeAdapter(XSDAdaptadorDateTimeMs.class)
    @XmlSchemaType(name = "dateTime")
    protected Date endDateTime;
    @XmlElement(name = "StartDateTime", required = true, type = String.class)
    @XmlJavaTypeAdapter(XSDAdaptadorDateTimeMs.class)
    @XmlSchemaType(name = "dateTime")
    @NotNull
    protected Date startDateTime;

    /**
     * Gets the value of the endDateTime property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public Date getEndDateTime() {
        return endDateTime;
    }

    /**
     * Sets the value of the endDateTime property.
     * 
     * @param value
     *            allowed object is {@link String }
     * 
     */
    public void setEndDateTime(Date value) {
        this.endDateTime = value;
    }

    /**
     * Gets the value of the startDateTime property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public Date getStartDateTime() {
        return startDateTime;
    }

    /**
     * Sets the value of the startDateTime property.
     * 
     * @param value
     *            allowed object is {@link String }
     * 
     */
    public void setStartDateTime(Date value) {
        this.startDateTime = value;
    }

}
