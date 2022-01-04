package com.houseManagement.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.houseManagement.entity.houseEntity;
import com.houseManagement.service.HouseService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

@RestController
@CrossOrigin(origins = "*")
public class HouseController {
	
	@Autowired
	private HouseService hs;
	
	private int houseId = 0;

	private String type;
	
	@PostMapping("/saveHouse")
	public void saveHouse(@RequestBody houseEntity hE) {
		houseEntity hentity = new houseEntity();
		hentity.setHouseId(hE.getHouseId());
		hentity.setHouseNo(hE.getHouseNo());
		hentity.setStatus(hE.getStatus());
		hentity.setType(hE.getType());
		hs.saveHouseService(hentity);
	}
	
	@GetMapping("/getAllHouse")
    public List<houseEntity> getAllHouse() {
        return hs.getAllHousesService();
    }
    
    @GetMapping("/deleteHouse")
    public void deleteHouse(@RequestParam int id) {
        hs.deleteHouseService(id, this.houseId);
    }
    
    @GetMapping("/getHouse")
    public List<houseEntity> getHouse() {
        return hs.getHousesService(this.houseId);
    }
    
    @GetMapping("/getByType")
    public List<houseEntity> getByType() {
        return hs.getTypeService(this.type);
    }
}
