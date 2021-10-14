public class BankAccount {
	//vars
	private double balance;
	private String accPin;
	private String accName;
	private String accPss;
	private String accId;
	
	//constructor
	public BankAccount() {
		
	}
	//overloaded constructor
	public BankAccount(String name, String pss, String id, String pinnum, double setBalance) {
		balance = setBalance;
		accPin = pinnum;
		accName = name;
		accPss = pss;
		
		//Randomize?
		accId = id;
	}
	
	//methods
	public String getInfo(String pss, String pin) {
		//.equals/compareTo
		if (pss == accPss && pin == accPin) {
			return "Name: " + accName + "\nAccount Id: " + accId + "\nBalance: " + Double.toString(balance);
		} else {
			return "Access Denied/Account Doesn't Exist";
		}
	}
	/*
	public String getInfo(String name, String pss, String pin) {
		return 
	}
	*/
	
	public void changePin(String oldPin, String newPin) {
		//add superuser
		if (oldPin == accPin) {
			accPin = newPin;
		}
	}
	
	public void changeName(String newName, String pss) {
		if (pss == accPss) {
			accName = newName;
		}
			
	}
	
	public void changePsswrd(String oldPss, String newPss, String newPssRepeat) {
		if (oldPss == accPss && newPss == newPssRepeat) {
			accPss = newPss;
		}
	}
	
	public void deposit(String pin, double amount) {
		if (pin == accPin && amount > 0) {
			balance += amount;
		}
	}
	
	public void withdraw(String pin, double amount) {
		if (pin == accPin && amount > 0) {
			balance -= amount;
		}
	}
	public static void main(String[] args) {
	}
	
}
