package runtimepolymorphism;

public class ChildClass  extends ParentClass{

	public static void main(String[] args) {
		
		ChildClass obj=new ChildClass();
		obj.show();
		
		//Upcasting 
		ParentClass p=new ChildClass();
		p.show();
		
	}

	
	public void show() {
		
		System.out.println("Child class method");
	}
}
