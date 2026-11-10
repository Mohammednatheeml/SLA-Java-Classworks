package userThrowException;

public class Bank {
	
	public void amount(int balance) throws Maximum50000 {
		if(balance < 0 || balance == 0) {
			throw new MaintainBalance("Maintain Balance upto 0");
		}
		
		else if(balance>50000) {
//			try {
				throw new Maximum50000("maintain into 50000");
//			}catch (Maximum50000 e) {
//				// TODO: handle exception
//				System.out.println(e.getMessage());
//			}
			
		}
		else {
			System.out.println("Balance="+balance);
		}
	}

	public static void main(String[] args) {
		Bank bank = new Bank();
		try {
		try {
			bank.amount(-567);
		} catch (Maximum50000 e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}catch (MaintainBalance e) {
			System.out.println(e.getMessage());
		}
		
		try {
			bank.amount(67890);
		} catch (Maximum50000 e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		

	}

}
