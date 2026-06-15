package com.telefonica.bst3.srv.nuc.pruebagithub.repository.extension;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import com.telefonica.bst3.model.CentvBankOffice;
import com.telefonica.bst3.srv.nuc.pruebagithub.repository.dto.GetBankOffice_OUT;

/**
 * The DAO interface for the entities The Repository interface for the entities
 * 
 * 
 */
public interface CentvBankOfficeRepositoryExtension {

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
            BigDecimal bankOfficeId);

    /**
     * 
     * 
     * @return List <CentvBankOffice>
     * @param String
     *            bankEntityCode
     * @param String
     *            bankOfficeCode
     */
    public List<CentvBankOffice> findCentvBankOfficeByBankCoBank(String bankEntityCode, String bankOfficeCode);

    /**
     * 
     * 
     * @return CentvBankOffice
     * @param java_math_BigDecimal
     *            id
     */
    public CentvBankOffice findCentvBankOffice(BigDecimal id);

}
