package Loja_instrumentos;


public class GuitarSpec extends InstrumentSpec{
    private int numStrings;

	public int getNumStrings() {
		return numStrings;
	}
	public void setNumStrings(int numStrings) {
		this.numStrings = numStrings;
	}
	public GuitarSpec(Builder builder, Model model, Type type, Wood backWood, Wood topWood, int numStrings) {
		super(builder, model, type, backWood, topWood);
		this.numStrings = numStrings;
	}
	 public boolean matches(InstrumentSpec otherSpec){
		 if (!super.matches(otherSpec)) {
			 return false; 
		 }
		 if (!(otherSpec instanceof GuitarSpec)) {
			 return false; 
		 }
		 GuitarSpec spec = (GuitarSpec)otherSpec;
		 if (numStrings != spec.numStrings) {
			 return false; 
		 }
		 return true;
	 }

	@Override
	public String toString() {
		return super.toString() + "\n Nº cordas: " + numStrings;
	}
}
