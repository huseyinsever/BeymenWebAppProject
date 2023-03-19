package StepDefinitions;

import Pages.DialogContent;
import Utilities.GWD;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class BeymenStepDefinitions {
    DialogContent dc=new DialogContent();
    @Given("Navigate to Beymen Website")
    public void navigateToBeymenWebsite() {
        GWD.getDriver().get("https://www.beymen.com/");
        GWD.getDriver().manage().window().maximize();
    }

    @And("Verify menu options")
    public void verifyMenuOptions() {
        dc.findAndClick("cerezButton");
        dc.findAndClick("closeButton");
        List <String> expectedList=new ArrayList<>();
        expectedList.add("Kadın");
        expectedList.add("Erkek");
        expectedList.add("Çocuk");
        expectedList.add("Kozmetik");
        expectedList.add("Ev & Mobilya");
        expectedList.add("Anne & Bebek & Oyuncak");
        expectedList.add("Teknoloji");
        expectedList.add("Spor & Outdoor");
        expectedList.add("Yaşam");
        expectedList.add("Outlet");

        for (int i = 0; i < expectedList.size(); i++) {
            Assert.assertEquals(expectedList.get(i),dc.navbarList.get(i).getText());
        }

    }

    @And("Go to the Woman section from the menu options")
    public void goToTheWomanSectionFromTheMenuOptions() {
        dc.hoverOver1();
    }

    @And("Go to bag")
    public void goToBag() {
        GWD.Bekle();
        dc.hoverOver2();
    }

    @And("From the Bag section, click on Shoulder Bag")
    public void fromTheBagSectionClickOnShoulderBag() {
        dc.findAndClick("shoulderBag");
    }

    @And("Choose Boxy Pink Leather Crossbody Bag")
    public void chooseBoxyPinkLeatherCrossbodyBag() {
        dc.findAndClick("pinkLeatherBag");
    }

    @And("Click Add to Cart")
    public void clickAddToCart() {
        JavascriptExecutor js=(JavascriptExecutor)GWD.getDriver();
        js.executeScript("arguments[0].scrollIntoView();",dc.addToCart);
        GWD.Bekle();
        dc.findAndClick("addToCart");
    }

    @And("Verify Added to Cart")
    public void verifyAddedToCart() {
        dc.verifyText("verifyCart","Ürün sepetinize eklenmiştir.");
    }

    @And("Go back to Beymen Homepage")
    public void goBackToBeymenHomepage() {
        dc.findAndClick("homepageBack");
    }

    @And("Go to the Male section from the menu options")
    public void goToTheMaleSectionFromTheMenuOptions() {
        dc.hoverOver3();
    }

    @And("Click on Sweatshirt from Clothing section")
    public void clickOnSweatshirtFromClothingSection() {
        GWD.Bekle();
        WebElement sweatshirt=GWD.getDriver().findElement(By.xpath("(//a[text()='Sweatshirt'])[2]"));
        sweatshirt.click();
    }

    @And("Choose the Summit Gray Hoodie")
    public void chooseTheSummitGrayHoodie() {
        GWD.Bekle();
        JavascriptExecutor js=(JavascriptExecutor)GWD.getDriver();
        js.executeScript("arguments[0].scrollIntoView();",dc.summitGrayTshirt);
        dc.findAndClick("summitGrayTshirt");
    }


    @And("Please choose size S")
    public void pleaseChooseSizeS() {
        dc.findAndClick("chooseSizeS");
        JavascriptExecutor js=(JavascriptExecutor)GWD.getDriver();
        js.executeScript("arguments[0].scrollIntoView();",dc.addToCart);
        GWD.Bekle();
        dc.findAndClick("addToCart");
        dc.verifyText("verifyCart","Ürün sepetinize eklenmiştir.");
        GWD.getDriver().get("https://www.beymen.com/");
    }

    @And("Go to Kids section from menu options")
    public void goToKidsSectionFromMenuOptions() {
        WebDriverWait wait=new WebDriverWait(GWD.getDriver(), Duration.ofSeconds(30));
        wait.until(ExpectedConditions.urlContains("https://www.beymen.com/"));
        dc.hoverOver4();
    }

    @And("Go Boy")
    public void goBoy() {
        GWD.Bekle();
        dc.hoverOver5();
    }

    @And("Click on Shirts from the Boys section")
    public void clickOnShirtsFromTheBoysSection() {
        WebElement shirts=GWD.getDriver().findElement(By.xpath("(//a[text()='Gömlek'])[3]"));
        shirts.click();
    }

    @And("Choose the Polo Ralph Lauren Shirt")
    public void chooseThePoloRalphLaurenShirt() {
        JavascriptExecutor js=(JavascriptExecutor)GWD.getDriver();
        js.executeScript("arguments[0].scrollIntoView();",dc.poloLaurenT);
        dc.findAndClick("poloLaurenT");
    }

    @And("Please choose size M")
    public void pleaseChooseSizeM() {
        dc.findAndClick("chooseSizeM");
        dc.findAndClick("addToCart");
        dc.verifyText("verifyCart","Ürün sepetinize eklenmiştir.");
    }

    @And("Go to Cart")
    public void goToCart() {
        dc.findAndClick("gotoCart");
    }

    @And("Verify that all added products have arrived in the cart")
    public void verifyThatAllAddedProductsHaveArrivedInTheCart() {
        WebDriverWait wait=new WebDriverWait(GWD.getDriver(),Duration.ofSeconds(30));
        wait.until(ExpectedConditions.urlContains("https://www.beymen.com/cart"));
        GWD.Bekle(); //-----------------------//
        WebElement itemThree=GWD.getDriver().findElement(By.xpath("(//div[@class='m-basket__productTools'])[3]"));
        JavascriptExecutor js=(JavascriptExecutor)GWD.getDriver();
        js.executeScript("arguments[0].scrollIntoView();",itemThree);
        GWD.Bekle(); //-----------------------//
        WebElement itemThreeVerify=GWD.getDriver().findElement(By.xpath("//span[text()='Boxy Pembe Deri Çapraz Çanta']"));
        Assert.assertTrue(itemThreeVerify.getText().contains("Boxy Pembe Deri Çapraz Çanta"));

        js.executeScript("window.scrollTo(document.body.scrollHeight, 0)");
        WebElement itemTwoVerify=GWD.getDriver().findElement(By.xpath("//span[text()='Summit Gri Kapüşonlu Sweatshirt']"));
        Assert.assertTrue(itemTwoVerify.getText().contains("Summit Gri Kapüşonlu Sweatshirt"));

        WebElement itemOneVerify= GWD.getDriver().findElement(By.xpath("//span[text()='Kırmızı Siyah Ekoseli Erkek Çocuk Gömlek']"));
        Assert.assertTrue(itemOneVerify.getText().contains("Kırmızı Siyah Ekoseli Erkek Çocuk Gömlek"));

    }

    @And("Verify all items in the Order Summary")
    public void verifyAllItemsInTheOrderSummary() {
        dc.verifyText("orderVerify1","7.348,00 TL");
        dc.verifyText("orderVerify2","-450,00 TL");
        dc.verifyText("orderVerify3","-450,00 TL");
        dc.verifyText("orderVerify4","0,00 TL");
        dc.verifyText("orderVerify5","6.898,00 TL");
    }

    @When("Delete all items in the cart and verify that there are no items in the cart")
    public void deleteAllItemsInTheCartAndVerifyThatThereAreNoItemsInTheCart() {
        dc.findAndClick("deleteItem");
        WebDriverWait wait=new WebDriverWait(GWD.getDriver(),Duration.ofSeconds(30));
        wait.until(ExpectedConditions.visibilityOf(dc.deleteWait));
        dc.findAndClick("deleteItem");
        GWD.Bekle();
        dc.findAndClick("deleteItem");
        GWD.Bekle();

        WebElement cartIcon=GWD.getDriver().findElement(By.xpath("(//*[@class='icon icon-cart'])[1]"));
        Assert.assertTrue(cartIcon.isDisplayed());
    }
    @Then("Go back to Home Page")
    public void goBackToHomePage() {
        GWD.getDriver().get("https://www.beymen.com/");
        WebDriverWait wait=new WebDriverWait(GWD.getDriver(),Duration.ofSeconds(30));
        wait.until(ExpectedConditions.urlContains("https://www.beymen.com/"));
    }

}
