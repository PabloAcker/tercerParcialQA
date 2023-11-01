package mobile.activities.clock;

import mobile.control.Button;
import mobile.control.Label;
import org.openqa.selenium.By;

public class AlarmScreen {
    public Button addAlarmButton = new Button(By.id("com.google.android.deskclock:id/fab"));
    public Label nameAlarmLabel = new Label(By.id("com.google.android.deskclock:id/edit_label"));

}
