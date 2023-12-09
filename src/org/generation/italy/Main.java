package org.generation.italy;

import java.util.Scanner;

import org.generation.italy.model.Auto;
import org.generation.italy.model.Furgone;
import org.generation.italy.model.Moto;
import org.generation.italy.model.Veicolo;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String tipoVeicolo, marca, alimentazione;
		int i=0, capacitaRaggiunta=0, anno, cilindrata, porte, tempi, capacita;
		final int capacitaGarage=14;
		
		Veicolo[] garage = new Veicolo[capacitaGarage];
		
		do{
		   System.out.print("Inserisci il tipo di veicolo da parcheggiare: (auto, moto, furgone) ");
		   tipoVeicolo=scanner.nextLine();
		   
		   System.out.print("marca: ");
		   marca=scanner.nextLine();
		   System.out.print("anno: ");
		   anno=Integer.parseInt(scanner.nextLine());
		   System.out.print("cilindrata: ");
		   cilindrata=Integer.parseInt(scanner.nextLine());
		   
		   switch(tipoVeicolo){
		   case "auto":
			   System.out.print("porte: ");
		       porte=Integer.parseInt(scanner.nextLine());      
			   System.out.print("diesel o benzina? ");
		       alimentazione=scanner.nextLine();
			   Auto auto = new Auto(capacitaRaggiunta, marca, anno, cilindrata, porte, alimentazione);
			   garage[capacitaRaggiunta]=auto;
			   break;
		   case "moto":
		      System.out.print("tempi: ");
		      tempi=Integer.parseInt(scanner.nextLine());
		      Moto moto = new Moto(capacitaRaggiunta,marca,anno, cilindrata, tempi);
		      garage[capacitaRaggiunta]=moto;
		      break;
		   case "furgone":
		      System.out.print("capacita: ");
		      capacita=Integer.parseInt(scanner.nextLine());
		      Furgone furgone = new Furgone(capacitaRaggiunta, marca, anno, cilindrata, capacita);
		      garage[capacitaRaggiunta]=furgone;
		      break;
		   default:System.out.println("scelta non valida.");
		   }
		   capacitaRaggiunta++;
		   for(i=0; i < capacitaRaggiunta; i++) {
			   System.out.println(garage[i]);
		   }
		   System.out.print("Vuoi continuare? (si/no) ");
		}while(scanner.nextLine().equals("si") && capacitaRaggiunta < capacitaGarage);
		
		System.out.print("Inserisci l'id del mezzo: ");
		i=Integer.parseInt(scanner.nextLine());
		if(i < capacitaRaggiunta && i>=0) {
			System.out.println(garage[i]);
		}
		else System.out.println("Veicolo non presente.");
		
		scanner.close();
	}

}
