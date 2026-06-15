
package com.telefonica.bst3.srv.nuc.pruebagithub.msg.getbank;

import javax.xml.bind.annotation.XmlRegistry;

/**
 * This object contains factory methods for each Java content interface and Java element interface generated in the
 * com.telefonica.bst3.srv.nuc.pruebagithub.msg.getbank package. &lt;p&gt;An ObjectFactory allows you to programatically
 * construct new instances of the Java representation for XML content. The Java representation of XML content can
 * consist of schema derived interfaces and classes representing the binding of schema type definitions, element
 * declarations and model groups. Factory methods for each of these are provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package:
     * com.telefonica.bst3.srv.nuc.pruebagithub.msg.getbank
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetBank_IN }
     * 
     */
    public GetBank_IN createGetBank_IN() {
        return new GetBank_IN();
    }

    /**
     * Create an instance of {@link GetBank_OUT }
     * 
     */
    public GetBank_OUT createGetBank_OUT() {
        return new GetBank_OUT();
    }

    /**
     * Create an instance of {@link BankEntity_DTO_OUT }
     * 
     */
    public BankEntity_DTO_OUT createBankEntity_DTO_OUT() {
        return new BankEntity_DTO_OUT();
    }

    /**
     * Create an instance of {@link TimePeriod }
     * 
     */
    public TimePeriod createTimePeriod() {
        return new TimePeriod();
    }

}
