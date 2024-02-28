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

    public void search(GuitarSpec searchSpec) {
        List<Guitar> matchingGuitars = new ArrayList<>();

        for (Guitar guitar : guitarList) {
            GuitarSpec guitarSpec = guitar.getSpec();

            if (searchSpec.getBuilder() != null && !searchSpec.getBuilder().equals(guitarSpec.getBuilder())) {
                continue;
            }

            if (searchSpec.getModel() != null && !searchSpec.getModel().equals(guitarSpec.getModel())) {
                continue;
            }

            if (searchSpec.getType() != null && !searchSpec.getType().equals(guitarSpec.getType())) {
                continue;
            }

            if (searchSpec.getBackWood() != null && !searchSpec.getBackWood().equals(guitarSpec.getBackWood())) {
                continue;
            }

            if (searchSpec.getTopWood() != null && !searchSpec.getTopWood().equals(guitarSpec.getTopWood())) {
                continue;
            }
            matchingGuitars.add(guitar);
        }
        if (matchingGuitars.isEmpty()) {
            System.out.println("OPSS... NADA FOI ENCOTRADO.");
        } else {
            System.out.println("\n INSTRUMENTOS EM ESTOQUE:");
            for (Guitar guitar : matchingGuitars) {
                System.out.println(guitar);
            }
        }
    }
}