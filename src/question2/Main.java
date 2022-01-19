package question2;
public class Main{
	public static void main(String[] args) {
		Date d=new Date(15,12,2022);
		Owner ow=new Owner("gagan",d,"1234");
		SavingsAccount ac1=new SavingsAccount(ow,1500,"0341000", 5);
		ac1.display();
		CurrentAccount ac2=new CurrentAccount(ow,1550,"01234567",50000);
		CurrentAccount.updateCharges(200);
		ac2.display();
		
	}
}