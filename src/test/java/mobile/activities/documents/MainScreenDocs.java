package mobile.activities.documents;

import mobile.control.Button;
import mobile.control.Label;
import org.openqa.selenium.By;

public class MainScreenDocs {
    public Button moreOptionsButton = new Button(By.xpath("//android.widget.ImageButton[@content-desc=\"More options\"]"));
    public Button newFolderButton = new Button(By.xpath("//android.widget.TextView[@resource-id=\"android:id/title\" and @text=\"New folder\"]"));
    public Label nameFirstFolderLabel = new Label(By.xpath("//android.widget.TextView[@resource-id=\"android:id/title\"]"));

}
