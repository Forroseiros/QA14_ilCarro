package com.ilCarro.qa14.fw;

import com.ilCarro.qa14.models.Car;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class CarHelper extends HelperBase {
    public CarHelper(WebDriver wd) {
        super(wd);
    }

    public void isLetTheCatTitlePresent() {
        Assert.assertTrue(isElementPresent(By.cssSelector("#root > div > section > div.let-carwork-style_let_car__options__1vKeV")));
    }

    public boolean isFindCarFormPresent() {
        return isElementPresent(By.cssSelector(".Main_mainpage__find_your_car__AHLkw"));
    }

    public void clickOnAddCarTab() {
        click(By.cssSelector("#root > div > header > section > ul > li:nth-child(2) > a"));
    }

    public void fillCarForm(Car car) {
        type(By.cssSelector(".country"), car.getCountry());
        type(By.cssSelector(".address"), car.getAddress());
        type(By.cssSelector(".distance_included"), car.getDistance());
    }
}
