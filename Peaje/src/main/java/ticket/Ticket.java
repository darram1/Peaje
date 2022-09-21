package ticket;

public abstract class Ticket implements ITicket 
{
	private final double entradaKm;
	private final double euroKm;

	protected Ticket(double entradaKm, double euroKm) 
	{
		this.entradaKm = entradaKm;
		this.euroKm = euroKm ;
	}

	public double getEntradaKm() {
		return entradaKm;
	}


	public double getEuroKm() {
		return euroKm;
	}

	@Override
	public String toString() {
		return "Ticket [entradaKm=" + entradaKm + ", euroKm=" + euroKm + "]";
	}
	
}
