package revija;

public class Model {

	protected static int poslId;
	protected int id;
	Velicina v;
	public Model( Velicina v) {
		this.id = poslId++;
		this.v = v;
	}

	public int dohvId() {
		return id;
	}
	public Velicina dohvVelicinu() {
		return v;
	}

	@Override
	public String toString() {
		return "Model " + id + " (" + v + ")";
	}
	
	
}
