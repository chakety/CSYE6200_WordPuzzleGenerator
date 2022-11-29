package application;
import application.Gameboard.Gameboard;
import application.wordsearch.GetHbox;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;



public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		BorderPane pane = new BorderPane();
		 pane.setCenter(Gameboard.getGameboard());
		 pane.setRight(GetHbox.getHbox());
		 
		 
		 Scene scene = new Scene(pane, 800, 800);
		 primaryStage.setTitle("Puzzle Game Generator");
		 primaryStage.setScene(scene);
		 primaryStage.show();
		 
			
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
