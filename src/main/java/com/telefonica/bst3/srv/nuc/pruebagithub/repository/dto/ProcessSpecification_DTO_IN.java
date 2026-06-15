package com.telefonica.bst3.srv.nuc.pruebagithub.repository.dto;

public class ProcessSpecification_DTO_IN {

    private Integer id;
    private String code;
    private String name;
    private Integer level;

    public ProcessSpecification_DTO_IN() {
        super();
    }

    public ProcessSpecification_DTO_IN(Integer id, String code, String name, Integer level) {
        super();
        this.id = id;
        this.code = code;
        this.name = name;
        this.level = level;
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCode() {
        return this.code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getLevel() {
        return this.level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

}
