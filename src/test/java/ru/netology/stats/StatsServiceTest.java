package ru.netology.stats;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.provider.CsvFileSource;

import static org.junit.jupiter.api.Assertions.*;


class StatsServiceTest {

    @Test
    @CsvFileSource
    void findFullSumm() {
        StatsService service = new StatsService();

        int[] monthsSales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 180;
        long actual = service.getFullSum(monthsSales);

        assertEquals(expected, actual);
    }
    @Test
    @CsvFileSource
    void findAverage() {
        StatsService service = new StatsService();

        int[] monthsSales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 15;
        long actual = service.getAverageSales(monthsSales);

        assertEquals(expected, actual);
    }
    @Test
    @CsvFileSource
    void findMonthMaxSales() {
        StatsService service = new StatsService();

        int[] monthsSales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 8;
        long actual = service.getMonthMaxSales(monthsSales);

        assertEquals(expected, actual);
    }
    @Test
    @CsvFileSource
    void findMonthMinSales() {
        StatsService service = new StatsService();

        int[] monthsSales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 9;
        long actual = service.getMonthMinSales(monthsSales);

        assertEquals(expected, actual);
    }
    @Test
    @CsvFileSource
    void findCountOverAverageSales() {
        StatsService service = new StatsService();

        int[] monthsSales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 5;
        long actual = service.getCountOverAverageSales(monthsSales);

        assertEquals(expected, actual);
    }
    @Test
    @CsvFileSource
    void findCountUnderAverageSales() {
        StatsService service = new StatsService();

        int[] monthsSales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 5;
        long actual = service.getCountUnderAverageSales(monthsSales);

        assertEquals(expected, actual);
    }
}
