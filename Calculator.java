package week1.day2;

public class Calculator {
	
	public int add(int num1 , int num2)  {
		
		int sum = num1 + num2;
		
		return sum;
			
	}
	
	public double sub(double num1 , double num2) {
		
		double result = num1 - num2;
		
		return result;
		
	}
	
	
	
	public double mul(double num1 , double num2) { 
		
		double result = num1 * num2;
		
		return result;
		
	}
	
	public double division(double num1 , double num2) {
		
		double result = num1 /num2;
		
		return result;
		
	}
	
	public static void main(String[] args) {
		
		Calculator cal = new Calculator();
		
		System.out.println(cal.add(100, 200));
		System.out.println(cal.sub(90, 30));
		System.out.println(cal.mul(48.99, 98.99));
		System.out.println(cal.division(998, 98));
		
		
		
	}

}
