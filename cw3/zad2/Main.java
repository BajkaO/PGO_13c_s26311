package cw3.zad2;

import java.util.ArrayList;
import java.util.HashMap;

import static cw3.zad2.ProductType.Consumable;
import static cw3.zad2.ProductType.Electronic;

public class Main {

    public static void main(String[] args) {

        System.out.println("start testu");
        // 1. utoworzenie magazynu i dodanie produktow
        // 2. dodanie produktow do sklepu
        // 3. utworznie klienta
        // 4. wykonanie zakupu

        Product produkt1wMagazynie = new Product("produkt 1",Consumable,10);
        Product produkt2wMagazynie = new Product("produkt 2",Electronic,5);

        ArrayList produktyWMagazynie = new ArrayList();
        produktyWMagazynie.add(produkt1wMagazynie);
        produktyWMagazynie.add(produkt2wMagazynie);

        Storage st1 = new Storage(2,produktyWMagazynie);
        System.out.println("magazyn testu " + produkt1wMagazynie.getName() + " " + produktyWMagazynie.toString());


        Product produktWsklepie1 = new Product("produkt 1",Consumable,10);

        Product produktWsklepie2 = new Product("produkt 2",Electronic,99.00,1);
        Product produktWsklepie3 = new Product("produkt 3",Electronic,120.50,4);
        Product produktWsklepie4= new Product("produkt 5",Electronic,12.50,4,st1);

        Person p1 = new Person("Jan","Kowalski", 100.50, 1000.00);
        Person p2 = new Person("Ludwik","Nowak", 1000.50, 1000.00);


        ShoppinkCard koszyk1 = new ShoppinkCard(p1);
        ShoppinkCard koszyk2 = new ShoppinkCard(p2);


        System.out.println("ID testu " + koszyk1.getId());
        System.out.println("ID testu " + koszyk2.getId());
        //p1.setMyCurOrder();

        //koszyk1.addProduct(produktWsklepie1, 2) ;
       // koszyk1.addProduct(produktWsklepie2, 1) ;
        HashMap koszykZiloscioa = new HashMap();

        koszykZiloscioa.put(produktWsklepie2,2);
        koszykZiloscioa.put(produktWsklepie3,1);

        koszyk1.setProdukIIlosc(koszykZiloscioa);
        System.out.println("koszyk zawiera " + koszyk1.getProdukIIlosc().toString());

        koszyk1.setTotalPrice(koszyk1.getProdukIIlosc());

        koszyk1.getTotalPrice();

        System.out.println("Klient " + koszyk1.getPersShopCard().getName() + " musi zaplacic " + koszyk1.getTotalPrice());

        // platnosc

        if (koszyk1.getPersShopCard().getCash() >= koszyk1.getTotalPrice()){

            System.out.println(" platnosc gotowoka ");
            Double wynik = koszyk1.getPersShopCard().getCash() - koszyk1.getTotalPrice();
            koszyk1.getPersShopCard().setCash(wynik);
            System.out.println(" Twoje saldo po zakupie " + koszyk1.getPersShopCard().getCash());


        } else {

            System.out.println(" platnosc karta ");
            Double wynik = koszyk1.getPersShopCard().getOnCard() - koszyk1.getTotalPrice();
            koszyk1.getPersShopCard().setOnCard(wynik);
            System.out.println(" Twoje saldo po zakupie " + koszyk1.getPersShopCard().getOnCard());

        };




    }
}
