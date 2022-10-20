
public class DatoveTypy {

	public static void main(String[] args) {
		
		//celociselne typy
		
		//deklaracia premennej
		int cislo;
		
		//inicializacia premennej
		cislo = 123;
		
		int c1 = 12;
		int c2 = 1, c3 = 2, c4 = 3;
		
		System.out.println("cislo = " + cislo);
		
		//desatinne cisla
		float ff = 12.345f;
		double dd = 1.245;
		
		//znaky
		char zavinac = '@';
		zavinac = 64;
		
		char uni = '\u0123';
		System.out.println(uni);
		
		
		boolean zamracene = false;
		int vlhkost = 80;
		
		boolean prsi = zamracene && vlhkost > 90;	
		
		byte bb = 12;
		int bint = bb;
		
		bb = (byte)bint;
		
		double ddd = 1.89;
		int dint = (int) ddd;
		System.out.println(dint);
		

	}
}