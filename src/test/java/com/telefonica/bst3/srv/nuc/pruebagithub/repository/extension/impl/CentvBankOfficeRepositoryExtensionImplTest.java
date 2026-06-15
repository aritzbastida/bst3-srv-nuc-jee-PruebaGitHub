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

import com.telefonica.bst3.model.CentvBankOffice;
import com.telefonica.bst3.srv.nuc.pruebagithub.repository.CentvBankOfficeRepository;
import com.telefonica.bst3.srv.nuc.pruebagithub.repository.dto.GetBankOffice_OUT;
import com.telefonica.coco.boot.test.config.RepositoryTest;

/**
 * Implementacion de las pruebas de la entidad
 */
@RunWith(SpringRunner.class)
@RepositoryTest
@Transactional
@Sql(scripts = "/data/insert.sql")
public class CentvBankOfficeRepositoryExtensionImplTest {
    @Autowired
    private CentvBankOfficeRepository centvBankOfficeRepository;

    /**
     * Prueba de la consulta getBankOffice
     */
    @Test
    public void getBankOffice_ValidDate_DateBankEntityCode_StringBankOfficeCode_StringBankOfficeId_BigDecimalTest() {

        GetBankOffice_OUT result = centvBankOfficeRepository.getBankOffice(new Date(), "A", "A", new BigDecimal("1"));
        org.junit.Assert.assertNull(result);
    }

    /**
     * Prueba de la consulta findCentvBankOfficeByBankCoBank
     */
    @Test
    public void findCentvBankOfficeByBankCoBank_BankEntityCode_StringBankOfficeCode_StringTest() {

        List<CentvBankOffice> result = centvBankOfficeRepository.findCentvBankOfficeByBankCoBank("A", "A");
        org.junit.Assert.assertNull(result);
    }

    /**
     * Prueba de la consulta findCentvBankOffice
     */
    @Test
    public void findCentvBankOffice_Id_BigDecimalTest() {

        CentvBankOffice result = centvBankOfficeRepository.findCentvBankOffice(new BigDecimal("1"));
        org.junit.Assert.assertNull(result);
    }

}
