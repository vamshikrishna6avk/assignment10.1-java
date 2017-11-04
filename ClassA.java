/*
 * there three ways we can access the package from another package
 * import packagename.*;
 * import packagename.classname;
 * fully qualified name.
 * 
 */

//here we are showing how the packages are useful and accessible of package
package mypackage; //here i have taken a package name as mypackage

public class ClassA { //created  class as classA
	                   //classes are the basics of opps(object oriented programming)
     
		public void eat(){ 
			//Here public is a access modifier which defines who can access this method
			//void to set to define returntype of method
			//given two methods and declared them that where dog a some properties like eat and colour
			
			System.out.println("rabbit eats carrot");
			//system is used to return code
            //out is static member
            //Println is used to print text rabbit eats carrot and gives output
			
			}  

		public void colour(){//Here public is a access modifier which defines who can access this method
			//void is sed to define return type of method and void as no return type or value
			
			System.out.println("rabbit is in white colour");//prints
			
	}

}
