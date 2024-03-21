package Loja_instrumentos;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class InstrumentSpec {
    private Map<String, Object> properties;

	public InstrumentSpec(Map<String, Object> properties) {
		super();
		this.properties = properties;
	}
	
    public Map<String, Object> getProperties() {
		return properties;
	}

	public void setProperties(Map<String, Object> properties) {
		this.properties = properties;
	}

	public boolean matches(InstrumentSpec otherSpec) {
        for (Iterator<String> i = otherSpec.getProperties().keySet().iterator(); i.hasNext();) {
            String propertyName = i.next();
            if (!properties.get(propertyName).equals(otherSpec.getProperties().get(propertyName))) {
                return false;
            }
        }
        return true;
    }
}
