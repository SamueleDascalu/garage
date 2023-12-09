package org.generation.italy.model;

public class Auto extends Veicolo {
	
	private int porte;
	private String alimentazione;
	
	public Auto(int id, String marca, int anno, int cilindrata, int porte, String alimentazione) {
		super(id, marca, anno, cilindrata);
		this.porte=porte;
		this.alimentazione=alimentazione;
	}
	
	@Override
	public String toString() {
		return super.toString()+"\nPorte: "+porte+"\nAlimentazione: "+alimentazione;
	}
	
}
