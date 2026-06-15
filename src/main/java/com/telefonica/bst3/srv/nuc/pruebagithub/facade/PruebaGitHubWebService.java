package com.telefonica.bst3.srv.nuc.pruebagithub.facade;

import javax.jws.Oneway;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Holder;

import com.telefonica.bst3.srv.nuc.pruebagithub.msg.getbank.GetBank_IN;
import com.telefonica.bst3.srv.nuc.pruebagithub.msg.getbank.GetBank_OUT;
import com.telefonica.bst3.srv.nuc.pruebagithub.msg.getbankoffice.GetBankOffice_IN;
import com.telefonica.bst3.srv.nuc.pruebagithub.msg.getbankoffice.GetBankOffice_OUT;
import com.telefonica.bst3.srv.nuc.pruebagithub.msg.loadfilerecord.LoadFileRecord_IN;
import com.telefonica.bst3.srv.nuc.pruebagithub.msg.readfilerecord.ReadFileRecord_IN;
import com.telefonica.bst3.srv.nuc.pruebagithub.msg.readfilerecord.ReadFileRecord_OUT;
import com.telefonica.coco.ws.domain.exceptions.SoapTelcoException;
import com.telefonica.tran.comarq.cc.cabecera.TE_Cabecera;
import com.telefonica.tran.comarq.cc.metadatos.TE_Metadatos;

@WebService(name = "srv-nuc-PruebaGitHub_WebService", targetNamespace = "http://telefonica.com/bst3/srv-nuc-PruebaGitHub-v4")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@XmlSeeAlso({ com.telefonica.bst3.srv.nuc.pruebagithub.msg.getbank.ObjectFactory.class,
        com.telefonica.bst3.srv.nuc.pruebagithub.msg.getbankoffice.ObjectFactory.class,
        com.telefonica.bst3.srv.nuc.pruebagithub.msg.loadfilerecord.ObjectFactory.class,
        com.telefonica.bst3.srv.nuc.pruebagithub.msg.readfilerecord.ObjectFactory.class,
        com.telefonica.tran.comarq.cc.cabecera.ObjectFactory.class,
        com.telefonica.tran.comarq.cc.error.fault.ObjectFactory.class,
        com.telefonica.tran.comarq.cc.metadatos.ObjectFactory.class })
public interface PruebaGitHubWebService {

    /**
     * 
     * @param request
     * @param teHeader
     * @param teMetadata
     * @return returns com.telefonica.bst3.srv.nuc.pruebagithub.msg.getbank.GetBank_OUT
     * @throws SoapTelcoException
     */
    @WebMethod(action = "getBank")
    @WebResult(name = "GetBank_OUT", targetNamespace = "http://telefonica.com/bst3/srv/PruebaGitHub/msg/getBank-v4", partName = "response")
    GetBank_OUT getBank(
            @WebParam(name = "GetBank_IN", targetNamespace = "http://telefonica.com/bst3/srv/PruebaGitHub/msg/getBank-v4", partName = "request") GetBank_IN in,
            @WebParam(name = "TE_Cabecera", targetNamespace = "http://telefonica.com/tran/comarq/cc/cabecera", header = true, mode = WebParam.Mode.INOUT, partName = "te_header") Holder<TE_Cabecera> holderHeader,
            @WebParam(name = "TE_Metadatos", targetNamespace = "http://telefonica.com/tran/comarq/cc/metadatos-2.0", header = true, mode = WebParam.Mode.INOUT, partName = "te_metadata") Holder<TE_Metadatos> holderMetadata)
            throws SoapTelcoException;

    /**
     * 
     * @param request
     * @param teHeader
     * @param teMetadata
     * @return returns com.telefonica.bst3.srv.nuc.pruebagithub.msg.getbankoffice.GetBankOffice_OUT
     * @throws SoapTelcoException
     */
    @WebMethod(action = "getBankOffice")
    @WebResult(name = "GetBankOffice_OUT", targetNamespace = "http://telefonica.com/bst3/srv/PruebaGitHub/msg/getBankOffice-v4", partName = "response")
    GetBankOffice_OUT getBankOffice(
            @WebParam(name = "GetBankOffice_IN", targetNamespace = "http://telefonica.com/bst3/srv/PruebaGitHub/msg/getBankOffice-v4", partName = "request") GetBankOffice_IN in,
            @WebParam(name = "TE_Cabecera", targetNamespace = "http://telefonica.com/tran/comarq/cc/cabecera", header = true, mode = WebParam.Mode.INOUT, partName = "te_header") Holder<TE_Cabecera> holderHeader,
            @WebParam(name = "TE_Metadatos", targetNamespace = "http://telefonica.com/tran/comarq/cc/metadatos-2.0", header = true, mode = WebParam.Mode.INOUT, partName = "te_metadata") Holder<TE_Metadatos> holderMetadata)
            throws SoapTelcoException;

    /**
     * 
     * @param request
     * @param teHeader
     * @param teMetadata
     * @return returns com.telefonica.bst3.srv.nuc.pruebagithub.msg.loadfilerecord.LoadFileRecord_OUT
     * @throws SoapTelcoException
     */
    @WebMethod(action = "loadFileRecord")
    @Oneway
    void loadFileRecord(
            @WebParam(name = "LoadFileRecord_IN", targetNamespace = "http://telefonica.com/bst3/srv/PruebaGitHub/msg/loadFileRecord-v4", partName = "request") LoadFileRecord_IN in,
            @WebParam(name = "TE_Cabecera", targetNamespace = "http://telefonica.com/tran/comarq/cc/cabecera", header = true, partName = "te_header") TE_Cabecera header,
            @WebParam(name = "TE_Metadatos", targetNamespace = "http://telefonica.com/tran/comarq/cc/metadatos-2.0", header = true, partName = "te_metadata") TE_Metadatos metadata);

    /**
     * 
     * @param request
     * @param teHeader
     * @param teMetadata
     * @return returns com.telefonica.bst3.srv.nuc.pruebagithub.msg.readfilerecord.ReadFileRecord_OUT
     * @throws SoapTelcoException
     */
    @WebMethod(action = "readFileRecord")
    @WebResult(name = "ReadFileRecord_OUT", targetNamespace = "http://telefonica.com/bst3/srv/PruebaGitHub/msg/readFileRecord-v4", partName = "response")
    ReadFileRecord_OUT readFileRecord(
            @WebParam(name = "ReadFileRecord_IN", targetNamespace = "http://telefonica.com/bst3/srv/PruebaGitHub/msg/readFileRecord-v4", partName = "request") ReadFileRecord_IN in,
            @WebParam(name = "TE_Cabecera", targetNamespace = "http://telefonica.com/tran/comarq/cc/cabecera", header = true, mode = WebParam.Mode.INOUT, partName = "te_header") Holder<TE_Cabecera> holderHeader,
            @WebParam(name = "TE_Metadatos", targetNamespace = "http://telefonica.com/tran/comarq/cc/metadatos-2.0", header = true, mode = WebParam.Mode.INOUT, partName = "te_metadata") Holder<TE_Metadatos> holderMetadata)
            throws SoapTelcoException;

}
