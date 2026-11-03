package privateAccessModifierExample;

public class BankAccount {
	private long accountNumber;
	private int balance;
	
	
	BankAccount(){
		
	}
	
	
	public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }
    
    public long getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }
}
