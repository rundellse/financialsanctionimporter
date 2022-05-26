package com.financialsanctionimporter.importer.model.xmladapters;

import javax.xml.bind.annotation.adapters.XmlAdapter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.financialsanctionimporter.importer.model.IndividualDOB;

public class IndividualDOBXMLAdapter extends XmlAdapter<String, IndividualDOB>{
	Logger LOG = LoggerFactory.getLogger(IndividualDOBXMLAdapter.class);

	@Override
	public IndividualDOB unmarshal(String v) throws Exception {
		IndividualDOB individualDOB = new IndividualDOB();
		
		String[] dayMonthYear = v.split("/");
		try {
			individualDOB.setDay(dayMonthYear[0]);
			individualDOB.setMonth(dayMonthYear[1]);
			individualDOB.setYear(dayMonthYear[2]);
		} catch (IndexOutOfBoundsException e) {
			LOG.error("Cannot fully parse formatting of IndividualDetails DOB. Returning with any day/month values already identified");
		}
		
		return individualDOB;
	}

	@Override
	public String marshal(IndividualDOB v) throws Exception {
		return String.join("/", v.getDay(), v.getMonth(), v.getYear());
	}
	
	

}
