package Loja_instrumentos;

import java.util.List;

public class Main {

	public static void main(String[] args) {

        Inventory inventory = new Inventory(null);

        inventory.addInstrument("324894t45", 999.99, new GuitarSpec(Builder.FENDER, Model.CUSTOM_SHOP, Type.ELECTRIC, Wood.MAHOGANY, Wood.MAPLE, 6));
        inventory.addInstrument("56tre6875", 1299.99, new GuitarSpec(Builder.GIBSON, Model.TELECASTER, Type.ELECTRIC, Wood.MAHOGANY, Wood.MAPLE, 7));
        inventory.addInstrument("9284fj42w", 1599.99, new GuitarSpec(Builder.GIBSON, Model.D_28, Type.ELECTRIC, Wood.COCOBOLO, Wood.MAPLE, 8));

        inventory.addInstrument("324894t45", 999.99, new MandolinSpec(Builder.FENDER, Model.CUSTOM_SHOP, Type.ELECTRIC, Wood.MAHOGANY, Wood.MAPLE, Style.A_STYLE));
        inventory.addInstrument("56tre6875", 1299.99, new MandolinSpec(Builder.GIBSON, Model.TELECASTER, Type.ELECTRIC, Wood.MAHOGANY, Wood.MAPLE, Style.OVAL_STYLE));
        inventory.addInstrument("9284fj42w", 1599.99, new MandolinSpec(Builder.GIBSON, Model.D_28, Type.ELECTRIC, Wood.COCOBOLO, Wood.MAPLE, Style.TEAR_DROP_STYLE));
        
        List<Guitar> matchingGuitars = inventory.search(new GuitarSpec(Builder.GIBSON, Model.TELECASTER, Type.ELECTRIC, Wood.MAHOGANY, Wood.MAPLE, 7));
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
