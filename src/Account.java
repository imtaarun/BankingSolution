
public class Account {
	
	private String name;
	private String userId;
	private String pin;
	private int balance;
	
	public Account(String name, String userId, String pin, int balance) {
		super();
		this.name = name;
		this.userId = userId;
		this.pin = pin;
		this.balance = balance;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getPin() {
		return pin;
	}

	public void setPin(String pin) {
		this.pin = pin;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	

}
