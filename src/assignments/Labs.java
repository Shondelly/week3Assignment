package assignments;

import java.util.Arrays;

public class Labs {

	private static final String Mario = null;
	public static void main(String[] args) {
		
		//
		// Arrays:
		//
		
		// 1. Create an array with the following values 1, 5, 2, 8, 13, 6
		int[] pickledPeppers = {1, 5, 2, 8, 13, 6};
		
		int[] array = new int[6];
		array[0] = 1;
		array[1] = 5;
		array[2] = 2;
		array[3] = 8;
		array[4] = 13;
		array[5] = 6;
		// 2. Print out the first element in the array
		System.out.println(pickledPeppers[0]);
		
		// 3. Print out the last element in the array without using the number 5
		System.out.println(pickledPeppers[4+1]);
		System.out.println("for question 3 the above answer is right but do ''array.legnth'' - 1 to always get the last one instead of having to do quick maths");
		// 4. Print out the element in the array at position 6, what happens?
		//System.out.println(pickledPeppers[6]);
		// code crashes cause its out of bounds
		
		// 5. Print out the element in the array at position -1, what happens?
		//System.out.println(pickledPeppers[-1]);
		// also crashes the code of rht esame thing
		
		// 6. Write a traditional for loop that prints out each element in the array
		for (int i = 0; i < pickledPeppers.length; i++) {
			System.out.println(pickledPeppers[i]);
		}
			
		// 7. Write an enhanced for loop that prints out each element in the array
		for (int pickle : pickledPeppers) {
			System.out.println(pickle);
		}
		
		// 8. Create a new variable called sum, write a loop that adds 
		//			each element in the array to the sum
		double sum = 0;
			 for (int pepper : pickledPeppers) {
		//		couldnt answe this be sure to study harder on this point remember to use the names you give your data
				 sum += pepper;
			 }
			 System.out.println(sum);
		// 9. Create a new variable called average and assign the average value of the array to it
//			 double average = 0;
//			 for (int i = 0; i < pickledPeppers.length; i++) {
//				 average += i;
//			 }
//			 average / pickledPeppers.length; 
//			above is the code you attempted below is how you solve it actually
			 double average = sum / pickledPeppers.length;
			 System.out.println(average);
		
		// 10. Write an enhanced for loop that prints out each number in the array 
		//			only if the number is odd
			 for (int pickle : pickledPeppers) {
				if (pickle % 2 != 0) {
//				you can also do "2 == 1" to get the same results	
					System.out.println(pickle);
				}
			 }
		
		// 11. Create an array that contains the values "Sam", "Sally", "Thomas", and "Robert"
			 String[] name = {"Sam", "Sally", "Thomas", "Robert"};
		System.out.println(name);
//		above aint doing nothing but printing out weird text questions for later		
		// 12. Calculate the sum of all the letters in the new array
		int sumName = 0;
		for (String names : name) {
			sumName += name.length;
		}
		System.out.println(sumName);

		//
		// Methods:
		//
		
		// 13. Write and test a method that takes a String name and prints out a greeting. 
		//			This method returns nothing. // if it ask to return nothing it is a void
		greet("Tom");
		greet("Billy Bob");
		
		// 14. Write and test a method that takes a String name and  
		//			returns a greeting.  Do not print in the method. // this is where you can things like String over void to return it
		greet2("Milly"); // this by itself wont print
		System.out.println(greet2("Milly"));
		String greeting = greet2("Nick");
		System.out.println(greeting);
		String greeting2 = greet2("Prexx");
		System.out.println(greeting2);
		// Compare method 13 and method 14:  
		//		a. Analyze the difference between these two methods.
		//		b. What do you find? 
		//		c. How are they different?
		// 13 will print something but you cant store a value as void is our value. where 14 you can store values but it wont print one says do something the other says say something
		
		// 15. Write and test a method that takes a String and an int and 
		//			returns true if the number of letters in the string is greater than the int
//		stringLength(Mario, 12);
//		failed attempts
		System.out.println(isStringLongerThanNumber("How much wood could a wood chuck chuck", 17));
		stringVsNumber("Traping love", 9);
		// 16. Write and test a method that takes an array of string and a string and 
		//			returns true if the string passed in exists in the array
		System.out.println(doesArrayContainString(name, "Sally")); // you gotta pass in an already established string array for this to work
		
		// 17. Write and test a method that takes an array of int and 
		//			returns the smallest number in the array
		System.out.println(getSmallestNum(pickledPeppers)); // againt we can pass an established array like we did from question 7
		getSmallestArray(array);
		// 18. Write and test a method that takes an array of double and 
		//			returns the average
		double[] doubles = {45.4, 37.87, 22.01, 68.96};
		System.out.println(groceryList(doubles));
		averageDouble(doubles);
		// 19. Write and test a method that takes an array of Strings and 
		//			returns an array of int where each element
		//			matches the length of the string at that position
		int[] nameLength = extractStringLength(name); // you have to assign it to a variable and our method is returning int[] in this case
			for (int numbers : nameLength) {
				System.out.println(numbers);
			}
			extractLength(name);
		// 20. Write and test a method that takes an array of strings and 
		//			returns true if the sum of letters for all strings with an even amount of letters
		//			is greater than the sum of those with an odd amount of letters.
			System.out.println(hasMoreEvenWords(name));
	
		// 21. Write and test a method that takes a string and 
		//			returns true if the string is a palindrome
			System.out.println(isPalindrome("is not"));
			System.out.println(isPalindrome("racecar"));
		 palindrome("Mom");
		
	}
	

	
	// Method 13:
	public static void greet(String name) {
		System.out.println("Hello," + name + "!");
	}


	// Method 14:
	public static String greet2(String name) {
		return "Hi," + name + "!";
	}
	
	// Method 15:
//	public static void stringLength(String word, int value ) {
//		if (word.length() < value) {
//			System.out.println(true);
//		} else {
//			System.out.println(false);
//		}
//	}
//	public static boolean stringLength2(String word, int value) {
//		if (value > word.length()) {
//			return "number length is bigger then value";
//		} else {
//			
//		}
//		return word;
//		failed attempts 
	public static boolean isStringLongerThanNumber(String string, int number) {
		if(string.length() > number) {
			return true;
		} else {
			return false;  // so close delly you over thought it a little bit also for this you dont need to have "else" part here to have it show its false
						   // you could also not have the if statement at all and just have "return" in place of if to still get ture or false
		}
	}
	public static void stringVsNumber(String x, int y) {
		System.out.println(x.length() > y);
	}
	// Method 16:
	public static boolean doesArrayContainString(String[] x, String y ) {
		for (String str : x) {
			if (str.equals(y)) {
				return true;

		}
	}
			return false;		// adding return false here fixes the issue of it not having a path way for each option
	}
	// Method 17:
//	public static int smallestInt(int a, int b, int c, int d, int e) {
//		for (int number : smallestInt) {
//			if (number)
//		}
//	}		attempt
	public static int getSmallestNum(int[] numbers) {	// we need someway to compare variables and and store the smallest number
		int smallest = numbers[0];	// setting to the first number in the array
		for(int number : numbers) {
			if (number < smallest) { // we are basically saying  "for each number in number in our numbers if the number is less then our smallest variable replace it"
				smallest = number;
			}
		}
		return smallest;
	}
	
	public static void getSmallestArray(int[] numbers) {
		int smallest = numbers[0];
		for (int number : numbers) {
			if (number < smallest) {
				smallest = number;
				//System.out.println(smallest); 	 you left your print line here be sure to move it to the right location
			}
		}
		System.out.println(smallest);
	}
	
	// Method 18:
	public static double groceryList(double[] items) {
		double average = 0;
		for (double amount : items) {
			average += amount; 
		}
		return average / items.length;
	}
	
	public static void averageDouble(double[] average) {
		double sum = 0;
		for (double number : average) {
			sum += number;
		}
		System.out.println(sum / average.length);
	}
//	System.out.println(average / items.length) you fool sysout doesnt go unless its a void
	
	// Method 19:
	public static int[] extractStringLength(String[] strings) {
		int[] results = new int[strings.length]; // our number will be equal to our string array we use
		for (int i = 0; i < strings.length; i++) {	// for loops are better here then an enhanced for loop because we need access to each elements index
			results[i] = strings[i].length();		// setting value using results
		}
		return results;
	}
	public static void extractLength(String[] strings) {
		int[] results = new int[strings.length];
		for (int i = 0; i < strings.length; i++) {
			results[i] = strings[i].length();
		}
		System.out.println(Arrays.toString(results)); // this is something chat gpt brought up when trying it yourself 
	}
	
	// Method 20:
//	public static boolean hasMoreEvenWords(String[] string) {
//		String[] results = new String[word.length];
//		for (int i = 0; i < word.length; i++) {
//			if (word.Length % 2 == 0) {
//				return true;
//			}
//		}
//		return false;
//	} my attempts
	public static boolean hasMoreEvenWords(String[] array) {
		int evenStrings = 0;
		int oddStrings = 0;
		
		for (String string : array) {
			if(string.length() % 2 == 0) {
//				evenStrings++;
//			} else 
//				oddStrings++;
//		}
//		if (evenStrings > oddStrings) {
//			return true;
//		}
//			return false;
//	} close to what you needed trying to attempt on your own but not quite. this results in counting the strings itself not the combined sum of the odds and evens
			evenStrings += string.length()	;
			} else {
				oddStrings += string.length() ;
			}
		}
		
		return evenStrings > oddStrings;
	}
	public static void hasLessOdds(String[] array) {
		int evenStrings = 0;
		int oddStrings = 0;
		for (String string : array) {
			if(string.length() % 2 == 0) {
				evenStrings += string.length();
			} else {
				oddStrings += string.length();
		}
	}
		System.out.println(evenStrings > oddStrings);
	}
	
	// Method 21: write a method that takes a string and return a boolean
	public static boolean isPalindrome(String string) {
	/* racecar
	 * mom
	 * wow
	 * gotta find a way to check if the values starting from the first and last equal each other
	 */
		for (int i = 0; i < string.length() / 2; i++) { // traditional for loop here is so its easier to keep track of our first and last element
			//// adding "/ 2" because we only want the code to go half way through so we know its a palindrome
			if(string.charAt(i) != string.charAt(string.length() - i -1)) { /* -1 after -i helps give last element
			* this translates to "If character value "_" (starts at 0) =/= the character value of the strings length - i (which takes 0 at first) - 1 "
			*/	return false;
			}
		}
		return true;
	}
	public static void palindrome(String string) {
		for (int i = 0; i < string.length() / 2; i++) {
			if(string.charAt(i) != string.charAt(string.length() - i - 1)) {
				System.out.println(false);
			}
		}
		System.out.println(true);
	}
}


