package com.telefonica.bst3.srv.nuc.pruebagithub.repository.extension.impl;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.telefonica.bst3.model.CentvBankEntity;
import com.telefonica.bst3.srv.nuc.pruebagithub.repository.dto.GetBank_OUT;
import com.telefonica.bst3.srv.nuc.pruebagithub.repository.extension.CentvBankEntityRepositoryExtension;

/**
 * The DAO implementation for the entities. The Repository interface for the entities
 * 
 * 
 */
public class CentvBankEntityRepositoryExtensionImpl implements CentvBankEntityRepositoryExtension {
    @Autowired
    private EntityManager entityManager;

    /**
     * 
     * 
     * @return GetBank_OUT
     * @param java_math_BigDecimal
     *            bankEntityId
     * @param String
     *            bankEntityCode
     * @param Date
     *            validDate
     */
    public GetBank_OUT getBank(BigDecimal bankEntityId, String bankEntityCode, Date validDate) {
        return null;
    }

    /**
     * 
     * 
     * @return List <CentvBankEntity>
     * @param String
     *            bankEntityCode
     */
    public List<CentvBankEntity> findCentvBankEntityByBankCoBank(String bankEntityCode) {
        return null;
    }

    /**
     * 
     * 
     * @return CentvBankEntity
     * @param java_math_BigDecimal
     *            id
     */
    public CentvBankEntity findCentvBankEntity(BigDecimal id) {
        return null;
    }

    /**
     * 
     * 
     * @return List <CentvBankEntity>
     * @param String
     *            bankCoBank
     */
    public List<CentvBankEntity> findAllCentvBankEntityByBankCoBank(String bankCoBank) {
        return null;
    }

}
