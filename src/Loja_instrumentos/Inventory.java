package Loja_instrumentos;

import java.util.ArrayList;
import java.util.List;

public class Inventory {

    private List<Guitar> guitarList;

    public Inventory(List<Guitar> guitarList) {
    	this.guitarList = guitarList == null ? new ArrayList<>() : guitarList;
	}

	public void addGuitar(Guitar guitar) {
		guitarList.add(guitar);
	}

	public void removeGuitar(Guitar guitar) {
		guitarList.remove(guitar);
	}

    public List<Guitar> search(GuitarSpec searchSpec) {
        List<Guitar> matchingGuitars = new ArrayList<>();

        for (Guitar guitar : guitarList) {
            if(guitar.getSpec().matches(searchSpec)) {
                matchingGuitars.add(guitar);	
            }
        }
        return matchingGuitars;
//        if (matchingGuitars.isEmpty()) {
//            System.out.println("OPSS... NADA FOI ENCOTRADO.");
//        } else {
//            System.out.println("\n INSTRUMENTOS EM ESTOQUE:");
//            for (Guitar guitar : matchingGuitars) {
//                System.out.println(guitar);
//            }
//        }
    }
}