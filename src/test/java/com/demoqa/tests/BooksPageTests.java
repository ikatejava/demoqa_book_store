package com.demoqa.tests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static io.qameta.allure.Allure.step;

public class BooksPageTests extends TestBase {
    @Test
    @Tag("books")
    @DisplayName("Check presence of books in DEMOQA Book Store")
    void checkPresenceOfBooks() {
        step("Open DEMOQA Book Store Books page", () -> {
            booksPage.openBooksPage()
                    .checkBookStoreText();
        });
        step("Authorize in DEMOQA Book Store", () -> {
            booksPage.clickLoginButton();
            loginPage.inputUserName(TestData.login)
                    .inputUserPassword(TestData.password)
                    .clickLoginButton();
        });
        step("Check books' titles", () -> {
            booksPage.checkGitPocketGuideBook(TestData.gitPocketGuideTitle)
                    .checkLearningJSDesignPatternsBook(TestData.learningJSDesignPatternsTitle)
                    .checkDesigningWebAPIsBook(TestData.designingWebAPIsTitle)
                    .checkSpeakingJSBook(TestData.speakingJSTitle)
                    .checkYouDontKnowJSbook(TestData.youDontKnowJSTitle)
                    .checkProgrammingJSApplicationsBook(TestData.programmingJSApplicationsTitle)
                    .checkEloquentJSBook(TestData.eloquentJSTitle)
                    .checkUnderstandingECMAScript6Book(TestData.understandingECMAScript6Title);
        });
        step("Log out", () -> {
            loginPage.clickLogoutButton();
        });
    }

    @Test
    @Tag("books")
    @DisplayName("Check chosen book info")
    void checkBookInfo() {
        step("Open DEMOQA Book Store Books page", () -> {
            booksPage.openBooksPage()
                    .checkBookStoreText();
        });
        step("Authorize in DEMOQA Book Store", () -> {
            booksPage.clickLoginButton();
            loginPage.inputUserName(TestData.login)
                    .inputUserPassword(TestData.password)
                    .clickLoginButton();
        });
        step("Navigate to the chosen book page", () -> {
            booksPage.clickGitPocketGuideBookLink();
        });
        step("Check 'Git Pocket Guide' book's info", () -> {
            booksPage.checkISBN(TestData.gitPocketGuideISBN)
                    .checkTitle(TestData.gitPocketGuideTitle)
                    .checkSubTitle(TestData.gitPocketGuideSubTitle)
                    .checkAuthor(TestData.gitPocketGuideAuthor)
                    .checkPublisher(TestData.gitPocketGuidePublisher)
                    .checkNumberOfPages(TestData.gitPocketGuideNumberOfPages)
                    .checkDescription(TestData.gitPocketGuideDescription)
                    .checkWebsiteLink(TestData.gitPocketGuideWebsiteLink);
        });
        step("Log out", () -> {
            loginPage.clickLogoutButton();
        });
    }
}
