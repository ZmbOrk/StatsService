package ru.netology.stats;

public class StatsService {
    public static void main(String[] args) {

        int[] monthsSales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18}; // массив с данными о продажах

        //вывод конечного результата
        int sum = getFullSum(monthsSales);
        System.out.println("Сумма всех продаж: " + sum + " руб.;");

        int average = getAverageSales(monthsSales);
        System.out.println("Средняя сумма: " + average + " руб.;");

        int monthMax = getMonthMaxSales(monthsSales);
        System.out.println("Месяц с максимальными продажами: " + monthMax + ";");

        int monthMin = getMonthMinSales(monthsSales);
        System.out.println("Месяц с минимальными продажами: " + monthMin + ";");

        int countOverAverage = getCountOverAverageSales(monthsSales);
        System.out.println("Количество месяцев с продажами ниже среднего: " + countOverAverage + ";");

        int countUnderAverage = getCountUnderAverageSales(monthsSales);
        System.out.println("Количество месяцев с продажами выше среднего: " + countUnderAverage + ";");
    }

    public static int getFullSum(int[] monthsSales) {
        // считаем сумму всех продаж
        int sum = 0;
        for (int sumMonths : monthsSales) {
            sum += sumMonths;
        }
        return sum;
    }

    public static int getAverageSales(int[] monthsSales) {
        // считаем среднюю сумму продаж в месяц
        int getAverageSales = getFullSum(monthsSales) / 12;
        return getAverageSales;
    }

    public static int getMonthMaxSales(int[] monthsSales) {
        // ищем месяц с макс.продажей
        int salesMax = monthsSales[0];
        int month = 0;
        int monthMax = 1;
        for (int proceed : monthsSales) {
            month++;
            if (salesMax <= proceed) {
                salesMax = proceed;
                monthMax = month;
            }
        }
        return monthMax;
    }

    public static int getMonthMinSales(int[] monthsSales) {
        // ищем месяц с мин.продажей
        int salesMin = monthsSales[0];
        int month = 0;
        int monthMin = 1;
        for (int proceed : monthsSales) {
            month++;
            if (salesMin >= proceed) {
                salesMin = proceed;
                monthMin = month;
            }
        }
        return monthMin;
    }

    public static int getCountOverAverageSales(int[] monthsSales) {
        // кол-во месяцев с продашей ниже среднего
        int proceedsAverage = getAverageSales(monthsSales);
        int count = 0;
        int countUnderAverage = 0;
        for (int proceed : monthsSales) {
            if (proceedsAverage > proceed) {
                count++;
                countUnderAverage = count;
            }
        }
        return countUnderAverage;
    }


    public static int getCountUnderAverageSales(int[] monthsSales) {
        // кол-во месяцев с продашей выше среднего
        int proceedsAverage = getAverageSales(monthsSales);
        int count = 0;
        int countOverAverage = 0;
        for (int proceed : monthsSales) {
            if (proceedsAverage < proceed) {
                count++;
                countOverAverage = count;
            }
        }
        return countOverAverage;
    }
}
