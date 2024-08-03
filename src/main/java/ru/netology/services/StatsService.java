package ru.netology.services;

public class StatsService {
    public int sumSales(int[] sales) {
        int totalSale = 0;
        for (int sale : sales) {
            totalSale += sale;
        }
        return totalSale;

    }

    public int averageSales(int[] sales) {
        return sumSales(sales) / sales.length;
    }

    public int calcMonthMaxSale(int[] sales) {
        int monthMaxSale = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[monthMaxSale]) {
                monthMaxSale = i;

            }
        }
        return monthMaxSale + 1;
    }

    public int calcMonthMinSale(int[] sales) {
        int monthMinSale = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[monthMinSale]) {
                monthMinSale = i;

            }
        }
        return monthMinSale + 1;
    }

    public int salesMonthsBelowAverage(int[] sales) {
        int counter = 0;
        int average = averageSales(sales);
        for (int sale : sales) {
            if (sale < average) {
                counter++;
            }
        }

        return counter;

    }

    public int salesMonthsAboveAverage(int[] sales) {
        int counter = 0;
        int average = averageSales(sales);
        for (int sale : sales) {
            if (sale > average) {
                counter++;
            }
        }

        return counter;
    }

}