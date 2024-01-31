package baseCode;

public class Test1 {

// added one line to the code for merging
	public class StringConcept {

		public static void main(String[] args) {
	        
			// String literal
			// String is an object that represents sequence of characters
			// String can be defined in two ways: 1. String Literal  2. new keyword
			// 1. String literal: It will not create new object, it will reffer existing if have multiple values with same name , exa below 
			
			//String s1 = "Welcome to the Selenium";
			String S5 = "Hello";
			
			// 2. new: It will create new object in memory, if have multiple values with same name , exa below 
			String s2 = new String("Welcome");
			String s3 = new String("Welcome");
			
			String s = "Welcome to the Selenium";
			String [] splittedString = s.split(" ");
			System.out.println(splittedString[0]);
			System.out.println(splittedString[1]);
			System.out.println(splittedString[2]);
			System.out.println(splittedString[3]);
			
			String s6 = "Welcome the Selenium";
			String [] splittedString1 = s6.split("the");
			System.out.println(splittedString1[0]);
			System.out.println(splittedString1[1]);
			System.out.println(splittedString1[2]);
			//System.out.println(splittedString1[3]);


		}

	}

}
