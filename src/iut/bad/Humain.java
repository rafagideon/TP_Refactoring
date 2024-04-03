package iut.bad;

public class Humain implements Consommation {
	protected String nom;
	protected String prenom;
	protected int age;
	
	public Humain() {
		super();
	}
	
	public Humain(String nom, String prenom) {
		super();
		this.nom = nom;
		this.prenom = prenom;
	}
	
	public Humain(String nom, String prenom, int age) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.age = age;
	}
	
	public void details() {
		System.out.println(toString());
	}

	@Override
	public String toString() {
		return "Humain [nom=" + nom + ", prenom=" + prenom + ", age=" + age + "]";
	}
	
	public void manger() {
		System.out.println("Miam Miam ! " + nom + " " + prenom + " est en train de manger...");
	}
	
	public void boire() {
		System.out.println("Glou Glou Glou ! " + nom + " " + prenom + " est en train de boire...");
	}
}