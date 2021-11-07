package com.birt.berton.BertonRestAPI_PROY_1C.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.birt.berton.BertonRestAPI_PROY_1C.DAO.OfertasDAO;
import com.birt.berton.BertonRestAPI_PROY_1C.models.Oferta;

@Service
public class OfertaServiceImpl implements OfertaService {
	
	@Autowired
	private OfertasDAO ofertasRepository;

	@Override
	public List<Oferta> findAll() {
		return ofertasRepository.findAll();
	}
	
}
