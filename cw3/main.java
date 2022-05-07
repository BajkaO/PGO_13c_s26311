package cw3;

class Main {
    public static void main(String[] args) {
        RailwayStation rs = new RailwayStation("name");

        rs.launchTrain("train1");
        rs.launchTrain("train1");

        rs.getTrains().get(0).addCar(1);
        rs.getTrains().get(0).addCar(2);
        rs.getTrains().get(0).addCar(3);
        rs.getTrains().get(0).addCar(4);

        System.out.println(rs.getTrains().toString());
        System.out.println(rs.getTrains().toString());

        System.out.println(rs.getTrains().get(0).getWeight());
    }

}
