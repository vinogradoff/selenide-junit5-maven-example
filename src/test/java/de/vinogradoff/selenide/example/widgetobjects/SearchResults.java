package de.vinogradoff.selenide.example.widgetobjects;


import com.codeborne.selenide.*;

import static com.codeborne.selenide.Selenide.*;

public class SearchResults {

  // Elements
  public ElementsCollection found = $$("#ires .g");

  // Actions
  public SelenideElement getResult(int index) {
    return found.get(index);
  }

}
