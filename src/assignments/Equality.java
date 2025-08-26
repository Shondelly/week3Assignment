package assignments;

public class Equality {

	public static <Student> void main(String[] args) {
		
		String a = new String("Hello");
		String b = new String("hello");
		
		System.out.println(a);
		System.out.println(b);
//		even though they look the same they arent equal		
		System.out.println(a == b);
//		But when using int you can see its true
////	you can use a method known as ".equals" to make them have the same value. this how you compare object data type values
////	if you wanna check they are hte same in memeor just use "=="		
		System.out.println("equals() method: " + a.equals(b));
		int x = 5;
		int y = 5;
		
		System.out.println(x);
		System.out.println(y);
		System.out.println(x == y);
/*		The difference is the primitive and object data types
 * 		"==" checks to see if data is the same in memory. with primitive it means it points to the same "value"
 * 		When you make a new object they arent considered the same in memory even if they are identical they dont hold the same value
 * 		
 */

		String c = new String("Hello");
		String d = c;
		
		System.out.println(c);
		System.out.println(d);
		System.out.println(c == d);
//		in this case the boolean is made true because there isnt a new instance being made so they both are considered the same value		
//		in a way its saying d is point to c which is pointing to "hello"
		String yeah = "whats good";
		System.out.println(yeah);
		String no = "nothing";
		System.out.println(no);
		String o = no;
		System.out.println(o);
		o = yeah;
		System.out.println(o);
		yeah = no;
		System.out.println(yeah);
		System.out.println(no == yeah);
		String k = "nothing";
		System.out.println(k == no);
		String t = new String ("nothing");
		System.out.println(t == k);
	}
/* With the declaration of a new Object, Java creates that object as its own instance in memory.  Even if two Objects are created with the same exact content, 
 * the Objects themselves will be created as two separate instances in memory.  The point here is that each instance has its own location in memory, and the 
 * location is not the same, even if the values within the fields are the same.
 * Let's look at our Grade Book Example above.   Imagine that we instantiate two students using the Student() Constructor as follows:
 */

//public static void Student
//		int[] grades = { 100, 100, 100 };
//		Student student1 = new Student("Molly Mack", grades);
//		Student student2 = new Student("Molly Mack", grades);
//		
///* 	Notice that the data is exactly the same, but we are creating two distinct Objects by using the new keyword.  So, if we run the following comparisons, 
// * the results will be reflect that the student1 Object is not the same as the student2 Object, because their locations in memory are distinct.   
// * These are Objects, not Primitive Datatypes.  The only one of the following examples that will be true is when we compare the student1.fullName to 
// * "Molly Mack" with the .equals() method.		
// */
//		
//		System.out.println("student1 vs. student2 Equality Example:");
//		System.out.println("---------------------------------------");
//		System.out.println("Is student1 == student2? " 
//		                    + (student1 == student2));
//		System.out.println("Is student1.equals(student2)? " 
//		                    + (student1.equals(student2)));
//		System.out.println("Is student1.equals(\"Molly Mack\")? " 
//		                    + (student1.equals("Molly Mack")));
//		System.out.println("Is student1.fullName.equals(\"Molly Mack\")? " 
//		                    + (student1.fullName.equals("Molly Mack")));
//
///*	Object Equality is fun to explore, and when you assign two variables to the same Object, it's fun to see what the result is.  
// * Let's declare a new variable student3 and initialize it with the  student2 Object as follows:
// */
//		Student student3 = student2;
//		System.out.println("student2 vs. student3 Equality Example:");
//		System.out.println("---------------------------------------");
//		System.out.println("Is student2 == student3? " 
//		                    + (student2 == student3));
//		System.out.println("Is student2.equals(student3)? " 
//		                    + (student2.equals(student3)));

	}


