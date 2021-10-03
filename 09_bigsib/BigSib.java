Money Hags: Nina Jiang, Ziying Jian, Faiza Huda, Chicken
APCS
HW09--What Are BigSibs Good For?
2021-10-01

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
