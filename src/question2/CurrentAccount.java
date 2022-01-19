package question2;

public class CurrentAccount extends Account{
	public static int charges=110;
	private float minimumBalance;
	
	public CurrentAccount(Owner ow, int bal, String num,float minimumBalance) {
		super(ow,bal,num);
		this.minimumBalance = minimumBalance;
	}
	
	public void display() {
		System.out.println("Current Account: ");
		System.out.println(owner+" Balance: "+balance+" Number: "+number+" minimumBalance: "+minimumBalance+" Charges: "+charges);
	}

	public float getCharges() {
		return charges;
	}
	public static  void updateCharges(int x) {
		charges=x;
	}

//	@Override
//	public String toString() {
//		StringBuilder builder = new StringBuilder();
//		builder.append("CurrentAccount [minimumBalance=").append(minimumBalance).append("]");
//		return builder.toString();
//	}
	
	
}
