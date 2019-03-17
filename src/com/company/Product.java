package com.company;

/**
 * Класс Продукт, содержит поля, конструктор и геттер.
 * */
public final class Product {

    private String name;
    private int count;

    public Product(final String name, final int count) {
        this.name = name;
        this.count = count;
    }

    public String getName() {
        return name;
    }

    public int getCount() {
        return count;
    }
}
