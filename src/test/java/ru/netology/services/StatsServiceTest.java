package ru.netology.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {
    @Test
    public void testSum() {
        StatsService statsService = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int actual = statsService.sumSales(sales);
        int expected = 8 + 15 + 13 + 15 + 17 + 20 + 19 + 20 + 7 + 14 + 14 + 18;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testAverage() {
        StatsService statsService = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int actual = statsService.averageSales(sales);
        int expected = (8 + 15 + 13 + 15 + 17 + 20 + 19 + 20 + 7 + 14 + 14 + 18) / 12;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testMonthMaximum() {
        StatsService statsService = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int actual = statsService.calcMonthMaxSale(sales);
        int expected = 8;
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void testMonthMinimum() {
        StatsService statsService = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int actual = statsService.calcMonthMinSale(sales);
        int expected = 9;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testSalesMonthsBelowAverage() {
        StatsService statsService = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int actual = statsService.salesMonthsBelowAverage(sales);
        int expected = 5;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testSalesMonthsAboveAverage() {
        StatsService statsService = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int actual = statsService.salesMonthsAboveAverage(sales);
        int expected = 5;
        Assertions.assertEquals(expected, actual);
    }

}