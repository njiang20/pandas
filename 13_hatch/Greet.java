/*
Team We Did Not Agree on This--Nina Jiang, Miss Alpaca, Ethan, Carl
APCS
HW13--Where do BigSibs Come from?
2021-10-06

DISCO:
-constructors must be public
-if a constructor is defined, make it the first method definition
-the creation of a new object runs a constructor (special method) automatically and is invoked with NEW
-constructor name must match the class name
-it cannot have a return type such as void
QCC
-why can't constructors have a return type? What happens if you keep it?
-how many parameters can a constructor have?
can constructors be private? If so, where are they used?
*/

public class Greet {
        public static void main (String[] args){
		String greeting;
		BigSib richard = new BigSib();

		greeting = richard.greet("freshman");
		System.out.println(greeting);
	}
}
