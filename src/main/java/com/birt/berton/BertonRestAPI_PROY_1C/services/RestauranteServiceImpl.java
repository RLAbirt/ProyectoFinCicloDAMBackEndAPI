package com.birt.berton.BertonRestAPI_PROY_1C.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.birt.berton.BertonRestAPI_PROY_1C.DAO.RestaurantesDAO;
import com.birt.berton.BertonRestAPI_PROY_1C.models.Restaurante;

@Service
public class RestauranteServiceImpl implements RestauranteService {
	
	@Autowired
	private RestaurantesDAO restaurantesRepository;
	

	@Override
	public List<Restaurante> findAll() {
		return restaurantesRepository.findAll();
	}


	@Override
	public List<Restaurante> findByLocation(Double lon, Double lat, Double dist) {
		return restaurantesRepository.findByLocation(lon, lat, dist);
	}

}
