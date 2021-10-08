public class BigSib {
	String helloMsg;

	public BigSib() {
		helloMsg = "Word Up";
	}
	public BigSib(String msg) {
		helloMsg = msg;
	}

	public String greet(String greeting) {
		return helloMsg + " " + greeting;
	}
}
