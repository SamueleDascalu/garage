package org.generation.italy.model;

public class Furgone extends Veicolo {

	private int capacita;
	
	public Furgone(int id, String marca, int anno, int cilindrata, int capacita) {
		super(id, marca, anno, cilindrata);
		this.capacita=capacita;
	}
	
	@Override
	public String toString() {
		return super.toString()+"\nCapacita: "+capacita;
	}
}
