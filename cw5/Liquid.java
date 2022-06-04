package cw5;

public abstract class Liquid extends Ingredient{
    private int dissolubility;

    public Liquid(String name, int baseReagent, int dissolubility) {
        super(name, baseReagent);
        this.dissolubility = dissolubility;
    }

    public void setDissolubility(int dissolubility) {
        this.dissolubility = dissolubility;
    }

    @Override
    public int getReagent() {
        return (super.getReagent() * dissolubility) / 100;
    }
}
