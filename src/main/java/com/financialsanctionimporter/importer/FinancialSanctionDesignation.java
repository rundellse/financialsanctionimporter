package com.financialsanctionimporter.importer;

import java.time.LocalDate;
import java.util.Set;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;

@Entity
public class FinancialSanctionDesignation {

    @GeneratedValue
    private Long id;

    private FinancialSanctionList financialSanctionList;

    private LocalDate lastUpdated;

    private LocalDate dateDesignated;

    private String uniqueId;

    private String ofsiGroupId;

    private String unReferenceNumber;

    private Set<FinancialSanctionDesignationName> names;

    private Set<String> nonLatinNames;

    private String regimeName;

    private String IndividualEntityShip;

    private String DesignationSource;

    private String SanctionsImposed;

    private SanctionsImposedIndicators sanctionsImposedIndicators;

    private String otherInformation;

    private String ukStatementOfReasons;

    private Set<FinancialSanctionDesignationAddress> financialSanctionDesignationAddresses;

    private Set<String> phoneNumbers;

    private Set<String> emailAddesses;



}
