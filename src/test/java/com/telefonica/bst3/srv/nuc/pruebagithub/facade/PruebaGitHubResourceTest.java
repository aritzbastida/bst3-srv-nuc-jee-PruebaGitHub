package com.telefonica.bst3.srv.nuc.pruebagithub.facade;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.argThat;
import static org.mockito.ArgumentMatchers.isNotNull;
import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.verify;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.put;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.math.BigDecimal;
import java.util.Arrays;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.RequestBuilder;

import com.telefonica.bst3.srv.nuc.pruebagithub.msg.getbank.GetBank_OUT;
import com.telefonica.bst3.srv.nuc.pruebagithub.msg.getbankoffice.GetBankOffice_OUT;
import com.telefonica.bst3.srv.nuc.pruebagithub.msg.readfilerecord.ReadFileRecord_OUT;
import com.telefonica.bst3.srv.nuc.pruebagithub.service.PruebaGitHubService;
import com.telefonica.coco.boot.test.config.ResourceTest;
import com.telefonica.coco.core.domain.types.DateFormatter;
import com.telefonica.coco.core.domain.types.DateType;

@RunWith(SpringRunner.class)
@ResourceTest
public class PruebaGitHubResourceTest {

    @Autowired
    private MockMvc mvc;

    @Value("${tap.web.context-path}")
    private String contextPath;

    @MockBean
    private PruebaGitHubService service;

    @Test
    public void testGetBank() throws Exception {

        GetBank_OUT out = new GetBank_OUT();

        given(service.getBank(any(), any())).willReturn(out);

        RequestBuilder request = get(contextPath + "///banks/bank/{id}", Long.toString(3))
                .param("startDate", "2018-10-12T18:30:00.000Z").param("code", "test")
                .param("tax", (new BigDecimal("6")).toString()).param("productIds", new String[] { "test" })
                .param("optional", Boolean.toString(true)).param("endDate", "2018-10-12");

        mvc.perform(request).andExpect(status().isOk()).andExpect(jsonPath("$").exists());

        verify(service).getBank(argThat(
                in -> in.getStartDate().equals(DateFormatter.parseDate("2018-10-12T18:30:00.000Z", DateType.DATE_TIME))
                        && in.getCode().equals("test") && in.getTax().equals(new BigDecimal("6"))
                        && in.getId().equals(new Long("3"))
                        && Arrays.equals(in.getProductIds(), new String[] { "test" }) && in.isOptional()
                        && in.getEndDate().equals(DateFormatter.parseDate("2018-10-12", DateType.DATE))),
                isNotNull());
    }

    @Test
    public void testGetBankOffice() throws Exception {

        GetBankOffice_OUT out = new GetBankOffice_OUT();

        given(service.getBankOffice(any())).willReturn(out);

        RequestBuilder request = get(contextPath + "///banks/bankoffice");

        mvc.perform(request).andExpect(status().isOk()).andExpect(jsonPath("$").exists());

        verify(service).getBankOffice(isNotNull());
    }

    @Test
    public void testLoadFileRecord() throws Exception {

        RequestBuilder request = put(contextPath + "///banks/filerecord/{record}", "test")
                .contentType(MediaType.APPLICATION_JSON).content("{}");

        mvc.perform(request).andExpect(status().isAccepted()).andExpect(jsonPath("$").doesNotExist());

        verify(service).loadFileRecord(argThat(in -> in.getRecord().equals("test")));
    }

    @Test
    public void testReadFileRecord() throws Exception {

        ReadFileRecord_OUT out = new ReadFileRecord_OUT();

        given(service.readFileRecord(any())).willReturn(out);

        RequestBuilder request = post(contextPath + "///banks/filerecord").contentType(MediaType.APPLICATION_JSON)
                .content("{}");

        mvc.perform(request).andExpect(status().isOk()).andExpect(jsonPath("$").exists());

        verify(service).readFileRecord(isNotNull());
    }

}
