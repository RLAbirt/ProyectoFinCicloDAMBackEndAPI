package com.birt.berton.BertonRestAPI_PROY_1C.models;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
"documentname",
"turismdescription", 
"templatetype",
"locality",
"marks",
"physical",
"visual",
"auditive",
"intellectual",
"organic",
"tourismemail",
"web",
"lodgingtype",
"category", 
"signatura", 
"capacity", 
"municipality",
"municipalitycode",
"territory",
"territorycode",
"country",
"countrycode",
"friendlyurl",
"physicalurl",
"dataxml",
"metadataxml",
"zipfile"
})


public class HotelProperties {
	
	@JsonProperty("documentname")
	public String documentname;		
	@JsonProperty("turismdescription")
	public String turismdescription; 
	@JsonProperty("templatetype")
	public String templatetype; 
	@JsonProperty("locality")
	public String locality; 
	@JsonProperty("marks")
	public String marks; 
	@JsonProperty("physical")
	public String physical; 
	@JsonProperty("visual")
	public String visual; 
	@JsonProperty("auditive")
	public String auditive; 
	@JsonProperty("intellectual")
	public String intellectual; 
	@JsonProperty("organic")
	public String organic; 
	@JsonProperty("tourismemail")
	public String tourismemail; 
	@JsonProperty("web")
	public String web; 
	@JsonProperty("lodgingtype")
	public String lodgingtype; 
	@JsonProperty("category")
	public String category; 
	@JsonProperty("signatura")
	public String signatura; 
	@JsonProperty("capacity")
	public String capacity; 
	@JsonProperty("municipality")
	public String municipality;
	@JsonProperty("municipalitycode")
	public String municipalitycode;
	@JsonProperty("territory")
	public String territory;
	@JsonProperty("territorycode")
	public String territorycode;
	@JsonProperty("country")
	public String country;
	@JsonProperty("countrycode")
	public String countrycode;
	@JsonProperty("friendlyurl")
	public String friendlyurl;
	@JsonProperty("physicalurl")
	public String physicalurl;
	@JsonProperty("dataxml")
	public String dataxml;
	@JsonProperty("metadataxml")
	public String metadataxml;
	@JsonProperty("zipfile")
	public String zipfile;
	
	@JsonProperty("documentname")
	public String getDocumentname() {
		return documentname;
	}
	
	@JsonProperty("documentname")
	public void setDocumentname(String documentname) {
		this.documentname = documentname;
	}
	
	@JsonProperty("turismdescription")
	public String getTurismdescription() {
		return turismdescription;
	}
	
	@JsonProperty("turismdescription")
	public void setTurismdescription(String turismdescription) {
		this.turismdescription = turismdescription;
	}
	
	@JsonProperty("templatetype")
	public String getTemplatetype() {
		return templatetype;
	}
	
	@JsonProperty("templatetype")
	public void setTemplatetype(String templatetype) {
		this.templatetype = templatetype;
	}
	
	@JsonProperty("locality")
	public String getLocality() {
		return locality;
	}
	
	@JsonProperty("locality")
	public void setLocality(String locality) {
		this.locality = locality;
	}
	
	@JsonProperty("marks")
	public String getMarks() {
		return marks;
	}
	
	@JsonProperty("marks")
	public void setMarks(String marks) {
		this.marks = marks;
	}
	
	@JsonProperty("physical")
	public String getPhysical() {
		return physical;
	}
	
	@JsonProperty("physical")
	public void setPhysical(String physical) {
		this.physical = physical;
	}
	
	@JsonProperty("visual")
	public String getVisual() {
		return visual;
	}
	
	@JsonProperty("visual")
	public void setVisual(String visual) {
		this.visual = visual;
	}
	
	@JsonProperty("auditive")
	public String getAuditive() {
		return auditive;
	}
	
	@JsonProperty("auditive")
	public void setAuditive(String auditive) {
		this.auditive = auditive;
	}
	
	@JsonProperty("intellectual")
	public String getIntellectual() {
		return intellectual;
	}
	
	@JsonProperty("intellectual")
	public void setIntellectual(String intellectual) {
		this.intellectual = intellectual;
	}
	
	@JsonProperty("organic")
	public String getOrganic() {
		return organic;
	}
	
	@JsonProperty("organic")
	public void setOrganic(String organic) {
		this.organic = organic;
	}
	
	@JsonProperty("tourismemail")
	public String getTourismemail() {
		return tourismemail;
	}
	
	@JsonProperty("tourismemail")
	public void setTourismemail(String tourismemail) {
		this.tourismemail = tourismemail;
	}
	
	@JsonProperty("web")
	public String getWeb() {
		return web;
	}
	
	@JsonProperty("web")
	public void setWeb(String web) {
		this.web = web;
	}
	
	@JsonProperty("lodgingtype")
	public String getLodgingtype() {
		return lodgingtype;
	}
	
	@JsonProperty("lodgingtype")
	public void setLodgingtype(String lodgingtype) {
		this.lodgingtype = lodgingtype;
	}
	
	@JsonProperty("category")
	public String getCategory() {
		return category;
	}
	
	@JsonProperty("category")
	public void setCategory(String category) {
		this.category = category;
	}
	
	@JsonProperty("signatura")
	public String getSignatura() {
		return signatura;
	}
	
	@JsonProperty("signatura")
	public void setSignatura(String signatura) {
		this.signatura = signatura;
	}
	
	@JsonProperty("capacity")
	public String getCapacity() {
		return capacity;
	}
	
	@JsonProperty("capacity")
	public void setCapacity(String capacity) {
		this.capacity = capacity;
	}
	
	@JsonProperty("municipality")
	public String getMunicipality() {
		return municipality;
	}
	
	@JsonProperty("municipality")
	public void setMunicipality(String municipality) {
		this.municipality = municipality;
	}
	
	@JsonProperty("municipalitycode")
	public String getMunicipalitycode() {
		return municipalitycode;
	}
	
	@JsonProperty("municipalitycode")
	public void setMunicipalitycode(String municipalitycode) {
		this.municipalitycode = municipalitycode;
	}
	
	@JsonProperty("territory")
	public String getTerritory() {
		return territory;
	}
	
	@JsonProperty("territory")
	public void setTerritory(String territory) {
		this.territory = territory;
	}
	
	@JsonProperty("territorycode")
	public String getTerritorycode() {
		return territorycode;
	}
	
	@JsonProperty("territorycode")
	public void setTerritorycode(String territorycode) {
		this.territorycode = territorycode;
	}
	
	@JsonProperty("country")
	public String getCountry() {
		return country;
	}
	
	@JsonProperty("country")
	public void setCountry(String country) {
		this.country = country;
	}
	
	@JsonProperty("countrycode")
	public String getCountrycode() {
		return countrycode;
	}
	
	@JsonProperty("countrycode")
	public void setCountrycode(String countrycode) {
		this.countrycode = countrycode;
	}
	
	@JsonProperty("friendlyurl")
	public String getFriendlyurl() {
		return friendlyurl;
	}
	
	@JsonProperty("friendlyurl")
	public void setFriendlyurl(String friendlyurl) {
		this.friendlyurl = friendlyurl;
	}
	
	@JsonProperty("physicalurl")
	public String getPhysicalurl() {
		return physicalurl;
	}
	
	@JsonProperty("physicalurl")
	public void setPhysicalurl(String physicalurl) {
		this.physicalurl = physicalurl;
	}
	
	@JsonProperty("dataxml")
	public String getDataxml() {
		return dataxml;
	}
	
	@JsonProperty("dataxml")
	public void setDataxml(String dataxml) {
		this.dataxml = dataxml;
	}
	
	@JsonProperty("metadataxml")
	public String getMetadataxml() {
		return metadataxml;
	}
	
	@JsonProperty("metadataxml")
	public void setMetadataxml(String metadataxml) {
		this.metadataxml = metadataxml;
	}
	
	@JsonProperty("zipfile")
	public String getZipfile() {
		return zipfile;
	}
	
	@JsonProperty("zipfile")
	public void setZipfile(String zipfile) {
		this.zipfile = zipfile;
	}
	
}
