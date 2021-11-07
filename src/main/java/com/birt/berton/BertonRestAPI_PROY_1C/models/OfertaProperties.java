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
"documentdescription",
"eventsearchdate1",
"eventsearchdate2",
"importance",
"parentcorec",
"marks",
"templatetype",
"eventtargetgroup",
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


public class OfertaProperties {
	
	@JsonProperty("documentname")
	public String documentname;
	@JsonProperty("documentdescription")
	public String documentdescription;
	@JsonProperty("eventsearchdate1")
	public String eventsearchdate1;
	@JsonProperty("eventsearchdate2")
	public String eventsearchdate2;
	@JsonProperty("importance")
	public String importance;
	@JsonProperty("parentcorec")
	public String parentcorec;
	@JsonProperty("marks")
	public String marks;
	@JsonProperty("templatetype")
	public String templatetype;
	@JsonProperty("eventtargetgroup")
	public String eventtargetgroup;
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

	@JsonProperty("documentdescription")
	public String getDocumentdescription() {
	return documentdescription;
	}

	@JsonProperty("documentdescription")
	public void setDocumentdescription(String documentdescription) {
	this.documentdescription = documentdescription;
	}

	@JsonProperty("eventsearchdate1")
	public String getEventsearchdate1() {
	return eventsearchdate1;
	}

	@JsonProperty("eventsearchdate1")
	public void setEventsearchdate1(String eventsearchdate1) {
	this.eventsearchdate1 = eventsearchdate1;
	}

	@JsonProperty("eventsearchdate2")
	public String getEventsearchdate2() {
	return eventsearchdate2;
	}

	@JsonProperty("eventsearchdate2")
	public void setEventsearchdate2(String eventsearchdate2) {
	this.eventsearchdate2 = eventsearchdate2;
	}

	@JsonProperty("importance")
	public String getImportance() {
	return importance;
	}

	@JsonProperty("importance")
	public void setImportance(String importance) {
	this.importance = importance;
	}

	@JsonProperty("parentcorec")
	public String getParentcorec() {
	return parentcorec;
	}

	@JsonProperty("parentcorec")
	public void setParentcorec(String parentcorec) {
	this.parentcorec = parentcorec;
	}

	@JsonProperty("marks")
	public String getMarks() {
	return marks;
	}

	@JsonProperty("marks")
	public void setMarks(String marks) {
	this.marks = marks;
	}

	@JsonProperty("templatetype")
	public String getTemplatetype() {
	return templatetype;
	}

	@JsonProperty("templatetype")
	public void setTemplatetype(String templatetype) {
	this.templatetype = templatetype;
	}

	@JsonProperty("eventtargetgroup")
	public String getEventtargetgroup() {
	return eventtargetgroup;
	}

	@JsonProperty("eventtargetgroup")
	public void setEventtargetgroup(String eventtargetgroup) {
	this.eventtargetgroup = eventtargetgroup;
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
