package Annotations;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)  
@Target({ElementType.TYPE,ElementType.METHOD}) 
public @interface MyAnnotation {
	String   Customer_id() default "";
    String    Customer_name();
    int       Customer_age();
    String[]  Hobbies();
}
@MyAnnotation(
	    Customer_id = "01",
	    Customer_name = "kayal",
	    Customer_age=22,
	    Hobbies = {"Dance", "Painting"}
	)

class Customer{ 
	
	@MyAnnotation(
		    Customer_id = "09",
		    Customer_name = "Priya",
		    Customer_age = 21,
		    Hobbies = {"Travelling", "Designing"}
		)
	public void Content()
	{
		System.out.println("This is the class method");
	}
}

