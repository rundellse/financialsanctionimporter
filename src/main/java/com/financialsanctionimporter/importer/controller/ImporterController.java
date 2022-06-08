package com.financialsanctionimporter.importer.controller;

import javax.xml.stream.XMLStreamReader;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ImporterController {

	private static final Logger LOG = LoggerFactory.getLogger(ImporterController.class);
	

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
	@Bean
	public CommandLineRunner doImport() throws Exception  {
		XMLStreamReader financialSanctionXMLReader = importService().fetchFinancialSanctionListReader();
		importService().unmarshalDesignations(financialSanctionXMLReader);
		
		return null;
	}

	
	@Bean
	public ImportService importService() {
		return new ImportService();
	}
	
}
