package cw5;

public abstract class Mineral extends Ingredient{
    private int power;

    public Mineral(String name, int baseReagent, int power) {
        super(name, baseReagent);
        this.power = power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    @Override
    public int getReagent() {
        return super.getReagent() + power;
    }

    public int getPower() {
        return power;
    }
}
