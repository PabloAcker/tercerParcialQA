package mobile.testSuite;

import mobile.activities.documents.MainScreenDocs;
import mobile.activities.documents.NewFolderDetailScreen;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import mobile.session.Session;

import java.util.Date;

public class DocumentsTest {
    MainScreenDocs mainScreenDocs = new MainScreenDocs();
    NewFolderDetailScreen newFolderDetailScreen = new NewFolderDetailScreen();
    @Test
    public void verifyCreateFolder(){
        String nameFolder = "HolaPablo"+new Date().getTime();
        mainScreenDocs.moreOptionsButton.click();
        mainScreenDocs.newFolderButton.click();
        newFolderDetailScreen.setNameNewFolder.setText(nameFolder);
        newFolderDetailScreen.okButton.click();
        // verificacion de nombre de la alarma creada:
        String actualResult=mainScreenDocs.nameFirstFolderLabel.getText();
        Assertions.assertEquals(nameFolder,actualResult,"ERROR El folder no fue creado");
    }
    @AfterEach
    public void closeApp(){
        Session.getSession().closeApp();
    }
}
