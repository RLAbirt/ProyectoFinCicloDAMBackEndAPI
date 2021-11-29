package com.birt.berton.BertonRestAPI_PROY_1C.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.birt.berton.BertonRestAPI_PROY_1C.models.Restaurante;
import com.birt.berton.BertonRestAPI_PROY_1C.services.RestauranteService;

@RestController
@RequestMapping("/api")
public class RestaurantesController {
	
	@Autowired
	private RestauranteService restauranteService;
	
	@GetMapping(value="/restaurantes")
	public ResponseEntity<List<Restaurante>> getAllRestaurantes() {
		return new ResponseEntity<List<Restaurante>>(restauranteService.findAll(), HttpStatus.OK);
	}
	
	@GetMapping(value="restaurantes/geo", params={"lon", "lat", "dist"})
	public ResponseEntity<List<Restaurante>> getRestaurantesByLocation(
			@RequestParam("lon") Double lon, @RequestParam("lat") Double lat, @RequestParam("dist") Integer dist) {
		Double radius = dist / 6378.1;
		return new ResponseEntity<List<Restaurante>>(restauranteService.findByLocation(lon, lat, radius), HttpStatus.OK);
	}
}
