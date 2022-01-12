package com.birt.berton.BertonRestAPI_PROY_1C.services;

import java.util.List;

import com.birt.berton.BertonRestAPI_PROY_1C.models.Hotel;
/**
 * Interfaz que define las consultas que habrá que implementar en el servicio de Hoteles
 * 
 */
public interface HotelService {
	List<Hotel> findAll();
	List<Hotel> findByPositionNear(Double lon, Double lat, Double distance);
}
