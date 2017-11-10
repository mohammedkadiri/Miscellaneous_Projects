import java.awt.Point;

class fourDPoint extends Point {
	int z;
	int t;
	fourDPoint(int x, int y, int z1, int y1){
		super(x,y);
		this.z = z1;
		this.t = y1;
	}


public static void main(String[] args){
	fourDPoint np = new fourDPoint(5,5,7,8);
	System.out.println("x is: " + np.x);
	System.out.println("y is: " + np.y);
	System.out.println("t is: " + np.z);
	System.out.println("z is: " + np.t);
}

}