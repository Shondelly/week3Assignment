package assignments;

public class Methods {

	public static void main(String[] args) {
// 		Methods allow you to reuse code by naming them so you can use it without having to write it out again.		
		String firstName = "Bruce";
		String lastName = "Banner";
		String fullName = createFullName(firstName, lastName);
		String fullName2 = createFullName("Skar", lastName);
		System.out.println(fullName);
////  if you remove the sysout and string fullName the code wont work. you gave it instructions but not a way to follow those instructions		
////  below is an example of how to reuse it by with the help of "fullName2". The "x" doesnt have value till it checks the code above it to assign one		
		System.out.println(fullName2);
	}
//  public status is an axis modifier we will learn more later	
// string is the return type of data we are using here. put drink or color here to replace it	
//  not all methods return something like "void" some of them just do something	instead of saying data type
// name of the method is a like a variable and you refer to it (make it a verb or action preferably
//	 "()" in methods can be blank or have something called parameters to help make the action or name of method
//   	examples of a vendingMchine (int money, String product) its like a parking spot for info
	public static String createFullName (String x, String y) {
		String fullName = x + " " + y;
//   return gives you the product or solution of your previous code or problem		
		return fullName;
	}
//   you can also jsut do "return x + " " y;" to get the same results		
//		
//		What is a method declaration?
//
//	modifier returnDatatype methodName (datatype1 par1, datatype2 par2) {
//	BodyOfMethod
//				}
//	Here, these parts of the method declaration are explained below:
//
//	modifier − modifier -- public, protected, default and private
//	returnDatatype − the return datatype (Can be a Java primitive datatype,  an Object, or a Collection of a datatype or an Object, or can be void).
//	methodName − name of the method
//	datatype1, datatype2 - datatypes of the parameters 
//	par1, par2 − formal parameters
//	datatype1 par1, datatype2 par2 − list of parameters (Can be as many as you need, separated by commas)
//	BodyofMethod —> this is where you put your code… anything that you want to accomplish in that particular method.  All Java code, and will include variable declarations, method calls, etc.
		
		
		//Let's define a method here:

		public static void sumTwoNumsPrintResult (int number1, int number2) {

		int sum = 0;

		sum = number1 + number2;

		System.out.println("The sum is:" + sum);

		// No return statement, because the returnType is void!

		}
//      What if we want to return the result?		
		public static int sumTwoNumsReturnResult (int number1, int number2) {

			int sum = 0;

			sum = number1 + number2;

			return sum;

			}
		
//		Let's call these two functions:

		public class ExampleJavaMethodClass {

		public static void main(String[] arg) {

		//Variable Declarations — visible in Main ONLY!

		int firstNumber = 3;

		int secondNumber = 7;

		//Call to first Method — passing variables into this Method as Parameters!

		sumTwoNumsPrintResult(firstNumber,secondNumber);

		//Additional Variable Declarations — visible in Main ONLY!

		int result = 0;

		//Call to second Method

		result = sumTwoNumsReturnResult(firstNumber,secondNumber);

		System.out.println("The sum is: " + result);

		}  // End of main()

		}
		
		
//		MORE METHODS
		
	
}
