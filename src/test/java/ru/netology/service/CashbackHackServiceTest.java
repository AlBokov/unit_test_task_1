package ru.netology.service;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class CashbackHackServiceTest {

    CashbackHackService service = new CashbackHackService();

    @Test(groups = {"positive"})
    public void CashBack1000() {
        int actual = service.remain(1000);
        int expected = 0;


        assertEquals(actual,expected);
    }


    @Test(groups = {"negative"})
    public void CashBack500() {
        int actual = service.remain(900);
        int expected = 100;


        assertEquals(actual,expected);
    }


    @Test(groups = {"positive"})
    public void CashBack2000() {
        int actual = service.remain(1900);
        int expected = 100;


        assertEquals(actual,expected);
    }



}
