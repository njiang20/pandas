public class BigSib {
	public String helloMsg = ""; //initial value for helloMsg

	public BigSib() { //constructor for the public class BigSib
		helloMsg = "Word up";
	}

	public String greet(String m) {
		String print = "";
		print = helloMsg + " " + m;
		return(print);
        }
}
