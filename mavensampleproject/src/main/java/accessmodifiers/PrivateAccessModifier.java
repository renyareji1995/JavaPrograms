package accessmodifiers;

public class PrivateAccessModifier {

	public static void main(String[] args) {
		
		PrivateAccessModifier obj=new PrivateAccessModifier();
		obj.display();
	}
	
	private void display() {
		
		System.out.println("Private Access Modifier");
	}

}
