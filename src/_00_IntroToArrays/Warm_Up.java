package _00_IntroToArrays;

public class Warm_Up {

	static int[] array = new int[10];
	static int sum = 0;

	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			array[i] = i + 1;
			System.out.println(i);
		}
		for (int j = 0; j < 10; j++) {
			sum = sum + array[j];
		}
		array[7] = 0;
		System.out.println(findMissingNum(array));
	 }

	public static int findMissingNum(int array[]) {
		int totalSum = 47;
		int difference = 0;
		for (int i = 0; i < 10; i++) {
			if (array[i] == 0) {
				System.out.println("Found 0");
				difference = totalSum - sum;
			}
		}
		return difference;
	}
}
