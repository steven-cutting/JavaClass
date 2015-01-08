// Steven Cutting Lab 6, pg 212, Listing 5.2, Sum Digits
import java.util.Scanner;

public class Listing5_2 {

	public static void main(String[] args) {
		long num = getint();
		System.out.println(sumDigits(num));
	}
	
    public static int sumDigits(long n){

        long length = String.valueOf(n).length();
        long num = 0;
        for(int x = 0; x < length; x++){
            num = num + (n % 10);
            n = n/10;
            
        }
        num = num + (n % 10);
        Integer derp = (int) (long) num;
        return derp;
    }
    
    static int getint() {
        /*Method that asks for an integer and then returns it.*/
    Scanner input = new Scanner(System.in);
    System.out.print("Please provide a long integer: ");
    return input.nextInt();
    }

}
