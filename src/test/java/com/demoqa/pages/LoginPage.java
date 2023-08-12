package com.demoqa.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Configuration.baseUrl;
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
        open(baseUrl + loginPagePath);
        return this;
    }

    public LoginPage checkGreetingUnauthorized(String unauthGreeting) {
        String unauthorizedUserGreeting = greetingUnathorized1.getText() + greetingUnathorized2.getText();
        unauthorizedUserGreeting.equals(unauthGreeting);
        System.out.println(unauthorizedUserGreeting);
        return this;
    }

    public LoginPage inputUserName(String login) {
        userName.setValue(login);
        return this;
    }

    public LoginPage inputUserPassword(String password) {
        userPassword.setValue(password);
        return this;
    }

    public LoginPage clickLoginButton() {
        loginButton.click();
        return this;
    }

    public LoginPage checkMainHeader() {
        mainHeader.shouldHave(text("Profile"));
        return this;
    }

    public LoginPage checkAuthorizedUserName(String login) {
        String authorizedUserName = userNameText.getText() + " " + userNameValue.getText();
        authorizedUserName.equals("User Name : " + login);
        System.out.println(authorizedUserName);
        return this;
    }

    public LoginPage clickLogoutButton() {
        logoutButton.click();
        return this;
    }

    public LoginPage checkErrorMessage(String invalidDataMessage) {
        String errorMessageText = errorMessage.getText();
        errorMessageText.equals(invalidDataMessage);
        System.out.println(errorMessageText);
        return this;
    }
}
