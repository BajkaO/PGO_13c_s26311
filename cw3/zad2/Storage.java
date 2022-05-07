package cw3.zad2;

import java.util.ArrayList;

public class Storage {

    private int deliveryTimeInDaysFromWarehouse=5;
    private ArrayList <Product> productsInStorage;

    public Storage(int deliveryTimeInDaysFromWarehouse, ArrayList<Product> productsInStorage) {
        this.deliveryTimeInDaysFromWarehouse = deliveryTimeInDaysFromWarehouse;
        this.productsInStorage = productsInStorage;
    }

    public Storage() {
        this.deliveryTimeInDaysFromWarehouse = deliveryTimeInDaysFromWarehouse;
        this.productsInStorage = productsInStorage;
    }

    public int getDeliveryTimeInDaysFromWarehouse() {
        return deliveryTimeInDaysFromWarehouse;
    }

    public void setDeliveryTimeInDaysFromWarehouse(int deliveryTimeInDaysFromWarehouse) {

        if (deliveryTimeInDaysFromWarehouse < 1) {
            throw new RuntimeException("nie moze byc zero");
        }

        this.deliveryTimeInDaysFromWarehouse = deliveryTimeInDaysFromWarehouse;
    }

    public ArrayList<Product> getProductsInStorage() {
        return productsInStorage;
    }

    public void setProductsInStorage(ArrayList<Product> productsInStorage) {
        this.productsInStorage = productsInStorage;
    }

    @Override
    public String toString() {
        return "Storage{" +
                "productsInStorage=" + productsInStorage +
                '}';
    }
}
