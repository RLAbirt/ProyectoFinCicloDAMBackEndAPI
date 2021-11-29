package com.birt.berton.BertonRestAPI_PROY_1C.services;

import java.util.List;

import com.birt.berton.BertonRestAPI_PROY_1C.models.Restaurante;

public interface RestauranteService {
	
	public List<Restaurante> findAll();
	public List<Restaurante> findByLocation(Double lon, Double lat, Double dist);

}
