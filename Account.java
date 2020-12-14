package smg_2;
import java.util.Date;

public class Account {
	protected int ID = 0;
	protected double balance = 0;
	static public double yearInterestRate = 0;
	protected Date date = new Date();
	Account(){
		
	}
	Account(int newId, double newBalance){
		this.ID = newId;
		this.balance = newBalance;
	}
	String dateCreated() {
		return date.toString();
	}
	void setID(int newID) {
		this.ID = newID;
	}
	void setBalance(double newBalance) {
		this.balance = newBalance;
	}
	static void setYearInterestRate(int newYearInterstRate) {
		yearInterestRate = newYearInterstRate;
	}
	int getID() {
		return this.ID;
	}
	double getBalance() {
		return this.balance;
	}
	double getYearInterestRate() {
		return yearInterestRate;
	}
	double getMouthlyInterestRate() {
		return yearInterestRate/12;
	}
	double getMontlyInterest() {
		return (this.yearInterestRate/12)*this.balance;
	}
	void withdraw(int a) {
		if (balance - a >= 0) {
			balance = balance - a;
			System.out.println("TRANSACTION SUCCESFULL. Current balance is: " + balance);
		}else {
			System.out.println("TRANSACTION UNSUCCESFULL. Not enought money. Current balance is: " + balance);
		}
	}
	void deposit(int a) {
		balance = balance + a;
		System.out.println("TRANSACTION SUCCESFULL. Current balance is: " + balance);
	}
}

