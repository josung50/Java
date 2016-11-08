package quickcoding4;

public class testMain{
	
	public static BankAccount account = new BankAccount();
	
	public static void main(String []args) {
		
		Thread depositMan = new Thread() {
			
			public void run() {
				try {
					for(int i=0; i<10; i++) {
						account.add(10);
						Thread.sleep(500);
					}
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		};
		
		Thread withdrawMan = new Thread() {
			public void run() {
				try {
					for(int j=0; j<10; j++){
						account.delete(10);
						Thread.sleep(500);
					}
				
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		};
		
		depositMan.start();
		withdrawMan.start();
		
	}
}
