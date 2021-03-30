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

public class Main extends Application {
	String input1 = "";
	String input2 = "";

	double value1 = 0;
	double value2 = 0;
	double result = 0;

	String operatorType = "";

	String windowLabelOverwrite = "";

	boolean isFirst = true;

	/*
	 * ive decided to make this label a class variable so we can make the
	 * windowLabelPrint() method.
	 */
	Label windowLabel = new Label();

	@Override
	public void start(Stage primaryStage) {

		// creates grid and scene
		GridPane grid1 = new GridPane();
		grid1.gridLinesVisibleProperty();
		Scene scene = new Scene(grid1, 50, 50);

		// creating label
		Label resultLabel = new Label();

		// creating math buttons
		Button addBtn = new Button("+");
		Button subtractBtn = new Button("-");
		Button multiplyBtn = new Button("*");
		Button divideBtn = new Button("/");
		Button equalsBtn = new Button("=");

		// creating number buttons
		Button Btn1 = new Button("1");
		Button Btn2 = new Button("2");
		Button Btn3 = new Button("3");
		Button Btn4 = new Button("4");
		Button Btn5 = new Button("5");
		Button Btn6 = new Button("6");
		Button Btn7 = new Button("7");
		Button Btn8 = new Button("8");
		Button Btn9 = new Button("9");
		Button Btn0 = new Button("0");

		//creating a reset all button to make my life easier
		Button resetBtn = new Button("Reset Me Baby");
		
		// adding buttons to the screen
		grid1.add(Btn7, 50, 50);
		grid1.add(Btn8, 51, 50);
		grid1.add(Btn9,52, 50);

		grid1.add(Btn4, 50, 51);
		grid1.add(Btn5, 51, 51);
		grid1.add(Btn6, 52, 51);

		grid1.add(Btn1, 50, 52);
		grid1.add(Btn2, 51, 52);
		grid1.add(Btn3, 52,52);
		grid1.add(Btn0, 51, 53);

		grid1.add(divideBtn, 53, 50);
		grid1.add(multiplyBtn, 53, 51);
		grid1.add(subtractBtn, 53, 52);
		grid1.add(addBtn, 53, 53);
		grid1.add(equalsBtn, 53, 54);
		
		grid1.add(resetBtn, 54, 53);

		// adding window and total label
		grid1.add(windowLabel, 50, 54);
		grid1.add(resultLabel, 54, 54);

		grid1.setHgap(5);
		grid1.setVgap(5);

		primaryStage.setScene(scene);
		primaryStage.show();

		// this event handles numbers
		EventHandler<MouseEvent> event0 = new EventHandler<MouseEvent>() {
			@Override
			public void handle(MouseEvent e) {

				Button tempBtn = ((Button) e.getSource());
				String currentBtn = tempBtn.getText();

				// the boolean isFirst allows you to control which side the operator to store
				// numbers
				if (isFirst) {
					if (!(currentBtn.equals("/")) || !(currentBtn.equals("*")) || !(currentBtn.equals("-"))
							|| !(currentBtn.equals("+")) || !(currentBtn.contentEquals("="))) {

						input1 += currentBtn;
						value1 = Double.valueOf(input1);
						// value of looks for numbers in the string... tbh we could just do a parse but
						// keeping it like this.

					}
				} else {
					if (!(currentBtn.equals("/")) || !(currentBtn.equals("*")) || !(currentBtn.equals("-"))
							|| !(currentBtn.equals("+")) || !(currentBtn.contentEquals("="))) {

						input2 += currentBtn;
						value2 = Double.valueOf(input2);

					}

				}
				windowLabelPrint();
			}
		};

		EventHandler<MouseEvent> event1 = new EventHandler<MouseEvent>() {
			@Override
			public void handle(MouseEvent e) {

				// because the user clicked on an operator we will now set isFirst to false
				isFirst = false;

				// we will now store the operator for event2 to use
				Button tempBtn = ((Button) e.getSource());
				String currentBtn = tempBtn.getText();
				operatorType = currentBtn;

				windowLabelPrint();
			}
		};

		EventHandler<MouseEvent> event2 = new EventHandler<MouseEvent>() {
			@Override
			public void handle(MouseEvent e) {

				switch (operatorType) {
				case "/":
					result = (value1 / value2);
				case "*":
					result = (value1 * value2);
				case "-":
					result = (value1 - value2);
				case "+":
					result = (value1 + value2);

				case "=":
					resultLabel.setText(Double.toString(result));
				}
				windowLabelPrint();
			}
		};
		
		EventHandler<MouseEvent> event3 = new EventHandler<MouseEvent>() {
			@Override
			public void handle(MouseEvent e) {
				
				input1 = "";
				input2 = "";
				
				value1 = 0;
				value2 = 0;
				result = 0;

				operatorType = "";

				windowLabelOverwrite = "";

				isFirst = true;
				
				resultLabel.setText("");
				windowLabel.setText("");
			}
		};

		Btn0.addEventFilter(MouseEvent.MOUSE_CLICKED, event0);
		Btn1.addEventFilter(MouseEvent.MOUSE_CLICKED, event0);
		Btn2.addEventFilter(MouseEvent.MOUSE_CLICKED, event0);
		Btn3.addEventFilter(MouseEvent.MOUSE_CLICKED, event0);
		Btn4.addEventFilter(MouseEvent.MOUSE_CLICKED, event0);
		Btn5.addEventFilter(MouseEvent.MOUSE_CLICKED, event0);
		Btn6.addEventFilter(MouseEvent.MOUSE_CLICKED, event0);
		Btn7.addEventFilter(MouseEvent.MOUSE_CLICKED, event0);
		Btn8.addEventFilter(MouseEvent.MOUSE_CLICKED, event0);
		Btn9.addEventFilter(MouseEvent.MOUSE_CLICKED, event0);

		divideBtn.addEventFilter(MouseEvent.MOUSE_CLICKED, event1);
		multiplyBtn.addEventFilter(MouseEvent.MOUSE_CLICKED, event1);
		subtractBtn.addEventFilter(MouseEvent.MOUSE_CLICKED, event1);
		addBtn.addEventFilter(MouseEvent.MOUSE_CLICKED, event1);
		equalsBtn.addEventFilter(MouseEvent.MOUSE_CLICKED, event2);
		
		resetBtn.addEventFilter(MouseEvent.MOUSE_CLICKED, event3);

	}

	public void windowLabelPrint() {
		windowLabelOverwrite = input1 + operatorType + input2;
		windowLabel.setText(windowLabelOverwrite);
	}

	public static void main(String[] args) {
		launch(args);
	}
}
