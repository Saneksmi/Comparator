package com.company;

import java.io.Serializable;
import java.util.Comparator;

/**
 * Класс имплементирующий интерфейс Компаратор и реализует
 * метод сравнения по полю name.
 * */
public final class NameComparator implements Comparator<Product>, Serializable {

    @Override
    public int compare(final Product o1, final Product o2) {
        if (o1.getName().length() > o2.getName().length()) {
            return -1;
        }
        if (o1.getName().length() < o2.getName().length()) {
            return 1;
        }
        return 0;
    }
}
