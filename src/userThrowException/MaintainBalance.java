package userThrowException;

public class MaintainBalance extends RuntimeException{
	
	public MaintainBalance(String message) {
		super(message);
	}
}
