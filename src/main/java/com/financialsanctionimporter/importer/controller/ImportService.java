package com.financialsanctionimporter.importer.controller;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import javax.xml.stream.FactoryConfigurationError;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.financialsanctionimporter.importer.model.FinancialSanctionList;

@Service
public class ImportService {
	private static final Logger LOG = LoggerFactory.getLogger(ImportService.class);
	
	@Value("${financial.sanction.xml.url}")
	private String FINANCIAL_SANCTION_XML_URL;
	
	public XMLStreamReader fetchFinancialSanctionListReader() {
		XMLStreamReader xmlInputStream = null;
		try {
			LOG.info("Attempting to load Financial Sanctions List from URL: {}", FINANCIAL_SANCTION_XML_URL);
			HttpURLConnection financialSanctionURL = (HttpURLConnection) new URL(FINANCIAL_SANCTION_XML_URL).openConnection();
			
			LOG.info(financialSanctionURL.getResponseCode() + "");
			LOG.info(financialSanctionURL.getResponseMessage());
			InputStream inputStream = financialSanctionURL.getInputStream();
			xmlInputStream = XMLInputFactory.newFactory().createXMLStreamReader(inputStream);
			LOG.info(inputStream.toString());
		} catch (FileNotFoundException fe) {
			LOG.error("FINANCIAL SANCTIONS FILE NOT FOUND - Check source URL");
			LOG.error("Full stack trace: {}", fe.getMessage());
			return null;
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (XMLStreamException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (FactoryConfigurationError e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return xmlInputStream;
	}
	
	public void unmarshalDesignations(XMLStreamReader financialSanctionStreamReader) {
		JAXBContext jaxbContext;
		try {
			jaxbContext = JAXBContext.newInstance(FinancialSanctionList.class);
		
			Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
			FinancialSanctionList financialSanctionList = (FinancialSanctionList) jaxbUnmarshaller.unmarshal(financialSanctionStreamReader);
			LOG.info("Designation List Imported", financialSanctionList);
		
		} catch (JAXBException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public void marshalDesignations(FinancialSanctionList financialSanctionList0 ) throws JAXBException {
	    JAXBContext context = JAXBContext.newInstance(FinancialSanctionList.class);
	    Marshaller mar= context.createMarshaller();
	    mar.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
	    mar.marshal(financialSanctionList0, new File("./book.xml"));
	}
	
}
