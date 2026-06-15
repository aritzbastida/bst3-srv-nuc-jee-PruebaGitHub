package com.telefonica.bst3.srv.nuc.pruebagithub.service;

import static com.telefonica.coco.core.domain.exceptions.TechnicalExceptionType.ERROR_VALIDACION;
import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.jdbc.Sql;
import org.springframework.transaction.annotation.Transactional;

import com.telefonica.bst3.srv.nuc.pruebagithub.msg.getbank.GetBank_IN;
import com.telefonica.bst3.srv.nuc.pruebagithub.msg.loadfilerecord.LoadFileRecord_IN;
import com.telefonica.bst3.srv.nuc.pruebagithub.msg.readfilerecord.ReadFileRecord_IN;
import com.telefonica.coco.boot.test.config.ServiceTest;
import com.telefonica.coco.core.domain.exceptions.TechnicalException;
import com.telefonica.tran.comarq.cc.error.TE_Excepcion;
import com.telefonica.tran.comarq.cc.metadatos.TE_Metadatos;

@Disabled // TODO Remove this annotation after coding integration tests
@ServiceTest
@Transactional
@Sql(scripts = "/data/insert.sql")
class PruebaGitHubServiceTest {

    @Autowired
    private PruebaGitHubService pruebaGitHubService;

    // TODO @MockBean your external dependencies here (cliews, cliers)

    @Test
    void testGetBank() throws TE_Excepcion {
        // Given
        GetBank_IN in = null;
        TE_Metadatos metadata = null;
        // When
        Throwable t = catchThrowable(() -> pruebaGitHubService.getBank(in, metadata));
        // Then
        assertThat(t).isInstanceOf(TechnicalException.class);
        assertThat(((TechnicalException) t).getFaultInfo().getErrorId()).isEqualTo(ERROR_VALIDACION.code());
    }

    @Test
    void testGetBankOffice() throws TE_Excepcion {
        // Given
        TE_Metadatos metadata = null;
        // When
        Throwable t = catchThrowable(() -> pruebaGitHubService.getBankOffice(metadata));
        // Then
        assertThat(t).isInstanceOf(TechnicalException.class);
        assertThat(((TechnicalException) t).getFaultInfo().getErrorId()).isEqualTo(ERROR_VALIDACION.code());
    }

    @Test
    void testLoadFileRecord() throws TE_Excepcion {
        // Given
        LoadFileRecord_IN in = null;
        // When
        Throwable t = catchThrowable(() -> pruebaGitHubService.loadFileRecord(in));
        // Then
        assertThat(t).isInstanceOf(TechnicalException.class);
        assertThat(((TechnicalException) t).getFaultInfo().getErrorId()).isEqualTo(ERROR_VALIDACION.code());
    }

    @Test
    void testReadFileRecord() throws TE_Excepcion {
        // Given
        ReadFileRecord_IN in = null;
        // When
        Throwable t = catchThrowable(() -> pruebaGitHubService.readFileRecord(in));
        // Then
        assertThat(t).isInstanceOf(TechnicalException.class);
        assertThat(((TechnicalException) t).getFaultInfo().getErrorId()).isEqualTo(ERROR_VALIDACION.code());
    }
}
