package Loja_instrumentos;

public class GuitarSpec {
    private Builder builder;
    private Model model;
    private Type type;
    private Wood backWood;
    private Wood topWood;
    
	public GuitarSpec(Builder builder, Model model, Type type, Wood backWood, Wood topWood) {
		super();
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

	@Override
	public String toString() {
		return "\n " + builder +" - "+ model + "\n Tipo: " + type + "\n BackWood: " + backWood + "\n TopWood: " + topWood;
	}

}
