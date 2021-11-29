package com.birt.berton.BertonRestAPI_PROY_1C.services;

import java.util.List;

import com.birt.berton.BertonRestAPI_PROY_1C.models.CasaRural;

public interface CasaRuralService {
	List<CasaRural> findAll();	
	
	List<CasaRural> findByPropertiesLodgingtype(String type);
	
	List<CasaRural> findByLodgingtypeAndLocation(Double lon, Double lat, Double dist, String type);
}
