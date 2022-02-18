
public class SocialMedia {
	
	int Number;  String appname;

	SocialMedia(){
		System.out.print("Which Social Media App you want to use");
	}
	
	SocialMedia(int n,String app){
	      Number=n;
	      appname=app;
	}
	
	void display(){System.out.println(Number+" "+appname);}  
	public static void main(String[] args) {
		
		SocialMedia social = new SocialMedia(); //calling default constructor
		SocialMedia social1 = new SocialMedia(1,"Whatsapp");
		SocialMedia social2 = new SocialMedia(2,"Facebook");
		SocialMedia social3 = new SocialMedia(3,"Instagram");
		social1.display();
		social2.display();
		social3.display();
		
		
		Twitter t = new Twitter();    // abstract class
		t.tweet();
		
		//interface implementation
		Whatsapp w = new Whatsapp();
		w.chat();
		Facebook f = new Facebook();
		f.videocall();
		Instagram i = new Instagram();
		i.post();
		

	}

}
