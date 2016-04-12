package fr.demos.formation.essais;
import fr.demos.formation.Climatisation;

public class TestClimatisation {

	public static void main(String[] args) {

		/*double x = 0;
		int i = 0;
		int j = 0;
		double result = 0;
		Climatisation[] tableau;*/

		Climatisation clim201 = new Climatisation("salle 201", 27.5, 1021, 36);
		Climatisation clim202 = new Climatisation("salle 202", 24.6, 0, 21);
		Climatisation clim203 = new Climatisation("salle 203", 22.1, 1045, 33);
		Climatisation clim204 = new Climatisation("salle 204", 0, 1056, 35);
		Climatisation clim205 = new Climatisation("salle 205", 25, 1076, 27);
		Climatisation clim206 = new Climatisation("salle 206", 21, 1028, 38);

		/*tableau = new Climatisation[6];
		tableau[0] = clim201;
		tableau[1] = clim202;
		tableau[2] = clim203;
		tableau[3] = clim204;
		tableau[4] = clim205;
		tableau[5] = clim206;

		for (Climatisation clim : tableau) {
			System.out.println(clim);
		}

		for (Climatisation clim : tableau) {
			if (clim.temperature != 0) {
				x = x + clim.temperature;
				i++;
			}
		}
		result = x / i;
		System.out.println("La moyenne des températures est " + Math.rint(result * 100) / 100);

		for (Climatisation clim : tableau) {
			if (clim.pression != 0) {
				x = x + clim.pression;
				j++;
			}
		}
		result = x / j;
		System.out.println("La moyenne des pressions est " + Math.rint(result * 100) / 100);
	}*/

	
	  System.out.println(clim201 + "\n");
	  System.out.println(clim202 +"\n");
	  System.out.println(clim203 + " \n temperaure °F = "+clim203.getTemperatureFarenheit() + "\n"); 
	  System.out.println(clim204 + " \n pression inchHg  = " + clim204.getpressionPouceMercure() +"\n");
	  System.out.println(clim205 + "\n");
	  System.out.println(clim206+ "\n");
	}

}

/*
 * clim204.app = "salle 204"; clim204.temperature = 23; clim204.pression = 1013;
 * clim204.humidite = 35;
 */