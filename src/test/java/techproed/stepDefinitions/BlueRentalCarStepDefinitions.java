package techproed.stepDefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import techproed.pages.BlueRentalCarPage;
import techproed.utilies.ConfigReader;
import techproed.utilies.Driver;

import java.util.Map;

public class BlueRentalCarStepDefinitions {

    BlueRentalCarPage blueRentalPage;
    @Then("Verilen_kullanici_ile_login_olunur")
    public void verilen_kullanici_ile_login_olunur(DataTable data) {
        blueRentalPage=new BlueRentalCarPage();
        blueRentalPage.loginButton.click();

        blueRentalPage.emailBox.sendKeys(data.row(1).get(0), Keys.TAB,data.row(1).get(1),Keys.ENTER);

        Assert.assertEquals(blueRentalPage.userDropDown.getText(),"Sam Walker");
        Driver.getDriver().navigate().back();//logout işlemi yerine navigate().back() methodu ile çözdük

        blueRentalPage.emailBox.sendKeys(data.row(2).get(0), Keys.TAB,data.row(2).get(1),Keys.ENTER);

        Assert.assertEquals(blueRentalPage.userDropDown.getText(),"Kate Brown");

    }
    @Then("Verilen_kullanicilar_ile_login_olunur")
    public void verilen_kullanicilar_ile_login_olunur(DataTable data) {
        blueRentalPage = new BlueRentalCarPage();
        System.out.println(data.asMaps());//Map'lerden oluşan bir list oluşturur
        //[{email=sam.walker@bluerentalcars.com, password=c!fas_art}, {email=kate.brown@bluerentalcars.com, password=tad1$Fas}]
        //Feature file'daki oluşturmuş olduğumuz tabloğu map olarak listeler.
        //Başlığı key olarak alır altındaki verileri value olarak alır
        for (Map<String,String> w:data.asMaps()) {
            blueRentalPage.loginButton.click();
            blueRentalPage.emailBox.sendKeys(w.get("emailAdress"),Keys.TAB,w.get("password"),Keys.ENTER);
            blueRentalPage.userDropDown.click();
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            blueRentalPage.logOut.click();
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            blueRentalPage.OK.click();
        }
    }

}