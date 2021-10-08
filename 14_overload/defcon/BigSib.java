public class BigSib{
	String helloMsg; //instance var

	public BigSib(){ //constr
		helloMsg = "Word up";
	}

	public String greet(String name){
    		return(helloMsg + " " + name);
	}
}
