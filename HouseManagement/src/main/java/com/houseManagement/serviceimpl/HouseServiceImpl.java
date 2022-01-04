package com.houseManagement.serviceimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.houseManagement.repo.HouseRepo;
import com.houseManagement.service.HouseService;
import com.houseManagement.entity.*;

@Service
public class HouseServiceImpl implements HouseService {
	
	@Autowired
	private HouseRepo rp;
	
	public List<houseEntity> getAllHousesService(){
		return rp.findAll();
	}
	
	@Override
	public void saveHouseService(houseEntity hentity) {
		rp.save(hentity);
	}

	@Override
	public void deleteHouseService(int id, int houseId) {
		
		if(rp.findById(id) != null)
        {
            rp.deleteById(id);
        }
		
	}

	@Override
	public List<houseEntity> getHousesService(int houseId) {
		// TODO Auto-generated method stub
		return rp.findById(houseId);
	}

	@Override
	public List<houseEntity> getTypeService(String type) {
		// TODO Auto-generated method stub
		return rp.findByType(type);
	}
}
