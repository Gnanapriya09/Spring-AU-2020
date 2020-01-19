package Annotations;

import java.lang.reflect.Method;

public class CustomerAnnotation {
	  
	public static void main(String args[])throws Exception{  
		
		MyAnnotation annotation = Customer.class.getAnnotation(MyAnnotation.class);
		
		Customer h1=new Customer();
		Method m1=h1.getClass().getMethod("Content");
		MyAnnotation methodannotation = m1.getAnnotation(MyAnnotation.class);
		System.out.println("Annotations in class");
	    System.out.println("Customer Name: " + annotation.Customer_name());
	    System.out.println("Customer ID: " + annotation.Customer_id());
	    System.out.println("Customer Age: "+ annotation.Customer_age());
	    System.out.print("Customer Hobbies:  ");
	    
	    for (int i = 0; i < annotation.Hobbies().length; i++) {
	    	System.out.print(" "+annotation.Hobbies()[i]);
	    	}
	    
	    System.out.println("\n\nAnnotations in methods");
	    System.out.println("Customer Name: " + methodannotation.Customer_name());
	    System.out.println("Customer ID: " + methodannotation.Customer_id());
	    System.out.println("Customer Age: "+ methodannotation.Customer_age());
	    System.out.print("Customer Hobbies:  ");
	    
	    for (int i = 0; i < methodannotation.Hobbies().length; i++) {
	    	System.out.print(" "+methodannotation.Hobbies()[i]);
	    	}
		
	}
}
