package revija;

public class Kombinacija {

	protected int kolicina;
	protected int brStvari=0;
	Nosivo odeca[];

	public Kombinacija(int kolicina) {
		this.kolicina = kolicina;
		odeca=new Odeca[kolicina];
	}
	
	public void dodaj(Nosivo od) throws GDodavanje {
		if(brStvari>= kolicina) throw new GDodavanje();
		else {
			odeca[brStvari]=od;
			brStvari++;
		}
	}

	public int dohvMaxBrStvari() {
		return kolicina;
	}

	public int dohvBrStvari() {
		return brStvari;
	}
	
	public Nosivo dohvStvar(int k) throws GIndeks {
		if(k<0 || k>=brStvari) throw new GIndeks();
		else return odeca[k];
	}

	@Override
	public String toString() {
		StringBuilder sb=new StringBuilder();
		sb.append("[");
		for(int i=0;i<this.brStvari;i++) {
			sb.append(odeca[i]);
			if(i!=brStvari-1) sb.append(", ");
		}
		sb.append("]");
		return sb.toString();
	}
	
	
	
	
}
