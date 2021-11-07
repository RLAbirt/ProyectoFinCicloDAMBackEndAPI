package com.birt.berton.BertonRestAPI_PROY_1C.controllers;

import java.net.http.HttpResponse;
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
	
	@GetMapping(value="/ofertas")
	public ResponseEntity<List<Oferta>> getAllOfertas() {
		return new ResponseEntity<List<Oferta>>(ofertaService.findAll(), HttpStatus.OK);
	}
	
}
