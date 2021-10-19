/*
Triumphant Triangles--Nina Jiang, Jason Zhou, John Gupta-she//Duckies: Miss Alpaca, Tiggy, Po
APCS
HW20: External Audit
2021-10-19

DISCO: N/A
Q: N/A
*/

public class Teller {
	public static void main(String [] args) {
		BankAccount elmo = new BankAccount();
		System.out.println(elmo.toString());
		//I created new instance. It should have id and ect

		System.out.println(elmo.setName("ooea"));
		System.out.println(elmo.setPassword("ljasieo"));

		System.out.println(elmo.setPin(1000));
		System.out.println(elmo.setPin(10090));

		System.out.println(elmo.setId(123123123));
		System.out.println(elmo.setId(123123112323));

		System.out.println(elmo.setBalance(1000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000));
		System.out.println(elmo.setBalance(100));

		System.out.println(elmo.deposit(100));
		System.out.println(elmo.deposit(-100));

		System.out.println(elmo.withdraw(100));
		System.out.println(elmo.withdraw(-100));

		System.out.println(elmo.authenticate(123123123, "ljasieo"));
	}
}
