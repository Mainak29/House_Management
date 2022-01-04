package com.houseManagement.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.houseManagement.entity.houseEntity;

public interface HouseRepo extends JpaRepository<houseEntity, Integer> {
	List<houseEntity> findByType(String type);
	List<houseEntity> findById(int houseId);
}
