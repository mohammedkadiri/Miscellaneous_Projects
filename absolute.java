
public class absolute {
	public static double absoluteValue(double a){
		if(a < 0){
			a = a -1;
			System.out.println(a);
		}else{
			System.out.println(a);
		}
		return a;
	}
	public static void main(String[] args){
		double a = -1;
		
		absoluteValue(a);
	}
}
