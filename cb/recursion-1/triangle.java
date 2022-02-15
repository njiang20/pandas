public class triangle {
  public static int triangle(int rows) {
  	if(rows < 2) {
  		return rows;
    }
  	return rows + triangle(rows-1);
  }

  public static void main(String[] args) {
    System.out.println(triangle(2));
  }
}
