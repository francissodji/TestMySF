package com.hospital.models;

public class Visit {
	
	int idVisit;
	String date_visit;
	int idPatient;
	String diagnosis;
	int idDrug;
	String Note_visit;
	
	
	public Visit(int idVisit, String date_visit, int idPatient, String diagnosis, int idDrug, String note_visit) {
		super();
		this.idVisit = idVisit;
		this.date_visit = date_visit;
		this.idPatient = idPatient;
		this.diagnosis = diagnosis;
		this.idDrug = idDrug;
		Note_visit = note_visit;
	}


	public int getIdVisit() {
		return idVisit;
	}


	public void setIdVisit(int idVisit) {
		this.idVisit = idVisit;
	}


	public String getDate_visit() {
		return date_visit;
	}


	public void setDate_visit(String date_visit) {
		this.date_visit = date_visit;
	}


	public int getIdPatient() {
		return idPatient;
	}


	public void setIdPatient(int idPatient) {
		this.idPatient = idPatient;
	}


	public String getDiagnosis() {
		return diagnosis;
	}


	public void setDiagnosis(String diagnosis) {
		this.diagnosis = diagnosis;
	}


	public int getIdDrug() {
		return idDrug;
	}


	public void setIdDrug(int idDrug) {
		this.idDrug = idDrug;
	}


	public String getNote_visit() {
		return Note_visit;
	}


	public void setNote_visit(String note_visit) {
		Note_visit = note_visit;
	}


	@Override
	public String toString() {
		return "Visit [idVisit=" + idVisit + ", date_visit=" + date_visit + ", idPatient=" + idPatient + ", diagnosis="
				+ diagnosis + ", idDrug=" + idDrug + ", Note_visit=" + Note_visit + "]";
	}
	
	
	

}
