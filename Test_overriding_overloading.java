package smg_2;

public class Test_overriding_overloading {
	public static void main(String[] args) {
		print(overloading.Plus(1, 2));
		print(overloading.Plus(1.2, 3.3));
		print(overloading.Plus(1.2, 1.2, 1.2));
		print(overriding.Plus(5, 2));
		print(overriding.Plus(1, 2, 3));
	}
	static void print (int a) {
		System.out.println(a);
	}
	static void print (double a) {
		System.out.println(a);
	}
}
