package com.financialsanctionimporter.importer.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * A Designation Address is a known address relating to a Designation organisation or party.
 */
@Entity
@XmlRootElement (name = "Address")
@XmlAccessorType (XmlAccessType.FIELD)
public class DesignationAddress {

	@GeneratedValue
	@Id
	private Long id;
	
	@XmlElement (name = "AddressLine1")
    private String addressLine1;

	@XmlElement (name = "AddressLine2")
    private String addressLine2;

	@XmlElement (name = "AddressLine3")
    private String addressLine3;

	@XmlElement (name = "AddressLine4")
    private String addressLine4;

	@XmlElement (name = "AddressLine5")
    private String addressLine5;

	@XmlElement (name = "AddressLine6")
    private String addressLine6;

	@XmlElement (name = "AddressCountry")
    private String addressCountry;


    public DesignationAddress() {
    }
    
    public DesignationAddress(String addressLine1, String addressLine2, String addressLine3, String addressLine4, String addressLine5, String addressLine6, String addressCountry) {
        this.addressLine1 = addressLine1;
        this.addressLine2 = addressLine2;
        this.addressLine3 = addressLine3;
        this.addressLine4 = addressLine4;
        this.addressLine5 = addressLine5;
        this.addressLine6 = addressLine6;
        this.addressCountry = addressCountry;
    }
    

    public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getAddressLine1() {
        return addressLine1;
    }

    public void setAddressLine1(String addressLine1) {
        this.addressLine1 = addressLine1;
    }

    public String getAddressLine2() {
        return addressLine2;
    }

    public void setAddressLine2(String addressLine2) {
        this.addressLine2 = addressLine2;
    }

    public String getAddressLine3() {
        return addressLine3;
    }

    public void setAddressLine3(String addressLine3) {
        this.addressLine3 = addressLine3;
    }

    public String getAddressLine4() {
        return addressLine4;
    }

    public void setAddressLine4(String addressLine4) {
        this.addressLine4 = addressLine4;
    }

    public String getAddressLine5() {
        return addressLine5;
    }

    public void setAddressLine5(String addressLine5) {
        this.addressLine5 = addressLine5;
    }

    public String getAddressLine6() {
        return addressLine6;
    }

    public void setAddressLine6(String addressLine6) {
        this.addressLine6 = addressLine6;
    }

    public String getAddressCountry() {
        return addressCountry;
    }

    public void setAddressCountry(String addressCountry) {
        this.addressCountry = addressCountry;
    }
}
