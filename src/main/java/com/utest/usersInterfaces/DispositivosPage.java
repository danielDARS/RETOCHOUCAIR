package com.utest.usersInterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class DispositivosPage extends PageObject {

    public static final Target LIST_COMPUTER= Target.the("Selecciona la lista de computadores")
            .located(By.xpath("//span[contains(text(),'Windows')]"));
    public static final Target LIST_LINUX = Target.the("selecciona el elemento Linux de la lista")
            .located(By.xpath("//div[contains(text(),'Linux')]"));
    public static final Target LIST_VERSION = Target.the("selecciona la lista de version")
            .located(By.xpath("//span[contains(text(),'Select a Version')]"));
    public static final Target LIST_FEDORA = Target.the("selecciona el elemento fedora de la lista")
            .located(By.xpath("//div[contains(text(),'Fedora')]"));
    public static final Target LIST_LANGUAGE = Target.the("selecciona la lista languaje")
            .located(By.xpath("//span[contains(text(),'Select OS language')]"));
    public static final Target LIST_BULGARIAN = Target.the("selecciona el elemento bulgarian de la lista")
            .located(By.xpath("//div[contains(text(),'Bulgarian')]"));

    public static final Target LIST_MOBILE= Target.the("selecciona la lista de computador")
            .located(By.xpath("//span[contains(text(),'Select Brand')]"));
    public static final Target LIST_APPLE= Target.the("selecciona el elemento Apple de la lista")
            .located(By.xpath("//div[contains(text(),'Apple')]"));

    public static final Target LIST_MODEL = Target.the("selecciona la lista modelo")
            .located(By.xpath("//span[contains(text(),'Select a Model')]"));

    public static final Target LIST_IPAD13G= Target.the("selecciona el elemento ipad 1 3g de la lista")
            .located(By.xpath("//div[contains(text(),'iPad 1 3G')]"));
    public static final Target LIST_SYSTEM = Target.the("selecciona la lista sistema")
            .located(By.xpath("(//span[@class='btn btn-default form-control ui-select-toggle'])[6]"));

    public static final Target LIST_IOS_4_3_1= Target.the("selecciona el elemento IOS 4.3.1 de la lista")
            .located(By.xpath("//div[contains(text(),'iOS 4.3.1')]"));

    public static final Target BTN_NEX3= Target.the("selecciona el elemento IOS 4.3.1 de la lista")
            .located(By.xpath("//a[@class='btn btn-blue pull-right']"));



}
