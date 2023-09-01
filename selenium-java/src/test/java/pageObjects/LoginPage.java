package pageObjects;

import metodos.MetodosTeste;
import org.openqa.selenium.By;

public class LoginPage {

    MetodosTeste metodosTeste = new MetodosTeste();

    By loginAutomation = By.xpath("//a[text()='Login automation']");
    By campoEmail = By.id("user[email]");
    By campoSenha = By.id("user[password]");
    By checkRemenber = By.id("user[remember_me]");

    public void preencherCamposLogin(String nomeTeste, String textoEmail, String senha){
        metodosTeste.clicar(loginAutomation);
        metodosTeste.escrever(campoEmail, textoEmail);
        metodosTeste.escrever(campoSenha,senha);
        metodosTeste.clicar(checkRemenber);
        metodosTeste.gerarEvidencia("login",nomeTeste);
    }

    public void esqueciSenha(){

    }
}
