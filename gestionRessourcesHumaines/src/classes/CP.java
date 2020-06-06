package classes;

public class CP {
	private int CadreID;
	private int PersonnelID;
	
	public CP(int cadreID, int personnelID) {
		
		CadreID = cadreID;
		PersonnelID = personnelID;
	}
	
	public int getCadreID() {
		return CadreID;
	}
	
	public void setCadreID(int cadreID) {
		CadreID = cadreID;
	}
	
	public int getPersonnelID() {
		return PersonnelID;
	}
	
	public void setPersonnelID(int personnelID) {
		PersonnelID = personnelID;
	}
	
	
}
