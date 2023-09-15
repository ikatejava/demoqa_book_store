package com.demoqa.tests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static com.demoqa.tests.TestData.*;
import static io.qameta.allure.Allure.step;

public class LoginPageTests extends TestBase {
    @Test
    @Tag("login")
    @Tag("positive")
    @DisplayName("Successful authorization in DEMOQA Book Store")
    void successfulAuthorization() {
        step("Open DEMOQA Book Store Login page", () -> {
            loginPage.openLoginPage()
                    .checkGreetingUnauthorized(unauthGreeting1, unauthGreeting2);
        });
        step("Fill out authorization form", () -> {
            loginPage.inputUserName(login)
                    .inputUserPassword(password)
                    .clickLoginButton();
        });
        step("Check that the user is authorized", () -> {
            loginPage.checkMainHeader()
                    .checkAuthorizedUserName(userNameText, login);
        });
        step("Log out", () -> {
            loginPage.clickLogoutButton();
        });
    }

    @Test
    @Tag("login")
    @Tag("negative")
    @DisplayName("Unsuccessful authorization in DEMOQA Book Store with wrong username")
    void authorizationWithWrongUserName() {
        step("Open DEMOQA Book Store Login page", () -> {
            loginPage.openLoginPage()
                    .checkGreetingUnauthorized(unauthGreeting1, unauthGreeting2);
        });
        step("Fill out authorization form", () -> {
            loginPage.inputUserName(wrongLogin)
                    .inputUserPassword(password)
                    .clickLoginButton();
        });
        step("Check error message", () -> {
            loginPage.checkErrorMessage(invalidDataMessage);
        });
    }

    @Test
    @Tag("login")
    @Tag("negative")
    @DisplayName("Unsuccessful authorization in DEMOQA Book Store with wrong password")
    void authorizationWithWrongPassword() {
        step("Open DEMOQA Book Store Login page", () -> {
            loginPage.openLoginPage()
                    .checkGreetingUnauthorized(unauthGreeting1, unauthGreeting2);
        });
        step("Fill out authorization form", () -> {
            loginPage.inputUserName(login)
                    .inputUserPassword(wrongPassword)
                    .clickLoginButton();
        });
        step("Check error message", () -> {
            loginPage.checkErrorMessage(invalidDataMessage);
        });
    }
}
