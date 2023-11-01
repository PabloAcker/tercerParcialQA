package mobile.activities.messages;

import mobile.control.Button;
import mobile.control.Label;
import mobile.control.TextBox;
import org.openqa.selenium.By;

public class MessageContactScreen {
    public TextBox setMessageTextBox = new TextBox(By.id("com.google.android.apps.messaging:id/compose_message_text"));
    public Button sendButton = new Button(By.id("com.google.android.apps.messaging:id/send_message_button_icon"));
    public Label getSpecificTextMsg(String textMsg){
        Label textMsgLabel = new Label(By.xpath("//android.widget.TextView[@resource-id=\"com.google.android.apps.messaging:id/message_text\" and @text='"+textMsg+"']"));
        return textMsgLabel;
    }

}
