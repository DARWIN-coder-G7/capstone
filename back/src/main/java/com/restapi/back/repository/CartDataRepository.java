package com.restapi.back.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.restapi.back.entity.CartData;

public interface CartDataRepository extends JpaRepository<CartData,Long>{

	@Query( value ="SELECT * FROM products where pr_status = 1 and pr_name like concat('%',:query,'%')or pr_desc like concat('%',:query,'%')",
			nativeQuery = true)	
	List<CartData>ByUserId(long query);
}
