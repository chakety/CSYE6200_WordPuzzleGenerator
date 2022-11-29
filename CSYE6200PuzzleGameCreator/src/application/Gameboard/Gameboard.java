package application.Gameboard;

import application.wordsearch.GetHbox;
import javafx.scene.Node;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Background;
import javafx.scene.layout.Border;
import javafx.scene.layout.BorderStroke;
import javafx.scene.layout.BorderStrokeStyle;
import javafx.scene.layout.BorderWidths;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;

public class Gameboard {
	static Background red =Background.fill(Color.RED);
	static Background green =Background.fill(Color.LIGHTGREEN);
	static Background white =Background.fill(Color.WHITE);
	static Background blue =Background.fill(Color.BLUE);
	
	
	Node getNodeFromGridPane(GridPane gridPane, int col, int row) {
	    for (Node node : gridPane.getChildren()) {
	        if (GridPane.getColumnIndex(node) == col && GridPane.getRowIndex(node) == row) {
	            return node;
	        }
	    }
	    return null;
	}
	Border helperfunction() {
		return new Border(new BorderStroke(Color.GREEN, BorderStrokeStyle.SOLID, CornerRadii.EMPTY, new BorderWidths(1)));
	}
	static void selectHandler( TextField tf,MouseEvent e) {
		if(tf.getBackground().equals(white) && e.getClickCount() == 1) {
			
			tf.setBackground(green);
			tf.setEditable(true);
		}
		else if(tf.getBackground().equals(green) && e.getClickCount() >= 2) {
			tf.setBackground(white);
			tf.setEditable(false);
			tf.setText("");
		}
	}
	static void limitInput(TextField tf) {
		System.out.print("before"+tf.getText());
		if(tf.getText().matches("[a-z]||[A-Z]")) {
			tf.setText(tf.getText().toUpperCase());
		}
		else {
			tf.setText("");
		}
	}
	static public HBox getGameboard() {
		//Grid pane
				GridPane Gpane = new GridPane();
				 for(int i=0;i<20;i++) {
					 for(int j = 0;j<20;j++) {
						 //for each slot add a textfield with 25 width
						  TextField tf=new TextField(); 
						  
						  tf.setMaxWidth(25);
						  tf.setMinWidth(25);
						  tf.setBorder(new Border(new BorderStroke(Color.LIGHTGREY, BorderStrokeStyle.SOLID, CornerRadii.EMPTY, new BorderWidths(1))));
						  tf.setBackground(white);
						  tf.setEditable(false);
						  
						  
						  
						
						  tf.setOnMouseClicked(e -> selectHandler(tf,e));
						  tf.setOnAction(e->limitInput(tf));
						  
						  //tf.setOnMouseDragEntered(e -> selectHandler(tf));
						  Gpane.setConstraints(tf, i, j);
						  Gpane.getChildren().add(tf);
						 
					 }
				 }
				 HBox GHbox = new HBox(1);
				 GHbox.getChildren().add(Gpane);
				 return GHbox;
						 //Grid pane
	}
}
