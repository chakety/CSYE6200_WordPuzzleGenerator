package application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public  class Main extends Application{

	@Override
	public void start(Stage Stage1) throws Exception {
		// TODO Auto-generated method stub
		BorderPane bd = new BorderPane();
		bd.setCenter(GetTurorialHBOX.getTHbox());
		
		Scene scene1 = new Scene(bd,600,800);
		Stage1.setScene(scene1);
		Stage1.show();
		
	}
	public static void main(String[] args) {
		launch(args);
	}

}
