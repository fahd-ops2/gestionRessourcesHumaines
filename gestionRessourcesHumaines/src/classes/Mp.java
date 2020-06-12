package classes;

public class Mp {
 private int ID,PersonnelID,MatiereID;

/**
 * @param personnelID
 * @param matiereID
 */
public Mp(int matiereID, int personnelID) {
	super();
	PersonnelID = personnelID;
	MatiereID = matiereID;
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
 * @return the matiereID
 */
public int getMatiereID() {
	return MatiereID;
}

/**
 * @param matiereID the matiereID to set
 */
public void setMatiereID(int matiereID) {
	MatiereID = matiereID;
}

/* (non-Javadoc)
 * @see java.lang.Object#toString()
 */
@Override
public String toString() {
	return "Mp [PersonnelID=" + PersonnelID + ", MatiereID=" + MatiereID + "]";
}
 
}
