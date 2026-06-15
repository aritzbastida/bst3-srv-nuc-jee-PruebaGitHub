package com.telefonica.bst3.srv.nuc.pruebagithub.repository.dto;

import java.math.BigDecimal;
import java.util.Date;

public class GetBankOffice_OUT {

    private BigDecimal bankOfficeId;
    private String bankOfficeBiCCode;
    private Long branchType;
    private Date startValidity;
    private Date endValidity;
    private Long geographicSiteId;
    private BigDecimal bankEntityId;
    private String code;

    public GetBankOffice_OUT() {
        super();
    }

    public GetBankOffice_OUT(BigDecimal bankOfficeId, String bankOfficeBiCCode, Long branchType, Date startValidity,
            Date endValidity, Long geographicSiteId, BigDecimal bankEntityId, String code) {
        super();
        this.bankOfficeId = bankOfficeId;
        this.bankOfficeBiCCode = bankOfficeBiCCode;
        this.branchType = branchType;
        this.startValidity = startValidity;
        this.endValidity = endValidity;
        this.geographicSiteId = geographicSiteId;
        this.bankEntityId = bankEntityId;
        this.code = code;
    }

    public BigDecimal getBankOfficeId() {
        return this.bankOfficeId;
    }

    public void setBankOfficeId(BigDecimal bankOfficeId) {
        this.bankOfficeId = bankOfficeId;
    }

    public String getBankOfficeBiCCode() {
        return this.bankOfficeBiCCode;
    }

    public void setBankOfficeBiCCode(String bankOfficeBiCCode) {
        this.bankOfficeBiCCode = bankOfficeBiCCode;
    }

    public Long getBranchType() {
        return this.branchType;
    }

    public void setBranchType(Long branchType) {
        this.branchType = branchType;
    }

    public Date getStartValidity() {
        if (this.startValidity != null)
            return (Date) this.startValidity.clone();
        else
            return null;

    }

    public void setStartValidity(Date startValidity) {
        if (startValidity != null)
            this.startValidity = (Date) startValidity.clone();
        else
            this.startValidity = startValidity;
    }

    public Date getEndValidity() {
        if (this.endValidity != null)
            return (Date) this.endValidity.clone();
        else
            return null;

    }

    public void setEndValidity(Date endValidity) {
        if (endValidity != null)
            this.endValidity = (Date) endValidity.clone();
        else
            this.endValidity = endValidity;
    }

    public Long getGeographicSiteId() {
        return this.geographicSiteId;
    }

    public void setGeographicSiteId(Long geographicSiteId) {
        this.geographicSiteId = geographicSiteId;
    }

    public BigDecimal getBankEntityId() {
        return this.bankEntityId;
    }

    public void setBankEntityId(BigDecimal bankEntityId) {
        this.bankEntityId = bankEntityId;
    }

    public String getCode() {
        return this.code;
    }

    public void setCode(String code) {
        this.code = code;
    }

}
