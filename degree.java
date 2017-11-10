
public class degree {
	public static double fahrenheitToCelsius(double temperature){
	return temperature = (temperature - 32)*(5/9);

	}
	public static void printTemperature(double temperature){
		System.out.println("F: " + temperature);
		System.out.println("F: " + fahrenheitToCelsius(temperature));
	}
	public static void main(String[] args){
		double temperature = 370;
		fahrenheitToCelsius(temperature);
		
		printTemperature(temperature);
	}
}
