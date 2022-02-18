
public class Facebook implements PostManager,ChatManager,VideoCallManager{

	
	@Override
	public void videocall() {
		System.out.println("Whom do want to call");
		
	}

	@Override
	public void chat() {
		System.out.println("Enter chat messgae");
		
	}

	@Override
	public void post() {
		System.out.println("Enter which type of post");
		
	}

}
