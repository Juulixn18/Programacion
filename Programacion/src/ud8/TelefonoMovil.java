package ud8;

public class TelefonoMovil extends Telefono implements Comunicador{
	
	private String modelo;
	
	public TelefonoMovil(String numero, String modelo) {
		super(numero);
		this.modelo=modelo;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	@Override
	public String toString() {
		return super.toString()+"TelefonoMovil [modelo=" + modelo + "]";
	}


}
