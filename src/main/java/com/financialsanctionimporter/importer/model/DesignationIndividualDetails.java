package com.financialsanctionimporter.importer.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import com.financialsanctionimporter.importer.model.xmladapters.IndividualDOBXMLAdapter;

/**
 * DesignationIndividualDetails is only populated on Designations for individual persons, rather than organisations. 
 */
@Entity
@XmlRootElement (name = "IndividualDetails")
@XmlAccessorType (XmlAccessType.FIELD)
@XmlType (propOrder = {
		"datesOfBirth",
		"nationalities",
		"positions",
		"birthDetails"
})
public class DesignationIndividualDetails {
	
	@GeneratedValue
	@Id
	@XmlTransient
	private Long id;

	@OneToMany (cascade = CascadeType.PERSIST)
	@XmlElementWrapper (name = "DOBs")
	@XmlElement (name = "DOB")
	@XmlJavaTypeAdapter (value = IndividualDOBXMLAdapter.class)
	private Set<IndividualDOB> datesOfBirth = new HashSet<>();
	
	@ElementCollection
	@XmlElementWrapper (name = "Nationalities")
	@XmlElement (name = "Nationality")
	private Set<String> nationalities = new HashSet<>();
	
	@ElementCollection
	@XmlElementWrapper (name = "Positions")
	@XmlElement  (name = "Postion")
	private Set<String> positions = new HashSet<>();
	
	@ElementCollection
	@XmlElement (name = "BirthDetails")
	private Set<IndividualBirthDetails> birthDetails = new HashSet<>();

	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Set<IndividualDOB> getDatesOfBirth() {
		return datesOfBirth;
	}

	public void setDatesOfBirth(Set<IndividualDOB> datesOfBirth) {
		this.datesOfBirth = datesOfBirth;
	}

	public Set<String> getNationalities() {
		return nationalities;
	}

	public void setNationalities(Set<String> nationalities) {
		this.nationalities = nationalities;
	}

	public Set<String> getPositions() {
		return positions;
	}

	public void setPositions(Set<String> positions) {
		this.positions = positions;
	}

	public Set<IndividualBirthDetails> getBirthDetails() {
		return birthDetails;
	}

	public void setBirthDetails(Set<IndividualBirthDetails> birthDetails) {
		this.birthDetails = birthDetails;
	}
	
}
