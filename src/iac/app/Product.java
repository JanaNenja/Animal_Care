package iac.app;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author s9123
 */
public class Product {

    private String Type;
    private String name;
    private int Price;
    private int amount;

    public Product() {
    }

    public Product(String Type, String name, int Price, int amount) {
        this.Price = Price;
        this.name = name;
        this.amount = amount;
        this.Type = Type;
    }

    

    public int getPrice() {
        return Price;
    }

    public void setPrice(int Price) {
        this.Price = Price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return Type;
    }

    public void setType(String Type) {
        this.Type = Type;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public void increase_Amount() {
        this.amount = amount + 1;
    }

    public void decrease_Amount() {
        this.amount = amount - 1;
    }
    @Override
    public String toString() {
        return name+" ,  Price "+Price;
    }
}
