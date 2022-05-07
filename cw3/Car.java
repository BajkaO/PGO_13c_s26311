package cw3;

public class Car {

    private int weight;
    private Car nextCar;

    public Car(int weight) {
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        if(weight < 0)
        {
            throw new RuntimeException("wage nie moze byc niegatywna");
        }
        this.weight = weight;
    }

    public Car getNextCar() {
        return nextCar;
    }

    public void setNextCar(Car nextCar) {
        this.nextCar = nextCar;
    }

    @Override
    public String toString() {
        return "Car{" +
                "weight=" + weight +
                ", nextCar=" + nextCar +
                '}';
    }
}
