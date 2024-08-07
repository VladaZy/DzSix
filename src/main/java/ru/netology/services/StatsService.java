package ru.netology.services;

public class StatsService {
    public long sumSales(long[] sales) {
        long totalSale = 0;
        for (long sale : sales) {
            totalSale += sale;
        }
        return totalSale;

    }

    public long averageSales(long[] sales) {
        return sumSales(sales) / sales.length;
    }

    public int calcMonthMaxSale(long[] sales) {
        int monthMaxSale = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[(int) monthMaxSale]) {
                monthMaxSale = i;

            }
        }
        return monthMaxSale + 1;
    }

    public int calcMonthMinSale(long[] sales) {
        int monthMinSale = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[monthMinSale]) {
                monthMinSale = i;

            }
        }
        return monthMinSale + 1;
    }

    public int salesMonthsBelowAverage(long[] sales) {
        int counter = 0;
        long average = averageSales(sales);
        for (long sale : sales) {
            if (sale < average) {
                counter++;
            }
        }

        return counter;

    }

    public int salesMonthsAboveAverage(long[] sales) {
        int counter = 0;
        long average = averageSales(sales);
        for (long sale : sales) {
            if (sale > average) {
                counter++;
            }
        }

        return counter;
    }

}