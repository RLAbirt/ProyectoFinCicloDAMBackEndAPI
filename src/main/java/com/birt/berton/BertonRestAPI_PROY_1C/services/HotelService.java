package com.birt.berton.BertonRestAPI_PROY_1C.services;

import java.util.List;

import com.birt.berton.BertonRestAPI_PROY_1C.models.Hotel;

public interface HotelService {
	List<Hotel> findAll();
	List<Hotel> findByPositionNear(Double lon, Double lat, Double distance);
}
