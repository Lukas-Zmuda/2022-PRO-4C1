
public class Vetvenie {

	public static void main(String[] args) {
		
		int a = -11;
		
		//neuplna podmienka
		if(a > 0) {
			System.out.println("a je kladne cislo");
		}		
		
		//uplna podmienka
		if(a % 2 == 0) {
			System.out.println("a je parne");
		}else {
			System.out.println("a je neparne");
		}
		
		int skore = 78;
//		if(skore <= 100 && skore > 90) {
//			System.out.println(1);
//		}
		
		if(skore > 90) {
			System.out.println(1);
		}else if(skore > 80) {
			System.out.println(2);
		}else if(skore > 70) {
			System.out.println(3);
		}else if(skore > 60) {
			System.out.println(4);
		}else {
			System.out.println(5);
		}

		System.out.println("Program pokracuje dalej ...");
	}

}
