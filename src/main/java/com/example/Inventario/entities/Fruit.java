package com.example.Inventario.entities;

public class Fruit {
    public static final String NAME_SEQUENCE = "userSequence";

    private long id;
    private String name;
    private int stock;
    private long unitPrice;
    private String date;
    private String provider;
    
    public Fruit(){}

    public Fruit(String name, int stock, long unitPrice, String date, String provider) {
        this.name = name;
        this.stock = stock;
        this.unitPrice = unitPrice;
        this.date = date;
        this.provider = provider;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public long getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(long unitPrice) {
        this.unitPrice = unitPrice;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getProvider() {
        return provider;
    }

    public void setProvider(String provider) {
        this.provider = provider;
    }

    @Override
    public String toString() {
        return "Fruit [id="+id + 
               "name= " + name +
               "stock= " + stock +
               "unitPrice= " + unitPrice +
               "date= " + date +
               "provider="+ provider +"]";
    }
}
