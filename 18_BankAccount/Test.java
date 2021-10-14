public class Test {
	public static void main(String[] args) {
		BankAccount richard = new BankAccount("Richard", "ee", "1010101", "0100", 69);
		richard.changeName("deez", "ee");
		System.out.println(richard.getInfo("ee", "0100"));
	}
}
