package singleinheritance;

public class ChildClass extends ParentClass {

	public static void main(String[] args) {
		
		ChildClass obj=new ChildClass();
		obj.sample();
		obj.display();

	}
public void sample() {
	
	System.out.println("Child class");
}
}
