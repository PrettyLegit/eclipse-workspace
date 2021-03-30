package application;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
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

public class Main_L12 extends Application {
	@Override
	public void start(Stage primaryStage) throws IOException {

		// create grid and scene
		GridPane grid1 = new GridPane();
		Scene scene1 = new Scene(grid1, 200, 200);

		Button load = new Button("Load");
		Button save = new Button("Save");

		TextField loadField = new TextField();
		TextField saveField = new TextField();

		grid1.add(load, 25, 25);
		grid1.add(save, 25, 77);

		grid1.add(loadField, 50, 51);
		grid1.setVgap(1);
		grid1.add(saveField, 50, 76);

		primaryStage.setScene(scene1);
		primaryStage.show();

		// creating file

		try {
			FileWriter fw = new FileWriter("Sample.txt");
			PrintWriter pw = new PrintWriter(fw);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		EventHandler<MouseEvent> event1 = new EventHandler<MouseEvent>() {
			@Override
			public void handle(MouseEvent e) {

				// reading file
				String userInput = "";
				userInput = loadField.getText();

				try {

					FileReader fr = new FileReader(userInput);
					BufferedReader br = new BufferedReader(fr);

					String result;
					while ((result = br.readLine()) != null) {
						System.out.println(result + "\n");
					}

				} catch (IOException e1) {
					// TODO Auto-generated catch block
					System.out.println("File not found");
					e1.printStackTrace();
				}
				
			}
		};

		EventHandler<MouseEvent> event2 = new EventHandler<MouseEvent>() {
			@Override
			public void handle(MouseEvent e) {

				String userInput = "";
				userInput = saveField.getText();

				try {
					FileWriter fw = new FileWriter("Sample.txt");
					PrintWriter pw = new PrintWriter(fw);

					pw.println(userInput);

					pw.close();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					System.out.println("Error");
					e1.printStackTrace();
				}
				
				try {

					FileReader fr = new FileReader("Sample.txt");
					BufferedReader br = new BufferedReader(fr);

					String result;
					while ((result = br.readLine()) != null) {
						System.out.println(result + "\n");
					}

				} catch (IOException e1) {
					// TODO Auto-generated catch block
					System.out.println("File not found");
					e1.printStackTrace();
				}
			}
		};

		// triggers event handler
		load.addEventFilter(MouseEvent.MOUSE_CLICKED, event1);
		save.addEventFilter(MouseEvent.MOUSE_CLICKED, event2);
	}

	public static void main(String[] args) {
		launch(args);
	}
}
