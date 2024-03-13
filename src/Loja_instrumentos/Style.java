package Loja_instrumentos;

public enum Style {

    A_STYLE, F_STYLE, OVAL_STYLE, TEAR_DROP_STYLE;

    @Override
    public String toString() {
        switch (this) {
            case A_STYLE: return "A-Style";
            case F_STYLE: return "F-Style";
            case OVAL_STYLE: return "Oval-Style";
            case TEAR_DROP_STYLE: return "Tear Drop-Style";
            default: return super.toString();
        }
    }
}
