package question2;

public class SavingsAccount extends Account{
	private float interestRate; 
	
	
	public void display() {
		System.out.println("Savings Account: ");
		System.out.println(owner+" Balance: "+balance+" Number: "+number+"interestRate : "+interestRate);
	}	
//	@Override
//	public String toString() {
//		super.toString();
//		StringBuilder builder = new StringBuilder();
//		builder.append("SavingsAccount [interestRate=").append(interestRate).append("]");
//		return builder.toString();
//	}

	public SavingsAccount(float interestRate) {
		this.interestRate = interestRate;
	}
	
	public SavingsAccount(Owner ow, int bal, String num,float interestRate) {
		super(ow,bal,num);
		this.interestRate = interestRate;
	}
	

//	public String toString() {
//		StringBuilder builder = new StringBuilder();
//		builder.append("SavingsAccount [interestRate=").append(interestRate).append("]");
//		return builder.toString();
//	}
//	@Override
	public float getInterest() {
		float interest = getBalance()*interestRate;
		return interest;
	}
}

