package classes;

import java.sql.*;

public class DiplomeSu {
  private int ID,PersonnelID,SpecialiteID;
  private String DiplomeSU,Faculte;
  private Date DateobtentionSu;
/**
 * @param iD
 * @param personnelID
 * @param specialiteID
 * @param diplomeSU
 * @param faculte
 * @param dateobtentionSu
 */
public DiplomeSu(int iD, int personnelID, int specialiteID, String diplomeSU,
		String faculte, Date dateobtentionSu) {
	ID = iD;
	PersonnelID = personnelID;
	SpecialiteID = specialiteID;
	DiplomeSU = diplomeSU;
	Faculte = faculte;
	DateobtentionSu = dateobtentionSu;
}
public DiplomeSu( int personnelID, int specialiteID, String diplomeSU,
		String faculte, Date dateobtentionSu) {
	
	PersonnelID = personnelID;
	SpecialiteID = specialiteID;
	DiplomeSU = diplomeSU;
	Faculte = faculte;
	DateobtentionSu = dateobtentionSu;
}
/**
 * @return the iD
 */
public int getID() {
	return ID;
}
/**
 * @param iD the iD to set
 */
public void setID(int iD) {
	ID = iD;
}
/**
 * @return the personnelID
 */
public int getPersonnelID() {
	return PersonnelID;
}
/**
 * @param personnelID the personnelID to set
 */
public void setPersonnelID(int personnelID) {
	PersonnelID = personnelID;
}
/**
 * @return the specialiteID
 */
public int getSpecialiteID() {
	return SpecialiteID;
}
/**
 * @param specialiteID the specialiteID to set
 */
public void setSpecialiteID(int specialiteID) {
	SpecialiteID = specialiteID;
}
/**
 * @return the diplomeSU
 */
public String getDiplomeSU() {
	return DiplomeSU;
}
/**
 * @param diplomeSU the diplomeSU to set
 */
public void setDiplomeSU(String diplomeSU) {
	DiplomeSU = diplomeSU;
}
/**
 * @return the faculte
 */
public String getFaculte() {
	return Faculte;
}
/**
 * @param faculte the faculte to set
 */
public void setFaculte(String faculte) {
	Faculte = faculte;
}
/**
 * @return the dateobtentionSu
 */
public Date getDateobtentionSu() {
	return DateobtentionSu;
}
/**
 * @param dateobtentionSu the dateobtentionSu to set
 */
public void setDateobtentionSu(Date dateobtentionSu) {
	DateobtentionSu = dateobtentionSu;
}
/* (non-Javadoc)
 * @see java.lang.Object#toString()
 */
@Override
public String toString() {
	return "DiplomeSu [ID=" + ID + ", PersonnelID=" + PersonnelID
			+ ", SpecialiteID=" + SpecialiteID + ", DiplomeSU=" + DiplomeSU
			+ ", Faculte=" + Faculte + ", DateobtentionSu=" + DateobtentionSu
			+ "]";
}
  
}
