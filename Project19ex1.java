package smg_2;
import java.util.Date;

public class Project19ex1 {

	public static void main(String[] args) {
		Person person = new Person("Pesho", "bul. Gotse Delchev", "pescho@abv.bg", "088 276 5354");
		Student student = new Student("Pesho", "bul. Gotse Delchev", "pescho@abv.bg", "088 276 5354", "junior");
		Employee employee = new Employee("Pesho", "bul. Gotse Delchev", "pescho@abv.bg", "088 276 5354", "bul. Bulgaria", 220);
		Faculty faculty = new Faculty("Pesho", "bul. Gotse Delchev", "pescho@abv.bg", "088 276 5354", "bul. Bulgaria", 220, 8, "master");
		Staff staff = new Staff("Pesho", "bul. Gotse Delchev", "pescho@abv.bg", "088 276 5354", "bul. Bulgaria", 220, "title");
		print(person.toString());
		print(student.toString());
		print(employee.toString());
		print(faculty.toString());
		print(staff.toString());
		System.out.println(" ");
		Employee emp2 = new Employee(person, "bul. Bulgaria", 220);
		Student st2 = new Student(person, "junior");
		Faculty fa2 = new Faculty(emp2, 8, "master");
		Staff sta2 = new Staff(emp2, "title");
		print(st2.toString());
		print(emp2.toString());
		print(fa2.toString());
		print(sta2.toString());
	}
	static void print(String a) {
		System.out.println(a);
	}

}
