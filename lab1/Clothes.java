package com.company;

public class Clothes {
    private String brand;
    private String typeClothes;
    private int size;
    private int amount;
    private double price;

    public static double totalPrice = 0.0;


    public Clothes() {
        brand = "Columbia";
        typeClothes = "Jacket";
        size = 42;
        amount = 2;
        price = 3450;
        totalPrice = amount * price;
    }

    public Clothes(String brand, String typeClothes, int size, int amount) {
        setBrand(brand);
        setType(typeClothes);
        setSize(size);
        setAmount(amount);
    }

    public Clothes(String brand, String typeClothes, int size, int amount, double price) {
        setBrand(brand);
        setType(typeClothes);
        setSize(size);
        setAmount(amount);
        setPrice(price);
        setTotalPrice(amount * price);
    }

    public String toString() {
        return "Brand: " + getBrand() + " Amount: " + getAmount() + " Type: " + getType() + " Size: " + getSize() + " Price: " + getPrice();
    }


    public static void printStaticSum() {
        System.out.println("Stat price: " + totalPrice);
    }

    public void printSum() {
        System.out.println("Total price:" + amount * price);
    }

    public void resetValue(String brand, String typeClothes, int size, int amount, double price) {
        setBrand(brand);
        setType(typeClothes);
        setSize(size);
        setAmount(amount);
        setPrice(price);
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getType() {
        return typeClothes;
    }

    public void setType(String type) {
        this.typeClothes = type;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public static double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }
}










