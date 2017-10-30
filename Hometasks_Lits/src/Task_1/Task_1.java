package Task_1;

import java.util.ArrayList;

public class Task_1 {

	public static void main(String[] args) {
		ArrayList<String>fruits = new ArrayList<String>();
		fruits.add("apple");
		fruits.add("apple");
		fruits.add("apple");
		fruits.add("cherry");
		fruits.add("mango");
		fruits.add("kiwi");
		fruits.add("pear");
		fruits.add("banana");
		System.out.println("These fruits are available in the store:");
		System.out.println("\t"+ fruits);
		for(int i = 0; i<fruits.size()/2; i++) {
			fruits.set(i, "berry");
			
		}
		System.out.println("No, these fruits are available in the store:");
		System.out.println("\t"+ fruits);
			

	
//		��� ���� ��� ������� 2-�� ������� ������:
//		for(int j  = fruits.size()/2; j<fruits.size(); j++) {
//			fruits.set(j, "pineapple");
//		
//		}

}
}
