package application;
import application.Gameboard.Gameboard;
import application.tutorial.GetTurorialHBOX;
import application.wordsearch.GetHbox;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;



public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		Gameboard Gb = new Gameboard();
		BorderPane pane = new BorderPane();
		pane.setCenter(Gb.getGameboard());
		pane.setRight(GetHbox.getHbox());
		pane.setTop(GetTurorialHBOX.getTHbox());
		wordcheck w = new wordcheck(Gb);
		pane.setBottom(w.checkHBox());
		 
		 Scene scene = new Scene(pane, 900, 900);
		 primaryStage.setTitle("Puzzle Game Generator");
		 primaryStage.setScene(scene);
		 primaryStage.show();
		 
			
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
