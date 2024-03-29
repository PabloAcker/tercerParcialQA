package mobile.activities.whendo;

import mobile.control.Button;
import mobile.control.TextBox;
import org.openqa.selenium.By;

public class AddTaskScreen {
    public TextBox titleTextBox = new TextBox(By.xpath("//android.widget.EditText[@resource-id=\"com.vrproductiveapps.whendo:id/noteTextTitle\"]"));
    public TextBox noteTextBox = new TextBox(By.xpath("//android.widget.EditText[@resource-id=\"com.vrproductiveapps.whendo:id/noteTextNotes\"]"));
    public Button saveButton = new Button(By.xpath("//android.widget.TextView[@content-desc=\"Save\"]"));
}
