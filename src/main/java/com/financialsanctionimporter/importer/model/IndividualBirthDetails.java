package com.financialsanctionimporter.importer.model;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlType;

@Entity
@XmlRootElement (name = "BirthDetails")
@XmlAccessorType (XmlAccessType.FIELD)
@XmlType (propOrder = {
		"locations"
})
public class IndividualBirthDetails {
	
	@GeneratedValue
	@Id
	@XmlTransient
	private Long id;
	
	@OneToMany
	@XmlElement (name = "Location")
	private Set<BirthDetailsLocation> locations;

	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Set<BirthDetailsLocation> getLocations() {
		return locations;
	}

	public void setLocations(Set<BirthDetailsLocation> locations) {
		this.locations = locations;
	}

}
