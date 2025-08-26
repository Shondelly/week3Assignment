package assignments;

import java.util.Scanner;

public class Java3MethodsPart1 {

		/* QUESTION 1:returnSum Method
			*Create a static method named returnSum that accepts 3 int variables named num1, num2, and num3
			*The method should return the sum of the three variables
		*/
		// WRITE YOUR CODE HERE
		public static int returnSum(int num1, int num2, int num3) {
		    int sum = num1 + num2 + num3;
		    return sum;
		    //	Instructor method "static int returnSum(int num1, int num2, int num3) {
			//return num1 + num2 + num3;"
	   // }
		}



		/***** DO NOT CHANGE THE CODE BELOW THIS LINE *****/
//			public static void main1(String[] args) {
//				Scanner in = new Scanner(System.in);
//				int num1, num2, num3;
//				num1 = in.nextInt();
//				num2 = in.nextInt();
//				num3 = in.nextInt();
//				System.out.println(returnSum(num1, num2, num3));
//	}
//			
//			public class Person {
//			    public static void greet() {
//			        System.out.println("Hi!");
//			    }
//			}
//
//			// Usage:
//			Person.greet();
		static String repeatWord(String userWord, int numTimes) {
			
		    // WRITE YOUR CODE HERE
			String result = "";
			for (int i = 0; i < numTimes; i++) {
				result += userWord;
			}
			return result;
//			String newString = "";
//			for (int i = 0; i < numTimes; i++) {
//			    newString += userWord;
//			}
//			return newString;
//		instructor results





	/***** DO NOT CHANGE THE CODE BELOW THIS LINE *****/ 
		}
		
//		public static void main(String[] args) {
//			Scanner in = new Scanner(System.in);
//			int numTimes;
//			String userWord;
//			userWord = in.nextLine();
//			numTimes = in.nextInt();
//			System.out.println(repeatWord(userWord,numTimes));
//		}
		
		static void fizzBuzz(int num1) {
		    
		    // WRITE YOUR CODE HERE
			if (num1 % 3 == 0 && num1 % 5 == 0) {
				System.out.println("FizzBuzz");
			} else if (num1 % 3 == 0) {
				System.out.println("Fizz");
			} else if (num1 % 5 == 0) {
				System.out.println("Buzz");
			} else 
				System.out.println("Hello worls!");



			
			
	/***** DO NOT CHANGE THE CODE BELOW THIS LINE *****/
		}
//	    
//		public static void main(String[] args) {
//			Scanner in = new Scanner(System.in);
//			int num1;
//			num1 = in.nextInt();
//			fizzBuzz(num1);
//		}
		
		static int sumOfDigits(int digits) {
		    
		    // WRITE YOUR CODE HERE
			int sum = 0; 
			while (digits > 0) { 
				int lastDigit = digits % 10; // this takes our last digit off and add it tot the sum since % gives us our remainder
				sum += lastDigit;
				digits = digits / 10; // this removes our last digit entirely and makes the loop start again until our digits are 0
			}

			return sum;





			
	/***** DO NOT CHANGE THE CODE BELOW THIS LINE *****/
		}
//
//		public static void main(String[] args) {
//			Scanner in = new Scanner(System.in);
//			int digits = in.nextInt();
//			int sumAll = sumOfDigits(digits);
//			System.out.println("The sum of all digits for the value " + digits + " is " + sumAll + ".");
//		}
		
		static boolean passwordChecker(String password) {
			
			// WRITE YOUR CODE HERE
	    if (password.length() > 7) {
	        for (int i = 0; i < password.length() ; i++) {
	            char current = password.charAt(i);
	            if (current == '!' || current == '$'|| current == '%' || current == '&')
	            return true;
	        }
	    } else
	    return false;
		return false;

//		if (password.length() >= 8 && 
//			    (password.contains("!") ||
//			     password.contains("$") ||
//			     password.contains("%") || 
//			     password.contains("&"))) {
//			         return true;
//			     }
//			return false;		instructors version





			
	/***** DO NOT CHANGE THE CODE BELOW THIS LINE *****/
		}

//		public static void main(String[] args) {
//			Scanner in = new Scanner(System.in);
//			String password = in.nextLine();
//	        boolean meetsRequirement = passwordChecker(password);
//			if (meetsRequirement) {
//			    System.out.println(password + " meets the requirements.");
//			} else {
//			    System.out.println(password + " does not meet the requirements.");
//			}
//		}
		
		static int avgNameLength(String[] names) {
			
			// WRITE YOUR CODE HERE
	    int sum = 0;
	    
	    for (int i = 0; i < names.length; i++) { // remember [] are for arrays only right here we just need to keep track of the array of names
	        sum += names[i].length();		// this where youd put the [] since we are we need to know what array iteration we are on
	    }
			return sum / names.length;
			
	/***** DO NOT CHANGE THE CODE BELOW THIS LINE *****/
		}

//		public static void main(String[] args) {
//			Scanner in = new Scanner(System.in);
//			String[] names;
//			names = new String[5];
//			names[0] = in.nextLine();
//			names[1] = in.nextLine();
//			names[2] = in.nextLine();
//			names[3] = in.nextLine();
//			names[4] = in.nextLine();
//			
//			int avgLength = avgNameLength(names);
//			System.out.println("The average name length is " + avgLength + ".");
//		}
		
		public static int rectanglePerimeter (int length, int width) {
		int area = length * width;
		return area;
		}
		
		
		

/***** DO NOT CHANGE THE CODE BELOW THIS LINE *****/
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
	    int length = in.nextInt();
		int width = in.nextInt();
		int perimeter = rectanglePerimeter(length, width);
		System.out.println("The rectangle has a perimeter of " + perimeter + ".");
	}
}
