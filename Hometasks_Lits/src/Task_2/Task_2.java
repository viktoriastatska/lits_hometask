package Task_2;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Task_2 {

	public static void main(String[] args) {
		int[] digits = {1, 2, 3, 4, 4, 5, 6, 6, 7, 7, 8};{
		
			for(int i = 0; i<digits.length; i++) {
				System.out.println("initial order:" + "\t" + digits[i]);
				
			}
			System.out.println("=================");
			
			for(int i = 0; i<digits.length/2; i++) {
				int temp = digits[digits.length - 1 - i];
				digits[digits.length -1-i] = digits[i];
				digits[i] = temp;
					
			}
			for(int i = 0; i<digits.length; i++) {
			System.out.println("reversed order:" + "\t" +digits[i ]);
			
			}	
			}
		System.out.println("=================");
		System.out.println("blablabla");
//		Set uniqueDigits = new HashSet<>();
//		for(int i = 0; i<digits.length; i++) {
//			uniqueDigits.add(digits[i]);
//		}
//		System.out.println("Sorted by HashSet:" + uniqueDigits);
		
			int current = digits[0];
			System.out.println("Unique digits:" + current);
			for(int i = 0; i<digits.length; i++) {
				
				if(!(current == digits[i])) {
					System.out.println("Unique digits:" + digits[i]);
					
			}
				current = digits[i];
	}
}
}
