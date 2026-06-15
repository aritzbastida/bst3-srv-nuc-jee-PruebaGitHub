package com.telefonica.bst3.srv.nuc.pruebagithub.service.readfilerecord;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.telefonica.bst3.srv.nuc.pruebagithub.msg.readfilerecord.ReadFileRecord_IN;
import com.telefonica.bst3.srv.nuc.pruebagithub.msg.readfilerecord.ReadFileRecord_OUT;
import com.telefonica.coco.core.domain.Command;
import com.telefonica.tran.comarq.cc.error.TE_Excepcion;

@Command
public class ReadFileRecordCommand {

    private static final Logger logger = LoggerFactory.getLogger(ReadFileRecordCommand.class);

    @Autowired
    private ReadFileRecordMapper mapper;

    // TODO Autowire your dependencies here

    public ReadFileRecord_OUT execute(ReadFileRecord_IN in) throws TE_Excepcion {

        return new ReadFileRecord_OUT();
    }
}
