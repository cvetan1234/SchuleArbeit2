package smg_2;

public class CheckingAccount extends Account{
	private double tawan;
	CheckingAccount(){
		
	}
	CheckingAccount(int newID, double newBalance, double setTawan){
		super(newID,newBalance);
		tawan = setTawan;
	}
	CheckingAccount(Account a, double setTawan){
		setID(a.getID());
		setBalance(a.getBalance());
		tawan = setTawan;
	}
	void deposit(int a) {
		if (balance + a <= tawan) {
			balance += a;
			System.out.println("TRANSACTION SUCCESFULL. CUrrent balance is " + balance);
		}else {
			System.out.println("TRANSACTION UNSUCCESFULL. Over the limit. Current balance is: " + balance);
		}
	}
}
