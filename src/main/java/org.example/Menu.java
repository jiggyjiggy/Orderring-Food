package org.example;

import java.util.List;

public class Menu {
    private final List<Menuitem> menuitems;

    public Menu(List<Menuitem> menuitems) {
        this.menuitems = menuitems;
    }

    public Menuitem choose(String name) {
        return new Menuitem("돈까스", 5000);
    }
}
