package kermis;

public abstract class RisicoRijkeAttractie extends Attracties {
	
	int draaiLimiet; 
	
	void opstellingsKeuring() {
		if((kaartjes_verkocht % draaiLimiet) == 0) {
			System.out.println("Er komt even een monteur kijken!");
		}
	}
	
}
