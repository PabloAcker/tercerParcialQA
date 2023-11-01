package mobile.testSuite;

import mobile.activities.whendo.AddTaskScreen;
import mobile.activities.whendo.DeletedTaskScreen;
import mobile.activities.whendo.EditTaskScreen;
import mobile.activities.whendo.MyListScreen;
import mobile.session.Session;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Date;
import java.util.Random;

public class CUDTask_3Parcial {
    AddTaskScreen addTaskScreen = new AddTaskScreen();
    DeletedTaskScreen deletedTaskScreen = new DeletedTaskScreen();
    EditTaskScreen editTaskScreen = new EditTaskScreen();
    MyListScreen myListScreen = new MyListScreen();
    Random rnd = new Random();

    @Test
    public void verifyCUDTask(){
        String taskName = "Pablo" + new Date().getTime();
        String taskText = "Tercer Parcial QA" + rnd.nextInt(1000);

        //Create task
        myListScreen.addButton.click();
        addTaskScreen.titleTextBox.setText(taskName);
        addTaskScreen.noteTextBox.setText(taskText);
        addTaskScreen.saveButton.click();
        //verificacion de que el task se creo
        Assertions.assertTrue(myListScreen.getSpecificTask(taskName).isControlDisplayed(), "ERROR! La tarea no fue creada");

        //update task
        String taskNameUpdate = "PabloUpdate" + new Date().getTime();
        String taskTextUpdate = "Tercer Parcial QA casi aprobado!" + rnd.nextInt(1000);
        myListScreen.getSpecificTask(taskName).click();
        editTaskScreen.titleEditTextBox.setText(taskNameUpdate);
        editTaskScreen.noteEditTextBox.setText(taskTextUpdate);
        editTaskScreen.saveEditButton.click();
        //verificacion de que el task se edito
        Assertions.assertTrue(myListScreen.getSpecificTask(taskNameUpdate).isControlDisplayed(), "ERROR! La tarea no fue actualizada");

        //delete task
        myListScreen.getSpecificTask(taskNameUpdate).click();
        deletedTaskScreen.deletedButton.click();
        deletedTaskScreen.confirmDeletedButton.click();
        //verificacion de que la tarea se elimino
        Assertions.assertFalse(myListScreen.getSpecificTask(taskNameUpdate).isControlDisplayed(), "ERROR! La tarea no fue eliminada");

    }
    @AfterEach
    public void closeApp(){
        Session.getSession().closeApp();
    }
}
