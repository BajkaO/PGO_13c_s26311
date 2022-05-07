package cw3.zad2;

public class Product {

   private  String name;
   private ProductType productType;
   private Double price;
    // ilosc dostepnego produktu w sklepie
    private int quantity;
    private boolean isAva;
    private Storage storage;
    // ustalilam 3 dni robocze na wysylke ze sklepu
    private int czasWysylkiZeSklepu = 0;


    public Product(String name, ProductType productType, int quantity) {
        this.name = name;
        this.productType = productType;
        this.quantity = quantity;
    }

    public Product(String name, ProductType productType, Double price, int quantity) {
        this.name = name;
        this.productType = productType;
        this.price = price;
        this.quantity = quantity;
        if (getQuantity()>0){
            this.isAva = true;} else
            this.isAva = false;

    }

    public Product(String name, ProductType productType, Double price, int quantity, Storage storage) {
        this.name = name;
        this.productType = productType;
        this.price = price;
        this.quantity = quantity;
        if (getQuantity()>0){
            this.isAva = true;} else
            this.isAva = false;
        this.storage = storage;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {

        if (name == null || name.isEmpty()) {
            throw new RuntimeException("Name cannot be empty");
        }
        this.name = name;

    }

    public ProductType getProductType() {
        return productType;
    }

    public void setProductType(ProductType productType) {
        this.productType = productType;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {

        if (price == 0.0 || price == null) {
            throw new RuntimeException("price cannot be empty");
        }

        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {

        if (quantity == 0 ||quantity == Integer.parseInt(null)) {
            throw new RuntimeException("quantity cannot be empty");
        }


        this.quantity = quantity;
    }

    public boolean isAva() {
        return isAva;
    }

    public void setAva() {
         if (getQuantity()>0){
        isAva = true;} else
            isAva = false;
    }

    public Storage getStorage() {
        return storage;
    }

    public void setStorage(Storage storage) {
        this.storage = storage;
    }

    public void sellProd(int amount){

        quantity= quantity-amount;


    };

    public int increaseQuant(int amount){

        return quantity= quantity + amount;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", productType=" + productType +
                ", price=" + price +
                ", quantity=" + quantity +
                ", isAva=" + isAva +
                ", storage=" + storage +
                ", czasWysylkiZeSklepu=" + czasWysylkiZeSklepu +
                '}';
    }
}
