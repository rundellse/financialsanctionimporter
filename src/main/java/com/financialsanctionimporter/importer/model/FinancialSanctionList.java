package com.financialsanctionimporter.importer.model;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import com.financialsanctionimporter.importer.model.xmladapters.LocalDateXMLAdapter;

/**
 * Top level object containing the full Designations list.
 */
@Entity
@XmlRootElement (name = "Designations")
@XmlAccessorType (XmlAccessType.FIELD)
@XmlType (propOrder = {
		"publishedDate",
		"designations"
})
public class FinancialSanctionList {

    @GeneratedValue
    @Id
    @XmlTransient
    private Long id;

    @XmlElement (name = "DateGenerated")
    @XmlJavaTypeAdapter (value = LocalDateXMLAdapter.class)
    private LocalDate publishedDate;
    
    @XmlElement (name = "Designation")
    private Set<Designation> designations = new HashSet<>();


	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public LocalDate getPublishedDate() {
		return publishedDate;
	}

	public void setPublishedDate(LocalDate publishedDate) {
		this.publishedDate = publishedDate;
	}

	public Set<Designation> getDesignations() {
		return designations;
	}

	public void setDesignations(Set<Designation> designations) {
		this.designations = designations;
	}    
    
}
