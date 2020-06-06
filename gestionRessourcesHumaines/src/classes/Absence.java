package classes;

public class Absence {
	private int ID,PersonnelID;
	private String Duree,Justification;
	/**
	 * @param iD
	 * @param personnelID
	 * @param duree
	 * @param justification
	 */
	public Absence(int iD, int personnelID, String duree, String justification) {
		ID = iD;
		PersonnelID = personnelID;
		Duree = duree;
		Justification = justification;
	}
	
	/**
	 * @param personnelID
	 * @param duree
	 * @param justification
	 */
	public Absence(int personnelID, String duree, String justification) {
		super();
		PersonnelID = personnelID;
		Duree = duree;
		Justification = justification;
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
	 * @return the duree
	 */
	public String getDuree() {
		return Duree;
	}
	/**
	 * @param duree the duree to set
	 */
	public void setDuree(String duree) {
		Duree = duree;
	}
	/**
	 * @return the justification
	 */
	public String getJustification() {
		return Justification;
	}
	/**
	 * @param justification the justification to set
	 */
	public void setJustification(String justification) {
		Justification = justification;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Absence [ID=" + ID + ", PersonnelID=" + PersonnelID
				+ ", Duree=" + Duree + ", Justification=" + Justification + "]";
	}
	

}
