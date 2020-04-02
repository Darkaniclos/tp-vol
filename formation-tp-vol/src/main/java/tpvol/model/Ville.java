package vol.model;

import java.util.ArrayList;

public class Ville {
	
	private String nom;
	private String pays;
	private ArrayList<Aeroport> aeroports = new ArrayList<Aeroport>();
	
	public Ville() {
		super();
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPays() {
		return pays;
	}

	public void setPays(String pays) {
		this.pays = pays;
	}

	public ArrayList<Aeroport> getAeroports() {
		return aeroports;
	}

	public void setAeroports(ArrayList<Aeroport> aeroports) {
		this.aeroports = aeroports;
	}
	
	public void addAeroport(Aeroport aeroports) {
		this.aeroports.add(aeroports);
	}
	
	

}
