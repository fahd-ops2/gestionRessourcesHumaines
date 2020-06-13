package classes;

import java.sql.*;

public class DiplomeSu {
  private int ID,PersonnelID,CodeS;
  private String DiplomeSU,Faculte,Specialitee;
  private Date DateobtentionSu;
/**
 * @param iD
 * @param personnelID
 * @param specialiteID
 * @param diplomeSU
 * @param faculte
 * @param dateobtentionSu
 */

/**
 * @return the iD
 */
public int getID() {
	return ID;
}
/**
 * @param personnelID
 * @param codeS
 * @param diplomeSU
 * @param faculte
 * @param specialitee
 * @param dateobtentionSu
 */
public DiplomeSu(int personnelID, int codeS, String diplomeSU, String faculte,
		String specialitee, Date dateobtentionSu) {
	super();
	PersonnelID = personnelID;
	CodeS = codeS;
	DiplomeSU = diplomeSU;
	Faculte = faculte;
	Specialitee = specialitee;
	DateobtentionSu = dateobtentionSu;
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
/* (non-Javadoc)
 * @see java.lang.Object#toString()
 */
@Override
public String toString() {
	return "DiplomeSu [ID=" + ID + ", PersonnelID=" + PersonnelID + ", CodeS="
			+ CodeS + ", DiplomeSU=" + DiplomeSU + ", Faculte=" + Faculte
			+ ", Specialitee=" + Specialitee + ", DateobtentionSu="
			+ DateobtentionSu + "]";
}

  
}
