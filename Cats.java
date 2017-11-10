
public class Cats {

	public static void main(String[] args) {
	
System.out.println("Cats eyes are " + 	catsEyes(2));
	}
	public static int catsEyes(int cats) {
		if(cats == 0){
			return 0;
		}else{
			return 2 + catsEyes(cats - 1);
		}
	}

}
