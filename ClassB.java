/*
 *if we use packagename.* then all the classes and interface of this package  
 * will be accessible .
 * the import keyword is used to make the classes and interfaces of another package 
 * accessible to the current package  
 * 
 * if we import packagename.classname then only  declared the class of this package will be accessible
 * 3. If we use fully qualified name then only we can declare  the class of this package will be 
 * accessible.
 * here there is no need to import. but we have to use fully qualified name every time when  access the class or interface
 */
package mypackage2;//here created another package to show how the classes will run in different packages


import mypackage.*;    // here if we use this import packagename.* we can accessible all the classes in the the mypackage
import mypackage.ClassA;//or we can use mypackage.classname where we can accessible only the .classfile in this package 

public class ClassB { //created another main class as ClassB
	                   //classes are the basics of opps(object oriented programming)

	public static void main(String[] args) { 
		
		
		System.out.println("The properties of a rabbit is :");
		//system is used to return code
                //out is static member
            //Println is used to print text the property of rabbit is student and gives output 
		
		ClassA demo =new ClassA(); //here i have created the object for the ClassA here it shows the an error that to import package of classA
		System.out.println("here the classA methods have been called in the different package");//prints
		
		demo.eat();//here it displays the properties 
		demo.colour();//properties are eat,colour

	}

}