package application.wordsearch;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.ContentDisplay;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Region;
import javafx.scene.paint.Color;

public class GetHbox {
	public static HBox getHbox() {
		HBox hbox = new HBox(2);
		hbox.setPadding(new Insets(5,10,5,10));
		hbox.setSpacing(5);
		ImageView img = new ImageView(new Image("/searchimage/Search_Icon.png"));
		img.setPreserveRatio(true);
		img.setFitHeight(100);
		Button btn = new Button(" ");
		btn.setBackground(null);
		btn.setPrefSize(Region.USE_COMPUTED_SIZE, 100);
		btn.setGraphic(img);
		btn.setContentDisplay(ContentDisplay.CENTER);
		
		TextField txt = new TextField("");
		txt.setPrefSize(Region.USE_COMPUTED_SIZE, 50);
		
		Label l1 = new Label();
		l1.setWrapText(true);
		
		
		EventHandler<ActionEvent> event = new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent arg0) {
				// TODO Auto-generated method stub

				try {
					Wordsearch.wordsearch(txt.getText());
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				try(BufferedReader fin = new BufferedReader(new FileReader("rst.txt"))){
					String rst = "";
					int i = 0;
					StringBuilder str = new StringBuilder();
					while((rst = fin.readLine()) != null && i <10) {
						str.append(rst);
						str.append("\n");
						i++;
						}
					l1.setText(str.toString());
					l1.setTextFill(Color.DARKVIOLET);
					} catch (FileNotFoundException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
		};
		
		
		btn.setOnAction(event);
		txt.setOnAction(event);
		hbox.setAlignment(Pos.TOP_LEFT);
		hbox.getChildren().addAll(GetVbox.getVbox(txt, l1),btn);
		
		return hbox;
		
		
	}

}
