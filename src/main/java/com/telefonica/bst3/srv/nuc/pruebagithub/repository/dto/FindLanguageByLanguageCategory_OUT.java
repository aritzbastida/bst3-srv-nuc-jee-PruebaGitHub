package com.telefonica.bst3.srv.nuc.pruebagithub.repository.dto;

import java.util.Date;

public class FindLanguageByLanguageCategory_OUT {

    private Date languageStartValidy;
    private Date languageEndValidity;
    private Long languageLanguageCode;
    private String languageAlphabetName;

    public FindLanguageByLanguageCategory_OUT() {
        super();
    }

    public FindLanguageByLanguageCategory_OUT(Date languageStartValidy, Date languageEndValidity,
            Long languageLanguageCode, String languageAlphabetName) {
        super();
        this.languageStartValidy = languageStartValidy;
        this.languageEndValidity = languageEndValidity;
        this.languageLanguageCode = languageLanguageCode;
        this.languageAlphabetName = languageAlphabetName;
    }

    public Date getLanguageStartValidy() {
        if (this.languageStartValidy != null)
            return (Date) this.languageStartValidy.clone();
        else
            return null;

    }

    public void setLanguageStartValidy(Date languageStartValidy) {
        if (languageStartValidy != null)
            this.languageStartValidy = (Date) languageStartValidy.clone();
        else
            this.languageStartValidy = languageStartValidy;
    }

    public Date getLanguageEndValidity() {
        if (this.languageEndValidity != null)
            return (Date) this.languageEndValidity.clone();
        else
            return null;

    }

    public void setLanguageEndValidity(Date languageEndValidity) {
        if (languageEndValidity != null)
            this.languageEndValidity = (Date) languageEndValidity.clone();
        else
            this.languageEndValidity = languageEndValidity;
    }

    public Long getLanguageLanguageCode() {
        return this.languageLanguageCode;
    }

    public void setLanguageLanguageCode(Long languageLanguageCode) {
        this.languageLanguageCode = languageLanguageCode;
    }

    public String getLanguageAlphabetName() {
        return this.languageAlphabetName;
    }

    public void setLanguageAlphabetName(String languageAlphabetName) {
        this.languageAlphabetName = languageAlphabetName;
    }

}
