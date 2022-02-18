
public class Bank implements DepositManager,AtmManager{
	//java do not support multiple inheritance so we are using interface to inherit two parent classes
	@Override
	public void Withdraw() {
		
		System.out.println("Enter Withdraw ammout");
		
	}

	@Override
	public void deposit() {
	
		System.out.println("Enter Deposit Ammount");
		
	}

	public static void main(String args[]) {
		
		Bank b = new Bank();
		b.Withdraw();
		b.deposit();
	}
}
