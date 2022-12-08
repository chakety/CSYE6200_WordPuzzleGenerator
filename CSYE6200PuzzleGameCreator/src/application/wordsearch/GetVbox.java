package application.wordsearch;


import application.Gameboard.Gameboard;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;

public class GetVbox {
	public static VBox getVbox(TextField text, Label l1) {
		VBox vbox = new VBox();
		vbox.setAlignment(Pos.TOP_RIGHT);
		vbox.setBackground(Gameboard.white);
		vbox.getChildren().addAll(text,l1);
		
		return vbox;
	}

}
