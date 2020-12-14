package smg_2;

public class Person {
	protected String name;
	protected String address;
	protected String e_address;
	protected String number;
	Person(){
		
	}
	Person (Person p) {
		equal(p);
	}
	Person(String setName, String setAddress, String setE_address, String setNum){
		name = setName;
		address = setAddress;
		e_address = setE_address;
		number = setNum;
	}
	public String toString() {
		return "Name: " + name+ " Address: " + address + " e_address: " + e_address + " Phone number: " + number;
	}
	void equal(Person p) {
		name = p.name;
		address = p.address;
		e_address = p.e_address;
		number = p.number;
	}
}
