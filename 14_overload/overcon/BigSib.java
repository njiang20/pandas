/*
ziggy's fishball amoebaly rangers: Ziying Jian - Scruffy; Faiza Huda - Truthful Tom; Emily Ortiz - Applesauce; Nina Jia>APCS
HW14 -- Customize Your Creation
2021-10-07

DISCO:
-the default constructor can be overwritten
-default constructor doesn't take a parameter
-overloaded constructor takes in a parameter

QCC:
-what is the purpose of a default constructor v. overloaded constructor?
-when would one be used over the other?
*/

public class BigSib {
	private String helloMsg; //instance var

	public BigSib() { //default constr
		helloMsg = "Word Up";
	}
	public BigSib(String msg) { //overloaded constr
		helloMsg = msg;
	}

	public String greet(String greeting) {
		return helloMsg + " " + greeting;
	}
}
