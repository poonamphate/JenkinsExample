
public class PrimeNumber {
	public static void main(String[] args) {
		int n = 17;
		
		boolean result = checkPrimeNumber(n);
		System.out.println(n + " is prime number : "+result);
	}
	
	static boolean checkPrimeNumber(int n) {
		if(n == 0 || n == 1) {
			return false;
		}
		
		for(int i = 2; i<n/2; i++) {
			if(n/i == 0) {
				return false;	
			}
		}
		return true;
	}
}
