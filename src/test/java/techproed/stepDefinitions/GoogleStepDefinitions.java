package techproed.stepDefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Keys;
import techproed.pages.GooglePage;
import techproed.utilies.ConfigReader;
import techproed.utilies.Driver;

import java.util.List;

import static org.junit.Assert.assertTrue;

public class GoogleStepDefinitions {
    GooglePage googlePage = new GooglePage();

    @Given("kullanici_google_anasayfaya_gider")
    public void kullanici_google_anasayfaya_gider() {
        Driver.getDriver().get(ConfigReader.getProperty("google_Url"));
    }

    @When("kullanici googleda {string} aratir")
    public void kullanici_googleda_aratir(String aranacakKelime) {
        googlePage.aramaKutusu.sendKeys(aranacakKelime + Keys.ENTER);
    }

    @Then("title'in {string} icerdigini dogrular")
    public void title_in_icerdigini_dogrular(String titleDegeri) {

        assertTrue(Driver.getDriver().getTitle().contains(titleDegeri));

    }

    @When("kullanici verilen bilgileri aratir")
    public void kullanici_verilen_bilgileri_aratir(DataTable dataTable) throws InterruptedException {

        List<String> aranacakBilgiler = dataTable.asList();//[Bilgiler, Java, SQL, Lambda, Python]

        for (int i = 1; i < aranacakBilgiler.size(); i++) {
            Thread.sleep(3000);

            googlePage.aramaKutusu.sendKeys(aranacakBilgiler.get(i) + Keys.ENTER);
            googlePage.aramaKutusu.clear();

        }

    }
}