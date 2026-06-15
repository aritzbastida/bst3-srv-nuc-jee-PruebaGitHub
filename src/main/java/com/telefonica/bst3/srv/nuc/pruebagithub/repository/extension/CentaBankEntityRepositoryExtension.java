package com.telefonica.bst3.srv.nuc.pruebagithub.repository.extension;

import java.math.BigDecimal;

import com.telefonica.bst3.model.CentaBankEntity;

/**
 * The DAO interface for the entities
 * 
 * 
 */
public interface CentaBankEntityRepositoryExtension {

    /**
     * 
     * 
     * @return CentaBankEntity
     * @param java_math_BigDecimal
     *            id
     */
    public CentaBankEntity findCentaBankEntity(BigDecimal id);

}
