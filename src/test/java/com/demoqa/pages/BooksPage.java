package com.demoqa.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.interactable;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class BooksPage {
    String booksPagePath = "books";
    SelenideElement
            bookStoreTextInTheHeader = $(".main-header"),
            loginButton = $("#login"),
            gitPocketGuide = $("a[href='/books?book=9781449325862']"),
            learningJSDesignPatterns = $("a[href='/books?book=9781449331818']"),
            designingWebAPIs = $("a[href='/books?book=9781449337711']"),
            speakingJS = $("a[href='/books?book=9781449365035']"),
            youDontKnowJS = $("a[href='/books?book=9781491904244']"),
            programmingJSApplications = $("a[href='/books?book=9781491950296']"),
            eloquentJS = $("a[href='/books?book=9781593275846']"),
            understandingECMAScript6 = $("a[href='/books?book=9781593277574']"),
            bookISBN = $("#ISBN-wrapper"),
            bookTitle = $("#title-wrapper").$("#userName-value"),
            bookSubTitle = $("#subtitle-wrapper"),
            bookAuthor = $("#author-wrapper"),
            bookPublisher = $("#publisher-wrapper"),
            bookNumberOfPages = $("#pages-wrapper"),
            bookDescription = $("#description-wrapper"),
            bookWebsiteLink = $("#website-wrapper");

    public BooksPage openBooksPage() {
        open(booksPagePath);
        return this;
    }

    public void checkBookStoreText() {
        bookStoreTextInTheHeader.shouldHave(text("Book Store"));
    }

    public void clickLoginButton() {
        loginButton.click();
    }

    public BooksPage checkGitPocketGuideBook(String gitPocketGuideTitle) {
        gitPocketGuide.shouldHave(text(gitPocketGuideTitle));
        String gitPocketGuideName = gitPocketGuide.getText();
        System.out.println(gitPocketGuideName);
        return this;
    }

    public BooksPage checkLearningJSDesignPatternsBook(String learningJSDesignPatternsTitle) {
        learningJSDesignPatterns.shouldHave(text(learningJSDesignPatternsTitle));
        String learningJSDesignPatternsName = learningJSDesignPatterns.getText();
        System.out.println(learningJSDesignPatternsName);
        return this;
    }

    public BooksPage checkDesigningWebAPIsBook(String designingWebAPIsTitle) {
        designingWebAPIs.shouldHave(text(designingWebAPIsTitle));
        String designingWebAPIsName = designingWebAPIs.getText();
        System.out.println(designingWebAPIsName);
        return this;
    }

    public BooksPage checkSpeakingJSBook(String speakingJSTitle) {
        speakingJS.shouldHave(text(speakingJSTitle));
        String speakingJSName = speakingJS.getText();
        System.out.println(speakingJSName);
        return this;
    }

    public BooksPage checkYouDontKnowJSbook(String youDontKnowJSTitle) {
        youDontKnowJS.shouldHave(text(youDontKnowJSTitle));
        String youDontKnowJSName = youDontKnowJS.getText();
        System.out.println(youDontKnowJSName);
        return this;
    }

    public BooksPage checkProgrammingJSApplicationsBook(String programmingJSApplicationsTitle) {
        programmingJSApplications.shouldHave(text(programmingJSApplicationsTitle));
        String programmingJSApplicationsName = programmingJSApplications.getText();
        System.out.println(programmingJSApplicationsName);
        return this;
    }

    public BooksPage checkEloquentJSBook(String eloquentJSTitle) {
        eloquentJS.shouldHave(text(eloquentJSTitle));
        String eloquentJSName = eloquentJS.getText();
        System.out.println(eloquentJSName);
        return this;
    }

    public void checkUnderstandingECMAScript6Book(String understandingECMAScript6Title) {
        understandingECMAScript6.shouldHave(text(understandingECMAScript6Title));
        String understandingECMAScript6Name = understandingECMAScript6.getText();
        System.out.println(understandingECMAScript6Name);
    }

    public void clickGitPocketGuideBookLink() {
        gitPocketGuide.shouldBe(interactable);
        gitPocketGuide.click();
    }

    public BooksPage checkISBN(String isbn) {
        bookISBN.shouldHave(text(isbn));
        String chosenBookISBN = bookISBN.getText();
        System.out.println(chosenBookISBN);
        return this;
    }

    public BooksPage checkTitle(String title) {
        bookTitle.shouldHave(text(title));
        String chosenBookTitle = bookTitle.getText();
        System.out.println(chosenBookTitle);
        return this;
    }

    public BooksPage checkSubTitle(String subTitle) {
        bookSubTitle.shouldHave(text(subTitle));
        String chosenBookSubTitle = bookSubTitle.getText();
        System.out.println(chosenBookSubTitle);
        return this;
    }

    public BooksPage checkAuthor(String author) {
        bookAuthor.shouldHave(text(author));
        String chosenBookAuthor = bookAuthor.getText();
        System.out.println(chosenBookAuthor);
        return this;
    }

    public BooksPage checkPublisher(String publisher) {
        bookPublisher.shouldHave(text(publisher));
        String chosenBookPublisher = bookPublisher.getText();
        System.out.println(chosenBookPublisher);
        return this;
    }

    public BooksPage checkNumberOfPages(int numberOfPages) {
        bookNumberOfPages.shouldHave(text(String.valueOf(numberOfPages)));
        String chosenBookNumberOfPages = bookNumberOfPages.getText();
        System.out.println(chosenBookNumberOfPages);
        return this;
    }

    public BooksPage checkDescription(String description) {
        bookDescription.shouldHave(text(description));
        String chosenBookDescription = bookDescription.getText();
        System.out.println(chosenBookDescription);
        return this;
    }

    public void checkWebsiteLink(String websiteLink) {
        bookWebsiteLink.shouldBe(interactable);
        bookWebsiteLink.shouldHave(text(websiteLink));
        String chosenBookWebsiteLink = bookWebsiteLink.getText();
        System.out.println(chosenBookWebsiteLink);
    }
}