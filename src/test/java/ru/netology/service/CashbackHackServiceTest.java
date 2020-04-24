package ru.netology.service;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

class CashBackServiceTest {
    CashbackHackService service = new CashbackHackService();

    @Test
    public void shouldRemain0() {
        int actual = service.remain(1000);
        int expected = 0;
        assertEquals(actual, expected);
    }

    @Test
    public void shouldRemain1000() {
        int actual = service.remain(0);
        int expected = 1000;
        assertEquals(actual, expected);
    }

    @Test
    public void shouldRemain200() {
        int actual = service.remain(800);
        int expected = 200;
        assertEquals(actual, expected);
    }
}
