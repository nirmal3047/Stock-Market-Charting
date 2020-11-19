package com.nirmal.company.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nirmal.company.entities.Sector;

@Repository
public interface SectorDao extends JpaRepository<Sector, Integer> {

}
