public class BigSib {
	public static void bigsib(String a) {
		String name;
		name = a;
		System.out.println("Why, hello there, " + name + ". How do you do?");
	}

	class Greet{
		public static void main(String [] args){
			BigSib.greet("Flim");
			BigSib.greet("Flam");
			BigSib.greet("Kazaam");
		}
	}
}
