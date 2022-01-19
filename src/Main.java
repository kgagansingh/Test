
public class Main {
	String name;
	public static void main(String[] args) {
		Thread t=new Thread(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				
			}
		});
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Main [name=").append(name).append("]");
		return builder.toString();
	}

	
}
