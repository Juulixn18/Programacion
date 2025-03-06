package ud8;

public class UsoAgenda {

	public static void main(String[] args) {
		Agenda agenda = new Agenda ();
		agenda.anadirContacto(new Contacto("Pepe","123456"));
		agenda.anadirContacto(new Contacto("Juan","234567"));
		agenda.anadirContacto(new Contacto("Maria","345678"));
		System.out.println(agenda);

	}

}
