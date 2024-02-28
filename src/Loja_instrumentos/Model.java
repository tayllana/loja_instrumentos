package Loja_instrumentos;

public enum Model {

    STRATOCASTER,
    LES_PAUL,
    D_28,
    SG,
    TELECASTER,
    JUMBO,
    CUSTOM_TELE,
    SG_STANDARD,
    J_45,
    DREADNOUGHT,
    L_00,
    OM_28,
    CUSTOM_SHOP,
    ANY;

    public String toString() {
        switch (this) {
            case STRATOCASTER: return "Stratocaster";
            case LES_PAUL: return "Les Paul";
            case D_28: return "D-28";
            case SG: return "SG";
            case TELECASTER: return "Telecaster";
            case JUMBO: return "Jumbo";
            case CUSTOM_TELE: return "Custom Tele";
            case SG_STANDARD: return "SG Standard";
            case J_45: return "J-45";
            case DREADNOUGHT: return "Dreadnought";
            case L_00: return "L-00";
            case OM_28: return "OM-28";
            case CUSTOM_SHOP: return "Custom Shop";
            case ANY: return "any";
        }
        return null;
    }
}
