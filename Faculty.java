package smg_2;

public class Faculty extends Employee{
	private int officeHours;
	private String rank;
	Faculty(){
		
	}
	Faculty(String setName, String setAddress, String setE_address, String setNum, String setOffice, int setSalary, int setOfficeHours, String setRank){
		super(setName, setAddress, setE_address, setNum, setOffice, setSalary);
		officeHours = setOfficeHours;
		rank = setRank;
	}
	Faculty(Employee e, int setOfficeHours, String setRank){
		super(e); //super.equal(e);
		officeHours = setOfficeHours;
		rank = setRank;
	}
	public String toString() {
		return super.toString() + " Office hours: " + officeHours + " Rank: " + rank; 
	}
}
