package kermis;

import java.util.Scanner;

public class Kassa {
	
	int kaartjes;
	boolean kassaGo = true;
	
	void kassa(Botswagentjes a, Spin b, Spiegelpaleis c, Spookhuis d, Hawaii e, Ladderklimmen f, Scanner s) {
		
		System.out.println("----------------");
		System.out.println("Wat wil je doen?");
		//Scanner s = new Scanner(System.in);
		System.out.println( "[1] botsauto's, \r\n" + 
							"[2] spin, \r\n" + 
							"[3] spiegelpaleis, \r\n" + 
							"[4] spookhuis, \r\n" + 
							"[5] hawaii, \r\n" + 
							"[6] ladderklimmen, \r\n" +
							"[O] omzet, \r\n" +
							"[K] kaartverkoop, \r\n" +
							"[X] kassa sluiten. \r\n");
		String input = s.next();
		if(input.equals("1")) {			//botswagentjes
			a.draaien();
		}else if(input.equals("2")) {	//spin
			b.draaien();
			b.opstellingsKeuring();
		}else if(input.equals("3")) {	//spiegelpaleis
			c.draaien();
		}else if(input.equals("4")) {	//spookhuis
			d.draaien();
		}else if(input.equals("5")) {	//hawaii
			e.draaien();
			e.opstellingsKeuring();
		}else if(input.equals("6")) {	//ladderklimmen
			f.draaien();
		}
		
		else if(input.toUpperCase().equals("O")) {getOmzet(a, b, c, d, e, f);}
		else if(input.toUpperCase().equals("K")) {getAfzet(a, b, c, d, e, f);}
		else if(input.toUpperCase().equals("X")) {quit();}
		

	}

	
	void getOmzet(Botswagentjes a, Spin b, Spiegelpaleis c, Spookhuis d, Hawaii e, Ladderklimmen f) {
		Attracties[] omzetArray = {a,b,c,d,e,f};
		double total = 0;
		
		for(int x = 0; x < omzetArray.length; x++) {
			System.out.println("Omzet "+omzetArray[x].naam+": "+omzetArray[x].getOmzet());
			total += omzetArray[x].getOmzet(); 
		}
		System.out.println("Totale omzet: "+total);
	}
	
	void getAfzet(Attracties a, Spin b, Spiegelpaleis c, Spookhuis d, Hawaii e, Ladderklimmen f) {
		Attracties[] afzetArray = {a,b,c,d,e,f};
		int kaartjes = 0;
		
		for(int x = 0; x < afzetArray.length; x++) {
			System.out.println("Afzet "+afzetArray[x].naam+": "+afzetArray[x].getAfzet());
			kaartjes += afzetArray[x].getAfzet(); 
		}
		System.out.println("Kaartjes verkocht: "+kaartjes);
	}
	
	void quit() {
		kassaGo = false;
	}
}
