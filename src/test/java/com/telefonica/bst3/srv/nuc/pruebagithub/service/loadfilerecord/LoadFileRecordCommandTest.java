package com.telefonica.bst3.srv.nuc.pruebagithub.service.loadfilerecord;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.telefonica.bst3.srv.nuc.pruebagithub.msg.loadfilerecord.LoadFileRecord_IN;
import com.telefonica.tran.comarq.cc.error.TE_Excepcion;

@ExtendWith(MockitoExtension.class)
class LoadFileRecordCommandTest {

    @InjectMocks
    private LoadFileRecordCommand pruebaGitHubCommand = new LoadFileRecordCommand();

    @Mock
    private LoadFileRecordMapper mapper;

    @Test
    void testLoadFileRecord() throws TE_Excepcion {
        // Given
        LoadFileRecord_IN in = null;
        // When
        pruebaGitHubCommand.execute(in);
    }
}
