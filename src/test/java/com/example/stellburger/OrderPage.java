package com.example.stellburger;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class OrderPage {
    private final SelenideElement Mail = $x("//input[@name=\"name\"]");
    private final SelenideElement PASSWORD = $x("//input[@name=\"Пароль\"]");
    private final SelenideElement BUTTON_LOGIN = $x("//button[contains(text(),'Войти')]");


    public void login_elements(String mail, String password){
        Mail.sendKeys(mail);
        PASSWORD.sendKeys(password);
        BUTTON_LOGIN.click();
    }

    public String test_login_button(){
        return BUTTON_LOGIN.getText();
    }
}
