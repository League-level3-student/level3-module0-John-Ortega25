package _03_More_Array_Fun;

import java.util.Random;

import javax.swing.JOptionPane;

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
	
	//3. Write a method that takes an array of Strings and prints all the Strings in the array in reverse order.
	public static String reverseOrder(String[] names) {
		String namePrint = "";
		for (int i = names.length-1; i >= 0 ; i--) {
			if (i!= 0) {
				namePrint = namePrint + names[i] + " ";
			}
			else {
				namePrint = namePrint + names[i];
			}
		}
		return namePrint;
	}
	
	
	//4. Write a method that takes an array of Strings and prints every other String in the array.
	public static String everyOther(String[] names) {
		String namePrint = "";
		for (int i = 0; i < names.length; i++) {
			if (i%2 == 0 && i <names.length-2) {
				namePrint = namePrint + names[i] + " ";
			}else if (i%2==0) {
				namePrint = namePrint + names[i];
			}
		}
		return namePrint;
	}
	
	//5. Write a method that takes an array of Strings and prints all the Strings in the array
	//   in a completely random order. Almost every run of the program should result in a different order.
	
	
}
