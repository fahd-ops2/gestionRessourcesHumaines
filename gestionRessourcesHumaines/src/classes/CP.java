package classes;

public class CP {
	private int id ;
	private int CadreID;
	private int PersonnelID;
	

	
	/**
	 * @param id
	 * @param cadreID
	 * @param personnelID
	 */
	public CP(int id, int cadreID, int personnelID) {
		super();
		this.id = id;
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

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "CP [id=" + id + ", CadreID=" + CadreID + ", PersonnelID="
				+ PersonnelID + "]";
	}


	
}
