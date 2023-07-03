package org.example;

import ru.netology.services.javaqamvn.services.RecreationServices;

public class Main {
    public static void main(String[] args) {
        RecreationServices services = new RecreationServices();

        int count = services.calculate(10000, 60000, 150000);
        System.out.println(count);
    }
}