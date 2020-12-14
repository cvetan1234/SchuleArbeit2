package smg_2;
import java.util.Scanner;

public class Project18ex1 {

	public static void main(String[] args) {
		Triangle t = new Triangle();
		Scanner sc = new Scanner(System.in);
		print("Triangle!");
		print("Enter a: ");
	    getInfo(t,1,sc.nextDouble());
	    print("Enter b: ");
	    getInfo(t,2,sc.nextDouble());
	    print("Enter c: ");
	    getInfo(t,3,sc.nextDouble());
	    print("Enter colour: ");
	    String s = sc.next();
	    t.setColour(s);
	    print("Is it filled: ");
	    boolean b = sc.nextBoolean();
	    t.setIsItFilled(b);
	    
	    t.printRectangle();
	    System.out.println(t.getColour());
	    System.out.println(t.getIsItFilled());
	    System.out.println(t.getPerimeter());
	    System.out.println(t.getArea());
	}
	static void print(String s) {
		System.out.println(s);
	}
	static void getInfo(Triangle t, int num, double set) {
		if (num == 1) {
			t.setSide1(set);
		}else if (num == 2) {
			t.setSide2(set);
		}else if (num == 3) {
			t.setSide3(set);
		}
	}

}
