package com.example.company_employee.company_employee.controller;

import com.example.company_employee.company_employee.dao.CompanyEntity;
import com.example.company_employee.company_employee.service.Company;
import com.example.company_employee.company_employee.service.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/company")
public class CompanyController {
    private CompanyService companyService;

    @Autowired
    public CompanyController(CompanyService companyService) {
        this.companyService = companyService;
    }

    @GetMapping("/")
    public List<Company> getAllCompany(){
        return companyService
                .getAllCompanies()
                ;

    }
}
