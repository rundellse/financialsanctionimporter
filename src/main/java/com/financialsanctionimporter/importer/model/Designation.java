package com.financialsanctionimporter.importer.model;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import com.financialsanctionimporter.importer.model.xmladapters.LocalDateXMLAdapter;

/**
 * A Designation is the basic unit of Financial Sanctions. Each instance represents either an organisation or individual to whom
 * UK financial sanctions have been applied.
 */
@Entity
@XmlRootElement (name = "Designation")
@XmlAccessorType (XmlAccessType.FIELD)
@XmlType (propOrder = {
		"lastUpdated",
		"dateDesignated",
		"uniqueId",
		"ofsiGroupId",
		"unReferenceNumber",
		"names",
		"nonLatinNames",
		"regimeName",
		"individualEntityShip",
		"designationSource",
		"sanctionsImposed",
		"sanctionsImposedIndicators",
		"otherInformation",
		"ukStatementOfReasons",
		"financialSanctionDesignationAddresses",
		"phoneNumbers",
		"emailAddresses",
		"individualDetails"
})
public class Designation {

	@GeneratedValue
	@Id
	@XmlTransient
	private Long id;

	@ManyToOne
	@XmlTransient
	private FinancialSanctionList financialSanctionList;
	
	@XmlElement (name = "LastUpdated")
	@XmlJavaTypeAdapter(value = LocalDateXMLAdapter.class)
	private LocalDate lastUpdated;
	
	@XmlElement (name = "DateDesignated")
	@XmlJavaTypeAdapter(value = LocalDateXMLAdapter.class)
	private LocalDate dateDesignated;

	@XmlElement (name = "UniqueID")
	private String uniqueId;

	@XmlElement (name = "OFSIGroupID")
	private String ofsiGroupId;

	@XmlElement (name = "UNReferenceNumber")
	private String unReferenceNumber;

	@OneToMany
	@XmlElementWrapper (name = "Names")
	@XmlElement (name = "Name")
	private Set<DesignationName> names = new HashSet<>();

	@ElementCollection
	@XmlElementWrapper (name = "NonLatinNames")
	@XmlElement (name = "NonLatinName")
	private Set<String> nonLatinNames = new HashSet<>();

	@XmlElement (name = "RegimeName")
	private String regimeName;
	
	@XmlElement (name = "IndividualEntityShip")
	private String individualEntityShip;

	@XmlElement (name = "DesignationSource")
	private String designationSource;

	@XmlElement (name = "SanctionsImposed")
	private String sanctionsImposed;

	@OneToOne(cascade = CascadeType.PERSIST)
	@XmlElement (name = "SanctionsImposedIndicators")
	private SanctionsImposedIndicators sanctionsImposedIndicators;

	@XmlElement (name = "OtherInformation")
	private String otherInformation;

	@XmlElement (name = "UKStatementOfReasons")
	private String ukStatementOfReasons;

	@OneToMany(cascade = CascadeType.PERSIST)
	@XmlElementWrapper (name = "Addresses")
	@XmlElement (name = "Address")
	private Set<DesignationAddress> financialSanctionDesignationAddresses = new HashSet<>();

	@ElementCollection
	@XmlElementWrapper (name = "PhoneNumbers")
	@XmlElement (name = "PhoneNumber")
	private Set<String> phoneNumbers = new HashSet<>();

	@ElementCollection
	@XmlElementWrapper (name = "EmailAddresses")
	@XmlElement (name = "EmailAddress")
	private Set<String> emailAddresses = new HashSet<>();
	
	@ElementCollection
	@XmlElementWrapper (name = "IndividualDetails")
	@XmlElement (name = "Individual")
	private Set<DesignationIndividualDetails> individualDetails;
	

	public Designation() {
	}

	public Designation(FinancialSanctionList financialSanctionList, LocalDate lastUpdated, LocalDate dateDesignated,
			String uniqueId, String ofsiGroupId, String unReferenceNumber, Set<DesignationName> names,
			Set<String> nonLatinNames, String regimeName, String individualEntityShip, String designationSource,
			String sanctionsImposed, SanctionsImposedIndicators sanctionsImposedIndicators, String otherInformation,
			String ukStatementOfReasons, Set<DesignationAddress> financialSanctionDesignationAddresses,
			Set<String> phoneNumbers, Set<String> emailAddesses) {
		this.financialSanctionList = financialSanctionList;
		this.lastUpdated = lastUpdated;
		this.dateDesignated = dateDesignated;
		this.uniqueId = uniqueId;
		this.ofsiGroupId = ofsiGroupId;
		this.unReferenceNumber = unReferenceNumber;
		this.names = names;
		this.nonLatinNames = nonLatinNames;
		this.regimeName = regimeName;
		this.individualEntityShip = individualEntityShip;
		this.designationSource = designationSource;
		this.sanctionsImposed = sanctionsImposed;
		this.sanctionsImposedIndicators = sanctionsImposedIndicators;
		this.otherInformation = otherInformation;
		this.ukStatementOfReasons = ukStatementOfReasons;
		this.financialSanctionDesignationAddresses = financialSanctionDesignationAddresses;
		this.phoneNumbers = phoneNumbers;
		this.emailAddresses = emailAddesses;
	}
	

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public FinancialSanctionList getFinancialSanctionList() {
		return financialSanctionList;
	}

	public void setFinancialSanctionList(FinancialSanctionList financialSanctionList) {
		this.financialSanctionList = financialSanctionList;
	}

	public LocalDate getLastUpdated() {
		return lastUpdated;
	}

	public void setLastUpdated(LocalDate lastUpdated) {
		this.lastUpdated = lastUpdated;
	}

	public LocalDate getDateDesignated() {
		return dateDesignated;
	}

	public void setDateDesignated(LocalDate dateDesignated) {
		this.dateDesignated = dateDesignated;
	}

	public String getUniqueId() {
		return uniqueId;
	}

	public void setUniqueId(String uniqueId) {
		this.uniqueId = uniqueId;
	}

	public String getOfsiGroupId() {
		return ofsiGroupId;
	}

	public void setOfsiGroupId(String ofsiGroupId) {
		this.ofsiGroupId = ofsiGroupId;
	}

	public String getUnReferenceNumber() {
		return unReferenceNumber;
	}

	public void setUnReferenceNumber(String unReferenceNumber) {
		this.unReferenceNumber = unReferenceNumber;
	}

	public Set<DesignationName> getNames() {
		return names;
	}

	public void setNames(Set<DesignationName> names) {
		this.names = names;
	}

	public Set<String> getNonLatinNames() {
		return nonLatinNames;
	}

	public void setNonLatinNames(Set<String> nonLatinNames) {
		this.nonLatinNames = nonLatinNames;
	}

	public String getRegimeName() {
		return regimeName;
	}

	public void setRegimeName(String regimeName) {
		this.regimeName = regimeName;
	}

	public String getIndividualEntityShip() {
		return individualEntityShip;
	}

	public void setIndividualEntityShip(String individualEntityShip) {
		this.individualEntityShip = individualEntityShip;
	}

	public String getDesignationSource() {
		return designationSource;
	}

	public void setDesignationSource(String designationSource) {
		this.designationSource = designationSource;
	}

	public String getSanctionsImposed() {
		return sanctionsImposed;
	}

	public void setSanctionsImposed(String sanctionsImposed) {
		this.sanctionsImposed = sanctionsImposed;
	}

	public SanctionsImposedIndicators getSanctionsImposedIndicators() {
		return sanctionsImposedIndicators;
	}

	public void setSanctionsImposedIndicators(SanctionsImposedIndicators sanctionsImposedIndicators) {
		this.sanctionsImposedIndicators = sanctionsImposedIndicators;
	}

	public String getOtherInformation() {
		return otherInformation;
	}

	public void setOtherInformation(String otherInformation) {
		this.otherInformation = otherInformation;
	}

	public String getUkStatementOfReasons() {
		return ukStatementOfReasons;
	}

	public void setUkStatementOfReasons(String ukStatementOfReasons) {
		this.ukStatementOfReasons = ukStatementOfReasons;
	}

	public Set<DesignationAddress> getFinancialSanctionDesignationAddresses() {
		return financialSanctionDesignationAddresses;
	}

	public void setFinancialSanctionDesignationAddresses(
			Set<DesignationAddress> financialSanctionDesignationAddresses) {
		this.financialSanctionDesignationAddresses = financialSanctionDesignationAddresses;
	}

	public Set<String> getPhoneNumbers() {
		return phoneNumbers;
	}

	public void setPhoneNumbers(Set<String> phoneNumbers) {
		this.phoneNumbers = phoneNumbers;
	}

	public Set<String> getEmailAddesses() {
		return emailAddresses;
	}

	public void setEmailAddesses(Set<String> emailAddesses) {
		this.emailAddresses = emailAddesses;
	}

}
