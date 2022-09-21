package ticket;

public class TicketEspecial extends Ticket 
{
	private int numPasag;
	
	public TicketEspecial(double entradaKm, double euroKm, int numPasag) 
	{
		super(entradaKm, euroKm);
		this.numPasag=numPasag;
	}

	
	public double calcularTarifa(double salidaKm) 
	{
		double recorridosKm = Math.abs(salidaKm - getEntradaKm());
		if(recorridosKm > 100)
		{
			
			double tarifa = (double) ( recorridosKm * ( getEuroKm() + 0.05) )  * this.numPasag;
		}
			
		double tarifa = (double) ( recorridosKm  * getEuroKm() ) * this.numPasag;
			
		return tarifa;
	}


	@Override
	public String toString() {
		return "TicketEspecial [numPasag=" + numPasag + "]";
	}
	
}
