
package fr.demos.formation;

import java.io.Serializable;

public class Climatisation implements Serializable{
	private static final long serialVersionUID = 1L;
	private String app;
	private double temperature;
	private double pression;
	private int humidite;
	private long datation = System.currentTimeMillis();
	static final int DELTA_T = 40;
	static final double K_F = 1.8;
	static final double K_HG = 0.0295299831;
	
	public String getApp() {
		return app;
	}

	public double getTemperature() {
		return temperature;
	}

	public double getPression() {
		return pression;
	}

	public int getHumidite() {
		return humidite;
	}

	public long getDatation() {
		return datation;
	}

	public Climatisation(String app, double temperature, double pression, int humidite) {
		//this(app,temperature,humidite);
		this.app = app;
		this.temperature = temperature;
		this.humidite = humidite;
		this.pression = pression;
	}

	public Climatisation(String app, double temperature, int humidite) {
		this(app, temperature, 0, humidite);
		/*this.app = app;
		this.temperature = temperature;
		this.humidite = humidite;*/
	}

	public double getTemperatureFarenheit() {
		return ((this.temperature + DELTA_T) * K_F - DELTA_T);

	}

	public double getpressionPouceMercure() {
		return (Math.rint(this.pression * K_HG * 100) / 100);
	}


	@Override
	public String toString() {
		return "Climatisation  " + app + "\n date = " + new java.util.Date(this.datation) + "\n temperature °C = "
				+ temperature + "\n pression hPa = " + pression + "\n humidite % = " + humidite;
	}

}
