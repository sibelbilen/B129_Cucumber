package techproed.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
//runner class; testNG deki .xml filelarda belirttigimiz classlari packagelara veya methodlari nasil
//calistiiryorsak ,cucumber frameworkundede runner class'indaki tags parametresi ile
//belirttigimiz senaryoyu calistirabiliriz.

@RunWith(Cucumber.class)//Cucumber ile Junitin entegre olmasini saglayan test calistirici notasyonudur
@CucumberOptions(features = "src/test/resources/features/day30_IlkFeature" ,
        glue = "techproed/stepDefinitions", tags="@gr1 and @sql")//senaryolari nerede ve nasil calisacagi ve hangi raporu kullanacagiyla alakali secenekelri  ayarlariz

// glue = "techproed/stepDefinitions" bu parametre ile kodlarimizi yazdigimiz stepDefinition classinin packagesini belirtiriz


/*
features ===> features'ların olduğu dosyanın yolunu ver(ContentRoot)
glue ====> stepDefinition'ların olduğu dosyanın yolunu ver(Source Root)
tags ====> çalıştırmak istediğin grubu yaz
 */
public class Runner {

}
