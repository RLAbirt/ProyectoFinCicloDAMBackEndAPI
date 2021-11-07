package com.birt.berton.BertonRestAPI_PROY_1C.DAO;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.birt.berton.BertonRestAPI_PROY_1C.models.Oferta;

public interface OfertasDAO extends MongoRepository<Oferta,Integer> {
	List<Oferta> findAll();
}
