package application;

import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.HBox;

public class GetTurorialHBOX {
	
	public static HBox getTHbox() {
		
		HBox tb = new HBox();
		Button tbutton = new Button("TUTORIAL");
		
		EventHandler<ActionEvent> callStage = new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent arg0) {
				GetTutorialStage.getTutorialStage();
				
			}
			
		};
		tbutton.setOnAction(callStage);
		tb.setAlignment(Pos.TOP_RIGHT);
		tb.getChildren().addAll(tbutton);
		
		
		return tb;
		
	}

}
