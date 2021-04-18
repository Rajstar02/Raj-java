package week1.day1;

public class ArmStrongNumber {
	
	public static void main(String[] args) {
		
		int input = 153;
		
		int OrgNum = input;
		
		int sum = 0;
		
		int rem;
		
		while (input > 0) {
			
			rem = input % 10 ;
			
		System.out.println(rem);
		
		sum = sum + (rem*rem*rem);
		
		System.out.println(sum);
		
		input = input / 10;
		
		System.out.println(input);
		
		if (sum == OrgNum) {
			
			System.out.println("Given no is a armstrong Number");
			
		}
		
		else {
			
			System.out.println("Not a armstrong number");
			
		}
		
			
		}
		
	}

}
