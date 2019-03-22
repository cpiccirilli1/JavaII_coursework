import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import javafx.scene.layout.BorderPane;
import javafx.scene.text.*;
import javafx.scene.control.Alert;
import javafx.event.EventHandler;
import javafx.event.ActionEvent;
import javafx.application.Platform;

//@author Chelsea Piccirilli
//Lab1
//Spring 2019

public class StudentGui extends Application{
	
	String c_white = "-fx-text-fill: White;";
	String c_black = "-fx-background-color: Black;";
	@Override
	public void start(Stage primaryStage){

		Label studentID = new Label("Student Information:");
		studentID.setStyle(c_white);

		BorderPane pane = new BorderPane();
		pane.setTop(studentID);
		pane.setCenter(centerPane());	
		pane.setBottom(bottomPane());
		pane.setStyle(c_black);

		//creates a scene		
		Scene scene = new Scene(pane);
		primaryStage.setTitle("Student Information");
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	private GridPane centerPane(){
		GridPane pane = new GridPane();
		pane.setAlignment(Pos.CENTER);
		pane.setPadding(new Insets(11.5, 12.5, 13.5, 14.5));
		pane.setHgap(5.5);
		pane.setVgap(5.5);

		//creates labels 
		Label firstName = new Label("First Name:");
		firstName.setFont(Font.font("Arial", 14));
		firstName.setStyle("-fx-text-fill: white;");
		Label lastName = new Label("Last Name:");
		lastName.setFont(Font.font("Arial", 14));
		lastName.setStyle("-fx-text-fill: white;");
		Label stID = new Label("Student ID:");
		stID.setFont(Font.font("Arial", 14));
		stID.setStyle("-fx-text-fill: white;");
		Label email = new Label("Email:");
		email.setFont(Font.font("Arial", 14));
		email.setStyle("-fx-text-fill: white;");
		Label gpa = new Label("GPA:");
		gpa.setFont(Font.font("Arial", 14));
		gpa.setStyle("-fx-text-fill: white;");

		//places buttons and fields in pane
		pane.add(firstName, 0, 0);
		pane.add(new TextField(), 1, 0);	
		pane.add(lastName, 2, 0);
		pane.add(new TextField(), 3, 0);
		pane.add(stID, 0, 1);
		pane.add(new TextField(), 1, 1);
		pane.add(email, 2, 1);
		pane.add(new TextField(), 3, 1);
		pane.add(gpa, 0, 2);
		pane.add(new TextField(), 1, 2);
		return pane;
	}//ends centerPane function	

	private GridPane bottomPane() {

		GridPane bottom = new GridPane();
		bottom.setAlignment(Pos.CENTER);
		bottom.setPadding(new Insets(11.5, 12.5, 13.5, 14.5));
		bottom.setHgap(5.5);
		bottom.setVgap(5.5);

		//creates all buttons
		Button findButton = new Button("Find");
		findButton.setStyle("-fx-background-color: orange;");
		
		Button insertButton = new Button("Insert");
		insertButton.setStyle("-fx-background-color: cyan;");
		
		Button updateButton = new Button("Update");
		updateButton.setStyle("-fx-background-color: yellow;");
		
		Button deleteButton = new Button("Delete");
		deleteButton.setStyle("-fx-background-color: red;");
		
		Button exitButton = new Button("Exit");
		exitButton.setStyle("-fx-background-color: brown;");
		exitButton.setOnAction(new ExitWindow());

		//adds all buttons to pane: bottom
		bottom.add(findButton, 0, 0);
		bottom.add(insertButton, 1, 0);
		bottom.add(deleteButton, 2, 0);
		bottom.add(updateButton, 3, 0);
		bottom.add(exitButton, 4, 0);
		return bottom;
	}//ends bottomPane function

	class ExitWindow implements EventHandler<ActionEvent>{
		@Override

		public void handle(ActionEvent e){
			GridPane exitPane = new GridPane();
			Button ok = new Button("Ok");
			ok.setOnAction(z-> {Platform.exit();});


			Button cancel = new Button("Cancel");


			Label exitQ = new Label("Exit?");
			exitQ.setStyle(c_white);
			exitPane.add(exitQ, 0, 0); 
			exitPane.add(ok, 1, 0);
			exitPane.add(cancel, 2, 0);
			exitPane.setStyle(c_black);
			exitPane.setPadding(new Insets(11.5, 12.5, 13.5, 14.5));
			exitPane.setHgap(5.5);
			exitPane.setVgap(5.5);

			Scene exitScene = new Scene(exitPane);
			Stage stage2 = new Stage();
			cancel.setOnAction(x-> {stage2.close();});

			stage2.setTitle("Exit?");
			stage2.setScene(exitScene);
			stage2.show();
				
		} //end handle		

	}	//end ExitWindow class

	
}//end class