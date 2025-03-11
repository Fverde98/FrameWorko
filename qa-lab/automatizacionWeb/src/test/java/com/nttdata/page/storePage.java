package com.nttdata.page;
import org.openqa.selenium.By;

public class storePage {

    //Localizadores de elementos
    public static By btnInicioSesion = By.xpath("//*[@id=\"_desktop_user_info\"]/div/a/span");
    public static By Usuario = By.xpath("//*[@id=\"field-email\"]");
    public static By Pass = By.xpath("//*[@id=\"field-password\"]");
    public static By btnIniciar = By.xpath("//*[@id=\"submit-login\"]");

    //clothes
    public static By btnClothes = By.xpath("//*[@id=\"category-3\"]/a");
    public static By btnMen = By.xpath("//*[@id=\"left-column\"]/div[1]/ul/li[2]/ul/li[1]/a");
    public static By ropaPolo = By.xpath("//*[@id=\"js-product-list\"]/div[1]/div/article/div/div[1]/a/picture/img");
    public static By Cantidad = By.xpath("//*[@id=\"add-to-cart-or-refresh\"]/div[2]/div/div[1]/div/span[3]/button[1]");
    public static By addCar = By.xpath("//*[@id=\"add-to-cart-or-refresh\"]/div[2]/div/div[2]/button");
    public static By finalizarCompra = By.xpath("//*[@id=\"blockcart-modal\"]/div/div/div[2]/div/div[2]/div/div/a");
    public static By montoPoPUP = By.xpath("//*[@id=\"blockcart-modal\"]/div/div/div[2]/div/div[2]/div/p[4]");
    public static By price = By.xpath("//*[@id=\"blockcart-modal\"]/div/div/div[2]/div/div[1]/div/div[2]/p");
    //title
    public static By title =By.xpath("//*[@id=\"main\"]/div/div[1]/div/div[1]/h1");

    //total
    public static By total = By.xpath("//*[@id=\"main\"]/div/div[2]/div[1]/div[1]/div[2]/div[2]");

    //finalizar compra
    public static By finalizar = By.xpath("//*[@id=\"main\"]/div/div[2]/div[1]/div[2]/div/a");

}