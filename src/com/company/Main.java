package com.company;

import java.util.Set;
import java.util.TreeSet;

/**
 * Программа содержит класс продукт с двумя полями и 2 компаратора,
 * сортирующих по очереди сначала по одному полю, потом по другому.
 * */
public final class Main {
    private Main() {
    }

    public static void main(final String[] args) {

        NameComparator nameComparator = new NameComparator();

        Set<Product> products = new TreeSet<>(nameComparator);
        products.add(new Product("Canon", 253));
        products.add(new Product("Philips", 117));
        products.add(new Product("Meiz", 98));
        products.add(new Product("Huawei", 165));

        for (Product s : products) {
            System.out.println(s.getName());
        }

        System.out.println(" ");
        CountComparator countComparator = new CountComparator();
        Set<Product> products1 = new TreeSet<>(countComparator);
        products1.add(new Product("Canon1", 362));
        products1.add(new Product("Philips1", 267));
        products1.add(new Product("Meiz1", 133));
        products1.add(new Product("Huawei1", 101));

        for (Product s : products1) {
            System.out.println(s.getCount());
        }
    }
}
