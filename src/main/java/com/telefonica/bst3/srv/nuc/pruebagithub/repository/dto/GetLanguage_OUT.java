package com.telefonica.bst3.srv.nuc.pruebagithub.repository.dto;

import java.util.Date;

public class GetLanguage_OUT {

    private Date centvLanguageInCategoryStartValidity;
    private Date centvLanguageInCategoryEndValidity;
    private Long centaLanguageCode;
    private Date centvLanguageStartValidity;
    private Date centvLanguageEndValidity;
    private String centvLanguageAlphabetName;
    private Date centvLanguageCategoryStartValidity;
    private Date centvLanguageCategoryEndValidity;
    private String centvLanguageCategoryName;
    private Long centvLanguageCategoryCode;

    public GetLanguage_OUT() {
        super();
    }

    public GetLanguage_OUT(Date centvLanguageInCategoryStartValidity, Date centvLanguageInCategoryEndValidity,
            Long centaLanguageCode, Date centvLanguageStartValidity, Date centvLanguageEndValidity,
            String centvLanguageAlphabetName, Date centvLanguageCategoryStartValidity,
            Date centvLanguageCategoryEndValidity, String centvLanguageCategoryName, Long centvLanguageCategoryCode) {
        super();
        this.centvLanguageInCategoryStartValidity = centvLanguageInCategoryStartValidity;
        this.centvLanguageInCategoryEndValidity = centvLanguageInCategoryEndValidity;
        this.centaLanguageCode = centaLanguageCode;
        this.centvLanguageStartValidity = centvLanguageStartValidity;
        this.centvLanguageEndValidity = centvLanguageEndValidity;
        this.centvLanguageAlphabetName = centvLanguageAlphabetName;
        this.centvLanguageCategoryStartValidity = centvLanguageCategoryStartValidity;
        this.centvLanguageCategoryEndValidity = centvLanguageCategoryEndValidity;
        this.centvLanguageCategoryName = centvLanguageCategoryName;
        this.centvLanguageCategoryCode = centvLanguageCategoryCode;
    }

    public Date getCentvLanguageInCategoryStartValidity() {
        if (this.centvLanguageInCategoryStartValidity != null)
            return (Date) this.centvLanguageInCategoryStartValidity.clone();
        else
            return null;

    }

    public void setCentvLanguageInCategoryStartValidity(Date centvLanguageInCategoryStartValidity) {
        if (centvLanguageInCategoryStartValidity != null)
            this.centvLanguageInCategoryStartValidity = (Date) centvLanguageInCategoryStartValidity.clone();
        else
            this.centvLanguageInCategoryStartValidity = centvLanguageInCategoryStartValidity;
    }

    public Date getCentvLanguageInCategoryEndValidity() {
        if (this.centvLanguageInCategoryEndValidity != null)
            return (Date) this.centvLanguageInCategoryEndValidity.clone();
        else
            return null;

    }

    public void setCentvLanguageInCategoryEndValidity(Date centvLanguageInCategoryEndValidity) {
        if (centvLanguageInCategoryEndValidity != null)
            this.centvLanguageInCategoryEndValidity = (Date) centvLanguageInCategoryEndValidity.clone();
        else
            this.centvLanguageInCategoryEndValidity = centvLanguageInCategoryEndValidity;
    }

    public Long getCentaLanguageCode() {
        return this.centaLanguageCode;
    }

    public void setCentaLanguageCode(Long centaLanguageCode) {
        this.centaLanguageCode = centaLanguageCode;
    }

    public Date getCentvLanguageStartValidity() {
        if (this.centvLanguageStartValidity != null)
            return (Date) this.centvLanguageStartValidity.clone();
        else
            return null;

    }

    public void setCentvLanguageStartValidity(Date centvLanguageStartValidity) {
        if (centvLanguageStartValidity != null)
            this.centvLanguageStartValidity = (Date) centvLanguageStartValidity.clone();
        else
            this.centvLanguageStartValidity = centvLanguageStartValidity;
    }

    public Date getCentvLanguageEndValidity() {
        if (this.centvLanguageEndValidity != null)
            return (Date) this.centvLanguageEndValidity.clone();
        else
            return null;

    }

    public void setCentvLanguageEndValidity(Date centvLanguageEndValidity) {
        if (centvLanguageEndValidity != null)
            this.centvLanguageEndValidity = (Date) centvLanguageEndValidity.clone();
        else
            this.centvLanguageEndValidity = centvLanguageEndValidity;
    }

    public String getCentvLanguageAlphabetName() {
        return this.centvLanguageAlphabetName;
    }

    public void setCentvLanguageAlphabetName(String centvLanguageAlphabetName) {
        this.centvLanguageAlphabetName = centvLanguageAlphabetName;
    }

    public Date getCentvLanguageCategoryStartValidity() {
        if (this.centvLanguageCategoryStartValidity != null)
            return (Date) this.centvLanguageCategoryStartValidity.clone();
        else
            return null;

    }

    public void setCentvLanguageCategoryStartValidity(Date centvLanguageCategoryStartValidity) {
        if (centvLanguageCategoryStartValidity != null)
            this.centvLanguageCategoryStartValidity = (Date) centvLanguageCategoryStartValidity.clone();
        else
            this.centvLanguageCategoryStartValidity = centvLanguageCategoryStartValidity;
    }

    public Date getCentvLanguageCategoryEndValidity() {
        if (this.centvLanguageCategoryEndValidity != null)
            return (Date) this.centvLanguageCategoryEndValidity.clone();
        else
            return null;

    }

    public void setCentvLanguageCategoryEndValidity(Date centvLanguageCategoryEndValidity) {
        if (centvLanguageCategoryEndValidity != null)
            this.centvLanguageCategoryEndValidity = (Date) centvLanguageCategoryEndValidity.clone();
        else
            this.centvLanguageCategoryEndValidity = centvLanguageCategoryEndValidity;
    }

    public String getCentvLanguageCategoryName() {
        return this.centvLanguageCategoryName;
    }

    public void setCentvLanguageCategoryName(String centvLanguageCategoryName) {
        this.centvLanguageCategoryName = centvLanguageCategoryName;
    }

    public Long getCentvLanguageCategoryCode() {
        return this.centvLanguageCategoryCode;
    }

    public void setCentvLanguageCategoryCode(Long centvLanguageCategoryCode) {
        this.centvLanguageCategoryCode = centvLanguageCategoryCode;
    }

}
