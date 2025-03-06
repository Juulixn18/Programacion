package ud8;

import java.util.ArrayList;



public class Agenda  {

	private ArrayList<Contacto> contactos;
	
	public Agenda() {
		contactos=new ArrayList<Contacto>();
	}
	
	public boolean anadirContacto(Contacto c) {
			if(existeContacto(c)) {
				return false;
			}
			contactos.add(c);
			return true;
	}
	public boolean existeContacto(Contacto c) {
		for(Contacto con:contactos) {
			if (c.getNombre().equals(c.getNombre())){
				return true;
			}
		}
		return false;
	}
	
	public void listarContactos() {
		System.out.println(toString());
	}
	
	public Contacto buscarContacto(String nombre) {
		for (int i = 0; i < contactos.size(); i++) {
			Contacto c=contactos.get(i);
			if(c.getNombre().equals(nombre)) {
				System.out.println("Contacto encontrado en el numero: "+i);
				return c;
			}
		}
		
		System.out.println("Contacto no encontrado");
		return null;
	}

	public boolean eliminarContacto(Contacto c) {
		if (!existeContacto(c)) {
			return false;
		}
		for (int i = 0; i < contactos.size(); i++) {
			if(contactos.get(i).getNombre().equals(c.getNombre())) {
				contactos.remove(i);
			}
		}
		return true;
	}
	
	public String toString() {
		String cad="";
		for(Contacto c:contactos) {
			cad+=c.toString()+" - \n";
		}
		return cad;
				
	}

}
