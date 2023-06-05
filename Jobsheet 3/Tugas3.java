import java.util.Scanner;
public class Tugas3{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		float suhu, celcius, reaumur, fahrenheit, kelvin;
		System.out.println("Masukkan suhu");
		suhu = sc.nextFloat();
		celcius = suhu;
		reaumur = celcius * 4 / 5;
		fahrenheit = celcius * 9 / 5 +32;
		kelvin = celcius+273;
		System.out.println("Celcius = "+ celcius);
		System.out.println("Reaumur = "+reaumur);
		System.out.println("Fahrenheit = "+fahrenheit);
		System.out.println("Kelvin = "+kelvin);
	}
}