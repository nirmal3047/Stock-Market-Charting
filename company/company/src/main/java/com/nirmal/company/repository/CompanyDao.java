package com.nirmal.company.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nirmal.company.entities.Company;

@Repository
public interface CompanyDao extends JpaRepository<Company, Integer> {

}
