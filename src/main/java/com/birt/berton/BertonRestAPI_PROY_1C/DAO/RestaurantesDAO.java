package com.birt.berton.BertonRestAPI_PROY_1C.DAO;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import com.birt.berton.BertonRestAPI_PROY_1C.models.Restaurante;
/**
 * Interfaz que define las consultas de Restaurantes
 * 
 */
public interface RestaurantesDAO extends MongoRepository<Restaurante,Integer> {
	
	List<Restaurante> findAll();
	
	@Query(value="{'geometry':{$geoWithin:{$centerSphere:[[?0,?1],?2]}}}")
	List<Restaurante> findByLocation(Double lon, Double lat, Double dist);

}
