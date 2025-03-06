package POAO;

import java.util.Random;

public class Password {
	

	private int longitud;
	private String contraseña;
	
	
	public Password(int longitud){
		contraseña="";
		this.longitud=longitud;
	}
	
	public Password(String contraseña, int longitud) {
		this.contraseña=contraseña;
		this.longitud=longitud;
	}
	
	//setter
	public void setLongitud(int longitud) {
		if (longitud<0) {
			longitud=8;
		}else {
		this.longitud=longitud;
		}
	}
	
	//getters 
	public int getLongitud() {
		return longitud;
	}
	public String getContraseña() {
		return contraseña;
	}
	//comprobaciones
	public boolean esFuerte() {
		int contMayusc=0;
		int contMinusc=0;
		int contNums=0;
		for(int i=0; i<contraseña.length(); i++) {
			if (contraseña.charAt(i)>='0'&&contraseña.charAt(i)<='9') {
				contNums++;		
			}
			if (contraseña.charAt(i)>='a'&&contraseña.charAt(i)<='z') {
				contMinusc++;		
			}
			if (contraseña.charAt(i)>='A'&&contraseña.charAt(i)<='Z') {
				contMayusc++;		
			}
			
		}
		if (contMayusc>2&&contMinusc>1&&contNums>5) {
			return true;
		}
		return false;	
	}
	
	public void generaContraseña() {
		Random random=new Random();
		String caracteres="ABCDEFGHIJKLMNÑOPQRSTUVWXYZabcdefghijklmnñopqrstuvwxyz0123456789";		
		for(int i=0; i<longitud; i++) {
			int numale=random.nextInt(62);
			contraseña+=caracteres.charAt(numale);
		}		
	}
	@Override
	public String toString() {
		return "Password [longitud=" + longitud + ", contraseña=" + contraseña ;
	}
	
	
}
