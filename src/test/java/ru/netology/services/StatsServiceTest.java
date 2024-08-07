package ru.netology.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {
    @Test
    public void testSum() {
        StatsService statsService = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long actual = statsService.sumSales(sales);
        long expected = 8 + 15 + 13 + 15 + 17 + 20 + 19 + 20 + 7 + 14 + 14 + 18;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testAverage() {
        StatsService statsService = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long actual = statsService.averageSales(sales);
        long expected = (8 + 15 + 13 + 15 + 17 + 20 + 19 + 20 + 7 + 14 + 14 + 18) / 12;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testMonthMaximum() {
        StatsService statsService = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long actual = statsService.calcMonthMaxSale(sales);
        long expected = 8;
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void testMonthMinimum() {
        StatsService statsService = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long actual = statsService.calcMonthMinSale(sales);
        long expected = 9;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testSalesMonthsBelowAverage() {
        StatsService statsService = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long actual = statsService.salesMonthsBelowAverage(sales);
        long expected = 5;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testSalesMonthsAboveAverage() {
        StatsService statsService = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long actual = statsService.salesMonthsAboveAverage(sales);
        long expected = 5;
        Assertions.assertEquals(expected, actual);
    }

}