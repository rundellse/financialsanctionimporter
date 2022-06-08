package com.financialsanctionimporter.importer.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlType;

/**
 * Contains the Town and Country of birth for a sanctioned individual.
 */
@Entity
@XmlRootElement (name = "Location")
@XmlAccessorType (XmlAccessType.FIELD)
@XmlType (propOrder = {
		"townOfBirth",
		"countryOfBirth"
})
public class BirthDetailsLocation {

	@GeneratedValue
	@Id
	@XmlTransient
	private Long id;
	
	@XmlElement (name = "TownOfBirth")
	private String townOfBirth;
	
	@XmlElement (name = "CountryOfBirth")
	private String countryOfBirth;


	public String getTownOfBirth() {
		return townOfBirth;
	}


	public void setTownOfBirth(String townOfBirth) {
		this.townOfBirth = townOfBirth;
	}


	public String getCountryOfBirth() {
		return countryOfBirth;
	}


	public void setCountryOfBirth(String countryOfBirth) {
		this.countryOfBirth = countryOfBirth;
	}
	
}
