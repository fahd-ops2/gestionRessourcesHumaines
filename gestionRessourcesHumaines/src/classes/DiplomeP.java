package classes;

import java.sql.*;

public class DiplomeP {
private int ID;
private int PersonnelID,CodeS;
private String Specialitee;
private String Diplomep;
private String DateobtentionP;





/**
 * @param personnelID
 * @param codeS
 * @param specialitee
 * @param diplomep
 * @param dateobtentionP
 */
public DiplomeP(int personnelID, int codeS, String specialitee,
		String diplomep, String dateobtentionP) {
	super();
	PersonnelID = personnelID;
	CodeS = codeS;
	Specialitee = specialitee;
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

/**
 * @return the codeS
 */
public int getCodeS() {
	return CodeS;
}
/**
 * @param codeS the codeS to set
 */
public void setCodeS(int codeS) {
	CodeS = codeS;
}
/**
 * @return the specialitee
 */
public String getSpecialitee() {
	return Specialitee;
}
/**
 * @param specialitee the specialitee to set
 */
public void setSpecialitee(String specialitee) {
	Specialitee = specialitee;
}
public String getDiplomep() {
	return Diplomep;
}
public void setDiplomep(String diplomep) {
	Diplomep = diplomep;
}
public String getDateobtentionP() {
	return DateobtentionP;
}
public void setDateobtentionP(String dateobtentionP) {
	DateobtentionP = dateobtentionP;
}
/* (non-Javadoc)
 * @see java.lang.Object#toString()
 */
@Override
public String toString() {
	return "DiplomeP [ID=" + ID + ", PersonnelID=" + PersonnelID + ", CodeS="
			+ CodeS + ", Specialitee=" + Specialitee + ", Diplomep=" + Diplomep
			+ ", DateobtentionP=" + DateobtentionP + "]";
}


}
