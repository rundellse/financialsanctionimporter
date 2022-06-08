package com.financialsanctionimporter.financialsanctionimporter;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.io.FileNotFoundException;
import java.io.InputStream;

import java.time.LocalDate;
import javax.xml.bind.JAXBException;
import javax.xml.stream.FactoryConfigurationError;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;

import org.junit.jupiter.api.Test;

import com.financialsanctionimporter.importer.controller.ImportService;
import com.financialsanctionimporter.importer.model.Designation;
import com.financialsanctionimporter.importer.model.FinancialSanctionList;


public class ImportServiceUnitTest {
	
	ImportService importService = new ImportService();
	
	
	@Test
	public void unmarshalDesignations_createdCorrectly() throws FileNotFoundException, XMLStreamException, FactoryConfigurationError, JAXBException {
		InputStream inputStream = getClass().getClassLoader().getResourceAsStream("DesignationImportTest.xml");
		XMLStreamReader xmlInputStream = XMLInputFactory.newFactory().createXMLStreamReader(inputStream);
		
		FinancialSanctionList resultList = importService.unmarshalDesignations(xmlInputStream);
		
		Designation personResultDesignation = resultList.getDesignations().stream()
				.filter(d -> d.getNames().stream().anyMatch(n -> n.getName6().contains("AKHUND")))
				.findFirst().orElse(null);
		
		assertEquals(LocalDate.of(2022, 4, 26), resultList.getPublishedDate());
		assertEquals(3, resultList.getDesignations().size());
		assertNotNull(personResultDesignation);
		assertEquals("AFG0006", personResultDesignation.getUniqueId());
		//TODO remaining designation fields
	}
	
	
}
