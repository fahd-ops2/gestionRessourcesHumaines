package classes;

public class Cadre {
  private int ID,PersonnelID,CodeC;
  private String Cadre;
/**
 * @param personnelID
 * @param codeC
 * @param cadre
 */
public Cadre(int personnelID, int codeC, String cadre) {
	super();
	PersonnelID = personnelID;
	CodeC = codeC;
	Cadre = cadre;
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
 * @return the codeC
 */
public int getCodeC() {
	return CodeC;
}
/**
 * @param codeC the codeC to set
 */
public void setCodeC(int codeC) {
	CodeC = codeC;
}
/**
 * @return the cadre
 */
public String getCadre() {
	return Cadre;
}
/**
 * @param cadre the cadre to set
 */
public void setCadre(String cadre) {
	Cadre = cadre;
}
/* (non-Javadoc)
 * @see java.lang.Object#toString()
 */
@Override
public String toString() {
	return "Cadre [ID=" + ID + ", PersonnelID=" + PersonnelID + ", CodeC="
			+ CodeC + ", Cadre=" + Cadre + "]";
}
  
}
