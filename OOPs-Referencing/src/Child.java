
public class Child extends Super {
	
	Child(){
		
		super();
		super.display();
	System.out.println("My gender is: " +super.gender);

}
	
	public static void main(String args[]) {
		Child o = new Child();
	}
}