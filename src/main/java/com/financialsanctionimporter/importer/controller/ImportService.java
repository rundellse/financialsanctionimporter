package com.financialsanctionimporter.importer.controller;

import java.io.FileNotFoundException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import javax.xml.stream.XMLInputFactory;
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
	
	/**
	 * Fetches the content of the Financial Sanctions XML hosted on the UK gov site. Uses the spring property ${financial.sanction.xml.url}
	 * to locate the file and returns it as an XMLStreamReader, this can then be interpreted by the Jaxb implementation.
	 *
	 * @return XMLStreamReader - Contains the stream of the Financial Sanctions XML file
	 * @throws Exception - The load of the Financial Sanction XML is the core of the app, errors to be thrown to error out.
	 */
	public XMLStreamReader fetchFinancialSanctionListReader() throws Exception {
		XMLStreamReader xmlInputStream = null;
		try {
			LOG.info("Attempting to load Financial Sanctions List from URL: {}", FINANCIAL_SANCTION_XML_URL);
			HttpURLConnection financialSanctionURL = (HttpURLConnection) new URL(FINANCIAL_SANCTION_XML_URL).openConnection();
			LOG.debug("Financial Sanction URL connection made. Response code: {}", financialSanctionURL.getResponseCode());
			
			InputStream inputStream = financialSanctionURL.getInputStream();
			xmlInputStream = XMLInputFactory.newFactory().createXMLStreamReader(inputStream);
			LOG.debug("Financial Sanction XML loaded");
		} catch (FileNotFoundException fe) {
			LOG.error("FINANCIAL SANCTIONS FILE NOT FOUND - Check source URL");
			LOG.error("Error message: {}", fe.getMessage());
			return null;
		} catch (Exception e) {
			// There's no point doing anything more with this app for now if this step fails. Throw the error.
			throw e;
		}
		return xmlInputStream;
	}
	
	/**
	 * Unmarshals the XMLStreamReader containing the Designations data to Java objects, based on the Jaxb configuration. Top level
	 * object is a FinancialSanctionList, which contains a Set of Designations detailing each of the sanctioned parties.
	 *
	 * @param financialSanctionStreamReader - XMLStreamReader containing the XML data.
	 * @return FinancialSanctionList - contains the data unmarshalled to Java objects.
	 * @throws JAXBException - Little scope to handle issues from the content in app so error is thrown.
	 */
	public FinancialSanctionList unmarshalDesignations(XMLStreamReader financialSanctionStreamReader) throws JAXBException {
		FinancialSanctionList financialSanctionList;
		JAXBContext jaxbContext;
		try {
			jaxbContext = JAXBContext.newInstance(FinancialSanctionList.class);
		
			Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
			financialSanctionList = (FinancialSanctionList) jaxbUnmarshaller.unmarshal(financialSanctionStreamReader);
			LOG.info("Designation List Imported, number of Designations: {}", financialSanctionList.getDesignations().size());
		
		} catch (JAXBException e) {
			throw e;
		}
		
		return financialSanctionList;
		
	}
	
//	public void marshalDesignations(FinancialSanctionList financialSanctionList0 ) throws JAXBException {
//	    JAXBContext context = JAXBContext.newInstance(FinancialSanctionList.class);
//	    Marshaller mar = context.createMarshaller();
//	    mar.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
//	    mar.marshal(financialSanctionList0, new File("./book.xml"));
//	}
	
}
