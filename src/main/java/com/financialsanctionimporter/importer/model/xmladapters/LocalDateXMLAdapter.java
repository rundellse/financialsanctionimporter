package com.financialsanctionimporter.importer.model.xmladapters;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import javax.xml.bind.annotation.adapters.XmlAdapter;

public class LocalDateXMLAdapter extends XmlAdapter<String, LocalDate>{

	@Override
	public LocalDate unmarshal(String dateString) throws Exception {
		return LocalDate.parse(dateString, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
	}

	@Override
	public String marshal(LocalDate localDate) throws Exception {
		return localDate.toString();
	}
}
