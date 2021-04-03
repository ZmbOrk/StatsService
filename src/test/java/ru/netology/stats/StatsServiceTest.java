package ru.netology.stats;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import ru.netology.stats.StatsService;
import java.util.Arrays;


import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {

    @ParameterizedTest
    @CsvFileSource
    void shouldfullSum (String line) {
        StatsService  service= new StatsService();
        //конвертируем строку в int
        int[] monthsSales = Arrays.stream(line.split(",")).mapToInt(Integer::parseInt).toArray();
        int actual = service.getFullSum(monthsSales);

        int expected = 180;

        assertEquals(expected, actual);
    }

}