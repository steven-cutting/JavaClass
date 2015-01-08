// Steven Cutting; Test 1; Problem 2


public class Problem_two {


	public static void main(String[] args) {
		
		int r = (int) (Math.random() * 11 + 2);
		
		while (r != 11){
			System.out.println(r);
			r = (int) (Math.random() * 11 + 2);	
			
		}
		System.out.println(11);
	}

}
