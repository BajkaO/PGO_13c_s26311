package cw3.zad2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.ListIterator;
import java.util.Map;

public class ShoppinkCard {
    private static int counter = 1;
    private final int Id;
    private Double totalPrice;
    // dodano ilosc produktu w koszyku , nie ilosc dostepnego produkty w sklepie
    private  int iloscProduktu;
    private Double totalDelivTime;
    private Person persShopCard;
    private ArrayList <Product> products;
    private HashMap<Product, Integer> produkIIlosc;

    public ShoppinkCard( Double totalPrice, Double totalDelivTime, Person persShopCard) {
        this.Id = counter++;
        this.totalPrice = totalPrice;
        this.totalDelivTime = totalDelivTime;
        this.persShopCard = persShopCard;
    }

    public ShoppinkCard(Double totalPrice, Double totalDelivTime, Person persShopCard, ArrayList<Product> products) {
        this.Id = counter++;
        this.totalPrice = totalPrice;
        this.totalDelivTime = totalDelivTime;
        this.persShopCard = persShopCard;
        this.products = products;
    }

    public ShoppinkCard(Person persShopCard) {
        this.Id = counter++;
        this.persShopCard = persShopCard;
    }

    public int getId() {
        return Id;
    }


    public Double getTotalPrice() {
        System.out.println("cena za zakupy razem to :" + totalPrice);
        return totalPrice;
    }

    public void setTotalPrice(HashMap produkIIlosc) {
        double sum = 0.0;
        double cena = 0.0;
        for (Object i : produkIIlosc.keySet()) {

           // System.out.println("key: " + i + " value: " + produkIIlosc.get(i));

            Product p = (Product) i;
            cena = p.getPrice();
            int ilosc = (int) produkIIlosc.get(i);

          //  System.out.println( "cena " + p.getPrice());

            sum += (cena * ilosc);
            System.out.println("suma czesciowa " + sum);
            this.totalPrice = sum;
        }

this.totalPrice = sum;


    }

    public Double getTotalDelivTime() {

        return totalDelivTime;
    }

    public void setTotalDelivTime(Double totalDelivTime) {
        this.totalDelivTime = totalDelivTime;
    }

    public Person getPersShopCard() {
        return persShopCard;
    }

    public void setPersShopCard(Person persShopCard) {
        this.persShopCard = persShopCard;
    }

    public ArrayList<Product> getProducts() {
        return products;
    }

    public void setProducts(ArrayList<Product> products) {
        this.products = products;
    }

    public void addProduct(Product product, int iloscProduktu){

        this.products.add(product);
        this.iloscProduktu = iloscProduktu;
    };

    public int getIloscProduktu() {
        return iloscProduktu;
    }

    public void setIloscProduktu(int iloscProduktu) {
        this.iloscProduktu = iloscProduktu;
    }

    public HashMap getProdukIIlosc() {
        return produkIIlosc;
    }

    public void setProdukIIlosc(HashMap produkIIlosc) {
        this.produkIIlosc = produkIIlosc;
    }

    public void addProdukIIlosc(String name, int i) {

    }



}
