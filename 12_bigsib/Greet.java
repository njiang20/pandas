public class Greet {
	public static void main( String[] args ) {
		String greeting;

		BigSib richard = new BigSib();
		richard.setHelloMsg("Word up");

		BigSib space = new BigSib();
		space.setHelloMsg("Salutations");

		BigSib foo = new BigSib();
		foo.setHelloMsg("Hey ya");

		BigSib mom = new BigSib();
		mom.setHelloMsg("Sup");

		greeting = richard.greet("freshman");
		System.out.println(greeting);

		greeting = space.greet("Dr. Spaceman");
		System.out.println(greeting);

		greeting = foo.greet("Kong Fooey");
		System.out.println(greeting);

		greeting = mom.greet("mom");
		System.out.println(greeting);

	} //end main()
} //end Greet
