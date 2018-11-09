package de.vinogradoff.selenide.example;



import de.vinogradoff.selenide.example.widgetobjects.*;
import org.junit.jupiter.api.*;

import javax.xml.bind.SchemaOutputResolver;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.CollectionCondition.*;
import static com.codeborne.selenide.Selenide.*;

/**
 * Simple Selenide Test with PageObjects
 */
public class GoogleTest

{
    @Test
    public void searchForSelenide() {
        // Arrange
        open("https://google.com/ncr");
        // Act
        new GoogleSearch().searchFor("selenide");

        // Assert
        SearchResults results = new SearchResults();
        results.found.shouldHave(sizeGreaterThan(1));
        results.getResult(0).shouldHave(text("Selenide: concise UI tests in Java"));

        System.out.println("Parameters used for test:"+
                " googleid.username="+System.getProperty("googleid.username")+
                " googleid.password="+System.getProperty("googleid.password")
        );
    }
}
