package _03_More_Array_Fun;

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
		return namePrint;
	}
	
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
}
