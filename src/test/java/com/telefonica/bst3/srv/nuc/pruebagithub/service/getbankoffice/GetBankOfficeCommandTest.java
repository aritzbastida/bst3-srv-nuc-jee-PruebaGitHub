package com.telefonica.bst3.srv.nuc.pruebagithub.service.getbankoffice;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import com.telefonica.bst3.srv.nuc.pruebagithub.msg.getbankoffice.GetBankOffice_OUT;
import com.telefonica.tran.comarq.cc.error.TE_Excepcion;
import com.telefonica.tran.comarq.cc.metadatos.TE_Metadatos;

@RunWith(MockitoJUnitRunner.class)
public class GetBankOfficeCommandTest {

    @InjectMocks
    private GetBankOfficeCommand pruebaGitHubCommand = new GetBankOfficeCommand();

    @Mock
    private GetBankOfficeMapper mapper;

    @Test
    public void testGetBankOffice() throws TE_Excepcion {
        TE_Metadatos metadata = null;
        // When
        GetBankOffice_OUT out = pruebaGitHubCommand.execute(metadata);
        // Then
        assertThat(out).isNull();
    }
}
