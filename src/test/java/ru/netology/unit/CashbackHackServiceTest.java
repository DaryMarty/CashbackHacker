package ru.netology.unit;

import org.junit.Test;

import static org.junit.Assert.*;

public class CashbackHackServiceTest {

    @Test
    public void shouldCalculateRemain() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount = 1600;
        int expected = 400;

        int actual = cashbackHackService.remain(amount);
        assertEquals(expected, actual);
    }

    @Test
    public void shouldCalculateMaxRemain() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount = 1001;
        int expected = 999;

        int actual = cashbackHackService.remain(amount);
        assertEquals(expected, actual);
    }

    @Test
    public void shouldCalculateMinRemain() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount = 999;
        int expected = 1;

        int actual = cashbackHackService.remain(amount);
        assertEquals(expected, actual);
    }

    @Test
    public void shouldCalculateWithoutRemain() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount = 1000;
        int expected = 0;

        int actual = cashbackHackService.remain(amount);
        assertEquals(expected, actual);
    }
}