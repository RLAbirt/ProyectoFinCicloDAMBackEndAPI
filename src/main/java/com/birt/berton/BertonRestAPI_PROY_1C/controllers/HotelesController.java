package com.birt.berton.BertonRestAPI_PROY_1C.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.birt.berton.BertonRestAPI_PROY_1C.models.Hotel;
import com.birt.berton.BertonRestAPI_PROY_1C.services.HotelService;

@RestController
@RequestMapping("/api")
public class HotelesController {

	@Autowired
	private HotelService hotelService;
	
	@GetMapping(value="/hoteles")
	public ResponseEntity<List<Hotel>> getAllHoteles() {
		return new ResponseEntity<List<Hotel>>(hotelService.findAll(), HttpStatus.OK);
	}
	
	@GetMapping(value="/hoteles/geo", params= {"lon", "lat", "dist"})
	public ResponseEntity<List<Hotel>> getHotelesByLocation(
			@RequestParam("lon") Double lon, @RequestParam("lat") Double lat, @RequestParam("dist") Double dist) {
		
		Double radius = dist / 6378.1;
		return new ResponseEntity<List<Hotel>>(hotelService.findByPositionNear(lon, lat, radius), HttpStatus.OK);
	}
	
}
