package Pages;

import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import java.util.List;

public class DialogContent extends Parent {
    public DialogContent() {
        PageFactory.initElements(GWD.getDriver(),this);
    }

    @FindBy(css = "button[class='o-modal__closeButton bwi-close']>svg")
    private WebElement closeButton;

    @FindBy(css = "button[id='onetrust-accept-btn-handler']")
    private WebElement cerezButton;

    @FindBy(css = "ul[class='o-navbar__nav no-padding col-12']>li")
    public List <WebElement>  navbarList;

    @FindBy(css = "a[data-id='10006']")
    private WebElement womenBuild;

    @FindBy(xpath = "(//span[text()='Çanta'])[1]")
    private WebElement womenBag;

    @FindBy(css = "a[data-id='10139']")
    private WebElement shoulderBag;

    @FindBy(xpath = "(//a[text()='Omuz Çantası'])[1]")
    private WebElement crossbodyBag;

    @FindBy(xpath = "(//a[@href='/p_sou-ba-boxy-pembe-deri-capraz-canta_1068117'])[1]")
    private WebElement pinkLeatherBag;

    @FindBy(css = "button[class='m-addBasketFavorite__basket btn']")
    public WebElement addToCart;

    @FindBy(xpath = "//p[text()='Ürün sepetinize eklenmiştir.']")
    private WebElement verifyCart;

    @FindBy(xpath = "//img[@src='//cdn.beymen.com/assets/desktop/img/beymen-logo-dot-blue.svg']")
    private WebElement homepageBack;

    @FindBy(css = "a[data-id='10004']")
    private WebElement manBuild;

    @FindBy(xpath = "//div[@data-productid='1072219']")
    public WebElement summitGrayTshirt;

    @FindBy(xpath = "(//div[@class='m-variation']//span)[1]")
    private WebElement chooseSizeS;

    @FindBy(css = "a[data-id='31210']")
    private WebElement kidsBuild;

    @FindBy(xpath = "//span[text()='Erkek Çocuk']")
    private WebElement maleKidsBuild;

    @FindBy(xpath = "//div[@data-productid='1140480']")
    public WebElement poloLaurenT;

    @FindBy(css = "div[class='m-variation']>:nth-child(2)")
    public WebElement chooseSizeM;

    @FindBy(css = "a[title='Sepetim']")
    private WebElement gotoCart;

    @FindBy(xpath = "(//span[@class='m-orderSummary__value'])[1]")
    private WebElement orderSummary1;

    @FindBy(xpath = "(//span[@class='m-orderSummary__value'])[2]")
    private WebElement orderSummary2;

    @FindBy(xpath = "(//span[@class='m-orderSummary__value'])[3]")
    private WebElement orderSummary3;

    @FindBy(xpath = "(//span[@class='m-orderSummary__value'])[4]")
    private WebElement orderSummary4;

    @FindBy(xpath = "(//span[@class='m-orderSummary__value'])[5]")
    private WebElement orderSummary5;

    @FindBy(xpath = "//button[@class='m-basket__remove btn-text']")
    private WebElement deleteItem;

    @FindBy(xpath = "//p[text()='Sepetinizden ürün başarılı bir şekilde silinmiştir.']")
    public WebElement deleteWait;





















    WebElement myElement;

    public void findAndClick(String element){
        switch (element){
            case "closeButton":myElement=closeButton;break;
            case "shoulderBag":myElement=shoulderBag;break;
            case "cerezButton":myElement=cerezButton;break;
            case "crossbodyBag":myElement=crossbodyBag;break;
            case "pinkLeatherBag":myElement=pinkLeatherBag;break;
            case "addToCart":myElement=addToCart;break;
            case "homepageBack":myElement=homepageBack;break;
            case "summitGrayTshirt":myElement=summitGrayTshirt;break;
            case "chooseSizeS":myElement=chooseSizeS;break;
            case "poloLaurenT":myElement=poloLaurenT;break;
            case "chooseSizeM":myElement=chooseSizeM;break;
            case "gotoCart":myElement=gotoCart;break;
            case "deleteItem":myElement=deleteItem;break;



        }
        clickFunction(myElement);
    }


    public void findAndSend(String element, String value){
        switch (element){



        }
        sendKeysFunction(myElement,value);
    }


    public void verifyText(String element, String text){
        switch (element){
            case "verifyCart":myElement=verifyCart;break;
            case "orderVerify1":myElement=orderSummary1;break;
            case "orderVerify2":myElement=orderSummary2;break;
            case "orderVerify3":myElement=orderSummary3;break;
            case "orderVerify4":myElement=orderSummary4;break;
            case "orderVerify5":myElement=orderSummary5;break;

        }
        verifyContainsText(myElement,text);
    }

    public void hoverOver1(){
        Actions actions=new Actions(GWD.getDriver());
        actions.moveToElement(womenBuild).build().perform();
    }
    public void hoverOver2(){
        Actions actions=new Actions(GWD.getDriver());
        actions.moveToElement(womenBag).build().perform();
    }
    public void hoverOver3(){
        Actions actions=new Actions(GWD.getDriver());
        actions.moveToElement(manBuild).build().perform();
    }

    public void hoverOver4(){
        Actions actions=new Actions(GWD.getDriver());
        actions.moveToElement(kidsBuild).build().perform();
    }
    public void hoverOver5(){
        Actions actions=new Actions(GWD.getDriver());
        actions.moveToElement(maleKidsBuild).build().perform();
    }

}
