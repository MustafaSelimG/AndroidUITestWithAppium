package steps;

import pages.HomePage;
import pages.MyAccountPage;
import pages.ProductPage;
import pages.SearchResultPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.net.MalformedURLException;

public class MyStepDefs {
    HomePage homePage = new HomePage();
    MyAccountPage myAccountPage = new MyAccountPage();
    ProductPage productPage = new ProductPage();
    SearchResultPage searchResultPage = new SearchResultPage();

    public MyStepDefs() throws MalformedURLException {
    }

    @When("I open the hamburger menu")
    public void ıOpenTheHamburgerMenu() {
        homePage.clickHamburgerMenu();
    }

    @And("I open the My Account section")
    public void ıOpenTheMyAccountSection() {
        homePage.clickMyAccount();
    }

    @And("I open the Sign In section")
    public void ıOpenTheSignInSection() {
        myAccountPage.clickSignInSection();
    }

    @And("I enter email {string} and password {string}")
    public void ıEnterEmailAndPassword(String email, String password) {
        myAccountPage.SignIn(email, password);
    }

    @And("I add product the favorites")
    public void ıAddProductTheFavorites() {
        productPage.setTitle();
        productPage.addProductToFavorites();
    }

    @And("I open the Favorite Ads")
    public void ıOpenTheFavoriteAds() {
        myAccountPage.clickFavoriteList();
    }

    @When("I open the real estate")
    public void ıOpenTheRealEstate() {
        homePage.clickRealEstate();
    }

    @And("I open the residential")
    public void ıOpenTheResidential() {
        homePage.clickResidential();
    }

    @And("I open the daily rentals")
    public void ıOpenTheDailyRentals() {
        homePage.clickDailyRentals();
    }

    @And("I open the flats")
    public void ıOpenTheFlats() {
        homePage.clickFlats();
    }

    @And("I filter the threePlusOne flats")
    public void ıFilterTheFlats() {
        searchResultPage.filterFlats();
    }

    @And("I sort by higher price")
    public void ıSortByHigherPrice() {
        searchResultPage.sortByHigherPrice();
    }

    @And("I open the first product")
    public void ıOpenTheFirstProduct() {
        searchResultPage.clickFirstProduct();
    }

    @And("I open the Special To Me section")
    public void ıOpenTheSpecialToMeSection() {
        homePage.clickSpecialToMe();
    }

    @Then("username {string} should be seen")
    public void usernameShouldBeSeen(String username) {
        myAccountPage.verifyUsername(username);
    }

    @Then("product name should be seen")
    public void productNameShouldBeSeen() {
        productPage.verifyProductName();
    }

}
