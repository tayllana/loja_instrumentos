package Loja_instrumentos;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        Inventory inventory = new Inventory(null);
        initializeInventory(inventory);

        Map<String, Object> properties = new HashMap<>();
        
        properties.put("builder", Builder.COLLINGS);
        properties.put("backWood", Wood.SITKA);

        InstrumentSpec clientSpec = new InstrumentSpec(properties);

        List<Instrument> matchingInstruments = inventory.search(clientSpec);

        if (!matchingInstruments.isEmpty()) {
            System.out.println("\n Você pode gostar desses instrumentos:");

            for (Instrument instrument : matchingInstruments) {
                InstrumentSpec spec = instrument.getSpec();

                System.out.println("\n Temos " + spec.getProperties().get("instrumentType") +
                        " com as seguintes propriedades:");
                
                Map<String, Object> property = spec.getProperties();
                
                System.out.println("\n "+property.get("instrumentType")+" | " + instrument.getSerialNumber() + " | R$ "+instrument.getPrice());
                
                for (String propertyName : spec.getProperties().keySet()) {
                    if (!propertyName.equals("instrumentType")) {
                        System.out.println("  " + propertyName + ": " +
                                spec.getProperties().get(propertyName));
                    }
                }
                System.out.println("Você pode ter este " +
                        spec.getProperties().get("instrumentType") + " por $" +
                        instrument.getPrice() + "---");
            }
        } else {
            System.out.println("Sinto muito, não temos nada para você.");
        }
    }

    private static void initializeInventory(Inventory inventory) {

        Map<String, Object> properties = new HashMap<>();

        properties.put("instrumentType", InstrumentType.GUITAR);
        properties.put("builder", Builder.COLLINGS);
        properties.put("model", Model.D_28);
        properties.put("type", Type.ACOUSTIC);
        properties.put("numStrings", 6);
        properties.put("topWood", Wood.INDIAN_ROSEWOOD);
        properties.put("backWood", Wood.SITKA);

        inventory.addInstrument("11277", 3999.95, new InstrumentSpec(properties));
        
//        Map<String, Object> properties2 = new HashMap<>();
        properties.put("instrumentType", InstrumentType.GUITAR);
        properties.put("builder", Builder.COLLINGS);
        properties.put("model", Model.DREADNOUGHT);
        properties.put("type", Type.ELECTRIC);
        properties.put("numStrings", 6);
        properties.put("topWood", Wood.ADIRONDACK);
        properties.put("backWood", Wood.SITKA);

        inventory.addInstrument("11437", 1999.95, new InstrumentSpec(properties));
    }

}
