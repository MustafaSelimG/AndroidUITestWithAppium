# Android UI Test With Appium
>*libraries* Appium, Selenium, Cucumber, JUnit, TestNG

**Feature: Login Case**

  **Scenario Outline: verify login**</br>
    *When*  I open the hamburger menu</br>
    *And* I open the My Account section</br>
    *And* I open the Sign In section</br>
    *And* I enter email "< email >" and password "< password >"</br>
    *Then* username "< username >" should be seen</br>

  **Examples:**</br>
    | email      | password      | username     |</br>
    | *email*    | *password*    | *username*   |</br>
    
</br>

![login](https://user-images.githubusercontent.com/88919177/152316889-e37e7d1e-1085-4e56-95a8-fe577b0182b0.gif)

</br>
</br>

**Feature: Favorite Case**

  **Scenario: verify product on favorites**</br>
    *When* I open the real estate</br>
    *And* I open the residential</br>
    *And* I open the daily rentals</br>
    *And* I open the flats</br>
    *And* I filter the threePlusOne flats</br>
    *And* I sort by higher price</br>
    *And* I open the first product</br>
    *And* I add product the favorites</br>
    *And* I open the hamburger menu</br>
    *And* I open the Special To Me section</br>
    *And* I open the Favorite Ads</br>
    *Then* product name should be seen</br>
    
 </br>
    
 ![favorite](https://user-images.githubusercontent.com/88919177/152317274-d185580d-5208-436e-8cdc-8885401ab543.gif)
