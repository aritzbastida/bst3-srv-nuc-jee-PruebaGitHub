package com.telefonica.bst3.srv.nuc.pruebagithub.service.getbankoffice;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.telefonica.bst3.srv.nuc.pruebagithub.msg.getbankoffice.GetBankOffice_OUT;
import com.telefonica.coco.core.domain.Command;
import com.telefonica.tran.comarq.cc.error.TE_Excepcion;
import com.telefonica.tran.comarq.cc.metadatos.TE_Metadatos;

@Command
public class GetBankOfficeCommand {

    private static final Logger logger = LoggerFactory.getLogger(GetBankOfficeCommand.class);

    @Autowired
    private GetBankOfficeMapper mapper;

    // TODO Autowire your dependencies here

    public GetBankOffice_OUT execute(TE_Metadatos te_Metadatos) throws TE_Excepcion {

        // TODO Develop your code here
        logger.info("Not implemented yet");
        return null;
    }
}
