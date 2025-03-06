package POAO;

public class Tiempo {
	//atrib
	private int hora,min,seg;
	
	//constructores
	public Tiempo(int h, int m, int s) {
		setHora(h);
		setMinuto(m);
		setSegundo(s);
		
	}
	public Tiempo(int h, int m) {
		setHora(h);
		setMinuto(m);
		seg=0;
	}
	public Tiempo(int h) {
		setHora(h);
		min=00;
		seg=00;
	}
	
	//getter
	public String getTiempo(){
		return hora+":"+min+":"+seg;
	}
	
	//setters 
	public void setHora(int h) {
		if (h>=00&&h<=23) {
			hora=h;
		}else {
			hora=00;
		}
	}
	public void setMinuto(int m) {
		if (m>=00&&m<=59) {
			min=m;
		}else {
			min=00;
		}
	}
	public void setSegundo(int s) {
		if (s>=00&&s<=59) {
			seg=s;
		}else {
			seg=00;
		}
	}
	
}
