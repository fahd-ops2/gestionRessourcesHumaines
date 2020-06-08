package classes;

import java.sql.*;



public class Personnel {
	private int ID,NbreEnfant;
	private String Num_p,Cin,Pren_n_arabe,Pren_n,Datenaissance,Adresse,Tel,Nationalite,Sexe,Echelle,Echelon,Situationfamiliale,Marieemploye,Num_tE;
    private String Dateembauche,DateDesignation;
	/**
	 * @param iD
	 * @param nbreEnfant
	 * @param num_p
	 * @param cin
	 * @param pren_n_arabe
	 * @param pren_n
	 * @param adresse
	 * @param tel
	 * @param nationalite
	 * @param sexe
	 * @param echelle
	 * @param echelon
	 * @param situationfamiliale
	 * @param marieemploye
	 * @param num_tE
	 * @param dateembauche
	 * @param dateDesignation
	 * @param datenaissance
	 */
	public Personnel(int iD, int nbreEnfant, String num_p, String cin,
			String pren_n_arabe, String pren_n,String dateembauche, String adresse, String tel,
			String nationalite, String sexe, String echelle, String echelon,
			String situationfamiliale, String marieemploye, String num_tE,
			String dateDesignation, String datenaissance) {
		super();
		ID = iD;
		NbreEnfant = nbreEnfant;
		Num_p = num_p;
		Cin = cin;
		Pren_n_arabe = pren_n_arabe;
		Pren_n = pren_n;
		Adresse = adresse;
		Tel = tel;
		Nationalite = nationalite;
		Sexe = sexe;
		Echelle = echelle;
		Echelon = echelon;
		Situationfamiliale = situationfamiliale;
		Marieemploye = marieemploye;
		Num_tE = num_tE;
		Dateembauche = dateembauche;
		DateDesignation = dateDesignation;
		Datenaissance = datenaissance;
	}
	
	
	/**
	 * @param nbreEnfant
	 * @param echelle
	 * @param echelon
	 * @param situationfamiliale
	 * @param marieemploye
	 * @param num_tE
	 * @param dateembauche
	 * @param dateDesignation
	 */
	public Personnel(int nbreEnfant, String echelle, String echelon,
			String situationfamiliale, String marieemploye, String num_tE,
			String dateembauche, String dateDesignation) {
		super();
		NbreEnfant = nbreEnfant;
		Echelle = echelle;
		Echelon = echelon;
		Situationfamiliale = situationfamiliale;
		Marieemploye = marieemploye;
		Num_tE = num_tE;
		Dateembauche = dateembauche;
		DateDesignation = dateDesignation;
	}


	/**
	 * @param iD
	 * @param nbreEnfant
	 * @param num_p
	 * @param cin
	 * @param pren_n_arabe
	 * @param pren_n
	 * @param adresse
	 * @param tel
	 * @param nationalite
	 * @param sexe
	 * @param d
	 */
	public Personnel(  String num_p, String cin,
			String pren_n_arabe, String pren_n, String d, String adresse, String tel,
			String nationalite, String sexe) {
		Num_p = num_p;
		Cin = cin;
		Pren_n_arabe = pren_n_arabe;
		Pren_n = pren_n;
		Adresse = adresse;
		Tel = tel;
		Nationalite = nationalite;
		Sexe = sexe;
		Datenaissance =  d;
	}

	/**
	 * @param iD
	 * @param nbreEnfant
	 * @param pren_n_arabe
	 * @param pren_n
	 * @param adresse
	 * @param tel
	 * @param nationalite
	 * @param echelle
	 * @param echelon
	 * @param situationfamiliale
	 * @param marieemploye
	 * @param num_tE
	 */
	public Personnel(int iD, int nbreEnfant, String pren_n_arabe,
			String pren_n, String adresse, String tel, String nationalite,
			String echelle, String echelon, String situationfamiliale,
			String marieemploye, String num_tE) {
		super();
		ID = iD;
		NbreEnfant = nbreEnfant;
		Pren_n_arabe = pren_n_arabe;
		Pren_n = pren_n;
		Adresse = adresse;
		Tel = tel;
		Nationalite = nationalite;
		Echelle = echelle;
		Echelon = echelon;
		Situationfamiliale = situationfamiliale;
		Marieemploye = marieemploye;
		Num_tE = num_tE;
	}

	/**
	 * @param nbreEnfant
	 * @param num_p
	 * @param cin
	 * @param pren_n_arabe
	 * @param pren_n
	 * @param adresse
	 * @param tel
	 * @param nationalite
	 * @param sexe
	 * @param echelle
	 * @param echelon
	 * @param situationfamiliale
	 * @param marieemploye
	 * @param num_tE
	 * @param dateembauche
	 * @param dateDesignation
	 * @param datenaissance
	 */
	public Personnel( String num_p, String cin,
			String pren_n_arabe, String pren_n, String datenaissance, String adresse, String tel,
			String nationalite, String sexe, String echelle, String echelon,
			String situationfamiliale,int nbreEnfant, String marieemploye, String num_tE,
			String dateembauche, String dateDesignation) {
		super();
		NbreEnfant = nbreEnfant;
		Num_p = num_p;
		Cin = cin;
		Pren_n_arabe = pren_n_arabe;
		Pren_n = pren_n;
		Adresse = adresse;
		Tel = tel;
		Nationalite = nationalite;
		Sexe = sexe;
		Echelle = echelle;
		Echelon = echelon;
		Situationfamiliale = situationfamiliale;
		Marieemploye = marieemploye;
		Num_tE = num_tE;
		Dateembauche = dateembauche;
		DateDesignation = dateDesignation;
		Datenaissance = datenaissance;
	}
	
	
	/**
	 * @param iD
	 * @param nbreEnfant
	 * @param echelle
	 * @param echelon
	 * @param situationfamiliale
	 * @param marieemploye
	 * @param num_tE
	 * @param dateembauche
	 * @param dateDesignation
	 */
	public Personnel(int iD, int nbreEnfant, String echelle, String echelon,
			String situationfamiliale, String marieemploye, String num_tE,
			String dateembauche, String dateDesignation) {
		super();
		ID = iD;
		NbreEnfant = nbreEnfant;
		Echelle = echelle;
		Echelon = echelon;
		Situationfamiliale = situationfamiliale;
		Marieemploye = marieemploye;
		Num_tE = num_tE;
		Dateembauche = dateembauche;
		DateDesignation = dateDesignation;
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
	 * @return the nbreEnfant
	 */
	public int getNbreEnfant() {
		return NbreEnfant;
	}
	/**
	 * @param nbreEnfant the nbreEnfant to set
	 */
	public void setNbreEnfant(int nbreEnfant) {
		NbreEnfant = nbreEnfant;
	}
	/**
	 * @return the num_p
	 */
	public String getNum_p() {
		return Num_p;
	}
	/**
	 * @param num_p the num_p to set
	 */
	public void setNum_p(String num_p) {
		Num_p = num_p;
	}
	/**
	 * @return the cin
	 */
	public String getCin() {
		return Cin;
	}
	/**
	 * @param cin the cin to set
	 */
	public void setCin(String cin) {
		Cin = cin;
	}
	/**
	 * @return the pren_n_arabe
	 */
	public String getPren_n_arabe() {
		return Pren_n_arabe;
	}
	/**
	 * @param pren_n_arabe the pren_n_arabe to set
	 */
	public void setPren_n_arabe(String pren_n_arabe) {
		Pren_n_arabe = pren_n_arabe;
	}
	/**
	 * @return the pren_n
	 */
	public String getPren_n() {
		return Pren_n;
	}
	/**
	 * @param pren_n the pren_n to set
	 */
	public void setPren_n(String pren_n) {
		Pren_n = pren_n;
	}
	/**
	 * @return the adresse
	 */
	public String getAdresse() {
		return Adresse;
	}
	/**
	 * @param adresse the adresse to set
	 */
	public void setAdresse(String adresse) {
		Adresse = adresse;
	}
	/**
	 * @return the tel
	 */
	public String getTel() {
		return Tel;
	}
	/**
	 * @param tel the tel to set
	 */
	public void setTel(String tel) {
		Tel = tel;
	}
	/**
	 * @return the nationalite
	 */
	public String getNationalite() {
		return Nationalite;
	}
	/**
	 * @param nationalite the nationalite to set
	 */
	public void setNationalite(String nationalite) {
		Nationalite = nationalite;
	}
	/**
	 * @return the sexe
	 */
	public String getSexe() {
		return Sexe;
	}
	/**
	 * @param sexe the sexe to set
	 */
	public void setSexe(String sexe) {
		Sexe = sexe;
	}
	/**
	 * @return the echelle
	 */
	public String getEchelle() {
		return Echelle;
	}
	/**
	 * @param echelle the echelle to set
	 */
	public void setEchelle(String echelle) {
		Echelle = echelle;
	}
	/**
	 * @return the echelon
	 */
	public String getEchelon() {
		return Echelon;
	}
	/**
	 * @param echelon the echelon to set
	 */
	public void setEchelon(String echelon) {
		Echelon = echelon;
	}
	/**
	 * @return the situationfamiliale
	 */
	public String getSituationfamiliale() {
		return Situationfamiliale;
	}
	/**
	 * @param situationfamiliale the situationfamiliale to set
	 */
	public void setSituationfamiliale(String situationfamiliale) {
		Situationfamiliale = situationfamiliale;
	}
	/**
	 * @return the marieemploye
	 */
	public String getMarieemploye() {
		return Marieemploye;
	}
	/**
	 * @param marieemploye the marieemploye to set
	 */
	public void setMarieemploye(String marieemploye) {
		Marieemploye = marieemploye;
	}
	/**
	 * @return the num_tE
	 */
	public String getNum_tE() {
		return Num_tE;
	}
	/**
	 * @param num_tE the num_tE to set
	 */
	public void setNum_tE(String num_tE) {
		Num_tE = num_tE;
	}
	/**
	 * @return the dateembauche
	 */
	public String getDateembauche() {
		return Dateembauche;
	}
	/**
	 * @param dateembauche the dateembauche to set
	 */
	public void setDateembauche(String dateembauche) {
		Dateembauche = dateembauche;
	}
	/**
	 * @return the dateDesignation
	 */
	public String getDateDesignation() {
		return DateDesignation;
	}
	/**
	 * @param dateDesignation the dateDesignation to set
	 */
	public void setDateDesignation(String dateDesignation) {
		DateDesignation = dateDesignation;
	}
	/**
	 * @return the datenaissance
	 */
	public String getDatenaissance() {
		return Datenaissance;
	}
	/**
	 * @param datenaissance the datenaissance to set
	 */
	public void setDatenaissance(String datenaissance) {
		Datenaissance = datenaissance;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Personnel [ID=" + ID + ", NbreEnfant=" + NbreEnfant
				+ ", Num_p=" + Num_p + ", Cin=" + Cin + ", Pren_n_arabe="
				+ Pren_n_arabe + ", Pren_n=" + Pren_n + ", Adresse=" + Adresse
				+ ", Tel=" + Tel + ", Nationalite=" + Nationalite + ", Sexe="
				+ Sexe + ", Echelle=" + Echelle + ", Echelon=" + Echelon
				+ ", Situationfamiliale=" + Situationfamiliale
				+ ", Marieemploye=" + Marieemploye + ", Num_tE=" + Num_tE
				+ ", Dateembauche=" + Dateembauche + ", DateDesignation="
				+ DateDesignation + ", Datenaissance=" + Datenaissance + "]";
	}
	
	

}
