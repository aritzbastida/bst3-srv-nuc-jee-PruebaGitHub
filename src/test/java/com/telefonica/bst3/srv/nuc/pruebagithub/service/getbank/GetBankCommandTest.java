package com.telefonica.bst3.srv.nuc.pruebagithub.service.getbank;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.telefonica.bst3.srv.nuc.pruebagithub.msg.getbank.GetBank_IN;
import com.telefonica.bst3.srv.nuc.pruebagithub.msg.getbank.GetBank_OUT;
import com.telefonica.tran.comarq.cc.error.TE_Excepcion;
import com.telefonica.tran.comarq.cc.metadatos.TE_Metadatos;

@ExtendWith(MockitoExtension.class)
class GetBankCommandTest {

    @InjectMocks
    private GetBankCommand pruebaGitHubCommand = new GetBankCommand();

    @Mock
    private GetBankMapper mapper;

    @Test
    void testGetBank() throws TE_Excepcion {
        // Given
        GetBank_IN in = null;
        TE_Metadatos metadata = null;
        // When
        GetBank_OUT out = pruebaGitHubCommand.execute(in, metadata);
        // Then
        assertThat(out).isNull();
    }
}
