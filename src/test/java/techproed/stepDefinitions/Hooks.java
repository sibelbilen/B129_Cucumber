package techproed.stepDefinitions;


import io.cucumber.java.Before;

public class Hooks {
    /*
    Scenario'lar arasındaki bağlantıyı sağlayan glue parametresine koyduğumuz stepDefinition package'ı içerisinde
@Before ve @After gibi bir notasyon varsa extend yapmamıza gerek kalmadan her scenariodan önce veya sonra bu
methodlar çalışacaktır.
    Cucumber'da @Before, @After kullanma ihtiyacımız olursa bunu Hooks class'ına koyarız
      İstersek yeni bir package oluşturup bunun içinede Hooks class'ını koyabiliriz. Eğer yeni bir package içerisine
koyarsak Runner class'ındaki glue parametresine bu package'ı da eklememiz gerekir
 */
    @Before
    public void setUp1() {
        System.out.println("Testler çalışmaya başladı");
    }
    @Before("@gr1")
    public void setUp2() {
        System.out.println("amazonda sql aratirdi");
    }
    @Before
    public void setUp3() {
        System.out.println("Testler çalışmaya başladı");
    }
    @Before
    public void setUp4() {
        System.out.println("Testler çalışmaya başladı");
    }
}
