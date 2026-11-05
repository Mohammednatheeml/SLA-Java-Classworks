package threeDimenstionalArray;

public class FindIndex {
	public static void main(String[] args) {
		int[] arry = {10,20,30,40,50,60};
		
		int key = 40;
		
		for(int i=0;i<arry.length;i++) {
			if(arry[i]==key) {
				System.out.println("index:"+i);
			}
			
		}
	}
}
