package ud7;

public class Ordenador {
	

	private String nSerie, procesador, memoria, tamPantalla;
	public Ordenador(String nSerie, String procesador, String memoria, String tamPantalla) {
		super();
		this.nSerie = nSerie;
		this.procesador = procesador;
		this.memoria = memoria;
		this.tamPantalla = tamPantalla;
	}
	
	public String getnSerie() {
		return nSerie;
	}
	public String getProcesador() {
		return procesador;
	}
	public String getMemoria() {
		return memoria;
	}
	public String getTamPantalla() {
		return tamPantalla;
	}

	public void setnSerie(String nSerie) {
		this.nSerie = nSerie;
	}

	public void setProcesador(String procesador) {
		this.procesador = procesador;
	}

	public void setMemoria(String memoria) {
		this.memoria = memoria;
	}

	public void setTamPantalla(String tamPantalla) {
		this.tamPantalla = tamPantalla;
	}


	public String toString() {
		return "Ordenador [nSerie=" + nSerie + ", procesador=" + procesador + ", memoria=" + memoria + ", tamPantalla="
				+ tamPantalla + "]";
	}
	

	
}
