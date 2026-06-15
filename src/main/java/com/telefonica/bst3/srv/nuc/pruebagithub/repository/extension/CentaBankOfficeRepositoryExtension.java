package com.telefonica.bst3.srv.nuc.pruebagithub.repository.extension;

import java.math.BigDecimal;

import com.telefonica.bst3.model.CentaBankOffice;

/**
 * The DAO interface for the entities
 * 
 * 
 */
public interface CentaBankOfficeRepositoryExtension {

    /**
     * 
     * 
     * @return CentaBankOffice
     * @param java_math_BigDecimal
     *            id
     */
    public CentaBankOffice findCentaBankOffice(BigDecimal id);

}
