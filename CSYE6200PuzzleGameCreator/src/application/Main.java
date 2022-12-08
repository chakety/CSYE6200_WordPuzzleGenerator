package application;
import application.Gameboard.Gameboard;
import application.tutorial.GetTurorialHBOX;
import application.wordsearch.GetHbox;
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundImage;
import javafx.scene.layout.BackgroundPosition;
import javafx.scene.layout.BackgroundRepeat;
import javafx.scene.layout.BackgroundSize;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;



public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		Gameboard Gb = new Gameboard();
		BorderPane pane = new BorderPane();
		wordcheck w = new wordcheck(Gb);
		VBox vbox = new VBox();
		vbox.setAlignment(Pos.TOP_RIGHT);
		vbox.getChildren().addAll(GetTurorialHBOX.getTHbox(),GetHbox.getHbox(),w.checkHBox());
		pane.setCenter(Gb.getGameboard());	
		pane.setRight(vbox);
		
		Image img = new Image("/backgroundImage/MicrosoftTeams-image.png");
		BackgroundImage bimg = new BackgroundImage(img,
				BackgroundRepeat.NO_REPEAT,
				BackgroundRepeat.NO_REPEAT,
				BackgroundPosition.DEFAULT,
				BackgroundSize.DEFAULT );
		Background bGround = new Background(bimg);
		Background.fill(Color.TRANSPARENT);
		pane.setBackground(bGround);

		
		 
		 Scene scene = new Scene(pane, 995, 650);
		 primaryStage.setTitle("Puzzle Game Generator");
		 primaryStage.setScene(scene);
		 primaryStage.show();
		 
			
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
