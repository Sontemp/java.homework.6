package ru.netology.services.javaqamvn.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RecreationServicesTest {
    @Test
    public void test() {
        RecreationServices services = new RecreationServices();

        int income = 10000;
        int expense = 3000;
        int threshold = 20000;

        int actual = services.calculate(income, expense, threshold);
        int expected = 3;
        Assertions.assertEquals(actual, expected);
    }
}
