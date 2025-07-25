package assignment3;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		    SavingAccount savings = new SavingAccount("Sahal", 2000.0);
	        CheckingAccount checking = new CheckingAccount("Jack", 6500.0);

	        Transaction transaction = new Transaction();

	        savings.printAccountDetails();
	        transaction.performTransaction(savings, "deposit", 200);
	        transaction.performTransaction(savings, "withdraw", 100);

	        checking.printAccountDetails();
	        transaction.performTransaction(checking, "withdraw", 300);

	        System.out.println("\nTotal Bank Accounts: " + Bank.getTotalAccounts());

	}

}
