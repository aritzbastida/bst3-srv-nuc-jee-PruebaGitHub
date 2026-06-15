package com.telefonica.bst3.srv.nuc.pruebagithub.repository;

import java.math.BigDecimal;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

import com.telefonica.bst3.model.CentaBankOffice;
import com.telefonica.bst3.srv.nuc.pruebagithub.repository.extension.CentaBankOfficeRepositoryExtension;

/**
 * The Repository interface for the entities
 * 
 */
@Repository(value = "com.telefonica.bst3.srv.nuc.pruebagithub.repository.CentaBankOfficeRepository")
public interface CentaBankOfficeRepository extends JpaRepository<CentaBankOffice, BigDecimal>,
        JpaSpecificationExecutor<CentaBankOffice>, CentaBankOfficeRepositoryExtension {

}
