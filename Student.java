package smg_2;

public class Student extends Person {
	private String classstatus;
	void setClassstatus(String a) {
		if (a=="fresh-man" || a=="sophomore" || a=="junior" || a=="senior") {
			classstatus = a;
		}
	}
	Student(){
		
	}
	Student(String setName, String setAddress, String setE_address, String setNum, String setClassstatus){
		super(setName, setAddress, setE_address, setNum);
		classstatus = setClassstatus;
	}
	Student(Person p, String setClassstatus){
		super(p); //super.equal(p);
		classstatus = setClassstatus;
	}
	public String toString () {
		return super.toString() + " Class status: " + classstatus; 
	}
	
}
