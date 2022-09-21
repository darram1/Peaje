package ticket;

public class TicketGeneral extends Ticket 
{

	public TicketGeneral(double entradaKm, double euroKm) {
		super(entradaKm, euroKm);
	}
	
	public double calcularTarifa(double salidaKm) 
	{
		double descuentoKm = 0 ;
		double recorridosKm = Math.abs(salidaKm - getEntradaKm());
		double tarifa= recorridosKm * getEuroKm();
		if(recorridosKm > 500)
		{
			descuentoKm = recorridosKm - 500;
			tarifa = (double) ( recorridosKm - descuentoKm  * getEuroKm() ) + ( descuentoKm * getEuroKm() + 0.10 ) ; 
		}
		
		tarifa = (double) ( recorridosKm  * getEuroKm() );
		
		return tarifa;
	}

	@Override
	public String toString() {
		return "TicketGeneral []";
	}
	
	
	
}
