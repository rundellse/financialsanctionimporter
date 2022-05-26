package com.financialsanctionimporter.importer.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@XmlRootElement
@XmlAccessorType (XmlAccessType.FIELD)
public class SanctionsImposedIndicators {
	
	@GeneratedValue
	@Id
	private Long id;

	@XmlElement (name = "AssetFreeze")
    private boolean assetFreeze;

	@XmlElement (name = "ArmsEmbargo")
    private boolean armsEmbargo;

	@XmlElement (name = "TargetedArmsEmbargo")
    private boolean targetedArmsEmbargo;

	@XmlElement (name = "CharteringOfShips")
    private boolean charteringOfShips;

	@XmlElement (name = "ClosureOfRepresentativeOffices")
    private boolean closureOfRepresentativeOffices;

	@XmlElement (name = "CrewServicingOfShipsAndAircraft")
    private boolean crewServicingOfShipsAndAircraft;

	@XmlElement (name = "Deflag")
    private boolean deflag;

	@XmlElement (name = "PreventionOfBusinessArrangements")
    private boolean preventionOfBusinessArrangements;

	@XmlElement (name = "ProhibitionOfPortEntry")
    private boolean prohibitionOfPortEntry;

	@XmlElement (name = "TravelBan")
    private boolean travelBan;

	@XmlElement (name = "PreventionOfCharteringOfShips")
    private boolean preventionOfCharteringOfShips;

	@XmlElement (name = "PreventionOfCharteringOfShipsAndAircraft")
    private boolean preventionOfCharteringOfShipsAndAircraft;

	@XmlElement (name = "TechnicalAssistanceRelatedToAircraft")
    private boolean technicalAssistanceRelatedToAircraft;
    	

    public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public boolean isAssetFreeze() {
        return assetFreeze;
    }

    public void setAssetFreeze(boolean assetFreeze) {
        this.assetFreeze = assetFreeze;
    }

    public boolean isArmsEmbargo() {
        return armsEmbargo;
    }

    public void setArmsEmbargo(boolean armsEmbargo) {
        this.armsEmbargo = armsEmbargo;
    }

    public boolean isTargetedArmsEmbargo() {
        return targetedArmsEmbargo;
    }

    public void setTargetedArmsEmbargo(boolean targetedArmsEmbargo) {
        this.targetedArmsEmbargo = targetedArmsEmbargo;
    }

    public boolean isCharteringOfShips() {
        return charteringOfShips;
    }

    public void setCharteringOfShips(boolean charteringOfShips) {
        this.charteringOfShips = charteringOfShips;
    }

    public boolean isClosureOfRepresentativeOffices() {
        return closureOfRepresentativeOffices;
    }

    public void setClosureOfRepresentativeOffices(boolean closureOfRepresentativeOffices) {
        this.closureOfRepresentativeOffices = closureOfRepresentativeOffices;
    }

    public boolean isCrewServicingOfShipsAndAircraft() {
        return crewServicingOfShipsAndAircraft;
    }

    public void setCrewServicingOfShipsAndAircraft(boolean crewServicingOfShipsAndAircraft) {
        this.crewServicingOfShipsAndAircraft = crewServicingOfShipsAndAircraft;
    }

    public boolean isDeflag() {
        return deflag;
    }

    public void setDeflag(boolean deflag) {
        this.deflag = deflag;
    }

    public boolean isPreventionOfBusinessArrangements() {
        return preventionOfBusinessArrangements;
    }

    public void setPreventionOfBusinessArrangements(boolean preventionOfBusinessArrangements) {
        this.preventionOfBusinessArrangements = preventionOfBusinessArrangements;
    }

    public boolean isProhibitionOfPortEntry() {
        return prohibitionOfPortEntry;
    }

    public void setProhibitionOfPortEntry(boolean prohibitionOfPortEntry) {
        this.prohibitionOfPortEntry = prohibitionOfPortEntry;
    }

    public boolean isTravelBan() {
        return travelBan;
    }

    public void setTravelBan(boolean travelBan) {
        this.travelBan = travelBan;
    }

    public boolean isPreventionOfCharteringOfShips() {
        return preventionOfCharteringOfShips;
    }

    public void setPreventionOfCharteringOfShips(boolean preventionOfCharteringOfShips) {
        this.preventionOfCharteringOfShips = preventionOfCharteringOfShips;
    }

    public boolean isPreventionOfCharteringOfShipsAndAircraft() {
        return preventionOfCharteringOfShipsAndAircraft;
    }

    public void setPreventionOfCharteringOfShipsAndAircraft(boolean preventionOfCharteringOfShipsAndAircraft) {
        this.preventionOfCharteringOfShipsAndAircraft = preventionOfCharteringOfShipsAndAircraft;
    }

    public boolean isTechnicalAssistanceRelatedToAircraft() {
        return technicalAssistanceRelatedToAircraft;
    }

    public void setTechnicalAssistanceRelatedToAircraft(boolean technicalAssistanceRelatedToAircraft) {
        this.technicalAssistanceRelatedToAircraft = technicalAssistanceRelatedToAircraft;
    }
}
