package com.intprog.model;

import java.util.ArrayList;
import java.util.HashMap;


public class DTRModel {
	private ArrayList<HashMap<String, String>> dtrRecords = new ArrayList<HashMap<String, String>>();

	public ArrayList<HashMap<String, String>> getDtrRecords() {
		return dtrRecords;
	}

	public void setDtrRecords(ArrayList<HashMap<String, String>> dtrRecords) {
		this.dtrRecords = dtrRecords;
	}
	
}
