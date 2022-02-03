package pages;

import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.junit.Assert;
import org.openqa.selenium.support.PageFactory;
import utils.Driver;

import java.net.MalformedURLException;

public class ProductPage {

    public ProductPage() throws MalformedURLException {
        PageFactory.initElements(new AppiumFieldDecorator(Driver.getDriver()), this);
    }

    String title;

    @AndroidFindBy(accessibility = "Favorilere ekle")
    public AndroidElement addFavoriteButton;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout[2]/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.RadioGroup/android.widget.RadioButton")
    public AndroidElement addToList;

    @AndroidFindBy(id = "com.sahibinden:id/browsing_activity_classified_detail_classified_title_textView")
    public AndroidElement productTitle;

    @AndroidFindBy(id = "com.sahibinden:id/classifiedTitleTextView")
    public AndroidElement actualTitle;

    public void addProductToFavorites() {
        addFavoriteButton.click();
        addToList.click();
    }

    public void setTitle() {
        title = productTitle.getText();
    }

    public void verifyProductName() {
        Assert.assertEquals(title, actualTitle.getText());
    }

}
