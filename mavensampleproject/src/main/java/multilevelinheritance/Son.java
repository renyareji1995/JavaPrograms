package multilevelinheritance;

public class Son extends Father {

	public static void main(String[] args) {
		 Son obj=new Son();
		 
		 obj.display();
		 obj.show();
		 obj.print();

	}
	
	public void print() {
		
		System.out.println("Son");
	}

}
