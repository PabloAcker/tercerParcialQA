package web.webTest;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Random;

public class CreateSameUserTest_3Parcial extends TestBaseTodoLy{
    private Random rnd = new Random();
    String fullName = "PabloAcker3Parcial"+rnd.nextInt(1000);
    String email = "pablo"+rnd.nextInt(1000)+"@gmail.com";
    String pwd = "pablo123";

    @Test
    public void verifyCreateSameAccount() throws InterruptedException {
        //crear una cuenta>
        mainPage.signUpButton.click();
        signUpPage.fullNameTextbox.setText(fullName);
        signUpPage.emailTextbox.setText(email);
        signUpPage.passwordTextbox.setText(pwd);
        signUpPage.acceptTermsButton.click();
        signUpPage.signUpButton.click();
        //verificacion para ver si se creo el usuario
        Assertions.assertTrue(centralSection.openSettingsButton.isControlDisplayed(), "ERROR! No se pudo crear el usuario");

        // logout
        menuSection.logoutButton.click();
        // verificacion para ver si se deslogueo
        Assertions.assertTrue(mainPage.loginButton.isControlDisplayed(), "ERROR! No se pudo desloguear");

        // crear la misma cuenta de nuevo
        mainPage.signUpButton.click();
        signUpPage.fullNameTextbox.setText(fullName);
        signUpPage.emailTextbox.setText(email);
        signUpPage.passwordTextbox.setText(pwd);
        signUpPage.acceptTermsButton.click();
        signUpPage.signUpButton.click();
        // verifiacion de que la creacion de la misma cuenta no se pueda realizar>
        String expectedResult = "Account with this email address already exists!";
        Assertions.assertEquals(expectedResult,mainPage.errorMessageSameAccount.getTextValue(), "ERROR! El usuario se volvio a crear!");
        Thread.sleep(2000);
    }
}
