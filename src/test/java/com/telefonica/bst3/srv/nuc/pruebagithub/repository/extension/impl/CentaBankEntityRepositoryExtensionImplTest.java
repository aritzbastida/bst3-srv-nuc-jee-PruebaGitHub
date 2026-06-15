package com.telefonica.bst3.srv.nuc.pruebagithub.repository.extension.impl;

import java.math.BigDecimal;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.jdbc.Sql;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import com.telefonica.bst3.model.CentaBankEntity;
import com.telefonica.bst3.srv.nuc.pruebagithub.repository.CentaBankEntityRepository;
import com.telefonica.coco.boot.test.config.RepositoryTest;

/**
 * Implementacion de las pruebas de la entidad
 */
@RunWith(SpringRunner.class)
@RepositoryTest
@Transactional
@Sql(scripts = "/data/insert.sql")
public class CentaBankEntityRepositoryExtensionImplTest {
    @Autowired
    private CentaBankEntityRepository centaBankEntityRepository;

    /**
     * Prueba de la consulta findCentaBankEntity
     */
    @Test
    public void findCentaBankEntity_Id_BigDecimalTest() {

        CentaBankEntity result = centaBankEntityRepository.findCentaBankEntity(new BigDecimal("1"));
        org.junit.Assert.assertNull(result);
    }

}
