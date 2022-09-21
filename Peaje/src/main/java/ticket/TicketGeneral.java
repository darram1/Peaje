package ticket;

public class TicketGeneral extends Ticket 
{

	public TicketGeneral(double entradaKm, double euroKm) {
		super(entradaKm, euroKm);
	}
	
	public double calcularTarifa(double salidaKm) 
	{
		double recorridosKm = Math.abs(salidaKm - getEntradaKm());
		double tarifa= recorridosKm * getEuroKm();
		
		return tarifa;
	}
	
}
