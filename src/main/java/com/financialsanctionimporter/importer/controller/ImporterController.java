package com.financialsanctionimporter.importer.controller;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import javax.xml.stream.FactoryConfigurationError;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.financialsanctionimporter.importer.model.Designation;

@Configuration
public class ImporterController {

	private static final Logger LOG = LoggerFactory.getLogger(ImporterController.class);

	
	@Autowired
	private ImportService importService;
	

//	@Bean
//	public ApplicationRunner spoofDesignation(DesignationRepository designationRespository,
//			DesignationNameRepository designationNameRepository) {
//		return args -> {
//			Designation designation = new Designation();
//			DesignationName name = designationNameRepository
//					.save(new DesignationName("name6", "name5", "name4", "name3", "name2", "name1", "Legal Name"));
//			designation.getNames().add(name);
//			designation.setRegimeName("Regime Name");
//
//			DesignationAddress designationAddress = new DesignationAddress();
//			designationAddress.setAddressCountry("Country");
//			designation.getFinancialSanctionDesignationAddresses().add(designationAddress);
//
//			designationRespository.save(designation);
//			LOG.info("Test Designation saved, id: {}", designation.getId());
//			LOG.info("Test Designation Address cascade saved, id: {}", designationAddress.getId());
//		};
//	}
//
//	@Bean
//	public ApplicationRunner doImport() throws MalformedURLException, XMLStreamException, FactoryConfigurationError, IOException {
//		XMLStreamReader financialSanctionXMLReader = importService.fetchFinancialSanctionListReader();
//		
//		importService.unmarshalDesignations(financialSanctionXMLReader);
//		
//		return null;
//	}

	
	@Bean
	public ImportService instantiateImportService() {
		if (this.importService == null) {
			return this.importService;
		} else {
			return new ImportService();
		}
	}
	
}
