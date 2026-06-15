package com.telefonica.bst3.srv.nuc.pruebagithub.repository.extension.impl;

import java.math.BigDecimal;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.jdbc.Sql;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import com.telefonica.bst3.model.CentaBankOffice;
import com.telefonica.bst3.srv.nuc.pruebagithub.repository.CentaBankOfficeRepository;
import com.telefonica.coco.boot.test.config.RepositoryTest;

/**
 * Implementacion de las pruebas de la entidad
 */
@RunWith(SpringRunner.class)
@RepositoryTest
@Transactional
@Sql(scripts = "/data/insert.sql")
public class CentaBankOfficeRepositoryExtensionImplTest {
    @Autowired
    private CentaBankOfficeRepository centaBankOfficeRepository;

    /**
     * Prueba de la consulta findCentaBankOffice
     */
    @Test
    public void findCentaBankOffice_Id_BigDecimalTest() {

        CentaBankOffice result = centaBankOfficeRepository.findCentaBankOffice(new BigDecimal("1"));
        org.junit.Assert.assertNull(result);
    }

}
