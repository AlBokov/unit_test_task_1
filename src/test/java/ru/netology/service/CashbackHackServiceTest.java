package ru.netology.service;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class CashbackHackServiceTest {

    CashbackHackService service = new CashbackHackService();

    @Test(groups = {"positive"})
    public void CashBack1000() {
        int actual = service.remain(1000);
        int expected = 1000;


        assertEquals(actual,expected);
    }


    @Test(groups = {"negative"})
    public void CashBack500() {
        int actual = service.remain(500);
        int expected = 500;


        assertEquals(actual,expected);
    }


    @Test(groups = {"positive"})
    public void CashBack2000() {
        int actual = service.remain(2000);
        int expected = 1000;


        assertEquals(actual,expected);
    }



}
