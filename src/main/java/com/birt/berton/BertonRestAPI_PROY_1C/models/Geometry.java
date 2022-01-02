package com.birt.berton.BertonRestAPI_PROY_1C.models;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import lombok.Data;
import lombok.NoArgsConstructor;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "type",
    "coordinates"
})
@Data
@NoArgsConstructor
public class Geometry {
	
	@JsonProperty("type")
	public String type;
	
	@JsonProperty("coordinates")
    public List<Double> coordinates;
	
    public double distance;
	
	@JsonProperty("type")
    public String getType() {
        return type;
    }

    @JsonProperty("type")
    public void setType(String type) {
        this.type = type;
    }

    @JsonProperty("coordinates")
    public List<Double> getCoordinates() {
        return coordinates;
    }
    
    @JsonProperty("coordinates")
    public void setCoordinates(List<Double> coordinates) {
        this.coordinates = coordinates;
    }
    
    public void setDistance(Double distance) {
    	this.distance = distance;
    }
    
    
    public double calculaDistancia(double lon2, double lat2) {
		
		final int R = 6371; // Radius of the earth

	    double latDistance = Math.toRadians(lat2 - this.getCoordinates().get(1));
	    double lonDistance = Math.toRadians(lon2 - this.getCoordinates().get(0));
	    double a = Math.sin(latDistance / 2) * Math.sin(latDistance / 2)
	            + Math.cos(Math.toRadians(this.getCoordinates().get(1))) * Math.cos(Math.toRadians(lat2))
	            * Math.sin(lonDistance / 2) * Math.sin(lonDistance / 2);
	    double c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1 - a));
	    double distance = R * c * 1000; // convert to meters

	    return Math.round(distance);
	}

}
