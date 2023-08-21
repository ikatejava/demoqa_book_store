package com.demoqa.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.interactable;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Configuration.baseUrl;
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
            bookTitle = $("#userName-value"),
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

    public BooksPage checkBookStoreText() {
        bookStoreTextInTheHeader.shouldHave(text("Book Store"));
        return this;
    }

    public BooksPage clickLoginButton() {
        loginButton.click();
        return this;
    }

    public BooksPage checkGitPocketGuideBook(String gitPocketGuideTitle) {
        String gitPocketGuideName = gitPocketGuide.getText();
        gitPocketGuideName.equals(gitPocketGuideTitle);
        System.out.println(gitPocketGuideName);
        return this;
    }

    public BooksPage checkLearningJSDesignPatternsBook(String learningJSDesignPatternsTitle) {
        String learningJSDesignPatternsName = learningJSDesignPatterns.getText();
        learningJSDesignPatternsName.equals(learningJSDesignPatternsTitle);
        System.out.println(learningJSDesignPatternsName);
        return this;
    }

    public BooksPage checkDesigningWebAPIsBook(String designingWebAPIsTitle) {
        String designingWebAPIsName = designingWebAPIs.getText();
        designingWebAPIsName.equals(designingWebAPIsTitle);
        System.out.println(designingWebAPIsName);
        return this;
    }

    public BooksPage checkSpeakingJSBook(String speakingJSTitle) {
        String speakingJSName = speakingJS.getText();
        speakingJSName.equals(speakingJSTitle);
        System.out.println(speakingJSName);
        return this;
    }

    public BooksPage checkYouDontKnowJSbook(String youDontKnowJSTitle) {
        String youDontKnowJSName = youDontKnowJS.getText();
        youDontKnowJSName.equals(youDontKnowJSTitle);
        System.out.println(youDontKnowJSName);
        return this;
    }

    public BooksPage checkProgrammingJSApplicationsBook(String programmingJSApplicationsTitle) {
        String programmingJSApplicationsName = programmingJSApplications.getText();
        programmingJSApplicationsName.equals(programmingJSApplicationsTitle);
        System.out.println(programmingJSApplicationsName);
        return this;
    }

    public BooksPage checkEloquentJSBook(String eloquentJSTitle) {
        String eloquentJSName = eloquentJS.getText();
        eloquentJSName.equals(eloquentJSTitle);
        System.out.println(eloquentJSName);
        return this;
    }

    public BooksPage checkUnderstandingECMAScript6Book(String understandingECMAScript6Title) {
        String understandingECMAScript6Name = understandingECMAScript6.getText();
        understandingECMAScript6Name.equals(understandingECMAScript6Title);
        System.out.println(understandingECMAScript6Name);
        return this;
    }

    public BooksPage clickGitPocketGuideBookLink() {
        gitPocketGuide.shouldBe(interactable);
        gitPocketGuide.click();
        return this;
    }

    public BooksPage checkISBN(String isbn) {
        String chosenBookISBN = bookISBN.getText();
        chosenBookISBN.equals(isbn);
        System.out.println(chosenBookISBN);
        return this;
    }

    public BooksPage checkTitle(String title) {
        String chosenBookTitle = bookTitle.getText();
        chosenBookTitle.equals(title);
        System.out.println(chosenBookTitle);
        return this;
    }

    public BooksPage checkSubTitle(String subTitle) {
        String chosenBookSubTitle = bookSubTitle.getText();
        chosenBookSubTitle.equals(subTitle);
        System.out.println(chosenBookSubTitle);
        return this;
    }

    public BooksPage checkAuthor(String author) {
        String chosenBookAuthor = bookAuthor.getText();
        chosenBookAuthor.equals(author);
        System.out.println(chosenBookAuthor);
        return this;
    }

    public BooksPage checkPublisher(String publisher) {
        String chosenBookPublisher = bookPublisher.getText();
        chosenBookPublisher.equals(publisher);
        System.out.println(chosenBookPublisher);
        return this;
    }

    public BooksPage checkNumberOfPages(int numberOfPages) {
        String chosenBookNumberOfPages = bookNumberOfPages.getText();
        chosenBookNumberOfPages.equals(numberOfPages);
        System.out.println(chosenBookNumberOfPages);
        return this;
    }

    public BooksPage checkDescription(String description) {
        String chosenBookDescription = bookDescription.getText();
        chosenBookDescription.equals(description);
        System.out.println(chosenBookDescription);
        return this;
    }

    public BooksPage checkWebsiteLink(String websiteLink) {
        bookWebsiteLink.shouldBe(interactable);
        String chosenBookWebsiteLink = bookWebsiteLink.getText();
        chosenBookWebsiteLink.equals(websiteLink);
        System.out.println(chosenBookWebsiteLink);
        return this;
    }
}
