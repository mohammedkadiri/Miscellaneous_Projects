package loops;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class FloydsTriangle {
	public static void main(String[]args){
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		String input;
		
		try{
			System.out.println("This program creates floyds triangle: ");
			System.out.println("Enter number of rows in floyds triangle: ");
			input = br.readLine();
			int maxRows = Integer.parseInt(input);
			int num = 0;
			
			for(int rowCount = 0; rowCount <= maxRows; rowCount++){
				for(int colCount = 1; colCount <= rowCount; colCount++){
					System.out.print(++num + " ");
				}
				System.out.println( "" );
			}
			
		}catch(Exception ex){
			System.out.println("catch exception " + ex.getMessage());
			ex.printStackTrace();
		}
	}
}
