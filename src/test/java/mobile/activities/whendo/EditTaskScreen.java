package mobile.activities.whendo;

import mobile.control.Button;
import mobile.control.TextBox;
import org.openqa.selenium.By;

public class EditTaskScreen {
    public TextBox titleEditTextBox = new TextBox(By.xpath("//android.widget.EditText[@resource-id=\"com.vrproductiveapps.whendo:id/noteTextTitle\"]"));
    public TextBox noteEditTextBox = new TextBox(By.xpath("//android.widget.EditText[@resource-id=\"com.vrproductiveapps.whendo:id/noteTextNotes\"]"));
    public Button saveEditButton = new Button(By.xpath("//android.widget.TextView[@content-desc=\"Save\"]"));
}
