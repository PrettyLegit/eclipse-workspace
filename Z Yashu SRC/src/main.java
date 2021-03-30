
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

import javafx.scene.input.MouseEvent;
import javafx.event.EventHandler;

import java.io.*;

public class main extends Application
{
   @Override
   public void start(Stage primaryStage) throws Exception
   {
       //Two buttons, one for loading a file and one for saving.
       Button loadButton = new Button("Load");
       Button saveButton = new Button("Save");

       //One is going to be where the location and name of the file is entered.
       //The other is going to show the contents of that file.
       TextField locationOfFile = new TextField();
       TextField contentsOfFile = new TextField();

       //When we click on this button, we will load the contents of a file.
       //The file name and location comes from the first text field.
       EventHandler<MouseEvent> loadEventHandler = new EventHandler<MouseEvent>()
       {
           @Override
         public void handle(MouseEvent e)
         {
             System.out.println("Load button was pushed.");

             String oneLine = "";

             try
             {
                 BufferedReader br = new BufferedReader(new FileReader(locationOfFile.getText()));

                 //Safely reset our text field before adding new content to it.

                 //Read line by line through our file.
                 //Save each line into one of our text field objects.
                 while (oneLine != null)
                 {
                     //Display the contents of the file in our text field (in two steps).
                     //First is to get the previous text field text.
                     //Then add the new line from the file to end of the text field.

                     //This will let us know we reached the end of the file when we get a null line.
                     oneLine = br.readLine();
                 }

                 //Close our reader so that other programs and code can access our files.
                 br.close();
             }
             catch (IOException exception)
             {
                 //The file is not in the right location, wrong name, or the file is not readable.
                 //The format of the path or file may be wrong.

                 //Expected path for windows:             C:\Users\Documents\textfile.txt
                 //Wrong slashes or non-existent folder:  C:/Users/Documen/sdf.txt
                 // If you mistype, this will still save. C:\Users\Documents\wrongName.txt
             }
         }
       };

       //When we click on this button, we will save the contents of the text field to the file.
       EventHandler<MouseEvent> saveEventHandler = new EventHandler<MouseEvent>()
       {
           @Override
           public void handle(MouseEvent e)
           {
               System.out.println("Save button was pushed.");

               try
               {
                   BufferedWriter bw = new BufferedWriter(new FileWriter(locationOfFile.getText()));

                   //Write the entire string contents of our text field to our file in one go.
                   bw.write(contentsOfFile.getText());

                   //Close our writer so that other programs and code can access our files.
                   bw.close();
               }
               catch (IOException exception)
               {
                   //The location or name is wrong or the file is not readable.
                   //The path might be in the incorrect format.

                   //Expected path for windows:             C:\Users\Documents\textfile.txt
                   //Wrong slashes or non-existent folder:  C:/Users/Documen/sdf.txt
                   // If you mistype, this will still save. C:\Users\Documents\wrongName.txt
               }
           }
       };

       //Add the two event handlers to the buttons.
       loadButton.addEventFilter(MouseEvent.MOUSE_CLICKED, loadEventHandler);
       saveButton.addEventFilter(MouseEvent.MOUSE_CLICKED, saveEventHandler);

       GridPane gridPane = new GridPane();

       //Add the buttons and text fields to the grid pane.
       gridPane.add(loadButton, 0, 0);
       gridPane.add(locationOfFile, 0, 1);

       gridPane.add(saveButton, 0, 2);
       gridPane.add(contentsOfFile, 0, 3);

       Scene scene = new Scene(gridPane);

       //Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));

       //primaryStage.setScene(new Scene(root, 300, 275));

       primaryStage.setScene(scene);

       primaryStage.setTitle("Hello World");

       primaryStage.show();
   }

   public static void main(String[] args)
   {
       launch(args);
   }
}