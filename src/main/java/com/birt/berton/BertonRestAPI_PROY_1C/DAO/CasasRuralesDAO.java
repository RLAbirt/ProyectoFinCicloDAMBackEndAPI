package com.birt.berton.BertonRestAPI_PROY_1C.DAO;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import com.birt.berton.BertonRestAPI_PROY_1C.models.CasaRural;

public interface CasasRuralesDAO extends MongoRepository<CasaRural,Integer> {
	List<CasaRural> findAll();
	
	List<CasaRural> findByPropertiesLodgingtype(String type);
	
	@Query(value="{'geometry':{$geoWithin:{$centerSphere:[[?0,?1],?2]}}, 'properties.lodgingtype':?3}")
	List<CasaRural> findByLodgingtypeAndLocation(Double lon, Double lat, Double dist, String type);
}
