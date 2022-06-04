package cw5;

public class Crystal extends Mineral {
    private int magicPower;

    public Crystal(String name, int baseReagent, int power, int magicPower) {
        super(name, baseReagent, power);
        this.magicPower = magicPower;
    }

    @Override
    public int getReagent() {
        return super.getReagent() + magicPower;
    }
}
