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

//	public List<Guitar> search(Guitar searchGuitar) {
	public void search(Guitar searchGuitar) {
        List<Guitar> matchingGuitars = new ArrayList<>();

        for (Guitar guitar : guitarList) {
            if (searchGuitar.getBuilder() != null && !searchGuitar.getBuilder().equals(guitar.getBuilder())) {
                continue;
            }

            if (searchGuitar.getModel() != null && !searchGuitar.getModel().equals(guitar.getModel())) {
                continue;
            }

            if (searchGuitar.getType() != null && !searchGuitar.getType().equals(guitar.getType())) {
                continue;
            }

            if (searchGuitar.getBackWood() != null && !searchGuitar.getBackWood().equals(guitar.getBackWood())) {
                continue;
            }

            if (searchGuitar.getTopWood() != null && !searchGuitar.getTopWood().equals(guitar.getTopWood())) {
                continue;
            }
            matchingGuitars.add(guitar);
        }
        if (matchingGuitars.isEmpty()) {
            System.out.println("Nenhuma guitarra encontrada.");
        } else {
            System.out.println("\n INSTRUMENTOS EM ESTOQUE");
            for (Guitar guitar : matchingGuitars) {
                System.out.println(guitar);
            }
        }
//        return matchingGuitars;
    }
}