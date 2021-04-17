package week1.day1;

public class Fibonacci {
	
	public static void main(String[] args) {
		
		int num1 = 0;
		int num2 = 1;
		int sum = 0;
		
		System.out.println(num1);
		System.out.println(num2);
		

		
		for (int i = 1; i <=10; i++) {
			

			sum = num1 + num2;
			
			num1 = num2;
			num2 = sum;
		
		System.out.println(sum);
		
			
		}
		
	}

}
