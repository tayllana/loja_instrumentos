package Loja_instrumentos;


public class GuitarSpec {
    private Builder builder;
    private Model model;
    private Type type;
    private Wood backWood;
    private Wood topWood;
    private int numStrings;
    

	public GuitarSpec(Builder builder, Model model, Type type, Wood backWood, Wood topWood, int numStrings) {
		this.builder = builder;
		this.model = model;
		this.type = type;
		this.backWood = backWood;
		this.topWood = topWood;
		this.numStrings = numStrings;
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


	public int getNumStrings() {
		return numStrings;
	}


	public void setNumStrings(int numStrings) {
		this.numStrings = numStrings;
	}
	public boolean matches(GuitarSpec searchSpec) {
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
	    if (numStrings != searchSpec.numStrings) {
	        return false;
	    }
	    return true;
	}
//	public boolean matches(GuitarSpec searchSpec) {
//	    if (searchSpec.builder != null && builder != searchSpec.builder) {
//	        return false;
//	    }
//	    if (searchSpec.model != null && model != searchSpec.model) {
//	        return false;
//	    }
//	    if (searchSpec.type != null && type != searchSpec.type) {
//	        return false;
//	    }
//	    if (searchSpec.backWood != null && backWood != searchSpec.backWood) {
//	        return false;
//	    }
//	    if (searchSpec.topWood != null && topWood != searchSpec.topWood) {
//	        return false;
//	    }
//	    if (searchSpec.numStrings != 0 && numStrings != searchSpec.numStrings) {
//	        return false;
//	    }
//	    return true;
//	}


	@Override
	public String toString() {
		return "\n " + builder +" - "+ model + "\n Tipo: " + type + "\n BackWood: " + backWood + "\n TopWood: " + topWood + "\n Nº cordas: " + numStrings;
	}

}
