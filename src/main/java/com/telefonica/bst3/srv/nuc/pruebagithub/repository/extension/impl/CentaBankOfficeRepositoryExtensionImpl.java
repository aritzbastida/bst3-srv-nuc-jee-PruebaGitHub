package com.telefonica.bst3.srv.nuc.pruebagithub.repository.extension.impl;

import java.math.BigDecimal;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;

import com.telefonica.bst3.model.CentaBankOffice;
import com.telefonica.bst3.srv.nuc.pruebagithub.repository.extension.CentaBankOfficeRepositoryExtension;

/**
 * The DAO implementation for the entities.
 * 
 * 
 */
public class CentaBankOfficeRepositoryExtensionImpl implements CentaBankOfficeRepositoryExtension {
    @Autowired
    private EntityManager entityManager;

    /**
     * 
     * 
     * @return CentaBankOffice
     * @param java_math_BigDecimal
     *            id
     */
    public CentaBankOffice findCentaBankOffice(BigDecimal id) {
        return null;
    }

}
