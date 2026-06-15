package com.telefonica.bst3.srv.nuc.pruebagithub.facade;

import static org.springframework.http.HttpStatus.ACCEPTED;
import static org.springframework.http.HttpStatus.OK;

import java.math.BigDecimal;
import java.util.Date;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.scheduling.annotation.Async;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.telefonica.bst3.srv.nuc.pruebagithub.msg.getbank.GetBank_IN;
import com.telefonica.bst3.srv.nuc.pruebagithub.msg.getbank.GetBank_OUT;
import com.telefonica.bst3.srv.nuc.pruebagithub.msg.getbankoffice.GetBankOffice_OUT;
import com.telefonica.bst3.srv.nuc.pruebagithub.msg.loadfilerecord.LoadFileRecord_IN;
import com.telefonica.bst3.srv.nuc.pruebagithub.msg.readfilerecord.ReadFileRecord_IN;
import com.telefonica.bst3.srv.nuc.pruebagithub.msg.readfilerecord.ReadFileRecord_OUT;
import com.telefonica.bst3.srv.nuc.pruebagithub.service.PruebaGitHubService;
import com.telefonica.coco.core.domain.types.DateType;
import com.telefonica.coco.data.domain.MetadataResponse;
import com.telefonica.coco.web.domain.DateFormat;
import com.telefonica.coco.web.domain.MetadataDefaults;
import com.telefonica.coco.web.domain.StatusCodeMappingContributor;
import com.telefonica.tran.comarq.cc.error.TE_Excepcion;
import com.telefonica.tran.comarq.cc.metadatos.TE_Metadatos;

@RestController
@RequestMapping("${tap.web.context-path}")
public class PruebaGitHubResource implements StatusCodeMappingContributor {

    @Autowired
    private PruebaGitHubService pruebaGitHubService;

    @GetMapping("/banks/bank/{id}")
    public ResponseEntity<MetadataResponse<GetBank_OUT>> getBank(
            @RequestParam(name = "startDate", required = false) @DateFormat(DateType.DATE_TIME) Date startDate,
            @RequestParam(name = "code", required = true) String code,
            @RequestParam(name = "tax", required = false) BigDecimal tax, @PathVariable(name = "id") Long id,
            @RequestParam(name = "productIds", required = false, defaultValue = "") String[] productIds,
            @RequestParam(name = "optional", required = false) Boolean optional,
            @RequestParam(name = "endDate", required = false) @DateFormat(DateType.DATE) Date endDate,
            @MetadataDefaults(fields = "min", size = 50, sort = "DSC_1") TE_Metadatos metadata) throws TE_Excepcion {
        GetBank_IN in = new GetBank_IN();
        in.setStartDate(startDate);
        in.setCode(code);
        in.setTax(tax);
        in.setId(id);
        in.setProductIds(productIds);
        in.setOptional(optional);
        in.setEndDate(endDate);
        GetBank_OUT out = pruebaGitHubService.getBank(in, metadata);
        return ResponseEntity.status(OK).body(MetadataResponse.of(out, metadata));
    }

    @GetMapping("/banks/bankoffice")
    public ResponseEntity<MetadataResponse<GetBankOffice_OUT>> getBankOffice(TE_Metadatos metadata)
            throws TE_Excepcion {
        GetBankOffice_OUT out = pruebaGitHubService.getBankOffice(metadata);
        return ResponseEntity.status(OK).body(MetadataResponse.of(out, metadata));
    }

    @PutMapping("/banks/filerecord/{record}")
    @ResponseStatus(HttpStatus.ACCEPTED)
    @Async
    public void loadFileRecord(@RequestBody LoadFileRecord_IN in, @PathVariable(name = "record") String record)
            throws TE_Excepcion {
        in.setRecord(record);
        pruebaGitHubService.loadFileRecord(in);
    }

    @PostMapping("/banks/filerecord")
    public ResponseEntity<ReadFileRecord_OUT> readFileRecord(@RequestBody ReadFileRecord_IN in) throws TE_Excepcion {
        ReadFileRecord_OUT out = pruebaGitHubService.readFileRecord(in);
        return ResponseEntity.status(OK).body(out);
    }

    @Override
    public void addStatusCodeMappings(Map<String, HttpStatus> map) {
        // TODO: Concretar los mapeos con los códigos de error correctos

    }

}
