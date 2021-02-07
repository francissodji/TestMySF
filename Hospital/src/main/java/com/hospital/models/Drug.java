package com.hospital.models;

public class Drug {
	
	int idDrug;
	String TitleDrug;
	String Drug_code;
	
	
	public int getIdDrug() {
		return idDrug;
	}


	public void setIdDrug(int idDrug) {
		this.idDrug = idDrug;
	}


	public String getTitleDrug() {
		return TitleDrug;
	}


	public void setTitleDrug(String titleDrug) {
		TitleDrug = titleDrug;
	}


	public String getDrug_code() {
		return Drug_code;
	}


	public void setDrug_code(String drug_code) {
		Drug_code = drug_code;
	}


	public Drug(int idDrug, String titleDrug, String drug_code) {
		super();
		this.idDrug = idDrug;
		TitleDrug = titleDrug;
		Drug_code = drug_code;
	}


	@Override
	public String toString() {
		return "Drug [idDrug=" + idDrug + ", TitleDrug=" + TitleDrug + ", Drug_code=" + Drug_code + "]";
	}
	
	
}
