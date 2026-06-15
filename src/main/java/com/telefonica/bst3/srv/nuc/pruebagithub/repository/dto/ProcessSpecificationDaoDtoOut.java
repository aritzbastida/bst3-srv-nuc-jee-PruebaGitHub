package com.telefonica.bst3.srv.nuc.pruebagithub.repository.dto;

import java.util.Date;

public class ProcessSpecificationDaoDtoOut {

    private Long id;
    private String name;
    private Date startValidity;
    private Date endValidity;
    private String code;
    private Long level;
    private String description;
    private String shortName;
    private Long idProcessSpecFather;

    public ProcessSpecificationDaoDtoOut() {
        super();
    }

    public ProcessSpecificationDaoDtoOut(Long id, String name, Date startValidity, Date endValidity, String code,
            Long level, String description, String shortName, Long idProcessSpecFather) {
        super();
        this.id = id;
        this.name = name;
        this.startValidity = startValidity;
        this.endValidity = endValidity;
        this.code = code;
        this.level = level;
        this.description = description;
        this.shortName = shortName;
        this.idProcessSpecFather = idProcessSpecFather;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
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

    public String getCode() {
        return this.code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Long getLevel() {
        return this.level;
    }

    public void setLevel(Long level) {
        this.level = level;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getShortName() {
        return this.shortName;
    }

    public void setShortName(String shortName) {
        this.shortName = shortName;
    }

    public Long getIdProcessSpecFather() {
        return this.idProcessSpecFather;
    }

    public void setIdProcessSpecFather(Long idProcessSpecFather) {
        this.idProcessSpecFather = idProcessSpecFather;
    }

}
