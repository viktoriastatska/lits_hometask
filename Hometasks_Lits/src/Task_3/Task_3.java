package Task_3;

import java.util.Arrays;

public class Task_3 {

	public static void main(String[] args) {
		int[]numbers = {1,2,3,4,5,6,7,8};
		int min = 0;
		int max = 0;
		int sum = 0;
		for(int i = 0; i<numbers.length; i++) {
			sum+=numbers[i];
			if(numbers[i] < numbers[min]) {
				min = i;
			}
			if(numbers[i] > numbers[max]) {
				max = i;
			
		}
			
	}
		int avg = sum/numbers.length;
		numbers[min] = avg ;
		System.out.println("min:" + numbers[min]);
//		System.out.println("max:" + numbers[max]);
//		System.out.println("sum:" + sum);
		System.out.println("avg:" + avg);
		System.out.println(Arrays.toString(numbers));
}
}
