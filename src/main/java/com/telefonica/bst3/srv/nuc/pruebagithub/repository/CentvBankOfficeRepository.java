package com.telefonica.bst3.srv.nuc.pruebagithub.repository;

import java.math.BigDecimal;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

import com.telefonica.bst3.model.CentvBankOffice;
import com.telefonica.bst3.srv.nuc.pruebagithub.repository.extension.CentvBankOfficeRepositoryExtension;

/**
 * The Repository interface for the entities The Repository interface for the entities
 * 
 */
@Repository(value = "com.telefonica.bst3.srv.nuc.pruebagithub.repository.CentvBankOfficeRepository")
public interface CentvBankOfficeRepository extends JpaRepository<CentvBankOffice, BigDecimal>,
        JpaSpecificationExecutor<CentvBankOffice>, CentvBankOfficeRepositoryExtension {

}
