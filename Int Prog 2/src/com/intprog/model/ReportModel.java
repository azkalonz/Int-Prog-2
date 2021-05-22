package com.intprog.model;

import java.util.ArrayList;
import java.util.HashMap;

public class ReportModel {
	private ArrayList<HashMap<String, String>> reports = new ArrayList<HashMap<String, String>>();

	public ArrayList<HashMap<String, String>> getReports() {
		return reports;
	}

	public void setReports(ArrayList<HashMap<String, String>> reports) {
		this.reports = reports;
	}
}
