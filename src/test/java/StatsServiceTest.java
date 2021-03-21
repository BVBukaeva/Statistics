import ru.netology.stats.StatsService;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StatsServiceTest {
    int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

    @org.junit.jupiter.api.Test
    void sumTest() {
        StatsService statsService = new StatsService();
        assertEquals(180, statsService.sum(sales));
    }

    @org.junit.jupiter.api.Test
    void averageTest() {
        StatsService statsService = new StatsService();
        assertEquals(15, statsService.average(sales));
    }

    @org.junit.jupiter.api.Test
    void maxMonthTest() {
        StatsService statsService = new StatsService();
        assertEquals(6, statsService.maxMonth(sales));
    }

    @org.junit.jupiter.api.Test
    void minMonthTest() {
        StatsService statsService = new StatsService();
        assertEquals(9, statsService.minMonth(sales));
    }

    @org.junit.jupiter.api.Test
    void countMonthLessThanAverageTest() {
        StatsService statsService = new StatsService();
        assertEquals(5, statsService.countMonthLessThanAverage(sales));
    }

    @org.junit.jupiter.api.Test
    void countMonthMoreThanAverageTest() {
        StatsService statsService = new StatsService();
        assertEquals(5, statsService.countMonthMoreThanAverage(sales));
    }
}
