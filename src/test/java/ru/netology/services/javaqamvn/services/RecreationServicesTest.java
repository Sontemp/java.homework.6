package ru.netology.services.javaqamvn.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RecreationServicesTest {
    @Test
    public void test() {
        RecreationServices services = new RecreationServices();

        int expected = 3;
        int actual = services.calculate(100000, 60000, 150000);
        Assertions.assertEquals(expected, actual);
    }
}
