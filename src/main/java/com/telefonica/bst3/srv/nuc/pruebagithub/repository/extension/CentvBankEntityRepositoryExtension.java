package com.telefonica.bst3.srv.nuc.pruebagithub.repository.extension;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import com.telefonica.bst3.model.CentvBankEntity;
import com.telefonica.bst3.srv.nuc.pruebagithub.repository.dto.GetBank_OUT;

/**
 * The DAO interface for the entities The Repository interface for the entities
 * 
 * 
 */
public interface CentvBankEntityRepositoryExtension {

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
    public GetBank_OUT getBank(BigDecimal bankEntityId, String bankEntityCode, Date validDate);

    /**
     * 
     * 
     * @return List <CentvBankEntity>
     * @param String
     *            bankEntityCode
     */
    public List<CentvBankEntity> findCentvBankEntityByBankCoBank(String bankEntityCode);

    /**
     * 
     * 
     * @return CentvBankEntity
     * @param java_math_BigDecimal
     *            id
     */
    public CentvBankEntity findCentvBankEntity(BigDecimal id);

    /**
     * 
     * 
     * @return List <CentvBankEntity>
     * @param String
     *            bankCoBank
     */
    public List<CentvBankEntity> findAllCentvBankEntityByBankCoBank(String bankCoBank);

}
