import java.util.Scanner;

public class VstupDoProgramu {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String meno;
		
		System.out.println("Zadaj meno:");
		meno = sc.nextLine();
		System.out.println("Ahoj " + meno + "!");
		
		int rokNarodenia = 0;
		System.out.println("V ktorom roku si sa narodil?");
		rokNarodenia = sc.nextInt();
		
		System.out.println("Mas " + (2022 - rokNarodenia) + " rokov");
		

	}

}
