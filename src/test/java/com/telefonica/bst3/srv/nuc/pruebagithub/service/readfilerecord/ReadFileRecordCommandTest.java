package com.telefonica.bst3.srv.nuc.pruebagithub.service.readfilerecord;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import com.telefonica.bst3.srv.nuc.pruebagithub.msg.readfilerecord.ReadFileRecord_IN;
import com.telefonica.bst3.srv.nuc.pruebagithub.msg.readfilerecord.ReadFileRecord_OUT;
import com.telefonica.tran.comarq.cc.error.TE_Excepcion;

@RunWith(MockitoJUnitRunner.class)
public class ReadFileRecordCommandTest {

    @InjectMocks
    private ReadFileRecordCommand pruebaGitHubCommand = new ReadFileRecordCommand();

    @Mock
    private ReadFileRecordMapper mapper;

    @Test
    public void testReadFileRecord() throws TE_Excepcion {
        // Given
        ReadFileRecord_IN in = null;
        // When
        ReadFileRecord_OUT out = pruebaGitHubCommand.execute(in);
        // Then
        assertThat(out).isNull();
    }
}
