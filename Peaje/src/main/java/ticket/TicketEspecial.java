package ticket;

public class TicketEspecial extends Ticket 
{
	private int numPasag;
	
	public TicketEspecial(int numPasag,double entradaKm, double euroKm) {
		super(entradaKm, euroKm);
		this.numPasag=numPasag;
	}

	
	public double calcularTarifa(double salidaKm) 
	{
		double recorridosKm = Math.abs(salidaKm - getEntradaKm());
		double tarifa = (double) (recorridosKm * getEuroKm())*this.numPasag;
			
		return tarifa;
	}


	


	
		
	
}
