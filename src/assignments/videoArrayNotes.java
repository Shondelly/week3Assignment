package assignments;

public class videoArrayNotes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String studentName1 = "Tom Sawyer";
		String studentName2 = "Jessie Greenmen";
		String studentName3 = "Joe Jackson";
		
//		System.out.println(studentName1);
//		System.out.println(studentName2);
//		System.out.println(studentName3);
// array example "array has types and is object associated and the [] at the end shows the number of elements count starting from 0
		String[] students = new String[3];
		
		students[0] = "Tom Sawyer";
		students[1] = "Jessie Greenmen";
		students[2] = "Joe Jackson";
		
//		System.out.println(students[0]);
//		System.out.println(students[1]);
//		System.out.println(students[2]);
//		
// Lines appear longer when used like this but 	you can loop this instead of typing out each line	
// .length command will read out the length you assign to the string		
		for(int i = 0; i  < students.length; i++) {
// Putting just 0,1, or 2 over "i" in the below line will only print that element and not all of them so use an int less then the length of "3" in this case
// when i++ keeps getting added the i below will change as it goes vz it staying the same
			System.out.println(students[i]);
		}
		System.out.println("Enhanced for Loop: ");
// another way to print out every element in an array called an "enhanced for loop"
// the code below reads " for each student in students" where the student string goes up as the students array length goes		
		for (String student : students) {

			System.out.println(student);
	}
//		
//		String firstName = "Mary";
//		String lastName = "Brown";
//		int assignmentOne = 100;
//		int assignmentTwo = 79;
//		int assignmentThree = 80;
//		int assignmentFour = 90;
//		int assignmentFive = 100;
//
//		System.out.println("Student: " + firstName + " " + lastName);
//		System.out.println("Grades:");
//		System.out.println("1: " + assignmentOne);
//		System.out.println("2: " + assignmentTwo);
//		System.out.println("3: " + assignmentThree);
//		System.out.println("4: " + assignmentFour);
//		System.out.println("5: " + assignmentFive);
	
//		
//		How do we declare an array?  Arrays can be declared a number of ways, but each declaration has the same components:  
//			(1) a datatype 
//			(2) Square brackets or [] 
//			(3) a name. 
//
//			Notice that the following three examples are very similar, with the third example actually setting the values within 
//		the array in the declaration.  All three declare an array named gradesArray, all three tell Java that we are creating 
//		an array of type int (e.g. int []), and all three tell Java to create enough space for 5 elements.

//			int[] gradesArray = new int[5]; 
//			int[] gradesArray;
//			gradesArray = new int[5];
//			int[] gradesArray = {100, 79, 80, 90, 100};
//
//			Let's simplify the Grade Book Example now by using an array, and a for loop to print the grades:

		{	String fullName = "Mary" + " " + "Brown"; 
			int[] gradesArray = {100, 79, 80, 90, 100};

			System.out.println("Student: " + fullName);
			System.out.println("Grades: ");
			for (int i = 0; i < 5; i++) {
			System.out.println((i+1) + ": " + gradesArray[i]);
			}
		}
//			Check out this rewrite of our Grade Book code, using an enhanced for loop to print the grades:

			String fullName = "Mary" + " " + "Brown"; 
			int[] gradesArray = {100, 79, 80, 90, 100};
			int counter = 1;

			System.out.println("Student: " + fullName);
			System.out.println("Grades: ");
			for (int grade : gradesArray) {
			System.out.println((counter++) + ": " + grade);
			}
			
			
			
// next video
			
			
			String[] products = new String[5];
			
				products[0] = "Mixed Veggies";
				products[1] = "Onyo";
				products[2] = "Juice";
				products[3] = "Chicken";
				products[4] = "Rice";
				
			for (String product : products) {
				System.out.println("Product: " + product);
			}
			
			int[] multiplesOf3 = new int[10];
			
			for (int i = 1; i <= multiplesOf3.length; i++) {
//			System.out.println(i * 3);} (this is how i got my answer
// 			the videos answer
			multiplesOf3[i - 1] = i * 3;
			System.out.println("number: " + multiplesOf3[i - 1]);
			}
//			another for loop example
			int[] multiplesOf5 = new int[10];
			
			for (int i = 0; i < multiplesOf5.length; i++) {
				multiplesOf5[i] = (i + 1) * 5;
				System.out.println(multiplesOf5[i]);
			}
			

	}

}
