package edu.oop.zaklady;

public class Tester {

	public static void main(String[] args) {
		
		Student s1 = new Student();
		
		s1.meno = "Jan";
		s1.priezvisko = "Hrasko";
		s1.vek = 15;
		s1.pohlavie = 'm';
		
		System.out.println(s1.priezvisko);
		
		s1.celeMeno();
		Student s2 = new Student();
		s2.meno = "Fero";
		s2.priezvisko = "Mravec";
		s2.vek = 24;
		s2.pohlavie = 'm';
		
		s2.celeMeno();

	}

}
