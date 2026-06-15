package com.telefonica.bst3.srv.nuc.pruebagithub.repository.extension.impl;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.telefonica.bst3.model.CentvBankOffice;
import com.telefonica.bst3.srv.nuc.pruebagithub.repository.dto.GetBankOffice_OUT;
import com.telefonica.bst3.srv.nuc.pruebagithub.repository.extension.CentvBankOfficeRepositoryExtension;

/**
 * The DAO implementation for the entities. The Repository interface for the entities
 * 
 * 
 */
public class CentvBankOfficeRepositoryExtensionImpl implements CentvBankOfficeRepositoryExtension {
    @Autowired
    private EntityManager entityManager;

    /**
     * 
     * 
     * @return GetBankOffice_OUT
     * @param Date
     *            validDate
     * @param String
     *            bankEntityCode
     * @param String
     *            bankOfficeCode
     * @param java_math_BigDecimal
     *            bankOfficeId
     */
    public GetBankOffice_OUT getBankOffice(Date validDate, String bankEntityCode, String bankOfficeCode,
            BigDecimal bankOfficeId) {
        return null;
    }

    /**
     * 
     * 
     * @return List <CentvBankOffice>
     * @param String
     *            bankEntityCode
     * @param String
     *            bankOfficeCode
     */
    public List<CentvBankOffice> findCentvBankOfficeByBankCoBank(String bankEntityCode, String bankOfficeCode) {
        return null;
    }

    /**
     * 
     * 
     * @return CentvBankOffice
     * @param java_math_BigDecimal
     *            id
     */
    public CentvBankOffice findCentvBankOffice(BigDecimal id) {
        return null;
    }

}
