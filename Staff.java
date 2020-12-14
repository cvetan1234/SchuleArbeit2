package smg_2;

public class Staff extends Employee{
	private String title;
	Staff(){
		
	}
	Staff(String setName, String setAddress, String setE_address, String setNum, String setOffice, int setSalary, String setTitle){
		super(setName, setAddress, setE_address, setNum, setOffice, setSalary);
		title = setTitle;
	}
	Staff(Employee e, String setTitle){
		super(e); //super.equal(e);
		title = setTitle;
	}
	public String toString() {
		return super.toString() + " Title: " + title;
	}
}
