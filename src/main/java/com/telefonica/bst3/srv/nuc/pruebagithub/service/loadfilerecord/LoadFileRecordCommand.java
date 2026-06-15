package com.telefonica.bst3.srv.nuc.pruebagithub.service.loadfilerecord;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.telefonica.bst3.srv.nuc.pruebagithub.msg.loadfilerecord.LoadFileRecord_IN;
import com.telefonica.coco.core.domain.Command;
import com.telefonica.tran.comarq.cc.error.TE_Excepcion;

@Command
public class LoadFileRecordCommand {

    private static final Logger logger = LoggerFactory.getLogger(LoadFileRecordCommand.class);

    @Autowired
    private LoadFileRecordMapper mapper;

    // TODO Autowire your dependencies here

    public void execute(LoadFileRecord_IN in) throws TE_Excepcion {

        logger.info("Implemented");
    }
}
