import java.util.Scanner;

public class UBmi {

	/**
	 * Program na vypocet BMI
	 * -> hmotnost, vyska
	 * <- BMI
	 * 
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double hmotnost = 0, vyska = 0, bmi = 0;
		System.out.println("Zadaj hmotnost[kg]: ");
		hmotnost = sc.nextDouble();
		System.out.println("Zadaj vyska[cm]: ");
		vyska = sc.nextDouble();
		vyska /= 100;
		bmi = hmotnost / (vyska * vyska);
		System.out.println("BMI: " + bmi);
	}
}
