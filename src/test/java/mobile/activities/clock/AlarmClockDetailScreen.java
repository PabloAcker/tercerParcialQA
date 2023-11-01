package mobile.activities.clock;

import mobile.control.Button;
import mobile.control.TextBox;
import org.openqa.selenium.By;

public class AlarmClockDetailScreen {
    public Button okButton = new Button(By.id("com.google.android.deskclock:id/material_timepicker_ok_button"));
    public TextBox setNameAlarmTextBox = new TextBox(By.id("com.google.android.deskclock:id/label_input_field"));
    public Button okButtonNameAlarm = new Button(By.id("android:id/button1"));
}
