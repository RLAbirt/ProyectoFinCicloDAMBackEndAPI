package com.birt.berton.BertonRestAPI_PROY_1C.controllers;

import java.util.Collections;
import java.util.Comparator;
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
			@RequestParam("lon") Double lon, @RequestParam("lat") Double lat, @RequestParam("dist") Double dist) {
		
		try {
			Double radius = dist / 6378.1;
			List<Restaurante> restaurantes = restauranteService.findByLocation(lon, lat, radius);
			
			//Calcula distancia y la asigna
			for(int i = 0; i < restaurantes.size(); i++ ) {	
				restaurantes.get(i).getGeometry().setDistance(restaurantes.get(i).getGeometry().calculaDistancia(lon, lat));
			}
			
			//Ordena la lista de menos a mayor distancia
			Collections.sort(restaurantes, new Comparator<Restaurante>() {

				@Override
				public int compare(Restaurante o1, Restaurante o2) {
					// TODO Auto-generated method stub
					return Double.compare(o1.getGeometry().getDistance(), o2.getGeometry().getDistance());
				}
				
			});
			
			return new ResponseEntity<List<Restaurante>>(restaurantes, HttpStatus.OK);
		} catch (Exception e) {
			
			e.printStackTrace();
			return new ResponseEntity<List<Restaurante>>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
}
