package com.telefonica.bst3.srv.nuc.pruebagithub.service.loadfilerecord;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import com.telefonica.bst3.srv.nuc.pruebagithub.msg.loadfilerecord.LoadFileRecord_IN;
import com.telefonica.tran.comarq.cc.error.TE_Excepcion;

@RunWith(MockitoJUnitRunner.class)
public class LoadFileRecordCommandTest {

    @InjectMocks
    private LoadFileRecordCommand pruebaGitHubCommand = new LoadFileRecordCommand();

    @Mock
    private LoadFileRecordMapper mapper;

    @Test
    public void testLoadFileRecord() throws TE_Excepcion {
        // Given
        LoadFileRecord_IN in = null;
        // When
        pruebaGitHubCommand.execute(in);
    }
}
