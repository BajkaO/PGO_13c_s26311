
import java.time.LocalDate;
import java.time.Period;
import java.util.*;
import java.util.stream.Collectors;

public class Vehicle {

    private final static Set<Vehicle> extent = new HashSet<>();

    private String name;
    private LocalDate creationDate;
    private final List<Integer> wheels;
    private Brand brand;
    private Insurance insurance;

    public Vehicle(String name, LocalDate creationDate, int wheel1, int wheel2, Brand brand, Insurance insurance) throws ValidationException {
        setName(name);
        setCreationDate(creationDate);
        this.wheels = new ArrayList<>();
        addWheel(wheel1);
        addWheel(wheel2);
        setBrand(brand);
        setInsurance(insurance);
        extent.add(this);
    }

    public Vehicle(String name, int wheel1, int wheel2, Brand brand, String insName, int insNum) throws ValidationException {
        setName(name);
        this.wheels = new ArrayList<>();
        addWheel(wheel1);
        addWheel(wheel2);
        setBrand(brand);
        setInsurance(new Insurance(insName,insNum));
        extent.add(this);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) throws ValidationException {
        if(name == null || name.isEmpty()) throw new ValidationException("Name cannot be empty");
        this.name = name;
    }

    public LocalDate getCreationDate() {
        //checks?
        return creationDate;
    }

    public void setCreationDate(LocalDate creationDate) {
        this.creationDate = creationDate;
    }

    public List<Integer> getWheels() {
        return Collections.unmodifiableList(wheels);
    }

    public void addWheel(int number)
    {
        //checks?
        wheels.add(number);
    }

    public void removeWheels(int number) throws ValidationException {
        //checks?
        if(wheels.size() <= 2)
        {
          throw new ValidationException("Wheels size should be > 2");
        }
        wheels.remove(number);
    }

    public Brand getBrand() {
        return brand;
    }

    public void setBrand(Brand brand) {
        //TODO checks
        this.brand = brand;
    }

    public Period getAge()
    {
        return Period.between(creationDate,LocalDate.now());
    }

    public Insurance getInsurance() {
        return insurance;
    }

    public void setInsurance(Insurance insurance) {
        //TODO checks
        this.insurance = insurance;
    }

    public static Set<Vehicle> getExtent() {
        return Collections.unmodifiableSet(extent);
    }

    public static List<Vehicle> findByName(String name)
    {
        return extent.stream().filter(v -> v.name.equals(name)).collect(Collectors.toList());
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "name='" + name + '\'' +
                ", creationDate=" + creationDate +
                ", wheels=" + wheels +
                ", brand=" + brand +
                ", insurance=" + insurance +
                ", age=" + getAge() +
                '}';
    }
}
