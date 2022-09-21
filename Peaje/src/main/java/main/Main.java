package main;

import java.util.Scanner;

import ticket.TicketEspecial;
import ticket.TicketGeneral;

public class Main 
{
	public static void main(String[] args) 
	{
		double salidaKm;
		Scanner sc = new Scanner (System.in);
		TicketGeneral TG1 = new TicketGeneral(19, 40) ;
		TicketEspecial TE1 = new TicketEspecial(19, 40, 25) ;
		
		System.out.println("Introduce a que km sale el vehiculo: ");
		salidaKm=sc.nextDouble();
		System.out.println(TG1.calcularTarifa(salidaKm));
		
		
		System.out.println("Introduce a que km sale el autobus: ");
		salidaKm=sc.nextDouble();
		System.out.println(TE1.calcularTarifa(salidaKm));
		
	}
}
