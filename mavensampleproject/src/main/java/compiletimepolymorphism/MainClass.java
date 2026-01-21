package compiletimepolymorphism;

public class MainClass {

	public static void main(String[] args) {
		MainClass obj=new MainClass();
		obj.display();
		obj.display(4,5);
		obj.display("Hello");

	}

	
	 public void display() {
		
		System.out.println("Compile time polymorphism");
	}
	
	
	public void display(int a,int b) {
		int sum=a+b;
		System.out.println(sum);
	}
	
	public void display(String s) {
		
		System.out.println("String is: "+s);
	}
}
