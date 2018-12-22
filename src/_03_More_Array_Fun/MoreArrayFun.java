package _03_More_Array_Fun;

import java.util.Random;

public class MoreArrayFun {
	

	public static String printAll(String[] names) {
		String namePrint = "";
		int nameLength = names.length-1;
		for (int i = 0; i < names.length; i++) {
			if (i!= nameLength) {
				namePrint = namePrint + names[i] + " ";
			}
			else {
				namePrint = namePrint + names[i];
			}
		}
		// TODO Auto-generated method stub
		return namePrint;
	}
	
	//2. Write a method that takes an array of Strings and prints all the Strings in the array.
	
	
	
	//3. Write a method that takes an array of Strings and prints all the Strings in the array
	//   in reverse order.
	
	
	
	//4. Write a method that takes an array of Strings and prints every other String in the array.
	
	
	//5. Write a method that takes an array of Strings and prints all the Strings in the array
	//   in a completely random order. Almost every run of the program should result in a different order.
	
	
}
