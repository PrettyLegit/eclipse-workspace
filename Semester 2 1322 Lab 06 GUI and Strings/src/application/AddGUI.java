package application;

import javafx.scene.control.TextField;
import javafx.scene.control.Label;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;
import javafx.event.EventHandler;
import javafx.scene.input.MouseEvent;
import javafx.scene.control.*;

public class AddGUI extends Application {
	@Override
	public void start(Stage primaryStage) {

		//create grid and scene
		GridPane grid1 = new GridPane();
		Scene scene1 = new Scene(grid1, 200, 200);

		//creates label to display the sum later on in the program
		Label sumLabel = new Label("Enters integer values into the boxes to begin");

		Button submit = new Button("Submit");

		// this will make text field number 1 and number 2 inputs
		TextField field1 = new TextField();
		TextField field2 = new TextField();

		// add things on the grid
		grid1.add(sumLabel, 25, 25);
		grid1.add(submit, 51, 77);
		
		grid1.add(field1, 50, 51);
		grid1.setVgap(1);
		grid1.add(field2, 50, 76);

		primaryStage.setScene(scene1);
		primaryStage.show();

		EventHandler<MouseEvent> event1 = new EventHandler<MouseEvent>() {
			@Override
			public void handle(MouseEvent e) {
				int input1 = 0;
				int input2 = 0;
				int sum = 0;

				input1 = Integer.valueOf(field1.getText());
				input2 = Integer.valueOf(field2.getText());
				sum = input1 + input2;

				sumLabel.setText("The sum is " + sum);

			}
		};

		// triggers event handler
		submit.addEventFilter(MouseEvent.MOUSE_CLICKED, event1);
	}

	public static void main(String[] args) {
		launch(args);
	}
}
