package org.generation.italy.model;

public class Moto extends Veicolo{

	private int tempi;
	
	public Moto(int id, String marca, int anno, int cilindrata, int tempi) {
		super(id, marca, anno, cilindrata);
		this.tempi=tempi;
	}
	
	@Override
	public String toString() {
		return super.toString()+"\nTempi: "+tempi;
	}
}
