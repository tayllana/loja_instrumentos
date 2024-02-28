package Loja_instrumentos;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Inventory inventory = new Inventory(null);

        inventory.addGuitar(new Guitar("324894t45", 999.99, new GuitarSpec(Builder.FENDER, Model.CUSTOM_SHOP, Type.ELECTRIC, Wood.MAHOGANY, Wood.MAPLE)));
        inventory.addGuitar(new Guitar("56tre6875", 1299.99, new GuitarSpec(Builder.GIBSON, Model.TELECASTER, Type.ELECTRIC, Wood.MAHOGANY, Wood.MAPLE)));
        inventory.addGuitar(new Guitar("9284fj42w", 1599.99, new GuitarSpec(Builder.GIBSON, Model.D_28, Type.ELECTRIC, Wood.COCOBOLO, Wood.MAPLE)));

        inventory.search(new GuitarSpec(Builder.GIBSON, null, null, null, null));
       
        
	}

}
