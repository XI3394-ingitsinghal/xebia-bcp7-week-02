
public class Whatsapp implements VideoCallManager,ChatManager{


	@Override
	public void chat() {
		System.out.println("WhatsApp: Enter Chat Message");
		
	}

	@Override
	public void videocall() {
		System.out.println("WHo do you want to call");
		
	}

}
