package ru.netology.service;

import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

class CashbackHackServiceTest {

    @Test
    void shouldReturn0IfAmount1000() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount = 1000;
        int actual = cashbackHackService.remain(amount);
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    void shouldReturn499IfAmount501() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount = 501;
        int actual = cashbackHackService.remain(amount);
        int expected = 499;
        assertEquals(expected, actual);
    }

    @Test
    void shouldReturn999IfAmount1() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount = 1;
        int actual = cashbackHackService.remain(amount);
        int expected = 999;
        assertEquals(expected, actual);
    }

}