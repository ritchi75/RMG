package rmg;
import java.util.Scanner;
import java.math.BigInteger;
/**
 * Find largest Fibonacci # of n digits using BigInteger
 * @author Scott Ritchie
 */
public class FibN {

    //Use Scanner to enter in your n value and then call Fib()
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a value for n: ");
        long n = scan.nextLong();
        System.out.println(Fib(n));
    }
    
    /*
     * Using three BigIntegers, this method goes through the Fibonacci
     * sequence until it finds the largest number with n digits
     * @param n the user-determined decimal value
     * @return the resulting BigInteger number
     */
    public static BigInteger Fib(long n){
        BigInteger a = new BigInteger("0"); //Beginning sequence vals    
        BigInteger b = new BigInteger("1");  
        BigInteger c = new BigInteger("0");
        long cLen = 0; //Length of c used for loop conditions
        /* This loop performs the Fibonacci sequence steps while checking 
           if you've reached the desired decimal length */
        while(cLen <= n){
            c = a.add(b);
            cLen = c.toString().length();
            /* Once you've gone one step too far
               Revert to previous val, break, return */
            if(cLen > n){
                c=b;
                break;
            }
            a=b;
            b=c;
        }
        return c;
    }
}
