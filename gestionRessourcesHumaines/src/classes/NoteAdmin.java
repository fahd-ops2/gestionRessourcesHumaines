package classes;

public class NoteAdmin {
private int ID;
private int PersonnelID;
private float NoteAdministratif;

public NoteAdmin(int iD, int personnelID, float noteAdministratif) {

	ID = iD;
	PersonnelID = personnelID;
	NoteAdministratif = noteAdministratif;
}


/**
 * @param personnelID
 * @param noteAdministratif
 */
public NoteAdmin(int personnelID, float noteAdministratif) {
	super();
	PersonnelID = personnelID;
	NoteAdministratif = noteAdministratif;
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

public float getNoteAdministratif() {
	return NoteAdministratif;
}

public void setNoteAdministratif(float noteAdministratif) {
	NoteAdministratif = noteAdministratif;
}


/* (non-Javadoc)
 * @see java.lang.Object#toString()
 */
public String toString() {
	return "NoteAdmin [ID=" + ID + ", PersonnelID=" + PersonnelID
			+ ", NoteAdministratif=" + NoteAdministratif + "]";
}



}
