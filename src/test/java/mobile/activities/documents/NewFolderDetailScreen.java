package mobile.activities.documents;

import mobile.control.Button;
import mobile.control.TextBox;
import org.openqa.selenium.By;

public class NewFolderDetailScreen {
    public Button okButton = new Button(By.id("android:id/button1"));
    public TextBox setNameNewFolder = new TextBox(By.id("android:id/text1"));
}
