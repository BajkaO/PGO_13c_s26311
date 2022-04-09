package g13c.cw2.zd;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        System.out.println(Vehicle.getExtent().size());
        Vehicle vehicle = new Vehicle("name", LocalDate.now(),1,1, Brand.BMW, new Insurance(null,0));
        Vehicle vehicle1 = new Vehicle("name1", LocalDate.now(),1,1, Brand.Ferrari,new Insurance(null,0));
        vehicle = new Vehicle("name2", LocalDate.now(),1,1, Brand.Toyota, new Insurance(null,0));

        System.out.println(vehicle);

        vehicle.setName("new name");
        System.out.println(vehicle);

        System.out.println(Vehicle.getExtent().size());
        try {
            new Vehicle(null, LocalDate.now(),1,1, Brand.Toyota, new Insurance(null,0));
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(Vehicle.getExtent().size());
    }

}
