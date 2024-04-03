package iut.bad;

public class Femme extends Humain {
	public Femme() {
		super();
	}
	
	public Femme(String nom, String prenom) {
		super(nom, prenom);
	}
	
	public Femme(String nom, String prenom, int age) {
		super(nom, prenom, age);
	}
	
	public static void main() {
		Homme jamesBond = new Homme("James", "Bond", 35);
		Femme kantoSoa = new Femme("Kanto", "Soa", 32);
		jamesBond.ami(kantoSoa);
	}
}
