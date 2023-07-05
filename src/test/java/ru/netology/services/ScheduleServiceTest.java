package ru.netology.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class ScheduleServiceTest {
    @ParameterizedTest
    @CsvFileSource(files="src/test/resources/counter.csv")
    public void testCalculate1(int expected, int income, int expenses, int threshold) {
        ScheduleService service = new ScheduleService();
        int actual = service.calculate(income, expenses, threshold);

        Assertions.assertEquals(expected, actual);
    }
}