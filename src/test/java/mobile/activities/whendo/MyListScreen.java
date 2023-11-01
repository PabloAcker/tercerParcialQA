package mobile.activities.whendo;

import mobile.control.Button;
import mobile.control.Label;
import mobile.control.TextBox;
import org.openqa.selenium.By;
public class MyListScreen {
    public Button addButton = new Button(By.id("com.vrproductiveapps.whendo:id/fab"));

    public Label getSpecificTask(String nameTask){
        Label taskNameLabel = new Label(By.xpath("//android.widget.TextView[@text='"+nameTask+"']"));
        return taskNameLabel;
    }
}
