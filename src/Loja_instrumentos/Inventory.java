package Loja_instrumentos;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Inventory {

    private List<Instrument> inventory;

    public Inventory(List<Instrument> inventory) {
    	this.inventory = inventory == null ? new ArrayList<>() : inventory;
	}


	public void addInstrument(String serialNumber, double price, InstrumentSpec spec){
	 Instrument instrument = new Instrument(serialNumber, price, spec);
	 inventory.add(instrument);
	 }
	
	public Instrument getInstrument(String serialNumber){
	 for (Instrument instrument : inventory){
		 if(instrument.getSerialNumber().equals(serialNumber)){
			 return instrument;
		 }
	 }
	 return null;
	}
	public List<Instrument> search(InstrumentSpec searchSpec) {
	    List<Instrument> matchingInstruments = new ArrayList<>();
	    for (Iterator i = inventory.iterator(); i.hasNext();) {
	        Instrument instrument = (Instrument) i.next();
	        if (instrument.getSpec().matches(searchSpec)) {
	            matchingInstruments.add(instrument);
	        }
	    }

	    return matchingInstruments;
	}
}