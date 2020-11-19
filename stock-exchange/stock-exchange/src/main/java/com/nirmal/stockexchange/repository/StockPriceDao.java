package com.nirmal.stockexchange.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.nirmal.stockexchange.entities.StockPriceEntity;

@Repository
public interface StockPriceDao extends JpaRepository<StockPriceEntity, Integer> {

	@Query("select s from StockPriceEntity s where s.companyCode like %?1")
	List<StockPriceEntity> findByCompanyCode(int companyCode);
}
