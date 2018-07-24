package data;

public enum Jewelry {
    NECKLACE("Gold necklace", "Necklace mould", "Gold bar", 446, 21),
    RING("Gold ring", "Ring mould", "Gold bar", 446, 7),
    AMULET("Gold amulet", "Amulet mould", "Gold bar", 446, 34);
    //BRACELET("Gold bracelet", "Bracelet mould", "Gold bar", 446, 34);

    private final String jewelryName, mouldName, barName;
    private final int interfaceParent, interfaceComponent;

    Jewelry(final String jewelryName, final String mouldName, final String barName, final int interfaceParent, final int interfaceComponent) {
        this.jewelryName = jewelryName;
        this.mouldName = mouldName;
        this.barName = barName;
        this.interfaceParent = interfaceParent;
        this.interfaceComponent = interfaceComponent;
    }

    public String getJewelryName() {
        return this.jewelryName;
    }

    public String getMouldName() {
        return this.mouldName;
    }

    public String getBarName() {
        return this.barName;
    }

    public int getInterfaceParent() {
        return this.interfaceParent;
    }

    public int getInterfaceComponent() {
        return this.interfaceComponent;
    }
}

