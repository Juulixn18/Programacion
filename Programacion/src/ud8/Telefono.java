package ud8;

public class Telefono {
	private String numero;

	public Telefono(String numero) {
		
		this.numero = numero;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	@Override
	public String toString() {
		return "Telefono [numero=" + numero + "]";
	}
	
	public void enviaMensaje(String mensaje) {
		System.out.println("Mi telefono es "+getNumero()+" y el mensaje es "+Comunicador.CTE);
	}
}
