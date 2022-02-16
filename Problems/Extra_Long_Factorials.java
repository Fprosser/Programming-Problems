package Problems;


import java.awt.*;
import java.math.BigInteger;

/*
    Description:
    Given an integer return its factorial. 

    if n>20 integers are not suitable, so the solutions must use BigIntegers

    Example:
    
        Input 
        n = 25

        Output 
        15511210043330985984000000

*/


public class Extra_Long_Factorials {

    public static void extraLongFactorials(int n){
        
        BigInteger a = BigInteger.valueOf(n);
        int b = n-1;
        while(b > 0){
            a = a.multiply(BigInteger.valueOf(b));
            b--;
        }

        System.out.print(a);

        //This algorithm is really straightforward. We just have to use a bit of Java knowledge to mix the BigInteger with the regular integer.
    }

    public static void main(String[] args){
        int n = 25;

       extraLongFactorials(n);

    }
    
}
