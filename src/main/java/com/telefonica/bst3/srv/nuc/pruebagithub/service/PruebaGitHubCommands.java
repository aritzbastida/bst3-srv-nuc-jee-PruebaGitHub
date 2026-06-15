package com.telefonica.bst3.srv.nuc.pruebagithub.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.telefonica.bst3.srv.nuc.pruebagithub.service.getbank.GetBankCommand;
import com.telefonica.bst3.srv.nuc.pruebagithub.service.getbankoffice.GetBankOfficeCommand;
import com.telefonica.bst3.srv.nuc.pruebagithub.service.loadfilerecord.LoadFileRecordCommand;
import com.telefonica.bst3.srv.nuc.pruebagithub.service.readfilerecord.ReadFileRecordCommand;

@Component
public class PruebaGitHubCommands {

    @Autowired
    private GetBankCommand getBankCommand;

    @Autowired
    private GetBankOfficeCommand getBankOfficeCommand;

    @Autowired
    private LoadFileRecordCommand loadFileRecordCommand;

    @Autowired
    private ReadFileRecordCommand readFileRecordCommand;

    public GetBankCommand getBank() {
        return getBankCommand;
    }

    public GetBankOfficeCommand getBankOffice() {
        return getBankOfficeCommand;
    }

    public LoadFileRecordCommand loadFileRecord() {
        return loadFileRecordCommand;
    }

    public ReadFileRecordCommand readFileRecord() {
        return readFileRecordCommand;
    }

}