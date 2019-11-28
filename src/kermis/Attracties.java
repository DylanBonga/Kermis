package kermis;

abstract public class Attracties {
	String naam;
	double prijs;
	int oppervlakte;
	int kaartjes_verkocht;
	
	void draaien() {
		System.out.println(naam+" draait");
		kaartjes_verkocht++;
	};
	
	double getOmzet() {
		double omzet = (kaartjes_verkocht*prijs);
		return omzet;
	}
	
	int getAfzet() {
		int afzet = kaartjes_verkocht;
		return afzet;
	};
	
}
