package assignments;

import java.util.Scanner;

public class ObjectsandJavaDocs {

	public static void main(String[] args) {
/*	Primitive data types = int, double, boolean, float, etc. and java always make primitive lower case
 * object data types = string and array	and java make objects uppercase 
 * primitive data types 	are just a piece of data type and nothing more
 * example: int age = 34; is primitive has age is a value of 34 assigned to it
 * Strings are different because it is a value given property and methods which is why its an object
 *
 */ 
		int feet = 37;
		String name = "Gold and Joe";
//		an object has methods already on we can use. using something like .length
//		anything with "()" is a method and .lenght() will return int in the string	
		System.out.println(name.length());
///		charAt command example to show what character is in what slot or holds what value 
///		remember it starts at 0 so always put value -1
		System.out.println(name.charAt(6));
//		if we add an array to a primitive data type it becomes an object but the number inside is the "[]" is primtivie however 		
		
		Scanner s = new Scanner(System.in);
//		use "new" when making an object or an instance of one. (except String but you could do a "new String")
//		example: String phoneNumber = new String("7205607156");" and give it a litteral but its not memory effcient its just a way to do it. try to use "new"
//		primitve data only needs the value		
		
		int[] numbers = new int[3];
//		on arrays .length becomes a property rather then a method and you dont need "()" to access it. but if you need to call it it needs the parentheses 
//		
		System.out.println(numbers.length);
	}
/*	when making Objects you can define them as you need. In the Array section we needed a "Student" Object so we declared a class anmed Student.
 *  Student has 2 fields: "fullName" and "grades"a Constructor named Student() and a method named  described().
 *  
 *  Additonally student is a Class. Class is a template for objects to be created and is made an instance for that class.
 *  insantiate when describing the creation of object from a class
 *  
 *  Student Class Declaration.
 */

	public class Student {
		String fullName = "";
		int[] grades;

		public Student(String fName,int[] grades) {
		this.fullName = fName;
		this.grades = grades;
		}

		public void describe() {
		System.out.println("Student: " + this.fullName);
		System.out.println("Grades:");
		for (int grade : this.grades) {
		System.out.println("\t" + grade + " ");
		}
		System.out.println();
		}
		
		public class GradeBook {
			public void main(String[] args) {
			String fullName = "";
			String lineVariable = "---------------------------";
			Scanner sc = new Scanner(System.in);

			System.out.println("Grade Book Example");
			System.out.println("Name of Course:");
			String courseName = sc.nextLine();
			System.out.println("How many students are in this class:");
			int numOfStudents = sc.nextInt();
			Student[] programmingStudents = new Student[numOfStudents];
			System.out.println("How many grades do you have per student?");
			int numOfGrades = sc.nextInt();
			sc.nextLine();

			for (int i = 0; i < programmingStudents.length; i++) {
			int[] grades = new int[numOfGrades];
			System.out.print("Enter Student's Full Name: ");
			fullName = sc.nextLine();
			for (int j = 0; j < grades.length; j++) {
			System.out.print("Enter a grade: ");
			grades[j] = sc.nextInt();
			}
			programmingStudents[i] = new Student(fullName, grades);
			sc.nextLine();
			}

			System.out.println("\n\n"+lineVariable+"\n " 
			       + courseName + " Grade Book \n"+lineVariable); 
			for (Student student : programmingStudents) { 
			student.describe(); 
			    } 
			System.out.println(lineVariable+"\n");
			sc.close();
			}
			}

}
}