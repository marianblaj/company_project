package com.example.company_employee.company_employee.service;

import com.example.company_employee.company_employee.dao.CompanyEntity;
import com.example.company_employee.company_employee.dao.CompanyRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.concurrent.ConcurrentMap;
import java.util.stream.Collectors;

@Service
public class CompanyService {
    CompanyRepository companyRepository;

    public CompanyService(CompanyRepository companyRepository) {
        this.companyRepository = companyRepository;
    }

//    public List<Company> getAllCompanies(){
//        return companyRepository.findAll().stream().map(CompanyEntity::toPojo).collect(Collectors.toList());
//
//    }



    public List<Company> getAllCompanies(){
        return companyRepository
                .findAll()
                .stream()
                .map(CompanyEntity::toPojo)
                .collect(Collectors.toList());
    }

    public void addCompany(Company company){
        companyRepository.save(new CompanyEntity().convert2Entity(company));
    }

    public void updateCompany(String cui, Company company){
        CompanyEntity com = companyRepository
                .findCompanyEntityByCui(cui).orElseThrow(() -> new CompanyNotFoundException(company.getName()));

    }






























}
