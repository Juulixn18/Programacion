package ud8;

public class Ave {
	private String especie;
	private boolean vuela;
	public Ave(String especie, boolean vuela) {
		this.especie=especie;
		this.vuela=vuela;
	}
	public String getEspecie() {
		return especie;
	}
	public void setEspecie(String especie) {
		this.especie = especie;
	}
	public boolean isVuela() {
		return vuela;
	}
	public void setVuela(boolean vuela) {
		this.vuela = vuela;
	}
	@Override
	public String toString() {
		return "Ave [especie=" + especie + ", vuela=" + vuela + "]";
	}
	
	
	
}
