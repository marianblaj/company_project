package com.example.company_employee.company_employee.dao;

import com.example.company_employee.company_employee.service.Company;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CompanyRepository extends JpaRepository<CompanyEntity, Integer> {
    Optional<CompanyEntity> findCompanyEntityByCui(String cui);
}
