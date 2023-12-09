package org.generation.italy.model;

public class Veicolo {
	protected int id, anno, cilindrata;
	protected String marca;
	
	public Veicolo(int id, String marca, int anno, int cilindrata) {
		super();
		this.id=id;
		this.marca=marca;
		this.anno=anno;
		this.cilindrata=cilindrata;
	}
	
	@Override
	public String toString() {
		return "Id: "+id+"\nAnno: "+anno+"\nCilindrata: "+cilindrata+"\nMarca: "+marca;
	}
}
