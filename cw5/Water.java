package cw5;

public class Water extends Liquid {
    private boolean destilated;

    public Water(String name, int baseReagent, int dissolubility, boolean destilated) {
        super(name, baseReagent, dissolubility);
        this.destilated = destilated;
    }

    @Override
    public int getReagent() {
        return destilated ?
                super.getReagent()
                : super.getReagent() / 2;
    }
}
