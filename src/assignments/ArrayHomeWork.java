package assignments;

public class ArrayHomeWork {

//	Using the given Array of 5 integers named numbers and the given variable sum, print out the sum of all the elements in the Array.
//	Write a for loop that will iterate over the numbers Array and add each element of the Array to sum
//	Use System.out.println() to print the value of sum to the console
	
	public static void main(String[] args) {

        int[] numbers = {2, 4, 6, 8, 10};
        int sum = 0;
    /***** DO NOT CHANGE THE CODE ABOVE THIS LINE *****/

        // WRITE YOUR CODE HERE 
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        System.out.println(sum);


       
    }
	
	static void addX(int[] arr, int x) {
		System.out.println("**Original**"); // Keep this print statement
    /***** DO NOT CHANGE THE CODE ABOVE THIS LINE *****/

        // WRITE YOUR CODE HERE FOR PART 1
    for (int i = 0; i < arr.length; i++) {
        System.out.println(arr[i]);
    }



    
    /***** DO NOT CHANGE THE CODE BELOW THIS LINE *****/ 	
		System.out.println("**New Array**"); // Keep this print statement
    /***** DO NOT CHANGE THE CODE ABOVE THIS LINE *****/

        // WRITE YOUR CODE HERE FOR PART 2 
           for (int i = 0; i < arr.length; i++) {
         System.out.println(arr[i] += x);
           }
           
//       	for ( int i = 0; i < arr.length; i++ ) {
//		    System.out.println(arr[i]);
//		    arr[i] += x;
//		}
//
//    /***** DO NOT CHANGE THE CODE BELOW THIS LINE *****/ 	
//		System.out.println("**New Array**"); // Keep this print statement
//    /***** DO NOT CHANGE THE CODE ABOVE THIS LINE *****/
//
//        // WRITE YOUR CODE HERE FOR PART 2 
//
//		for ( int j = 0; j < arr.length; j++ ) {
//		    System.out.println(arr[j]);
//		}			instructor version his is updated before printing a second timevs mines updating and printing at the same time



    /***** DO NOT CHANGE THE CODE BELOW THIS LINE *****/ 
	}
//	public static void main(String[] args) {
//		Scanner in = new Scanner(System.in);
//		int x;
//		int[] arr = { 5, 10, 44, -4, 10 };
//		x = in.nextInt();
//		addX(arr, x);
	
	

//Given an Array of int named arr, replace the first and last value stored in the Array.
//Use the given integer values a and b provided by the user to replace the first and last elements, respectively
//Loop through the Array and print each element in the Array to the console
	
	static void changeTwo(int a, int b, int[] arr) {
/****** DO NOT CHANGE THE CODE ABOVE THIS LINE ******/

        // WRITE YOUR CODE HERE
        
        arr[0] = a;
        arr[arr.length - 1] = b;
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
         
         
         
         
         
         
        
/****** DO NOT CHANGE THE CODE BELOW THIS LINE ******/ 	
	}

//	public static void main(String[] args) {
//		Scanner in = new Scanner(System.in);
//		int a,b;
//		a = in.nextInt();
//		b = in.nextInt();
//		int[] arr = { 3, 7, 0, 4, -6, 10, 55 };
//		changeTwo(a, b, arr);
//	}
	
//	Given the variable userWord, create a new Array that is made up of the characters of the word stored in the variable.
//	Initialize a new Array, name it whatever you want
//	Make sure to use the correct Java data type for this new Array (data type char)
//	Add each letter of userWord to the Array as elements
//	Once you have populated the Array, print to the console each element of the Array
	
	static void charArray(String userWord) {
	    /***** DO NOT CHANGE THE CODE ABOVE THIS LINE *****/

	        // WRITE YOUR CODE HERE FOR
	         for (int i = 0; i < userWord.length(); i++) {
	             System.out.println(userWord.charAt(i));
	         }
		
//	         char[] arr = new char[userWord.length()];
//	 		for ( int i = 0; i < userWord.length(); i++ ) {
//	 		    arr[i] = userWord.charAt(i);
//	 		}
//	 		
//	 		for ( int j = 0; j < arr.length; j++ ) {
//	 		    System.out.println(arr[j]);
//	 		} instructors code
			





	    /***** DO NOT CHANGE THE CODE BELOW THIS LINE *****/ 	
		}
//		public static void main(String[] args) {
//			Scanner in = new Scanner(System.in);
//			String word;
//			word = in.nextLine();
//			charArray(word);
//		}
	
//	In the static method wordToArray take the value of userWord and turn it into an Array of char taking each letter in userWord and storing it into that Array.
//	Name your new Array variable charArray
//	return the Array variable in the method body
	
//	static char[] wordToArray(String userWord) {
//	    /***** DO NOT CHANGE THE CODE ABOVE THIS LINE *****/
//
//	        // WRITE YOUR CODE HERE "My code which is incorrect"
//	        char[] charArray = new char [userWord.length()];
//	        
//	        for (int i = 0; i < userWord.length(); i++) {
//	            charArray[i] = userWord.charAt(i);
//	        }
//		  
//		  for (int j = 0; j < charArray.length; j++) {  this entire code part was needed the value of userWord was already stored in i
//		      System.out.println(charArray[j]);    print line wasnt needed as it was a return type not a void
//		  }
//		  return charArray;
//
//	         
//	    /***** DO NOT CHANGE THE CODE BELOW THIS LINE *****/ 	 
//		}
//
//		 public static void main(String[] args) {
//			Scanner in = new Scanner(System.in);
//			String userWord;;
//			userWord = in.nextLine();
//			System.out.println("Your array is: ");
//			System.out.println(Arrays.toString(wordToArray(userWord)));
//		}
//	}
	
	static char[] wordToArray(String userWord) { // instructors code
	    /***** DO NOT CHANGE THE CODE ABOVE THIS LINE *****/

	        // WRITE YOUR CODE HERE
		    char[] charArray = new char[userWord.length()];
			for (int i = 0; i < userWord.length(); i++) {
			    charArray[i] = userWord.charAt(i);
			}
			
			return charArray;
//
//	    /***** DO NOT CHANGE THE CODE BELOW THIS LINE *****/ 	 
		}
//
//		 public static void main(String[] args) {
//			Scanner in = new Scanner(System.in);
//			String userWord;;
//			userWord = in.nextLine();
//			System.out.println("Your array is: ");
//			System.out.println(Arrays.toString(wordToArray(userWord))); 
//		}
	
//		BUILD AND RETURN AN ARRAY
	
//	In the method buildArray you will take the int value stored in the given variable num and declare an Array of that size called numArray.
//	Write a for loop that starts with a loop variable or index of zero (0) and checks to see if the loop variable is less than num.
//	To fill the Array, you will insert the value of that loop variable to one of the slots in numArray indexed by the loop variable
//	return the variable numArray after the for loop finishes
	
//		"MY CODE"	
//	static int[] buildArray(int num) {
//	    
//	    // WRITE YOUR CODE HERE
//	    int[] numArray = new int [buildArray.length()]; using the method name instead of the num assigned to the int
//			for (int i = 0; i < num.length; i++) { num.length isnt needed num isnt an array its sa stored value from user input
//	        if (i < num) {		repeating a statment the for loop already has
//	            numArray[i] = buildArray[i]; againt grabbing the method instead of just using a stored variable
//	        }
//			}
//			return numArray;
//
//
//
//
//
//	/****** DO NOT CHANGE THE CODE BELOW THIS LINE ******/
//		}
//		public static void main(String[] args) {
//			Scanner in = new Scanner(System.in);
//			int num;
//			num = in.nextInt();
//			System.out.println("Your array is: ");
//			System.out.println(Arrays.toString(buildArray(num)));
//		}
//	INSTRUCTORS CODE	
	static int[] buildArray(int num) {

	    // WRITE YOUR CODE HERE
			int[] numArray = new int[num];
			for ( int i = 0; i < num; i++ ) {
			    numArray[i] = i;
			}
			return numArray;


	/****** DO NOT CHANGE THE CODE BELOW THIS LINE ******/
		}
//		public static void main(String[] args) {
//			Scanner in = new Scanner(System.in);
//			int num;
//			num = in.nextInt();
//			System.out.println("Your array is: ");
//			System.out.println(Arrays.toString(buildArray(num)));
//		}

//		CREATE AN ARRAY OF INT
	
//	In the method createInt create an Array
//	Use the 6 variables that are passed in as num1, num2, num3, num4, num5, and num6 to create the Array
//	The Array of int should be called arrayInt
//	Make sure to return the last item in arrayInt	
	
	// MY CODE 
	
//	static int createInt(int num1, int num2, int num3, int num4, int num5, int num6) {
///****** DO NOT CHANGE THE CODE ABOVE THIS LINE ******/
//
//        // WRITE YOUR CODE HERE
//	    int[] arrayInt = new int [createInt]; right idea but you could have just listed them out
//	    for (int i = 0; i < createInt.length[i - 1]; i++) { uneeded and incorrect
//	        arrayInt[i] = createInt[i]; uneeded and incorrect
//	    }
//	        return arrayInt;
//	
//        
///****** DO NOT CHANGE THE CODE BELOW THIS LINE ******/
//	}
//	public static void main(String[] args) {
//		Scanner in = new Scanner(System.in);
//		int num1, num2, num3, num4, num5, num6; 
//		num1 = in.nextInt();
//		num2 = in.nextInt();
//		num3 = in.nextInt();
//		num4 = in.nextInt();
//		num5 = in.nextInt();
//		num6 = in.nextInt();
//		int returnedInt = createInt(num1, num2, num3, num4, num5, num6);
//		System.out.println("The last number of the array is " + returnedInt + ".");
//	}

// INSTRUCTORS CODE
	static int createInt(int num1, int num2, int num3, int num4, int num5, int num6) {
	    /***** DO NOT CHANGE THE CODE ABOVE THIS LINE *****/

	        // WRITE YOUR CODE HERE
			int[] arrayInt = {num1, num2, num3, num4, num5, num6};
			
			return arrayInt[arrayInt.length - 1]; // your often over complicating it sometimes take a simplier approach
	        
	    /***** DO NOT CHANGE THE CODE BELOW THIS LINE *****/
		}
	
//	BUILD A NEW ARRAY
	
//	Given an Array of words named arr and variables word1, word2, and word3 do the following:
//		Create a new Array called newArr that has word1, word2, and word3 as it's elements
//		Create another Array that is big enough to hold all of the words from the original Array arr, as well as the three new words. You can name this Array to your liking.
//		Write a loop to get the words from the original Array arr and put them into your new Array
//		Add the words from newArr into the new Array also
//		Finally, loop through your new Array and print each element to the console
//		An idea to get more practice with Arrays: You could create an Array for the three new words, and then loop through two Arrays to create your new Array.
}

