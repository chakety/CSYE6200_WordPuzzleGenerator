package application.tutorial;

import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.ContentDisplay;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundImage;
import javafx.scene.layout.BackgroundPosition;
import javafx.scene.layout.BackgroundRepeat;
import javafx.scene.layout.BackgroundSize;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Region;

public class GetTurorialHBOX {
	
	public static HBox getTHbox() {
		HBox tb = new HBox();
		tb.setPadding(new Insets(5,10,5,10));
		tb.setSpacing(5);
		ImageView image = new ImageView(new Image("/tutorialimage/tutorial.png"));
		image.setPreserveRatio(true);
		image.setFitHeight(125);
		
//		Image img = new Image("/backgroundImage/IMG_4054.PNG");
//		BackgroundImage bimg = new BackgroundImage(img,
//				BackgroundRepeat.NO_REPEAT,
//				BackgroundRepeat.NO_REPEAT,
//				BackgroundPosition.DEFAULT,
//				BackgroundSize.DEFAULT );
//		Background bGround = new Background(bimg);
		
		
		Button tbutton = new Button();
		tbutton.setGraphic(image);
		tbutton.setBackground(null);
		tbutton.setPrefSize(Region.USE_COMPUTED_SIZE, 100);
		tbutton.setContentDisplay(ContentDisplay.CENTER);
//		tb.setBackground(bGround);
		
		
		EventHandler<ActionEvent> callStage = new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent arg0) {
				GetTutorialStage.getTutorialStage();
				
			}
			
		};
		tbutton.setOnAction(callStage);
		tb.setAlignment(Pos.CENTER);
		tb.getChildren().addAll(tbutton);
		
		
		return tb;
		
	}

}
