package com.birt.berton.BertonRestAPI_PROY_1C.DAO;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import com.birt.berton.BertonRestAPI_PROY_1C.models.Hotel;
/**
 * Interfaz que define las consultas de Hoteles
 * 
 */
public interface HotelesDAO extends MongoRepository<Hotel,Integer>  {

	List<Hotel> findAll();
	
	@Query(value="{'geometry':{$geoWithin:{$centerSphere:[[?0,?1],?2]}}}")
	List<Hotel> findByLocation(Double lon, Double lat, Double distance);
}
