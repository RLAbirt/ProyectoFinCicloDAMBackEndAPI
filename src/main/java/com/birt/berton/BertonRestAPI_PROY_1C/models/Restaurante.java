package com.birt.berton.BertonRestAPI_PROY_1C.models;

import org.springframework.data.mongodb.core.mapping.Document;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Document(collection="restaurantes")
public class Restaurante extends Establecimiento {
	
	@JsonProperty("properties")
	private Properties properties;

}
