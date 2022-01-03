package com.birt.berton.BertonRestAPI_PROY_1C.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.birt.berton.BertonRestAPI_PROY_1C.models.Oferta;
import com.birt.berton.BertonRestAPI_PROY_1C.services.OfertaService;

@RestController
@RequestMapping("/api")
public class OfertasController {
	
	@Autowired
	private OfertaService ofertaService;
	
	/**
	 * Endpoint principal de ofertas.
	 * @return
	 */
	@GetMapping(value="/ofertas")
	public ResponseEntity<List<Oferta>> getAllOfertas() {
		try {
			return new ResponseEntity<List<Oferta>>(ofertaService.findAll(), HttpStatus.OK);
		} catch (Exception e) {
			e.printStackTrace();
			return new ResponseEntity<List<Oferta>>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
}
