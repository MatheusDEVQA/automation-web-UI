package Steps;

import metodos.MetodosTeste;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import pageObjects.LoginPage;

public class Teste {

    LoginPage loginPage = new LoginPage();


    @Before
    public void abrirNavegador(){

    }
    @Test
    public void teste_01_login_sucesso(){

        String nomeTeste = new Object(){}.getClass().getEnclosingMethod().getName();
        loginPage.preencherCamposLogin(nomeTeste,"tesemail@gemail.com", "15setSenha");

    }


    @After
    public void fecharNavegador(){


    }

}
