package ru.netology.stats;

public class StatsService {
    public int sum(int[] sales) {
        int sum = 0;
        for (int sale : sales) {
            sum = sum + sale;
        }
        return sum;
    }

    public int average(int[] sales) {
        int sum = 0;
        for (int sale : sales) {
            sum = sum + sale;
        }
        return sum / sales.length;
    }

    public int maxMonth(int[] sales) {
        int maxMonth = 0;
        for (int i = 0, salesLength = sales.length; i < salesLength; i++) {
            if (i != 0 && sales[maxMonth] < sales[i]) {
                maxMonth = i;
            }

        }
        return maxMonth + 1;
    }

    public int minMonth(int[] sales) {
        int minMonth = 0;
        for (int i = 0, salesLength = sales.length; i < salesLength; i++) {
            if (i != 0 && sales[minMonth] > sales[i]) {
                minMonth = i;
            }

        }
        return minMonth + 1;
    }

    public int countMonthLessThanAverage(int[] sales) {
        int sum = 0;
        for (int sale : sales) {
            sum = sum + sale;
        }
        int average = sum / sales.length;
        int count = 0;
        for (int sale : sales) {
            if (sale < average) {
                count++;
            }
        }
        return count;
    }

    public int countMonthMoreThanAverage(int[] sales) {
        int sum = 0;
        for (int sale : sales) {
            sum = sum + sale;
        }
        int average = sum / sales.length;
        int count = 0;
        for (int sale : sales) {
            if (sale > average) {
                count++;
            }
        }
        return count;
    }
}
