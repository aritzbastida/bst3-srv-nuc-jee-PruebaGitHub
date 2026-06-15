package com.telefonica.bst3.srv.nuc.pruebagithub.facade;

import javax.jws.WebService;
import javax.xml.ws.Holder;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.telefonica.bst3.srv.nuc.pruebagithub.msg.getbank.GetBank_IN;
import com.telefonica.bst3.srv.nuc.pruebagithub.msg.getbank.GetBank_OUT;
import com.telefonica.bst3.srv.nuc.pruebagithub.msg.getbankoffice.GetBankOffice_IN;
import com.telefonica.bst3.srv.nuc.pruebagithub.msg.getbankoffice.GetBankOffice_OUT;
import com.telefonica.bst3.srv.nuc.pruebagithub.msg.loadfilerecord.LoadFileRecord_IN;
import com.telefonica.bst3.srv.nuc.pruebagithub.msg.readfilerecord.ReadFileRecord_IN;
import com.telefonica.bst3.srv.nuc.pruebagithub.msg.readfilerecord.ReadFileRecord_OUT;
import com.telefonica.bst3.srv.nuc.pruebagithub.service.PruebaGitHubService;
import com.telefonica.coco.web.domain.MetadataDefaults;
import com.telefonica.coco.ws.domain.exceptions.SoapTelcoException;
import com.telefonica.tran.comarq.cc.cabecera.TE_Cabecera;
import com.telefonica.tran.comarq.cc.metadatos.TE_Metadatos;

@Component("webservice")
@WebService(targetNamespace = "http://telefonica.com/bst3/srv-nuc-PruebaGitHub-v4", endpointInterface = "com.telefonica.bst3.srv.nuc.pruebagithub.facade.PruebaGitHubWebService", portName = "srv-nuc-PruebaGitHub_Port", serviceName = "srv-nuc-PruebaGitHub-v4")
public class PruebaGitHubWebServiceImpl implements PruebaGitHubWebService {

    @Autowired
    private PruebaGitHubService pruebaGitHubService;

    @Override
    public GetBank_OUT getBank(GetBank_IN in, Holder<TE_Cabecera> holderHeader,
            @MetadataDefaults(fields = "min", size = 50, sort = "DSC_1") Holder<TE_Metadatos> holderMetadata)
            throws SoapTelcoException {

        TE_Metadatos metadata = holderMetadata != null ? holderMetadata.value : null;
        return pruebaGitHubService.getBank(in, metadata);
    }

    @Override
    public GetBankOffice_OUT getBankOffice(GetBankOffice_IN in, Holder<TE_Cabecera> holderHeader,
            Holder<TE_Metadatos> holderMetadata) throws SoapTelcoException {

        TE_Metadatos metadata = holderMetadata != null ? holderMetadata.value : null;
        return pruebaGitHubService.getBankOffice(metadata);
    }

    @Override
    public void loadFileRecord(LoadFileRecord_IN in, TE_Cabecera header, TE_Metadatos metadata) {

        pruebaGitHubService.loadFileRecord(in);
    }

    @Override
    public ReadFileRecord_OUT readFileRecord(ReadFileRecord_IN in, Holder<TE_Cabecera> holderHeader,
            Holder<TE_Metadatos> holderMetadata) throws SoapTelcoException {

        return pruebaGitHubService.readFileRecord(in);
    }

}
