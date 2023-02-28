package ru.netology.stats;

public class StatsService {

    public long sumSales(long[] sales) {
        long totalSale = 0;
        for (long sale : sales) {
            totalSale += sale;
        }
        return totalSale;
    }

    public long averageSale(long[] sales) {
        return sumSales(sales) / sales.length;
    }

    public int monthMaximumSale(long[] sales) {
        int maximumMonth = 0;
        long maximumSale = sales[0];

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= maximumSale) {
                maximumMonth = i;
                maximumSale = sales[i];
            }
        }

        return maximumMonth + 1;
    }

    public int monthMinimumSale(long[] sales) {
        int minimumMonth = 0;
        long minimumSale = sales[0];

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= minimumSale) {
                minimumMonth = i;
                minimumSale = sales[i];
            }
        }
        return minimumMonth - 1;
    }

    public int monthsBelowAverage(long[] sales) {
        int counter = 0;
        long averageSale = averageSale(sales);
        for (long sale : sales) {
            if (sale < averageSale) {
                counter++;
            }
        }
        return counter;
    }

    public int monthsOverAverage(long[] sales) {
        int counter = 0;
        long averageSale = averageSale(sales);
        for (long sale : sales) {
            if (sale > averageSale) {
                counter++;
            }
        }
        return counter;
    }
}