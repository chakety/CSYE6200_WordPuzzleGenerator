package application;
	
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;


public class tutorial extends Application {
	
	
	Button btn1;
	Label lbl1,lbl2,lbl3,lbl4;
	FlowPane pane1, pane2;
	Scene scene1, scene2;
	Stage stage1, Stage2;

	@Override
	public void start(Stage primaryStage) {
		stage1 = primaryStage;
		btn1 = new Button("TUTORIAL");
		btn1.setOnAction(e -> ButtonClicked(e));
		
		lbl1 = new Label("Scene1");
		lbl2 = new Label("Game Tutorial");
		lbl3 = new Label();
		lbl3.setText("To Play this game, you should follow this steps:");
		lbl4 = new Label();
		lbl4.setText("First, you should customize your map.");
		Label lbl5 = new Label("    Click a block to make it green.");
		Label lbl6 = new Label("    Input letter in green blocks only.");
		Label lbl7 = new Label("    Double click the block to cancel it.");
		Label lbl8 = new Label("Second, click save to check the word validation.");
		Label lbl9 = new Label("    Invalid words will turn to red.");
		Label lbl10 = new Label("    You need to correct it.");
		Label lbl11 = new Label("When not sure, using search for advice.");
		pane1 = new FlowPane();
		pane2 = new FlowPane();
		pane1.setHgap(20);
	    pane2.setVgap(10);
	    pane1.setStyle("-fx-background-color:white;-fx-padding:10px;");
	    pane2.setStyle("-fx-background-color:white;-fx-padding:10px;");
	    pane1.getChildren().addAll(lbl1, btn1);
	    btn1.setTranslateX(300);
	    pane2.getChildren().addAll(lbl2,lbl3,lbl4,lbl5,lbl6,lbl7,lbl8,lbl9,lbl10,lbl11);
	    scene1 = new Scene(pane1, 600, 600);
	    scene2 = new Scene(pane2, 300, 400);
	    Stage2 = new Stage();
	    Stage2.setScene(scene2);
	    Stage2.setResizable(false);
	    
	    Stage2.initModality(Modality.APPLICATION_MODAL);
	    Stage2.setTitle("Game Tutorial");
	    primaryStage.setTitle("MainPage");
	    primaryStage.setScene(scene1);
	    primaryStage.setMinWidth(300);
	    primaryStage.show();

	     
//
//		try {
//			BorderPane root = new BorderPane();
//			Scene scene = new Scene(root,400,400);
//			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
//			primaryStage.setScene(scene);
//			primaryStage.show();
//		} catch(Exception e) {
//			e.printStackTrace();
//		}
	}
	
	private Object ButtonClicked(ActionEvent e) {
		if (e.getSource()==btn1)
	         Stage2.showAndWait();


		return null;
	}

	public static void main(String[] args) {
		launch(args);
	}
}
