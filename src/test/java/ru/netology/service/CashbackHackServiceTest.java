package ru.netology.service;

import org.junit.Test;

import static org.junit.Assert.*;

public class CashbackHackServiceTest {

    CashbackHackService service = new CashbackHackService();

    @Test
    public void shouldRemain0() {
        int actual = service.remain(1000);
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    public void shouldRemain1000() {
        int actual = service.remain(0);
        int expected = 1000;
        assertEquals(expected, actual);
    }

    @Test
    public void shouldRemain200() {
        int actual = service.remain(800);
        int expected = 200;
        assertEquals(expected, actual);
    }
}
