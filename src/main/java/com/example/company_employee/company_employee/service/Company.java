package com.example.company_employee.company_employee.service;
import com.example.company_employee.company_employee.controller.CompanyDto;
import lombok.Data;

@Data
public class Company {

    private String name;
    private String address;
    private String cui;


      public CompanyDto toDto(){
          CompanyDto dto = new CompanyDto();
          dto.setName(name);
          dto.setCui(cui);
          return dto;
      }



}
