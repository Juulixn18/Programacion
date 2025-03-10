package ud8;

public class Reliquia {

	private int año;
	
	public Reliquia(int año) {
		super();
		this.año = año;
	}

	public int getAño() {
		return año;
	}

	public void setAño(int año) {
		this.año = año;
	}

	@Override
	public String toString() {
		return "Reliquia [año=" + año + "]";
	}
	
}
