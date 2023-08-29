package metodos;

import drivers.Browsers;
import org.openqa.selenium.By;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class MetodosTeste extends Browsers {

    public void escrever(By elemento, String texto){
        drive.findElement(elemento).sendKeys(texto);
    }

    public void clicar(By elemento){
        drive.findElement(elemento).click();
    }

    public void validarTexto(By elemento, String texto){
        assertEquals(texto,drive.findElement(elemento).getText());
    }
     public void validaContemTextoAlert(String texto){
        String textAlert = drive.switchTo().alert().getText();
        assertTrue(textAlert.contains(texto));
     }


}
