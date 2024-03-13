package Loja_instrumentos;

public class Guitar extends Instrument{

	public Guitar(String serialNumber, double price, InstrumentSpec spec) {
		super(serialNumber, price, spec);
	}

	@Override
	public String toString() {
		return "\n" + super.toString();
	}
	

}