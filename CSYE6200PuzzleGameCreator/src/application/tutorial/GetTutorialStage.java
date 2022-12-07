package application.tutorial;

import javafx.event.ActionEvent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.HBox;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class GetTutorialStage {

	static	Label lbl1,lbl2,lbl3,lbl4,lbl5,lbl6,lbl7,lbl8,lbl9,lbl10,lbl11;
	static	FlowPane pane2;
	static	Scene scene2;
	static	Stage stage2;

	
	public static Stage getTutorialStage() {
		
		
		lbl1 = new Label("Scene1");
		lbl2 = new Label("Game Tutorial");
		lbl3 = new Label();
		lbl3.setText("To Play this game, you should follow this steps:");
		lbl4 = new Label();
		lbl4.setText("First, you should customize your map.");
		lbl5 = new Label("_____Click a block to make it green.");
		lbl6 = new Label("_____Input letter in green blocks only.");
		lbl7 = new Label("_____Double click the block to cancel it.");
		lbl8 = new Label("Second, click save to check the word validation.");
		lbl9 = new Label("_____Invalid words will turn to red.");
		lbl10 = new Label("_____You need to correct it.");
		lbl11 = new Label("When not sure, using search for advice.");
		pane2 = new FlowPane();
	    pane2.setVgap(10);
	    
	    pane2.setStyle("-fx-background-color:white;-fx-padding:10px;");
	    pane2.getChildren().addAll(lbl2,lbl3,lbl4,lbl5,lbl6,lbl7,lbl8,lbl9,lbl10,lbl11);
	   
	    scene2 = new Scene(pane2, 300, 400);
	    stage2 = new Stage();
	    stage2.setScene(scene2);
	    stage2.setResizable(false);
	    
	    stage2.initModality(Modality.APPLICATION_MODAL);
	    stage2.setTitle("Game Tutorial");
	    stage2.show();
	    
	    
		return stage2;
		
	}

	

}
