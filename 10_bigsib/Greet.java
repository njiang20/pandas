/* 
Money Hags--Nina Jiang, Ziying Jian, Faiza Huda, Scruffy, Alpaca, Truthful Tom
APCS
HW10--Refactor Big Sib One/Java/Investigating syos
2021-10-04

DISCOVERIES:
-change the return type depending in the type of output the method displays
-printing out twice causes problems in the machine
*/

public class Greet {
    public static void main( String[] args ){
        System.out.println( BigSib.greet("Crosby") );
        System.out.println( BigSib.greet("Stills") );
        System.out.println( BigSib.greet("Nash") );
    }
}
