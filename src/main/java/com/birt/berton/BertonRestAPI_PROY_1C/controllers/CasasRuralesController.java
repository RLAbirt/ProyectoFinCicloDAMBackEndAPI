package com.birt.berton.BertonRestAPI_PROY_1C.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.birt.berton.BertonRestAPI_PROY_1C.models.CasaRural;
import com.birt.berton.BertonRestAPI_PROY_1C.services.CasaRuralService;


@RestController
@RequestMapping("/api")
public class CasasRuralesController {

	@Autowired
	private CasaRuralService casaRuralService;
	
	@GetMapping(value="/casasrurales")
	public ResponseEntity<List<CasaRural>> getAllCasasRurales() {
		return new ResponseEntity<List<CasaRural>>(casaRuralService.findAll(), HttpStatus.OK);
	}
	
	//Type -> "Agroturismos"
	@GetMapping(value="/casasrurales", params="type")
	public ResponseEntity<List<CasaRural>> getByPropertiesLodgingtype(@RequestParam("type") String type) {
		return new ResponseEntity<List<CasaRural>>(casaRuralService.findByPropertiesLodgingtype(type), HttpStatus.OK);
	}
	
	//Type -> "Agroturismos"
	@GetMapping(value="/casasrurales/geo", params={"lon", "lat", "dist", "type"})
	public ResponseEntity<List<CasaRural>> getByLodgingtypeAndLocation(
			@RequestParam("lon") Double lon, @RequestParam("lat") Double lat, @RequestParam("dist") Double dist, @RequestParam("type") String type ) {
		
		Double radius = dist / 6378.1;
		return new ResponseEntity<List<CasaRural>>(casaRuralService.findByLodgingtypeAndLocation(lon, lat, radius, type), HttpStatus.OK);
		
	}
	
}
