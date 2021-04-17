package week1.day1;

public class SumOfIndex {

	public static void main(String[] args) {
		
		int i = 143;
		
		int sum = 0;
		
		while (i !=0) {
			
			sum = sum + i % 10;
			
			i = i /10;
			
		}
System.out.println(sum);
	}

}
