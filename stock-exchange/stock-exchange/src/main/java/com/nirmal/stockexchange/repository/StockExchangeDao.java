package com.nirmal.stockexchange.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nirmal.stockexchange.entities.StockExchangeEntity;

@Repository
public interface StockExchangeDao extends JpaRepository<StockExchangeEntity, Integer> {

}
