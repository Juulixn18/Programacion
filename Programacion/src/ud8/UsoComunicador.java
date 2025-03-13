package ud8;

import java.util.ArrayList;

public class UsoComunicador {

	public static void main(String[] args) {
		ArrayList<Comunicador> coms=new ArrayList<Comunicador>();
		coms.add(new PalomaMensajera(false, null, 30));
		coms.add(new TelefonoMovil("6666666", "nokia"));
		
		for(Comunicador c:coms) {
			c.enviaMensaje("Hola");
		}
		
		
		
	}

}
