package ru.netology.service;

import static org.junit.Assert.assertEquals;


public class CashBackHackerServiceTest {
    @org.junit.Test
    public void testRemain() {
        CashBackHackerService service = new CashBackHackerService();
        int amount = 1000;
        int actual = service.remain(amount);
        int expected = 0;
        assertEquals(expected, actual);
    }
    @org.junit.Test
    public void testRemainWhithCashback() {
        CashBackHackerService service = new CashBackHackerService();
        int amount = 900;
        int actual = service.remain(amount);
        int expected = 100;
        assertEquals(expected, actual);
    }

}