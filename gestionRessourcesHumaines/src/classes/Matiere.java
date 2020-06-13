package classes;

public class Matiere {
     private  int ID,PersonnelID;
     private String NomMatiere;
	/**
	 * @param personnelID
	 * @param nomMatiere
	 */
	public Matiere(int personnelID, String nomMatiere) {
		super();
		PersonnelID = personnelID;
		NomMatiere = nomMatiere;
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
	 * @return the nomMatiere
	 */
	public String getNomMatiere() {
		return NomMatiere;
	}
	/**
	 * @param nomMatiere the nomMatiere to set
	 */
	public void setNomMatiere(String nomMatiere) {
		NomMatiere = nomMatiere;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Matiere [ID=" + ID + ", PersonnelID=" + PersonnelID
				+ ", NomMatiere=" + NomMatiere + "]";
	}
	

}
