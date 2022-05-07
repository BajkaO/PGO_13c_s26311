package cw3.zad2;

import java.util.ArrayList;

public class Person {

    private String name;
    private String surname;
    private Double cash;
    private Double onCard;
    private ArrayList <ShoppinkCard> myHistoryOrders;
    private ShoppinkCard myCurOrder;

    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public Person(String name, String surname, Double cash, Double onCard) {
        this.name = name;
        this.surname = surname;
        this.cash = cash;
        this.onCard = onCard;
    }

    public Person(String name, String surname, Double cash, Double onCard, ArrayList<ShoppinkCard> myHistoryOrders, ShoppinkCard myCurOrder) {
        this.name = name;
        this.surname = surname;
        this.cash = cash;
        this.onCard = onCard;
        this.myHistoryOrders = myHistoryOrders;
        this.myCurOrder = myCurOrder;
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

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {

        if (surname == null || surname.isEmpty()) {
            throw new RuntimeException("surname cannot be empty");
        }
        this.surname = surname;

    }

    public Double getCash() {
        return cash;
    }

    public void setCash(Double cash) {
        this.cash = cash;
    }

    public Double getOnCard() {
        return onCard;
    }

    public void setOnCard(Double onCard) {
        this.onCard = onCard;
    }

    public ArrayList<ShoppinkCard> getMyHistoryOrders() {
        return myHistoryOrders;
    }

    public void setMyHistoryOrders(ArrayList<ShoppinkCard> myHistoryOrders) {
        this.myHistoryOrders = myHistoryOrders;
    }

    public ShoppinkCard getMyCurOrder() {
        return myCurOrder;
    }

    public void setMyCurOrder(ShoppinkCard myCurOrder) {
        this.myCurOrder = myCurOrder;
    }
}
