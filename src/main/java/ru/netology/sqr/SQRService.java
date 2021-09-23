package ru.netology.sqr;

public class SQRService {

    int count;

    public int countSquaresInRange(long start, long end) {
        for (int i = 10; i <= 99; i++) {
            if (i * i >= start && i * i <= end) {
                count++;
            }
        }
        return count;
    }
}
