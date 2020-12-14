package smg_2;

public class Project19ex2 {
	public static void main(String[] args) {
		CheckingAccount cha = new CheckingAccount(2300, 2000, 3000);
		SavingsAccount sa = new SavingsAccount(2301, 2000);
		System.out.println(cha.dateCreated());
		System.out.println(sa.dateCreated());
		sa.deposit(5000);
		cha.deposit(1000);
		cha.deposit(100);
		sa.withdraw(10000);
		cha.withdraw(101001);
	}
}
