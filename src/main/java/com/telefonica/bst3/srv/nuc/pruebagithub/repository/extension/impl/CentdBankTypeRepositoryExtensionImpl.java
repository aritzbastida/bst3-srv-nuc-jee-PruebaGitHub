package com.telefonica.bst3.srv.nuc.pruebagithub.repository.extension.impl;

import java.util.List;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;

import com.telefonica.bst3.model.CentdBankType;
import com.telefonica.bst3.srv.nuc.pruebagithub.repository.extension.CentdBankTypeRepositoryExtension;

/**
 * The DAO implementation for the entities.
 * 
 * 
 */
public class CentdBankTypeRepositoryExtensionImpl implements CentdBankTypeRepositoryExtension {
    @Autowired
    private EntityManager entityManager;

    /**
     * 
     * 
     * @return List <CentdBankType>
     */
    public List<CentdBankType> findAllCentdBankType() {
        return null;
    }

}
