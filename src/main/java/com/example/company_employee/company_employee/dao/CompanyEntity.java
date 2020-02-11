package com.example.company_employee.company_employee.dao;

import com.example.company_employee.company_employee.service.Company;
import lombok.Data;
import lombok.Generated;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Data
@Entity
public class CompanyEntity {

    @Id
    @GeneratedValue
    private int id;

    @NotNull
    @Column(name = "nume", unique = true, nullable = false)
    private String name;
    private String address;
    private String cui;

    public Company toPojo() {
        Company pojo = new Company();
        pojo.setName(name);
        pojo.setAddress(address);
        pojo.setCui(cui);
        return pojo;
    }

    public CompanyEntity update(Company pojo){
        this.name=pojo.getName();
        this.address=pojo.getAddress();
        this.cui=pojo.getCui();
        return this;
    }

}
