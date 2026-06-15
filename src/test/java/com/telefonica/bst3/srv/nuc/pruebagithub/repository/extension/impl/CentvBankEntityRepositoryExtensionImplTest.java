package com.telefonica.bst3.srv.nuc.pruebagithub.repository.extension.impl;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.jdbc.Sql;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import com.telefonica.bst3.model.CentvBankEntity;
import com.telefonica.bst3.srv.nuc.pruebagithub.repository.CentvBankEntityRepository;
import com.telefonica.bst3.srv.nuc.pruebagithub.repository.dto.GetBank_OUT;
import com.telefonica.coco.boot.test.config.RepositoryTest;

/**
 * Implementacion de las pruebas de la entidad
 */
@RunWith(SpringRunner.class)
@RepositoryTest
@Transactional
@Sql(scripts = "/data/insert.sql")
public class CentvBankEntityRepositoryExtensionImplTest {
    @Autowired
    private CentvBankEntityRepository centvBankEntityRepository;

    /**
     * Prueba de la consulta getBank
     */
    @Test
    public void getBank_BankEntityId_BigDecimalBankEntityCode_StringValidDate_DateTest() {

        GetBank_OUT result = centvBankEntityRepository.getBank(new BigDecimal("1"), "A", new Date());
        org.junit.Assert.assertNull(result);
    }

    /**
     * Prueba de la consulta findCentvBankEntityByBankCoBank
     */
    @Test
    public void findCentvBankEntityByBankCoBank_BankEntityCode_StringTest() {

        List<CentvBankEntity> result = centvBankEntityRepository.findCentvBankEntityByBankCoBank("A");
        org.junit.Assert.assertNull(result);
    }

    /**
     * Prueba de la consulta findCentvBankEntity
     */
    @Test
    public void findCentvBankEntity_Id_BigDecimalTest() {

        CentvBankEntity result = centvBankEntityRepository.findCentvBankEntity(new BigDecimal("1"));
        org.junit.Assert.assertNull(result);
    }

    /**
     * Prueba de la consulta findAllCentvBankEntityByBankCoBank
     */
    @Test
    public void findAllCentvBankEntityByBankCoBank_BankCoBank_StringTest() {

        List<CentvBankEntity> result = centvBankEntityRepository.findAllCentvBankEntityByBankCoBank("A");
        org.junit.Assert.assertNull(result);
    }

}
