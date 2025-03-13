package ud8;

public class Telegrafo extends Reliquia{
	

	private String codigo;
	
	public Telegrafo(int año, String codigo) {
		super(año);
		this.codigo=codigo;
		
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	@Override
	public String toString() {
		return super.toString()+"Telegrafo [codigo=" + codigo + "]";
	}
	public void enviaMensaje(String mensaje) {
		System.out.println("Soy un telegrafo "+getCodigo()+" y el mensaje es "+Comunicador.CTE);
	}
	
}
