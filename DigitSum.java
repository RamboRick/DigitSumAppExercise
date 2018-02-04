package bigOnotationTest;

public class DigitSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sumDigit (20);
		
	}
	
	public static int sumDigit(int n){
		int sum =0;
		int count =0;
		while (n>0){
			sum += n % 10;
			n = n /10;
			count ++;
			
		}
		System.out.println(count);
		return sum;
	}
}
