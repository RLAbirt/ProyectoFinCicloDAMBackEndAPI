package com.birt.berton.BertonRestAPI_PROY_1C.models;

import org.bson.types.ObjectId;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Establecimiento {
	@JsonProperty("_id")
	private ObjectId id;
	@JsonProperty("id")
    private Integer establecimientoId;
    @JsonProperty("type")
    private String type;
    @JsonProperty("geometry")
    private Geometry geometry;
}
