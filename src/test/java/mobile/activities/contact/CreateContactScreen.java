package mobile.activities.contact;
import mobile.control.Button;
import mobile.control.TextBox;
import org.openqa.selenium.By;
public class CreateContactScreen {
    public TextBox nameTextBox = new TextBox(By.xpath("//android.widget.EditText[@text=\"First name\"]"));
    public TextBox phoneTextBox = new TextBox(By.xpath("//android.widget.EditText[@text=\"Phone\"]"));
    public Button saveButton = new Button(By.xpath("//android.widget.Button[@resource-id=\"com.android.contacts:id/editor_menu_save_button\"]"));
}
