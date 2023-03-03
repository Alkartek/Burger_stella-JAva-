package com.example.stellburger;

import org.junit.Assert;
import org.junit.Test;

public class BurgerTest extends Base {
    private final static String BASE_URL = "https://stellarburgers.nomoreparties.site/";
    private final static String LOGIN = "ThisISTestMain@mail.ru";
    private final static String PASSWORD_NUMBER = "123456789";
    private final static String PASS = "123456798";

    @Test
    public void Login(){
        MainPage mainPage = new MainPage(BASE_URL);
        mainPage.click_to_LK();
        OrderPage orderPage = new OrderPage();
        orderPage.login_elements(LOGIN,PASSWORD_NUMBER);
    }

    @Test
    public void LoginSecond(){
        MainPage mainPage = new MainPage(BASE_URL);
        mainPage.click_to_LK();

        OrderPage orderPage = new OrderPage();
        String text_result = orderPage.test_login_button();
        Assert.assertTrue(text_result.equals("Войти"));

        orderPage.login_elements(LOGIN,PASS);
    }
}
