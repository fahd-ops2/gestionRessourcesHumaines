package classes;

import java.sql.*;

public class Etablisment {
private int idE,CodeLM;
private String etablissement_ville,Mission;
private String date_debut;
private String date_fin ;
private int PersonnelID;






/**
 * @return the codeLM
 */
public int getCodeLM() {
	return CodeLM;
}
/**
 * @param codeLM the codeLM to set
 */
public void setCodeLM(int codeLM) {
	CodeLM = codeLM;
}
/**
 * @return the mission
 */
public String getMission() {
	return Mission;
}
/**
 * @param mission the mission to set
 */
public void setMission(String mission) {
	Mission = mission;
}

/**
 * @param codeLM
 * @param etablissement_ville
 * @param mission
 * @param date_debut
 * @param date_fin
 * @param personnelID
 */
public Etablisment(int codeLM, String etablissement_ville, String mission,
		String date_debut, String date_fin, int personnelID) {
	super();
	CodeLM = codeLM;
	this.etablissement_ville = etablissement_ville;
	Mission = mission;
	this.date_debut = date_debut;
	this.date_fin = date_fin;
	PersonnelID = personnelID;
}

/* (non-Javadoc)
 * @see java.lang.Object#toString()
 */
@Override
public String toString() {
	return "Etablisment [idE=" + idE + ", CodeLM=" + CodeLM
			+ ", etablissement_ville=" + etablissement_ville + ", Mission="
			+ Mission + ", date_debut=" + date_debut + ", date_fin=" + date_fin
			+ ", PersonnelID=" + PersonnelID + "]";
}
/**
 * @return the idE
 */
public int getIdE() {
	return idE;
}
/**
 * @param idE the idE to set
 */
public void setIdE(int idE) {
	this.idE = idE;
}
/**
 * @return the etablissement_ville
 */
public String getEtablissement_ville() {
	return etablissement_ville;
}
/**
 * @param etablissement_ville the etablissement_ville to set
 */
public void setEtablissement_ville(String etablissement_ville) {
	this.etablissement_ville = etablissement_ville;
}
/**
 * @return the date_debut
 */
public String getDate_debut() {
	return date_debut;
}
/**
 * @param date_debut the date_debut to set
 */
public void setDate_debut(String date_debut) {
	this.date_debut = date_debut;
}
/**
 * @return the date_fin
 */
public String getDate_fin() {
	return date_fin;
}
/**
 * @param date_fin the date_fin to set
 */
public void setDate_fin(String date_fin) {
	this.date_fin = date_fin;
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
/* (non-Javadoc)
 * @see java.lang.Object#toString()
 */




 }
