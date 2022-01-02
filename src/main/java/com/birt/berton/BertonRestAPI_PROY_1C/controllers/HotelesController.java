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

import com.birt.berton.BertonRestAPI_PROY_1C.models.Hotel;
import com.birt.berton.BertonRestAPI_PROY_1C.models.Properties;
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
		
		try {
			Double radius = dist / 6378.1;
			List<Hotel> hoteles = hotelService.findByPositionNear(lon, lat, radius);
			
			//Calcula distancia y la asigna
			for(int i = 0; i < hoteles.size(); i++ ) {	
				hoteles.get(i).getGeometry().setDistance(hoteles.get(i).getGeometry().calculaDistancia(lon, lat));
			}
			
			//Ordena la lista de menos a mayor distancia
			Collections.sort(hoteles, new Comparator<Hotel>() {

				@Override
				public int compare(Hotel o1, Hotel o2) {
					// TODO Auto-generated method stub
					return Double.compare(o1.getGeometry().getDistance(), o2.getGeometry().getDistance());
				}
				
			});
				
			return new ResponseEntity<List<Hotel>>(hoteles, HttpStatus.OK);
		} catch (Exception e) {
			e.printStackTrace();
			return new ResponseEntity<List<Hotel>>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
}
