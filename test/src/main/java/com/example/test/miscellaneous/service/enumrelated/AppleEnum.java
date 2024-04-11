package com.example.test.miscellaneous.service.enumrelated;

public enum AppleEnum {
    Jonathan(10,"USD"),
    GoldenDel(9, "USD"),
    RedDel,
    Cortland( 10),
    Shimla( "INR"),
    Winesap(15, "EUR");

    private int price; // price of each apple
    private String currency; // price of each apple


    // Constructor with 2 args
    AppleEnum(int p, String currncy) {
        price = p;
        currency = currncy;
    }

    // Constructor with price args
    AppleEnum(int p) {
        price = p;
        //currency = currncy;
    }

    // Constructor with no args
    AppleEnum() {
        price = -1;
    }

    // Constructor with currency args
    AppleEnum(String currncy) {
        //price = p;
        currency = currncy;
    }

    public int getPrice() {
        return price;
    }

    public String getCurrency() {
        return currency;
    }
}
