package com.birt.berton.BertonRestAPI_PROY_1C.DAO;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.birt.berton.BertonRestAPI_PROY_1C.models.Restaurante;

public interface RestaurantesDAO extends MongoRepository<Restaurante,Integer> {

}
