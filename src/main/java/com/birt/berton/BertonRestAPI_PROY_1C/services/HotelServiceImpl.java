package com.birt.berton.BertonRestAPI_PROY_1C.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.birt.berton.BertonRestAPI_PROY_1C.DAO.HotelesDAO;
import com.birt.berton.BertonRestAPI_PROY_1C.models.Hotel;

@Service
public class HotelServiceImpl implements HotelService {
	@Autowired
	private HotelesDAO hotelesRepository;

	@Override
	public List<Hotel> findAll() {
		return hotelesRepository.findAll();
	}

	@Override
	public List<Hotel> findByPositionNear(Double lon, Double lat, Double distance) {
		return hotelesRepository.findByLocation(lon, lat, distance);
	}

	
}
