package com.birt.berton.BertonRestAPI_PROY_1C.DAO;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.birt.berton.BertonRestAPI_PROY_1C.models.CasaRural;
import com.birt.berton.BertonRestAPI_PROY_1C.models.Hotel;

public interface CasasRuralesDAO extends MongoRepository<CasaRural,Integer> {
	List<CasaRural> findAll();
	List<CasaRural> findByPropertiesLodgingtype(String type);
}
