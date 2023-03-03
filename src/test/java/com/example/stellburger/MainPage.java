package com.example.stellburger;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;

import java.nio.channels.SelectableChannel;

import static com.codeborne.selenide.Selenide.$x;

public class MainPage {
    private final SelenideElement login = $x("//a[@href = \"/account\"]");
    private final SelenideElement orderbutton = $x("//button[@class=\"button_button__33qZ0 button_button_type_primary__1O7Bx button_button_size_large__G21Vg\"]");
    private final SelenideElement loginLowButton = $x("//button[@class=\"button_button__33qZ0 button_button_type_primary__1O7Bx button_button_size_large__G21Vg\"]");

    public MainPage(String URL) {
        Selenide.open(URL);
    }
    public void click_to_LK(){
        login.click();
    }



}
