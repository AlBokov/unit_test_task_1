package ru.netology.service;


import org.junit.Test;
import static org.junit.Assert.assertEquals;


public class CashbackHackServiceTest {

    CashbackHackService service = new CashbackHackService();

    @Test
    public void CashBack1000() {
        int actual = service.remain(1000);
        int expected = 0;


        assertEquals(actual,expected);
    }


    @Test
    public void CashBack500() {
        int actual = service.remain(900);
        int expected = 100;


        assertEquals(actual,expected);
    }


    @Test
    public void CashBack2000() {
        int actual = service.remain(2000);
        int expected = 1000;


        assertEquals(actual,expected);
    }



}
