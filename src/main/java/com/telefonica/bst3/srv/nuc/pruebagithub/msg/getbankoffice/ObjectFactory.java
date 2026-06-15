
package com.telefonica.bst3.srv.nuc.pruebagithub.msg.getbankoffice;

import javax.xml.bind.annotation.XmlRegistry;

/**
 * This object contains factory methods for each Java content interface and Java element interface generated in the
 * com.telefonica.bst3.srv.nuc.pruebagithub.msg.getbankoffice package. &lt;p&gt;An ObjectFactory allows you to
 * programatically construct new instances of the Java representation for XML content. The Java representation of XML
 * content can consist of schema derived interfaces and classes representing the binding of schema type definitions,
 * element declarations and model groups. Factory methods for each of these are provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package:
     * com.telefonica.bst3.srv.nuc.pruebagithub.msg.getbankoffice
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetBankOffice_OUT }
     * 
     */
    public GetBankOffice_OUT createGetBankOffice_OUT() {
        return new GetBankOffice_OUT();
    }

    /**
     * Create an instance of {@link BankOffice_DTO_OUT }
     * 
     */
    public BankOffice_DTO_OUT createBankOffice_DTO_OUT() {
        return new BankOffice_DTO_OUT();
    }

    /**
     * Create an instance of {@link GetBankOffice_IN }
     * 
     */
    public GetBankOffice_IN createGetBankOffice_IN() {
        return new GetBankOffice_IN();
    }

    /**
     * Create an instance of {@link TimePeriod }
     * 
     */
    public TimePeriod createTimePeriod() {
        return new TimePeriod();
    }

}
