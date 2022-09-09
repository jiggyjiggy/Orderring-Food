package org.example;

import java.util.Objects;

public class Menuitem {
    private final String name;
    private final int price;

    public Menuitem(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Menuitem menuitem = (Menuitem) o;
        return price == menuitem.price && Objects.equals(name, menuitem.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, price);
    }
}
