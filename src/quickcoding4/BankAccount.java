package quickcoding4;

public class BankAccount {
	private int balance = 100;
	
	public int getBalance() {
		return balance;
	}
	public synchronized void add(int money) {
		balance = balance + money;
		System.out.println("����: " + balance + " " + money + "��ŭ �Ա�");
	}
	public synchronized void delete(int money) {
		balance = balance - money;
		System.out.println("����: " + balance + " " + money + "��ŭ ���");
	}
}