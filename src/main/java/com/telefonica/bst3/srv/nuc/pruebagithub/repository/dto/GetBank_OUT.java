package com.telefonica.bst3.srv.nuc.pruebagithub.repository.dto;

import java.math.BigDecimal;
import java.util.Date;

public class GetBank_OUT {

    private String bankEntityBlCCode;
    private String bankEntityName;
    private Long bankEntityNameBankType;
    private Boolean bankEntityWindowPayment;
    private Long bankEntityBankInOrigin;
    private Date bankEntityStartValidity;
    private Date bankEntityEndValidity;
    private Long bankEntityCountryId;
    private BigDecimal bankEntityId;
    private String bankEntityCode;

    public GetBank_OUT() {
        super();
    }

    public GetBank_OUT(String bankEntityBlCCode, String bankEntityName, Long bankEntityNameBankType,
            Boolean bankEntityWindowPayment, Long bankEntityBankInOrigin, Date bankEntityStartValidity,
            Date bankEntityEndValidity, Long bankEntityCountryId, BigDecimal bankEntityId, String bankEntityCode) {
        super();
        this.bankEntityBlCCode = bankEntityBlCCode;
        this.bankEntityName = bankEntityName;
        this.bankEntityNameBankType = bankEntityNameBankType;
        this.bankEntityWindowPayment = bankEntityWindowPayment;
        this.bankEntityBankInOrigin = bankEntityBankInOrigin;
        this.bankEntityStartValidity = bankEntityStartValidity;
        this.bankEntityEndValidity = bankEntityEndValidity;
        this.bankEntityCountryId = bankEntityCountryId;
        this.bankEntityId = bankEntityId;
        this.bankEntityCode = bankEntityCode;
    }

    public String getBankEntityBlCCode() {
        return this.bankEntityBlCCode;
    }

    public void setBankEntityBlCCode(String bankEntityBlCCode) {
        this.bankEntityBlCCode = bankEntityBlCCode;
    }

    public String getBankEntityName() {
        return this.bankEntityName;
    }

    public void setBankEntityName(String bankEntityName) {
        this.bankEntityName = bankEntityName;
    }

    public Long getBankEntityNameBankType() {
        return this.bankEntityNameBankType;
    }

    public void setBankEntityNameBankType(Long bankEntityNameBankType) {
        this.bankEntityNameBankType = bankEntityNameBankType;
    }

    public Boolean getBankEntityWindowPayment() {
        return this.bankEntityWindowPayment;
    }

    public void setBankEntityWindowPayment(Boolean bankEntityWindowPayment) {
        this.bankEntityWindowPayment = bankEntityWindowPayment;
    }

    public Long getBankEntityBankInOrigin() {
        return this.bankEntityBankInOrigin;
    }

    public void setBankEntityBankInOrigin(Long bankEntityBankInOrigin) {
        this.bankEntityBankInOrigin = bankEntityBankInOrigin;
    }

    public Date getBankEntityStartValidity() {
        if (this.bankEntityStartValidity != null)
            return (Date) this.bankEntityStartValidity.clone();
        else
            return null;

    }

    public void setBankEntityStartValidity(Date bankEntityStartValidity) {
        if (bankEntityStartValidity != null)
            this.bankEntityStartValidity = (Date) bankEntityStartValidity.clone();
        else
            this.bankEntityStartValidity = bankEntityStartValidity;
    }

    public Date getBankEntityEndValidity() {
        if (this.bankEntityEndValidity != null)
            return (Date) this.bankEntityEndValidity.clone();
        else
            return null;

    }

    public void setBankEntityEndValidity(Date bankEntityEndValidity) {
        if (bankEntityEndValidity != null)
            this.bankEntityEndValidity = (Date) bankEntityEndValidity.clone();
        else
            this.bankEntityEndValidity = bankEntityEndValidity;
    }

    public Long getBankEntityCountryId() {
        return this.bankEntityCountryId;
    }

    public void setBankEntityCountryId(Long bankEntityCountryId) {
        this.bankEntityCountryId = bankEntityCountryId;
    }

    public BigDecimal getBankEntityId() {
        return this.bankEntityId;
    }

    public void setBankEntityId(BigDecimal bankEntityId) {
        this.bankEntityId = bankEntityId;
    }

    public String getBankEntityCode() {
        return this.bankEntityCode;
    }

    public void setBankEntityCode(String bankEntityCode) {
        this.bankEntityCode = bankEntityCode;
    }

}
