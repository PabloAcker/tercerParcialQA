package mobile.activities.whendo;

import mobile.control.Button;
import org.openqa.selenium.By;

public class DeletedTaskScreen {
    public Button deletedButton = new Button(By.id("com.vrproductiveapps.whendo:id/deleteItem"));
    public Button confirmDeletedButton = new Button(By.id("android:id/button1"));
}
