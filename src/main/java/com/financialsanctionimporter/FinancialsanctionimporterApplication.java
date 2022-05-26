package com.financialsanctionimporter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FinancialsanctionimporterApplication {

	Logger LOG = LoggerFactory.getLogger(FinancialsanctionimporterApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(FinancialsanctionimporterApplication.class, args);
	}

//	public void run() {
//		LOG.debug("Financial Sanction Importer Startup");
//		
//
//	}

}
