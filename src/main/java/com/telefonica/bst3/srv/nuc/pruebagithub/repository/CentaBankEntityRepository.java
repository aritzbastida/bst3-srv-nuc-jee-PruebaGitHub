package com.telefonica.bst3.srv.nuc.pruebagithub.repository;

import java.math.BigDecimal;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

import com.telefonica.bst3.model.CentaBankEntity;
import com.telefonica.bst3.srv.nuc.pruebagithub.repository.extension.CentaBankEntityRepositoryExtension;

/**
 * The Repository interface for the entities
 * 
 */
@Repository(value = "com.telefonica.bst3.srv.nuc.pruebagithub.repository.CentaBankEntityRepository")
public interface CentaBankEntityRepository extends JpaRepository<CentaBankEntity, BigDecimal>,
        JpaSpecificationExecutor<CentaBankEntity>, CentaBankEntityRepositoryExtension {

}
