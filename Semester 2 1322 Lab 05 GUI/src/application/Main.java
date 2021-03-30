package application;

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

public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {

		Text text1 = new Text("Click a button");

		GridPane grid1 = new GridPane();

		Scene scene1 = new Scene(grid1, 200, 200);

		// creating buttons
		Button button1 = new Button("button 1");
		Button button2 = new Button("button 2");
		Button button3 = new Button("button 3");
		Button button4 = new Button("button 4");
		Button button5 = new Button("button 5");

		// adding
		grid1.add(button1, 0, 0);
		grid1.add(button2, 1, 0);
		grid1.add(button3, 3, 0);
		grid1.add(button4, 4, 0);
		grid1.add(button5, 5, 0);
		grid1.add(text1, 500, 500);

		primaryStage.setScene(scene1);
		primaryStage.show();

		EventHandler<MouseEvent> event1 = new EventHandler<MouseEvent>() {
			@Override
			public void handle(MouseEvent e) {
				text1.setText("Button 1 clicked");
			}
		};

		EventHandler<MouseEvent> event2 = new EventHandler<MouseEvent>() {
			@Override
			public void handle(MouseEvent e) {
				text1.setText("Button 2 clicked");
			}
		};

		EventHandler<MouseEvent> event3 = new EventHandler<MouseEvent>() {
			@Override
			public void handle(MouseEvent e) {
				text1.setText("Button 3 clicked");
			}
		};

		EventHandler<MouseEvent> event4 = new EventHandler<MouseEvent>() {
			@Override
			public void handle(MouseEvent e) {
				text1.setText("Button 4 clicked");
			}
		};

		EventHandler<MouseEvent> event5 = new EventHandler<MouseEvent>() {
			@Override
			public void handle(MouseEvent e) {
				text1.setText("Button 5 clicked");
			}
		};

		button1.addEventFilter(MouseEvent.MOUSE_CLICKED, event1);
		button2.addEventFilter(MouseEvent.MOUSE_CLICKED, event2);
		button3.addEventFilter(MouseEvent.MOUSE_CLICKED, event3);
		button4.addEventFilter(MouseEvent.MOUSE_CLICKED, event4);
		button5.addEventFilter(MouseEvent.MOUSE_CLICKED, event5);

	}

	public static void main(String[] args) {
		launch(args);
	}
}
