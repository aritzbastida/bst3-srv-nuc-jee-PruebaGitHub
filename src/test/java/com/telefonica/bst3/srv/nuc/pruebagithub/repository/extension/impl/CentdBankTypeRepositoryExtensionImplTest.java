package com.telefonica.bst3.srv.nuc.pruebagithub.repository.extension.impl;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.jdbc.Sql;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import com.telefonica.bst3.model.CentdBankType;
import com.telefonica.bst3.srv.nuc.pruebagithub.repository.CentdBankTypeRepository;
import com.telefonica.coco.boot.test.config.RepositoryTest;

/**
 * Implementacion de las pruebas de la entidad
 */
@RunWith(SpringRunner.class)
@RepositoryTest
@Transactional
@Sql(scripts = "/data/insert.sql")
public class CentdBankTypeRepositoryExtensionImplTest {
    @Autowired
    private CentdBankTypeRepository centdBankTypeRepository;

    /**
     * Prueba de la consulta findAllCentdBankType
     */
    @Test
    public void findAllCentdBankTypeTest() {

        List<CentdBankType> result = centdBankTypeRepository.findAllCentdBankType();
        org.junit.Assert.assertNull(result);
    }

}
