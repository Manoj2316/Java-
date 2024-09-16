import java.util.Scanner.*; 
interface Shape 
{ 
 	void input();  	void area(); 
} 
 
class Circle implements Shape 
{ 
 	int r; 
 	double pi=3.14, ar=0;  	public void input() 
 	{  	 	r=5; 
 	} 
 	public void area() 
 	{ 
 	 	ar = pi*r*r; 
 	 	System.out.println("Area of circle:"+ar); 
 	} 
}
class Rectangle extends Circle 
{ 
 	int p, b; 
 	double ar;  	public void input() 
 	{ 
 	 	super.input(); 
 	 	p=6;  	 	b=4; 
 	} 
 	public void area() 
 	{ 
 	 	super.area(); 
 	 	ar = p*b; 
 	 	System.out.println("Area of rectangle:"+ar); 
 	} 
} 
 
public class Demo 
{ 
 	public static void main(String[] args) 
 	{ 
 	 	Rectangle obj = new Rectangle();  	 	obj.input(); 
 	 	obj.area(); 
 	} 
} 
 
