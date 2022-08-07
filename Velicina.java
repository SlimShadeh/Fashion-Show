package revija;

public class Velicina {

	public enum Oznaka{S,M,L}
	Oznaka o;
	
	public Velicina(Oznaka ozn) {
		this.o=ozn;
	}
	
	public Oznaka dohvOznaku() {
		return o;
	}
	
	public boolean manja(Velicina v) {
		if(this.o==Oznaka.S && (v.o==Oznaka.M || v.o==Oznaka.L)) return true;
		else if(this.o==Oznaka.M && v.o==Oznaka.L) return true;
		else return false;
	}

	@Override
	public String toString() {
		return o.toString();
	}
	
	
}
