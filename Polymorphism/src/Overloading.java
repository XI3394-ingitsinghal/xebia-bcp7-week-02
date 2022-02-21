
public class Overloading {
	
	void identity(int age,String name) {
		System.out.println("Name: " + name);
		System.out.println("Age: " + age);
	}

	void identity(int age,String name, char gender) {
		System.out.println("Name: " + name);
		System.out.println("Age: " + age);
		System.out.println("Gender: " + gender);
	}
	
	public static void main(String args[]) {
		Overloading o = new Overloading();
		
		o.identity(22, "Ingit");
		o.identity(22, "Ingit", 'm');
	}
}
