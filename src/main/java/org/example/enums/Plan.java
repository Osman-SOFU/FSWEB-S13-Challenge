package org.example.enums;

public enum Plan {
    BASIC("Basic", 50),   // Double değil Integer olarak ayarladık
    PREMIUM("Premium", 100),
    VIP("VIP", 200);

    private final String name;
    private final int price;   // int olarak değiştirdik

    Plan(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {    // int olarak döndürüyor
        return price;
    }

    @Override
    public String toString() {
        return name + " (Price: $" + price + ")";
    }
}
