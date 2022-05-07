package cw3;

public class Train {

    private enum C
    {
        a,v,b
    }



    private String name;
    private Car car;

    public Train(String name) {
        setName(name);
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null || name.isEmpty()) {
            throw new RuntimeException("Name cannot be empty");
        }
        this.name = name;
        C c = null;
    }

    public void addCar(int w)
    {
        if(car == null) {
            car = new Car(w);
            return;
        }
        Car current = car;
        while (current.getNextCar() != null)
        {
            current = current.getNextCar();
        }
        current.setNextCar(new Car(w));
    }

    public int getWeight()
    {
        if(car == null) {
            return 0;
        }
        int result = 0;

        Car current = car;
        while (current.getNextCar() != null)
        {
            result += current.getWeight();
            current = current.getNextCar();
        }
        result += current.getWeight();
        return result;
    }

    public String newToString()
    {
        String str = "Train{" +
                "name='" + name + "\n";
        Car current = car;
        while (current.getNextCar() != null)
        {
            str += "\tcar=" + current.getWeight() + ";\n";
            current = current.getNextCar();
        }
        str += "\tcar=" + current.getWeight() + ";";

        return str;
    }

    @Override
    public String toString() {
        return "Train{" +
                "name='" + name + '\'' +
                '}';
    }

}
