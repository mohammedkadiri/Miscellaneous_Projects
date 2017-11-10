import java.util.StringTokenizer;

public class Birthday {
	public static void main(String[] args){
		String date = "12/04/2007";
		StringTokenizer st1 = new StringTokenizer(date , "/");
		System.out.print(st1.nextToken());
		System.out.print(" " + st1.nextToken());
		System.out.println(" " +st1.nextToken());

	}
}
