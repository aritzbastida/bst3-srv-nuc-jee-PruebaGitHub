package com.telefonica.bst3.srv.nuc.pruebagithub.repository.dto;

import java.util.Date;

public class ListLanguage_OUT {

    private String alphabetName;
    private Date languageCode;
    private Date startValidity;
    private Date endValidity;

    public ListLanguage_OUT() {
        super();
    }

    public ListLanguage_OUT(String alphabetName, Date languageCode, Date startValidity, Date endValidity) {
        super();
        this.alphabetName = alphabetName;
        this.languageCode = languageCode;
        this.startValidity = startValidity;
        this.endValidity = endValidity;
    }

    public String getAlphabetName() {
        return this.alphabetName;
    }

    public void setAlphabetName(String alphabetName) {
        this.alphabetName = alphabetName;
    }

    public Date getLanguageCode() {
        if (this.languageCode != null)
            return (Date) this.languageCode.clone();
        else
            return null;

    }

    public void setLanguageCode(Date languageCode) {
        if (languageCode != null)
            this.languageCode = (Date) languageCode.clone();
        else
            this.languageCode = languageCode;
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

}
