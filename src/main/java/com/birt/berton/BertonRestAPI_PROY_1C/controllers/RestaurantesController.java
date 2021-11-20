package com.birt.berton.BertonRestAPI_PROY_1C.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
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
}
