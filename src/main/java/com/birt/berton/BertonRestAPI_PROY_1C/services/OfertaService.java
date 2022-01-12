package com.birt.berton.BertonRestAPI_PROY_1C.services;

import java.util.List;

import com.birt.berton.BertonRestAPI_PROY_1C.models.Oferta;
/**
 * Interfaz que define las consultas que habrá que implementar en el servicio de Ofertas
 * 
 */
public interface OfertaService {
	List<Oferta> findAll();

}
