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
		String veta = "";
		System.out.println("Zadaj hmotnost[kg]: ");
		hmotnost = sc.nextDouble();
		System.out.println("Zadaj vyska[cm]: ");
		vyska = sc.nextDouble();
		vyska /= 100;
		bmi = hmotnost / (vyska * vyska);
		if(bmi >= 40) {
			veta = "Tazka obezita";
		}else if(bmi >= 30) {
			veta = "Obezita";
		}else if(bmi >= 25) {
			veta = "Mierna nadvaha";
		}else if(bmi >= 18.5) {
			veta = "Idealna a zdrava vaha";
		}else {
			veta = "Podvyziva";
		}
		System.out.println("BMI: " + bmi + " - " + veta);
	}
}
