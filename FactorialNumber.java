
public class FactorialNumber {
	public static void main(String[] args){
		
	}
	
	public static int factorial(int n){
		if(n==1)
			return 1;
		else
			return (n*factorial(n-1));
	}
}
