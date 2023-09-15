package com.demoqa.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class LoginPage {
    String loginPagePath = "login";
    SelenideElement
            greetingUnathorized1 = $("h2"),
            greetingUnathorized2 = $("h5"),
            userName = $("#userName"),
            userPassword = $("#password"),
            loginButton = $("#login"),
            mainHeader = $(".main-header"),
            userNameText = $(".text-right").$("#userName-label"),
            userNameValue = $("#userName-value"),
            logoutButton = $("#submit"),
            errorMessage = $("#output");

    public LoginPage openLoginPage() {
        open(loginPagePath);
        return this;
    }

    public void checkGreetingUnauthorized(String unauthGreeting1, String unauthGreeting2) {
        greetingUnathorized1.shouldHave(text(unauthGreeting1));
        greetingUnathorized2.shouldHave(text(unauthGreeting2));
        String unauthorizedUserGreeting = greetingUnathorized1.getText() + greetingUnathorized2.getText();
        System.out.println(unauthorizedUserGreeting);
    }

    public LoginPage inputUserName(String login) {
        userName.setValue(login);
        return this;
    }

    public LoginPage inputUserPassword(String password) {
        userPassword.setValue(password);
        return this;
    }

    public void clickLoginButton() {
        loginButton.click();
    }

    public LoginPage checkMainHeader() {
        mainHeader.shouldHave(text("Profile"));
        return this;
    }

    public void checkAuthorizedUserName(String userName, String login) {
        userNameText.shouldHave(text(String.valueOf(userName)));
        userNameValue.shouldHave(text(login));
        String authorizedUserName = userNameText.getText() + " " + userNameValue.getText();
        System.out.println(authorizedUserName);
    }

    public void clickLogoutButton() {
        logoutButton.click();
    }

    public void checkErrorMessage(String invalidDataMessage) {
        errorMessage.shouldHave(text(invalidDataMessage));
        String errorMessageText = errorMessage.getText();
        System.out.println(errorMessageText);
    }
}