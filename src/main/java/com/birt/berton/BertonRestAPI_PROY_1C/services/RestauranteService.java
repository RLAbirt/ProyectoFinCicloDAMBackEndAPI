package com.birt.berton.BertonRestAPI_PROY_1C.services;

import java.util.List;

import com.birt.berton.BertonRestAPI_PROY_1C.models.Restaurante;
/**
 * Interfaz que define las consultas que habrá que implementar en el servicio de Restaurantes
 * 
 */
public interface RestauranteService {
	
	public List<Restaurante> findAll();
	public List<Restaurante> findByLocation(Double lon, Double lat, Double dist);

}
