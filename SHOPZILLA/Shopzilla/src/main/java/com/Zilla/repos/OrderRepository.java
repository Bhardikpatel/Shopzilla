package com.Zilla.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Zilla.models.Order;

@Repository
public interface OrderRepository extends JpaRepository<Order, Integer>{

	List<Order> findByUseridOrderByIdDesc(String userid);

	List<Order> findByStatusOrderByIdDesc(String status);
	
	
}
