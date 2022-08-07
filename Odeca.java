package revija;

public class Odeca implements Nosivo {

	protected String naziv;
	protected Velicina vel;
	
	
	public Odeca(String naziv, Velicina vel) {
		super();
		this.naziv = naziv;
		this.vel = vel;
	}

	public String dohvNaziv() {
		return naziv;
	}



	public Velicina dohvVelicinu() {
		return vel;
	}

	@Override
	public boolean odgovara(Model m) {
		return !this.vel.manja(m.dohvVelicinu());
	}

	@Override
	public String toString() {
		return "odeća " + this.naziv + " "+ this.vel;
	}
	
	

}
