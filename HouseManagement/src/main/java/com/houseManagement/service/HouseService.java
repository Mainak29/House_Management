package com.houseManagement.service;

import java.util.List;
import java.util.Optional;

import com.houseManagement.entity.houseEntity;

public interface HouseService {
	public void saveHouseService(houseEntity hentity);
	
	public List<houseEntity> getAllHousesService();
	
	public void deleteHouseService(int id, int houseId);

	public List<houseEntity> getHousesService(int houseId);

	public List<houseEntity> getTypeService(String type);
}
