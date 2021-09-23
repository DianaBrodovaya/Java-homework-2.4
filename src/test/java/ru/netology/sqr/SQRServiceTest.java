package ru.netology.sqr;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SQRServiceTest {

    @ParameterizedTest
    @CsvSource(
            value = {
                    "200,300,3",
                    "0,10000,90",
                    "-1000,-10,0",
                    "0,99,0",
                    "0,100,1",
                    "9801,10000000000000,1",
                    "100,9801,90",
                    "99,9800,89",
                    "99,9801,90",
                    "99,9802,90",
                    "101,9800,88",
                    "101,9801,89",
                    "101,9802,89"
            }
    )
    void countSquaresInRange(long start, long end, int expected) {
        SQRService service = new SQRService();

        int actual = service.countSquaresInRange(start, end);

        assertEquals(expected, actual);
    }
}