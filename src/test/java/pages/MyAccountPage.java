package pages;

import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.junit.Assert;
import org.openqa.selenium.support.PageFactory;
import utils.Driver;

import java.net.MalformedURLException;

public class MyAccountPage {
    public MyAccountPage() throws MalformedURLException {
        PageFactory.initElements(new AppiumFieldDecorator(Driver.getDriver()), this);
    }

    @AndroidFindBy(id = "com.sahibinden:id/action_login")
    public AndroidElement signInSection;

    @AndroidFindBy(id = "com.sahibinden:id/usernameOrEmailTextInputEditText")
    public AndroidElement emailBar;

    @AndroidFindBy(id = "com.sahibinden:id/passwordTextInputEditText")
    public AndroidElement passwordBar;

    @AndroidFindBy(id = "com.sahibinden:id/myaccount_activity_login_login_action_button")
    public AndroidElement signInButton;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.TextView[1]")
    public AndroidElement usernameTitle;

    @AndroidFindBy(id = "com.sahibinden:id/favorite_classifieds")
    public AndroidElement favoriteAds;

    @AndroidFindBy(id = "com.sahibinden:id/relativelayout_row")
    public AndroidElement favoriteList;

    public void clickSignInSection() {
        signInSection.click();
    }

    public void SignIn(String email, String password) {
        emailBar.sendKeys(email);
        passwordBar.sendKeys(password);
        signInButton.click();
    }

    public void verifyUsername(String username) {
        Assert.assertEquals(username, usernameTitle.getText());
    }

    public void clickFavoriteList() {
        favoriteAds.click();
        favoriteList.click();
    }

}
