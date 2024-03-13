package Loja_instrumentos;

public class InstrumentSpec {
    private Builder builder;
    private Model model;
    private Type type;
    private Wood backWood;
    private Wood topWood;
    
	public InstrumentSpec(Builder builder, Model model, Type type, Wood backWood, Wood topWood) {
		this.builder = builder;
		this.model = model;
		this.type = type;
		this.backWood = backWood;
		this.topWood = topWood;
	}
	public Builder getBuilder() {
		return builder;
	}
	public void setBuilder(Builder builder) {
		this.builder = builder;
	}
	public Model getModel() {
		return model;
	}
	public void setModel(Model model) {
		this.model = model;
	}
	public Type getType() {
		return type;
	}
	public void setType(Type type) {
		this.type = type;
	}
	public Wood getBackWood() {
		return backWood;
	}
	public void setBackWood(Wood backWood) {
		this.backWood = backWood;
	}
	public Wood getTopWood() {
		return topWood;
	}
	public void setTopWood(Wood topWood) {
		this.topWood = topWood;
	}
	
	public boolean matches(InstrumentSpec searchSpec) {
	    if (builder != searchSpec.builder) {
	        return false;
	    }
	    if (model != searchSpec.model) {
	        return false;
	    }
	    if (type != searchSpec.type) {
	        return false;
	    }
	    if (backWood != searchSpec.backWood) {
	        return false;
	    }
	    if (topWood != searchSpec.topWood) {
	        return false;
	    }
	    return true;
	}
	public String toString() {
		return "\n " + builder +" - "+ model + "\n Tipo: " + type + "\n BackWood: " + backWood + "\n TopWood: " + topWood;
	}
}
