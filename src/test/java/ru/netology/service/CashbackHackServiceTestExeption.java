package ru.netology.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CashbackHackServiceTestExeption {

    @Test
    public void testIllegalArgumentException() {
        final CashbackHackService expectEx = new CashbackHackService();
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
        expectEx.remain(0);
        });
        assertEquals("amount must be greater than zero", exception.getMessage());
    }

}