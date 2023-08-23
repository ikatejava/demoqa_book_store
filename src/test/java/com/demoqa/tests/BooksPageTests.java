package com.demoqa.tests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static com.demoqa.tests.TestData.*;
import static io.qameta.allure.Allure.step;

public class BooksPageTests extends TestBase {
    @Test
    @Tag("books")
    @Tag("positive")
    @DisplayName("Check presence of books in DEMOQA Book Store")
    void checkPresenceOfBooks() {
        step("Open DEMOQA Book Store Books page", () -> {
            booksPage.openBooksPage()
                    .checkBookStoreText();
        });
        step("Authorize in DEMOQA Book Store", () -> {
            booksPage.clickLoginButton();
            loginPage.inputUserName(login)
                    .inputUserPassword(password)
                    .clickLoginButton();
        });
        step("Check books' titles", () -> {
            booksPage.checkGitPocketGuideBook(gitPocketGuideTitle)
                    .checkLearningJSDesignPatternsBook(learningJSDesignPatternsTitle)
                    .checkDesigningWebAPIsBook(designingWebAPIsTitle)
                    .checkSpeakingJSBook(speakingJSTitle)
                    .checkYouDontKnowJSbook(youDontKnowJSTitle)
                    .checkProgrammingJSApplicationsBook(programmingJSApplicationsTitle)
                    .checkEloquentJSBook(eloquentJSTitle)
                    .checkUnderstandingECMAScript6Book(understandingECMAScript6Title);
        });
        step("Log out", () -> {
            loginPage.clickLogoutButton();
        });
    }

    @Test
    @Tag("books")
    @Tag("positive")
    @DisplayName("Check chosen book info")
    void checkBookInfo() {
        step("Open DEMOQA Book Store Books page", () -> {
            booksPage.openBooksPage()
                    .checkBookStoreText();
        });
        step("Authorize in DEMOQA Book Store", () -> {
            booksPage.clickLoginButton();
            loginPage.inputUserName(login)
                    .inputUserPassword(password)
                    .clickLoginButton();
        });
        step("Navigate to the chosen book page", () -> {
            booksPage.clickGitPocketGuideBookLink();
        });
        step("Check 'Git Pocket Guide' book's info", () -> {
            booksPage.checkISBN(gitPocketGuideISBN)
                    .checkTitle(gitPocketGuideTitle)
                    .checkSubTitle(gitPocketGuideSubTitle)
                    .checkAuthor(gitPocketGuideAuthor)
                    .checkPublisher(gitPocketGuidePublisher)
                    .checkNumberOfPages(gitPocketGuideNumberOfPages)
                    .checkDescription(gitPocketGuideDescription)
                    .checkWebsiteLink(gitPocketGuideWebsiteLink);
        });
        step("Log out", () -> {
            loginPage.clickLogoutButton();
        });
    }
}