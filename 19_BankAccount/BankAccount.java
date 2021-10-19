public class BankAccount {
//instance variables
	private String name;
	private String passwd;
	private short pin;
	private int acctNum;
	private double balance;
//---------------------------------------------

//mutators
	public String setName( String newName ) {
		String oldName = name;
		name = newName;
		return oldName;
	}

	public String setPasswd( String newPasswd ) {
		String oldPasswd = passwd;
		passwd = newPasswd;
		return oldPasswd;
	}

	public short setPin( short newPin ) {
		short oldPin = pin;
		pin = newPin;
		return oldPin;
	}

	public int setAcctNum( int newAcctNum ) {
		int oldAcctNum = acctNum;
		acctNum = newAcctNum;
		return oldAcctNum;
	}

	public double setBalance( double newBalance ) {
		double oldBalance = balance;
		balance = newBalance;
		return oldBalance;
	}

//---------------------------------------------

	public void deposit( double depositAmount ) {
		balance = balance + depositAmount;
	}

	public void withdraw( double withdrawAmount ) {
		balance = balance - withdrawAmount;
	}


//overwritten toString()
	public String toString() {
		String retStr = "\nAccount info:\n=======================";
		retStr = retStr + "\nName: " + name;
		retStr = retStr + "\nPassword: " + passwd;
		retStr = retStr + "\nPIN: " + pin;
		retStr = retStr + "\nAccount Number: " + acctNum;
		retStr = retStr + "\nBalance: " + balance;
		retStr = retStr + "\n=======================";
		return retStr;
	}


//main method for testing
	public static void main( String[] args ) {
		BankAccount ba = new BankAccount();
		ba.setName("deez");
		ba.setPasswd("123456789");
		ba.setPin((short)1234);
		ba.setAcctNum(123456789);
		ba.setBalance(12);
		ba.deposit(408);
		ba.withdraw(351);
		System.out.println(ba.toString());
	}//end main()
}//end class BankAccount
