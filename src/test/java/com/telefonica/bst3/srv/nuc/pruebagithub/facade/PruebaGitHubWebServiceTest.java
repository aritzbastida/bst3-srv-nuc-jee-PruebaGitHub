package com.telefonica.bst3.srv.nuc.pruebagithub.facade;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.BDDMockito.given;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.telefonica.bst3.srv.nuc.pruebagithub.msg.getbank.GetBank_IN;
import com.telefonica.bst3.srv.nuc.pruebagithub.msg.getbank.GetBank_OUT;
import com.telefonica.bst3.srv.nuc.pruebagithub.msg.getbankoffice.GetBankOffice_IN;
import com.telefonica.bst3.srv.nuc.pruebagithub.msg.getbankoffice.GetBankOffice_OUT;
import com.telefonica.bst3.srv.nuc.pruebagithub.msg.loadfilerecord.LoadFileRecord_IN;
import com.telefonica.bst3.srv.nuc.pruebagithub.msg.readfilerecord.ReadFileRecord_IN;
import com.telefonica.bst3.srv.nuc.pruebagithub.msg.readfilerecord.ReadFileRecord_OUT;
import com.telefonica.bst3.srv.nuc.pruebagithub.service.PruebaGitHubService;
import com.telefonica.coco.boot.test.config.WebServiceTest;
import com.telefonica.coco.ws.test.WebServiceUtils;

@WebServiceTest(logging = true)
class PruebaGitHubWebServiceTest {

    PruebaGitHubWebService webServiceClient;

    @MockBean
    private PruebaGitHubService mockService;

    @Autowired
    private WebServiceUtils wsUtils;

    @BeforeEach
    public void setup() {

        webServiceClient = wsUtils.createClient(PruebaGitHubWebService.class);
    }

    @Test
    void testGetBank() throws Exception {

        // Given
        GetBank_OUT expected = new GetBank_OUT();
        given(mockService.getBank(any(), any())).willReturn(expected);

        // When
        GetBank_OUT out = webServiceClient.getBank(new GetBank_IN(), null, null);

        // Then
        assertThat(out).isNotSameAs(expected);
        assertThat(out).usingRecursiveComparison().isEqualTo(expected);
    }

    @Test
    void testGetBankOffice() throws Exception {

        // Given
        GetBankOffice_OUT expected = new GetBankOffice_OUT();
        given(mockService.getBankOffice(any())).willReturn(expected);

        // When
        GetBankOffice_OUT out = webServiceClient.getBankOffice(new GetBankOffice_IN(), null, null);

        // Then
        assertThat(out).isNotSameAs(expected);
        assertThat(out).usingRecursiveComparison().isEqualTo(expected);
    }

    @Test
    void testLoadFileRecord() throws Exception {

        // When
        webServiceClient.loadFileRecord(new LoadFileRecord_IN(), null, null);
    }

    @Test
    void testReadFileRecord() throws Exception {

        // Given
        ReadFileRecord_OUT expected = new ReadFileRecord_OUT();
        given(mockService.readFileRecord(any())).willReturn(expected);

        // When
        ReadFileRecord_OUT out = webServiceClient.readFileRecord(new ReadFileRecord_IN(), null, null);

        // Then
        assertThat(out).isNotSameAs(expected);
        assertThat(out).usingRecursiveComparison().isEqualTo(expected);
    }

}
