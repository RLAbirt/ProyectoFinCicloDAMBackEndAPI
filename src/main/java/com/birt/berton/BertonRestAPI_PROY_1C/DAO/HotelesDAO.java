package com.birt.berton.BertonRestAPI_PROY_1C.DAO;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.birt.berton.BertonRestAPI_PROY_1C.models.Hotel;

public interface HotelesDAO extends MongoRepository<Hotel,Integer>  {
	List<Hotel> findAll();
}
