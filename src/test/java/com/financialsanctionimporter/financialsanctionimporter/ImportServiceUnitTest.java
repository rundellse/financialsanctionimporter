package com.financialsanctionimporter.financialsanctionimporter;

import java.io.FileNotFoundException;
import java.io.InputStream;

import javax.xml.stream.FactoryConfigurationError;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;

import org.junit.jupiter.api.Test;

import com.financialsanctionimporter.importer.controller.ImportService;


public class ImportServiceUnitTest {
	
	ImportService importService = new ImportService();
	
	
	@Test
	public void unmarshalDesignations_createdCorrectly() throws FileNotFoundException, XMLStreamException, FactoryConfigurationError {
		InputStream inputStream = getClass().getClassLoader().getResourceAsStream("DesignationExample.xml");
		XMLStreamReader xmlInputStream = XMLInputFactory.newFactory().createXMLStreamReader(inputStream);
		
		System.out.println(xmlInputStream.hasNext());
		System.out.println(xmlInputStream.next());
		System.out.println(xmlInputStream.getName());
		
		importService.unmarshalDesignations(xmlInputStream);
	}
	
	
}
