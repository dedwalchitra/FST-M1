
package activities;

public class BankAccount {
private Integer balance;
     
    public BankAccount(int initialBalance) {
		// TODO Auto-generated constructor stub
    	balance = initialBalance;
	}

	// Add method to calculate
    // balance amount after withdrawal
    public int withdraw(int amount) {
        if (balance < amount) {
            throw new NotEnoughFundsException(amount, balance);
        }
        balance -= amount;
        return balance;
    }



}