import java.util.Scanner;

public class Main {

	public static String USER = "TAARUN";
	public static String PIN = "1234";
	public static int BALANCE = 1000;

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		boolean isPowerOn = true;
		while (isPowerOn) {

			System.out.println("Please enter user id: ");
			String userId = scanner.next();

			if (userId.equals(USER)) {

				System.out.println("Please enter pin: ");
				String pin = scanner.next();

				if (pin.equals(PIN)) {

					boolean transaction = true;

					while (transaction) {
						System.out.println("Enter your choice");
						System.out.println("1) Balance");
						System.out.println("2) Withdraw");
						System.out.println("3) Deposit");
						System.out.println("4) Change PIN");
						System.out.println("5) logout");

						int choice = scanner.nextInt();

						switch (choice) {
						case 1:
							System.out.println("Balance in Account : " + BALANCE);
							break;
						case 2:
							System.out.println("Enter withdraw amount");
							int withdraw_amt = scanner.nextInt();
							BALANCE = BALANCE - withdraw_amt;
							System.out.println("Balance in Account : " + BALANCE);
							break;
						case 3:
							System.out.println("Enter deposit amount");
							int deposit_amt = scanner.nextInt();
							BALANCE = BALANCE + deposit_amt;
							System.out.println("Balance in Account : " + BALANCE);
							break;
						case 4:
							System.out.println("Enter new PIN");
							PIN = scanner.next();
							System.out.println("PIN change successful! Logging out!");
							transaction = false;
							break;
						case 5:
							System.out.println("logout successful! Thank you!");
							transaction = false;
							break;
						default:
							System.out.println("Enter from above choice");
						}
					}
				} else {
					System.out.println("Incorrect Pin");
				}
			} else {
				System.out.println("User not found");
			}
		}

		scanner.close();
	}
}
