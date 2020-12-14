package smg_2;
import java.util.Date;

public class Employee extends Person {
	protected String office;
	protected int salary;
	protected Date d = new Date();
	Employee(){
		
	}
	Employee(Employee e){
		equal(e);
	}
	Employee(String setName, String setAddress, String setE_address, String setNum, String setOffice, int setSalary){
		super(setName, setAddress, setE_address, setNum);
		salary = setSalary;
		office = setOffice;
	}
	Employee(Person p, String setOffice, int setSalary){
		super(p); //super.equal(p);
		office = setOffice;
		salary = setSalary;
	}
	public String toString() {
		return super.toString() + " Salary: " + salary + " Office: " + office + " Date " + d;
	}
	void equal(Employee e) {
		name = e.name;
		address = e.address;
		e_address = e.e_address;
		number = e.number;
		office = e.office;
		salary = e.salary;
	}
}
