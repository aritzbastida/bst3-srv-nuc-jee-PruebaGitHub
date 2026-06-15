package com.telefonica.bst3.srv.nuc.pruebagithub.repository.extension.impl;

import java.math.BigDecimal;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;

import com.telefonica.bst3.model.CentaBankEntity;
import com.telefonica.bst3.srv.nuc.pruebagithub.repository.extension.CentaBankEntityRepositoryExtension;

/**
 * The DAO implementation for the entities.
 * 
 * 
 */
public class CentaBankEntityRepositoryExtensionImpl implements CentaBankEntityRepositoryExtension {
    @Autowired
    private EntityManager entityManager;

    /**
     * 
     * 
     * @return CentaBankEntity
     * @param java_math_BigDecimal
     *            id
     */
    public CentaBankEntity findCentaBankEntity(BigDecimal id) {
        return null;
    }

}
