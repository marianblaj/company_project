package com.example.company_employee.company_employee.dao;

import com.example.company_employee.company_employee.service.Company;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CompanyRepository extends JpaRepository<Company, String> {
}
