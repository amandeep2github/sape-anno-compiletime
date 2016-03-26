package com.sapient.tdi.anno.domain;

import java.text.DateFormat;
import java.text.ParseException;

public class Start {

	public static void main(String[] args) throws ParseException {
		DateFormat df = DateFormat.getDateInstance(DateFormat.MEDIUM);
		System.out.println(df.parse("Nov 28, 2016"));

	}

}
