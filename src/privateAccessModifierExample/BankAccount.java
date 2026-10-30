package privateAccessModifierExample;

public class BankAccount {
	private long accountNumber;
	private int balance;
	
	
	BankAccount(){
		
	}
	public BankAccount(long accountNumber,int balance) {
		this.accountNumber=accountNumber;
		this.balance=balance;
		
		System.out.println("Accoundnumber:" +accountNumber);
		System.out.println("balance:" +balance);
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
