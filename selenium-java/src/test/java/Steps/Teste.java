package Steps;

import metodos.MetodosTeste;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

public class Teste {
    MetodosTeste metodosTeste = new MetodosTeste();

    By loginAutomation = By.xpath("//a[text()='Login automation']");
    By campoEmail = By.id("user[email]");
    By campoSenha = By.id("user[password]");
    By checkRemenber = By.id("user[remember_me]");


    @Before
    public void abrirNavegador(){
        metodosTeste.abrirBrowser();
    }
    @Test
    public void teste_01_preencherCamposLogin(){
        metodosTeste.clicar(loginAutomation);
        metodosTeste.escrever(campoEmail, "tesemail@gemail.com");
        metodosTeste.escrever(campoSenha,"setTest");
        metodosTeste.clicar(checkRemenber);
        metodosTeste.gerarEvidencia("login","teste_01_preencherCamposLogin");
    }


    @After
    public void fecharNavegador(){
        metodosTeste.fecharNavegador();
    }

}
