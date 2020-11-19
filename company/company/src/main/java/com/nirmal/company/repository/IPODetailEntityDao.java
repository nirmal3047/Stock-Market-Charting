package com.nirmal.company.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nirmal.company.entities.IPODetailEntity;

@Repository
public interface IPODetailEntityDao extends JpaRepository<IPODetailEntity, Integer>{

}
