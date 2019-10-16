package _03_More_Array_Fun;

import java.util.Random;

public class MoreArrayFun {
	//1. Create a main method to test the other methods you write.
	
	public static void main(String[] args) {
	String[] test = new String[] {"a","b","c","d","e","f","g","h","i","j","k"};	
	StringRandom(test);
	}
	
	
	 //2. Write a method that takes an array of Strings and prints all the Strings in the array.
	static void StringArray(String[] print) {
		for (int i = 0; i < print.length; i++) {
			System.out.println(print[i]);
		}
	}
	
	
	//3. Write a method that takes an array of Strings and prints all the Strings in the array
	//   in reverse order.
	static void StringReverse(String[] reverse) {
		for (int i = reverse.length - 1; i>=0; i--) {
			System.out.println(reverse[i]);
		}
	}
	
	
	//4. Write a method that takes an array of Strings and prints every other String in the array.
	static void StringEvens(String[] evens) {
		for (int i = 0; i < evens.length; i++) {
			if(i%2 == 0) {
				System.out.println(evens[i]);
			}
		}
	}
	
	//5. Write a method that takes an array of Strings and prints all the Strings in the array
	//   in a completely random order. Almost every run of the program should result in a different order.
	static Random rand = new Random();
	static void StringRandom(String[] random) {
		for (int i = 0; i < random.length; i++) {
			System.out.println(random[rand.nextInt(random.length)]);
		}
	}
	
}
