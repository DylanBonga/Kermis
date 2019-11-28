package kermis;
import java.util.Scanner;

public class Kermis {
	
	public void open() {
		System.out.println("De kermis is open!");
		
		Kassa kassa = new Kassa();
		
		Botswagentjes att1 = new Botswagentjes();
		Spin att2 = new Spin();
		Spiegelpaleis att3 = new Spiegelpaleis();
		Spookhuis att4 = new Spookhuis();
		Hawaii att5 = new Hawaii();
		Ladderklimmen att6 = new Ladderklimmen();
		
		Scanner s = new Scanner(System.in);
		while(kassa.kassaGo) {
			kassa.kassa(att1, att2, att3, att4, att5, att6, s);

		}
		s.close();
	}
}

