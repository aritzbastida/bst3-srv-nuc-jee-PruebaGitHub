package com.telefonica.bst3.srv.nuc.pruebagithub.service.getbank;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import com.telefonica.bst3.srv.nuc.pruebagithub.msg.getbank.GetBank_IN;
import com.telefonica.bst3.srv.nuc.pruebagithub.msg.getbank.GetBank_OUT;
import com.telefonica.tran.comarq.cc.error.TE_Excepcion;
import com.telefonica.tran.comarq.cc.metadatos.TE_Metadatos;

@RunWith(MockitoJUnitRunner.class)
public class GetBankCommandTest {

    @InjectMocks
    private GetBankCommand pruebaGitHubCommand = new GetBankCommand();

    @Mock
    private GetBankMapper mapper;

    @Test
    public void testGetBank() throws TE_Excepcion {
        // Given
        GetBank_IN in = null;
        TE_Metadatos metadata = null;
        // When
        GetBank_OUT out = pruebaGitHubCommand.execute(in, metadata);
        // Then
        assertThat(out).isNull();
    }
}
