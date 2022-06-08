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
 * A known name or alias for a sanctioned person or organisation. The key field is 'name6', this is always populated for a given
 * name entry and contains the surname or organisation name (or equivalent).
 */
@Entity
@XmlRootElement (name = "Name")
@XmlAccessorType (XmlAccessType.FIELD)
@XmlType (propOrder = {
		"name6",
		"name5",
		"name4",
		"name3",
		"name2",
		"name1",
		"nameType"
})
public class DesignationName {

	@GeneratedValue
	@Id
	@XmlTransient
	private Long id;
	
	@XmlElement (name = "Name6")
    private String name6;

	@XmlElement (name = "Name5")
    private String name5;

	@XmlElement (name = "Name4")
    private String name4;

	@XmlElement (name = "Name3")
    private String name3;

	@XmlElement (name = "Name2")
    private String name2;

	@XmlElement (name = "Name1")
    private String name1;

	/** Designation names are either names or aliases */
	@XmlElement (name = "NameType")
    private String nameType;
    

    public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}
	

	public String getName6() {
        return name6;
    }

    public void setName6(String name6) {
        this.name6 = name6;
    }

    public String getName5() {
        return name5;
    }

    public void setName5(String name5) {
        this.name5 = name5;
    }

    public String getName4() {
        return name4;
    }

    public void setName4(String name4) {
        this.name4 = name4;
    }

    public String getName3() {
        return name3;
    }

    public void setName3(String name3) {
        this.name3 = name3;
    }

    public String getName2() {
        return name2;
    }

    public void setName2(String name2) {
        this.name2 = name2;
    }

    public String getName1() {
        return name1;
    }

    public void setName1(String name1) {
        this.name1 = name1;
    }

    public String getNameType() {
        return nameType;
    }

    public void setNameType(String nameType) {
        this.nameType = nameType;
    }
}
