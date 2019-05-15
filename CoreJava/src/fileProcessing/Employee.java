package fileProcessing;

public class Employee {
	
	private int eId;
	private String eName;
	private String eCity;
	
	public Employee(int eId, String eName,String eCity) {
		this.eId = eId;
		this.eName = eName;
		this.eCity = eCity;
	}
	
	
	public String geteName() {
		return eName;
	}

	public void seteName(String eName) {
		this.eName = eName;
	}

	public String geteCity() {
		return eCity;
	}

	public void seteCity(String eCity) {
		this.eCity = eCity;
	}
	
	public int geteId() {
		return eId;
	}

	public void seteId(int eId) {
		this.eId = eId;
	}
	
	public String toString() {
		return this.eId+" "+this.eName+" "+this.eCity;
	}
	
	
	
}
