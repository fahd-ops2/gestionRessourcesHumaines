package classes;

import java.sql.*;

public class Etablisment {
private int idE;
private String etablissement_ville;
private Date date_debut;
private Date date_fin ;
private int ListeMissionID;
private int PersonnelID;






/**
 * @param idE
 * @param etablissement_ville
 * @param date_debut
 * @param date_fin
 * @param listeMissionID
 * @param personnelID
 */
public Etablisment(int idE, String etablissement_ville, Date date_debut,
		Date date_fin, int listeMissionID, int personnelID) {
	
	this.idE = idE;
	this.etablissement_ville = etablissement_ville;
	this.date_debut = date_debut;
	this.date_fin = date_fin;
	ListeMissionID = listeMissionID;
	PersonnelID = personnelID;
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
public Date getDate_debut() {
	return date_debut;
}
/**
 * @param date_debut the date_debut to set
 */
public void setDate_debut(Date date_debut) {
	this.date_debut = date_debut;
}
/**
 * @return the date_fin
 */
public Date getDate_fin() {
	return date_fin;
}
/**
 * @param date_fin the date_fin to set
 */
public void setDate_fin(Date date_fin) {
	this.date_fin = date_fin;
}
/**
 * @return the listeMissionID
 */
public int getListeMissionID() {
	return ListeMissionID;
}
/**
 * @param listeMissionID the listeMissionID to set
 */
public void setListeMissionID(int listeMissionID) {
	ListeMissionID = listeMissionID;
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
@Override
public String toString() {
	return "Etablisment [idE=" + idE + ", etablissement_ville="
			+ etablissement_ville + ", date_debut=" + date_debut
			+ ", date_fin=" + date_fin + ", ListeMissionID=" + ListeMissionID
			+ ", PersonnelID=" + PersonnelID + "]";
}


 }
