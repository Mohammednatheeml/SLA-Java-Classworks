package privateAccessModifierExample;

public class Main {
	public static void main(String[] args) {
		BankAccount bankAccount = new BankAccount();
		bankAccount.setAccountNumber(5678);
		System.out.println(bankAccount.getAccountNumber());
		}
}
