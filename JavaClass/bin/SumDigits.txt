// not ready to run

/**
*Sum Digits
*
*Ask user for an integer value
*
*Call sumDigits handing it the integer value
*    get the sum of the digits back
*
*    int total = 0;
*    total = sumDidgets(integer value);
*
*Display the integer and the sum of its digits
*/

public static int sumDigits(long n){
    
    int total = 0;
    int length = String.valueOf(n).length();
    
    for(int x = 0; x < length; x++){
        total += n%10;
        n = n/10;
       }
       return total
}


/**
*        break integer into individual numbers
*        (parse n)
*        add individual numbers together to get a total
*        return total
*/
