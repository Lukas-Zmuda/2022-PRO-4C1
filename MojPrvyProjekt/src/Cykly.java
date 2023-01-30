
public class Cykly {

	public static void main(String[] args) {
		
		//cyklus s pevnym poctom opakovani
		for(int i = 0; i < 5; i++) {
			System.out.println("Ahoj");
		}

		for(int i = 0; i < 11; i = i + 2) {
			System.out.print(i + ", ");
		}
		
		System.out.println();
		
		for(int i = 1, j = 10; i < 11; i++, j--) {
			System.out.println(i + ":" + j);
		}
		
		//cyklus s podmienkou na zaciatku
		int k = 0;
		while(k < 3) {
			System.out.println("Cau");
			k++;
		}
		
		//cyklus s podmienkou na konci
		k = 0;
		do {
			System.out.println("Servus");
			k++;
		}while(k < 3);
		
		int j = 1;
		while(true) {
			System.out.print(j + " ");
			j++;
			if(j == 6) {
				j++;
				continue;
			}
			if(j == 11) {
				break;
			}
			
		}
		
		System.out.println("\nProgram pokracuje dalej...");
		
		
	}

}
