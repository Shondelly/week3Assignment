package assignments;

public class MoreMethods {

	public static void main(String[] args) {
//// Example 1: adding in a way to invoke or pass instructions		
		int[] myArray = new int[3];
		myArray[0] = 7;
		myArray [1] = 10;
		myArray[2] = 8;
//// after declaring an array with myArray we can now invoke our previous code
		int sum = sumArray(myArray);
//// ^ dont forget to assign it a data type and and the name of the return type data and then print it out below
		System.out.println(sum);
//// if your only using it once you can Sysout(sumArray(myArray)) to still get the print.		
	
////		the bottom is an example that you cant pass a int Array into a string one you have to give it what it ask for
////		String[] strings = new String[1];
////		strings[0] = "test";	
////		sumArray(strings);
		
//// Example 2 adding a way to invoke the Double
		double [] grades = new double[5];
		grades[0] =100;
		grades[1] =88.7;
		grades[2] =95.8;
		grades[3] =77.9;
		grades[4] =84.2;
		
		System.out.println(calculateAverage(grades));
//// Example 3 invoke		
		System.out.println(multiplyString("null ",  4));
	}
	
//		Example 1: Takes an array of ints and returns the sum of all ints
	public static int sumArray(int[] numbers) {
// 		we need to find a way to declare the array. we do that by using "sum" for example
//		we still have to find a place to stop the array count so we dont exceed so find each element.
		int sum = 0;
// since we know we are going to add them we can use an enhanced for loop to help.		
		for (int number : numbers) {
			sum += number;
		}
		return sum;
//		running the code like this wont get you anything all of this is instructions so pass something into it.		
	}
	
// 	Example 2: Takes an array of double and return the average of all elements in the array
// *remember that all of these questions you see here youll have to deduce on your own by simplifying them to these in irl situations
	public static double calculateAverage(double[] numbers) {
		double sum = 0;
		for (double number : numbers) {
			sum += number;
			
		}
// 		this code wont work unless you invoke it.
		return sum / numbers.length;
		}
	
/*		Example 3: Take a String and an int and return the String concatenated with itself
 * 		int number of times (printouy your string as many times as the int)
 */
		public static String multiplyString(String str, int num) {
			String result = "";
//			you cant use an enhanced for loop "for(int etc. : etcs.)" because there is no array to iterate over	
//			you"ll know how many times you want to iterate based on the int "num" so using "i < num" is how we can iterate it		
			for (int i = 0; i < num; i++) {
				result += str;
			}
			return result;
		}
	}

