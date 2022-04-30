package com.financialsanctionimporter.importer;

public class SanctionsImposedIndicators {

    private boolean assetFreeze;

    private boolean armsEmbargo;

    private boolean targetedArmsEmbargo;

    private boolean charteringOfShips;

    private boolean closureOfRepresentativeOffices;

    private boolean crewServicingOfShipsAndAircraft;

    private boolean deflag;

    private boolean preventionOfBusinessArrangements;

    private boolean prohibitionOfPortEntry;

    private boolean travelBan;

    private boolean preventionOfCharteringOfShips;

    private boolean preventionOfCharteringOfShipsAndAircraft;

    private boolean technicalAssistanceRelatedToAircraft;


    public SanctionsImposedIndicators(boolean assetFreeze, boolean armsEmbargo, boolean targetedArmsEmbargo, boolean charteringOfShips, boolean closureOfRepresentativeOffices, boolean crewServicingOfShipsAndAircraft, boolean deflag, boolean preventionOfBusinessArrangements, boolean prohibitionOfPortEntry, boolean travelBan, boolean preventionOfCharteringOfShips, boolean preventionOfCharteringOfShipsAndAircraft, boolean technicalAssistanceRelatedToAircraft) {
        this.assetFreeze = assetFreeze;
        this.armsEmbargo = armsEmbargo;
        this.targetedArmsEmbargo = targetedArmsEmbargo;
        this.charteringOfShips = charteringOfShips;
        this.closureOfRepresentativeOffices = closureOfRepresentativeOffices;
        this.crewServicingOfShipsAndAircraft = crewServicingOfShipsAndAircraft;
        this.deflag = deflag;
        this.preventionOfBusinessArrangements = preventionOfBusinessArrangements;
        this.prohibitionOfPortEntry = prohibitionOfPortEntry;
        this.travelBan = travelBan;
        this.preventionOfCharteringOfShips = preventionOfCharteringOfShips;
        this.preventionOfCharteringOfShipsAndAircraft = preventionOfCharteringOfShipsAndAircraft;
        this.technicalAssistanceRelatedToAircraft = technicalAssistanceRelatedToAircraft;
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
