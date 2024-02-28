package Loja_instrumentos;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Inventory inventory = new Inventory(null);
	        inventory.addGuitar(new Guitar("324894t45", 999.99, Builder.FENDER, Model.TELECASTER, Type.ELECTRIC, Wood.MAHOGANY, Wood.MAPLE));
	        inventory.addGuitar(new Guitar("56tre6875", 1299.99, Builder.GIBSON, Model.LES_PAUL, Type.ELECTRIC, Wood.MAHOGANY, Wood.MAPLE));
	        inventory.addGuitar(new Guitar("9284fj42w", 1599.99, Builder.GIBSON, Model.D_28, Type.ELECTRIC, Wood.COCOBOLO, Wood.MAPLE));

	        inventory.search(new Guitar(null, 0, Builder.GIBSON, null, null, null, Wood.MAPLE));
       
        
	}

}
