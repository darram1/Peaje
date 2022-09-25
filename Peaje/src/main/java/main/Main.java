package main;

import java.io.IOException;
import java.util.Scanner;
import java.util.logging.ConsoleHandler;
import java.util.logging.FileHandler;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

import ticket.TicketEspecial;
import ticket.TicketGeneral;

public class Main 
{
	private final static Logger LOGGER = Logger.getLogger("main.Main");
	
	
	
	
	
	public static void main(String[] args) throws SecurityException, IOException
	{	
		double salidaKm;
		
		LOGGER.log(Level.INFO, "Proceso exitoso");
		LOGGER.log(Level.WARNING, "Ocurrio un error de acceso en 0xFF");
		LOGGER.log(Level.SEVERE, "ERROR MASIVO");
		
		Handler consoleHandler = new ConsoleHandler();
		
		Handler fileHandler = new FileHandler("./info.log", false);
		
		SimpleFormatter simpleFormatter = new SimpleFormatter();
		
		fileHandler.setFormatter(simpleFormatter);
		
		LOGGER.addHandler(consoleHandler);
        LOGGER.addHandler(fileHandler);
		
        consoleHandler.setLevel(Level.ALL);
        fileHandler.setLevel(Level.ALL);

        LOGGER.log(Level.INFO, "Logger inicializado");
        
        LOGGER.log(Level.INFO, "Llamadas a los componentes del sistema");
        
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
