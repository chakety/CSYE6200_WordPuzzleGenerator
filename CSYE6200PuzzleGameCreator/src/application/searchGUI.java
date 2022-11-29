package application;

import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;



public class searchGUI extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			//BorderPane root = new BorderPane();
			HBox hbox = new HBox(2);
			hbox.setPadding(new Insets(5,10,5,10));
			hbox.setSpacing(5);
			StackPane pane = new StackPane();
			pane.setPadding(new Insets(5,10,5,10));
			
			Button btn = new Button("Search");
			TextField txt = new TextField("Initial text");
			
			Label l1 = new Label();
			l1.setWrapText(true);
			
			
			EventHandler<ActionEvent> event = new EventHandler<ActionEvent>() {

				@Override
				public void handle(ActionEvent arg0) {
					// TODO Auto-generated method stub

					try {
						wordsearch(txt.getText());
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
			hbox.getChildren().addAll(getVbox(txt, l1),btn);
			pane.getChildren().add(hbox);
			
			Scene scene = new Scene(pane,400,400);
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

	public static void wordsearch(String args) throws IOException {
		String s1 = args.replaceAll(" ", "[A-Z]");
		System.out.println(s1);
		FileWriter fout = new FileWriter("rst.txt");
		try(BufferedReader fin = new BufferedReader(new FileReader("dict.txt"))){
			Pattern pattern = Pattern.compile(s1);
			String rst = "";
			while((rst = fin.readLine()) != null) {
				Matcher match = pattern.matcher(rst);
				while(match.find() && rst.length() == args.length()) {
					int start = match.start(0);
					int end = match.end(0);
					fout.write((String) rst.substring(start, end) + "\n");
				}
			}
			fin.close();
			fout.close();
		}
		catch(FileNotFoundException ex) {
			System.out.println("File not found.");
			System.exit(0);
		}
	}
	public VBox getVbox(TextField text, Label l1) {
		VBox vbox = new VBox();
		vbox.setAlignment(Pos.TOP_RIGHT);
		vbox.getChildren().addAll(text,l1);
		
		return vbox;
	}
	
	
	public static void main(String[] args) {
		launch(args);
	}
}
