public  class Greet{
	public static void greet(String a) {
		String name;
		name = a;
		System.out.println("Why, hello there, " + name + ". How do you do?");
	}

	public static void main(String[] args) {
		greet("Foo");
		greet("Moo");
		greet("Loo");
	}
}
