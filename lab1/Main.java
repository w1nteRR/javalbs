package com.company;

public class Main {

    public static void main(String[] args) {
	Clothes jacket = new Clothes();
	Clothes shirt = new Clothes("Nike", "Shirt", 40, 3, 1250.50);
	Clothes hood = new Clothes("s.Oliver", "Hood", 41, 2, 2950.99);

	System.out.println(Jacket.toString());
	System.out.println(Shirt.toString());
	System.out.println(Hood.toString());

	Clothes.printStaticSum();

	jacket.printSum();
	shirt.printSum();
	hood.printSum();
    }
}
