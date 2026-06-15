package com.telefonica.bst3.srv.nuc.pruebagithub.service;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.validation.annotation.Validated;

import com.telefonica.bst3.srv.nuc.pruebagithub.msg.getbank.GetBank_IN;
import com.telefonica.bst3.srv.nuc.pruebagithub.msg.getbank.GetBank_OUT;
import com.telefonica.bst3.srv.nuc.pruebagithub.msg.getbankoffice.GetBankOffice_OUT;
import com.telefonica.bst3.srv.nuc.pruebagithub.msg.loadfilerecord.LoadFileRecord_IN;
import com.telefonica.bst3.srv.nuc.pruebagithub.msg.readfilerecord.ReadFileRecord_IN;
import com.telefonica.bst3.srv.nuc.pruebagithub.msg.readfilerecord.ReadFileRecord_OUT;
import com.telefonica.coco.validation.domain.ValidMetadata;
import com.telefonica.tran.comarq.cc.error.TE_Excepcion;
import com.telefonica.tran.comarq.cc.metadatos.TE_Metadatos;

@Validated
@Transactional(propagation = Propagation.REQUIRED, rollbackFor = TE_Excepcion.class)
@Service
public class PruebaGitHubService {

    @Autowired
    private PruebaGitHubCommands commands;

    @Cacheable("CACHE_APP_BST3_SRV_NUC_JEE_PRUEBAGITHUB_4.GETBANK")
    public GetBank_OUT getBank(
            @NotNull @Valid GetBank_IN in, @NotNull @ValidMetadata(fields = { "min",
                    "all" }, maxPageSize = 200, sorting = { "DSC_1", "DSC_2" }) TE_Metadatos metadata)
            throws TE_Excepcion {
        return commands.getBank().execute(in, metadata);
    }

    @Cacheable("CACHE_APP_BST3_SRV_NUC_JEE_PRUEBAGITHUB_4.GETBANKOFFICE")
    public GetBankOffice_OUT getBankOffice(@NotNull @ValidMetadata TE_Metadatos metadata) throws TE_Excepcion {
        return commands.getBankOffice().execute(metadata);
    }

    public void loadFileRecord(@NotNull @Valid LoadFileRecord_IN in) throws TE_Excepcion {
        commands.loadFileRecord().execute(in);
    }

    public ReadFileRecord_OUT readFileRecord(@NotNull @Valid ReadFileRecord_IN in) throws TE_Excepcion {
        return commands.readFileRecord().execute(in);
    }

}
