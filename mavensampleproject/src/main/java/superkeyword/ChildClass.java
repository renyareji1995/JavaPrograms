//refer the immediate parent class instance variable
package superkeyword;

public class ChildClass extends ParentClass{
	
	int x=20;
	public static void main(String[] args) {
		
		ChildClass obj=new ChildClass();
		obj.display();
		 

	}
	
	public void display() {
		
		System.out.println(x);   //childclass
		System.out.println(super.x);   //parentclass
	}

}
