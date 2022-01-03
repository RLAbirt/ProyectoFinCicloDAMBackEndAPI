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

import com.birt.berton.BertonRestAPI_PROY_1C.models.CasaRural;
import com.birt.berton.BertonRestAPI_PROY_1C.services.CasaRuralService;


@RestController
@RequestMapping("/api")
public class CasasRuralesController {

	@Autowired
	private CasaRuralService casaRuralService;
	
	/**
	 * Endpoint principal de alojamientos.
	 * @return
	 */
	@GetMapping(value="/casasrurales")
	public ResponseEntity<List<CasaRural>> getAllCasasRurales() {
		try {
			return new ResponseEntity<List<CasaRural>>(casaRuralService.findAll(), HttpStatus.OK);
		} catch (Exception e) {
			e.printStackTrace();
			return new ResponseEntity<List<CasaRural>>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	/**
	 * Endpoint principal de casas rurales. Recibe un parámetro con el tipo de alojamiento
	 * para limitarlos a Agroturismos.
	 * @param type
	 * @return
	 */
	
	@GetMapping(value="/casasrurales", params="type")
	public ResponseEntity<List<CasaRural>> getByPropertiesLodgingtype(@RequestParam("type") String type) {
		try {
			return new ResponseEntity<List<CasaRural>>(casaRuralService.findByPropertiesLodgingtype(type), HttpStatus.OK);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return new ResponseEntity<List<CasaRural>>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	/**
	 * Endpoint para consultar restaurantes por geolocalización. Calcula la distancia entre el usuario
	 * y ordena la lista de menor a mayor distancia.
	 * @param lon
	 * @param lat
	 * @param dist
	 * @param type
	 * @return
	 */
	@GetMapping(value="/casasrurales/geo", params={"lon", "lat", "dist", "type"})
	public ResponseEntity<List<CasaRural>> getByLodgingtypeAndLocation(
			@RequestParam("lon") Double lon, @RequestParam("lat") Double lat, @RequestParam("dist") Double dist, @RequestParam("type") String type ) {
		
		try {
			Double radius = dist / 6378.1;
			
			List<CasaRural> rurales = casaRuralService.findByLodgingtypeAndLocation(lon, lat, radius, type);
			
			//Calcula distancia y la asigna
			for(int i = 0; i < rurales.size(); i++ ) {	
				rurales.get(i).getGeometry().setDistance(rurales.get(i).getGeometry().calculaDistancia(lon, lat));
			}
			
			//Ordena la lista de menos a mayor distancia
			Collections.sort(rurales, new Comparator<CasaRural>() {

				@Override
				public int compare(CasaRural o1, CasaRural o2) {
					// TODO Auto-generated method stub
					return Double.compare(o1.getGeometry().getDistance(), o2.getGeometry().getDistance());
				}
				
			});
			
			return new ResponseEntity<List<CasaRural>>(rurales, HttpStatus.OK);
		} catch (Exception e) {

			e.printStackTrace();
			return new ResponseEntity<List<CasaRural>>(HttpStatus.INTERNAL_SERVER_ERROR);
		}

		
	}
	
}
