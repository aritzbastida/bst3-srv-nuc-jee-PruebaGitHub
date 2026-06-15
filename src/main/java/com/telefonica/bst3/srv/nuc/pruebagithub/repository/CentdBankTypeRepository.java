package com.telefonica.bst3.srv.nuc.pruebagithub.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

import com.telefonica.bst3.model.CentdBankType;
import com.telefonica.bst3.srv.nuc.pruebagithub.repository.extension.CentdBankTypeRepositoryExtension;

/**
 * The Repository interface for the entities
 * 
 */
@Repository(value = "com.telefonica.bst3.srv.nuc.pruebagithub.repository.CentdBankTypeRepository")
public interface CentdBankTypeRepository extends JpaRepository<CentdBankType, Long>,
        JpaSpecificationExecutor<CentdBankType>, CentdBankTypeRepositoryExtension {

}
