package com.financialsanctionimporter.importer;

import java.time.LocalDate;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;

@Entity
public class FinancialSanctionList {

    @GeneratedValue
    private Long id;

    private LocalDate publishedDate;

}
