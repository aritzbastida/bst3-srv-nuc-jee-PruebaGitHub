
package com.telefonica.bst3.srv.nuc.pruebagithub.msg.loadfilerecord;

import javax.xml.bind.annotation.XmlRegistry;

/**
 * This object contains factory methods for each Java content interface and Java element interface generated in the
 * com.telefonica.bst3.srv.nuc.pruebagithub.msg.loadfilerecord package. &lt;p&gt;An ObjectFactory allows you to
 * programatically construct new instances of the Java representation for XML content. The Java representation of XML
 * content can consist of schema derived interfaces and classes representing the binding of schema type definitions,
 * element declarations and model groups. Factory methods for each of these are provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package:
     * com.telefonica.bst3.srv.nuc.pruebagithub.msg.loadfilerecord
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link LoadFileRecord_IN }
     * 
     */
    public LoadFileRecord_IN createLoadFileRecord_IN() {
        return new LoadFileRecord_IN();
    }

    /**
     * Create an instance of {@link BankEntity_DTO_IN }
     * 
     */
    public BankEntity_DTO_IN createBankEntity_DTO_IN() {
        return new BankEntity_DTO_IN();
    }

    /**
     * Create an instance of {@link BankOffice_DTO_IN }
     * 
     */
    public BankOffice_DTO_IN createBankOffice_DTO_IN() {
        return new BankOffice_DTO_IN();
    }

    /**
     * Create an instance of {@link TimePeriod }
     * 
     */
    public TimePeriod createTimePeriod() {
        return new TimePeriod();
    }

}
