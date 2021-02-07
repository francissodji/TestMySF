package com.hospital.models;

public class Race {
	
	int IdRace;
	String TitleRace;
	
	
	public Race(int idRace, String titleRace) {
		super();
		IdRace = idRace;
		TitleRace = titleRace;
	}


	public int getIdRace() {
		return IdRace;
	}


	public void setIdRace(int idRace) {
		IdRace = idRace;
	}


	public String getTitleRace() {
		return TitleRace;
	}


	public void setTitleRace(String titleRace) {
		TitleRace = titleRace;
	}


	@Override
	public String toString() {
		return "Race [IdRace=" + IdRace + ", TitleRace=" + TitleRace + "]";
	}
	
	

}
