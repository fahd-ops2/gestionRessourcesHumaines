package classes;

import java.sql.*;

public class DiplomeP {
private int ID;
private int PersonnelID;
private int SpecialiteID;
private String Diplomep;
private Date DateobtentionP;




public DiplomeP(int iD, int personnelID, int specialiteID, String diplomep,
		Date dateobtentionP) {
	ID = iD;
	PersonnelID = personnelID;
	SpecialiteID = specialiteID;
	Diplomep = diplomep;
	DateobtentionP = dateobtentionP;
}
public int getID() {
	return ID;
}
public void setID(int iD) {
	ID = iD;
}
public int getPersonnelID() {
	return PersonnelID;
}
public void setPersonnelID(int personnelID) {
	PersonnelID = personnelID;
}
public int getSpecialiteID() {
	return SpecialiteID;
}
public void setSpecialiteID(int specialiteID) {
	SpecialiteID = specialiteID;
}
public String getDiplomep() {
	return Diplomep;
}
public void setDiplomep(String diplomep) {
	Diplomep = diplomep;
}
public Date getDateobtentionP() {
	return DateobtentionP;
}
public void setDateobtentionP(Date dateobtentionP) {
	DateobtentionP = dateobtentionP;
}

}
