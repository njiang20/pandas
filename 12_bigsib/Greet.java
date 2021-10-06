/*
Nina Jiang, Alpaca
APCS
HW12--On Elder Individualty and the Elimination of Radio Fuzz
2021-10-05

DISCO:
- an instance variable is declared using "class varName = new class();"
- return required value type
QCC
- What is an instance variable?
*/

public class Greet {
        public static void main (String[] args){
		String greeting;

		BigSib richard = new BigSib();
		richard.setHelloMsg("Word up");

		greeting = richard.greet("freshman");
		System.out.println(greeting);
	}
}
