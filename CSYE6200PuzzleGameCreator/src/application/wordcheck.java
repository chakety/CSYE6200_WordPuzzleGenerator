package application;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import application.Gameboard.Gameboard;
import application.wordsearch.GetVbox;
import application.wordsearch.Wordsearch;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.util.Pair;

public class wordcheck {
	private static final String String = null;
	Gameboard Gb ;
	public wordcheck(Gameboard Gb){
		this.Gb = Gb;
	}
	public void checkhandler () {
		for(int i=0;i<20;i++) {
			for(int j=0;j<20;j++) {
				TextField tf = (TextField) Gb.getNodeFromGridPane(j, i);
				if(!tf.getBackground().equals(Gameboard.white)) {
					tf.setBackground(Gb.green);
				}
			}
		}
		// horizontal
		for(int i=0;i<20;i++) {
			List<Integer> hindex = new ArrayList<Integer>();
			List<Integer> vindex = new ArrayList<Integer>();
			String newword = "";
			for(int j=0;j<20;j++) {
				TextField tf = (TextField) Gb.getNodeFromGridPane(j, i);
				if(!tf.getBackground().equals(Gameboard.white)) {
					System.out.println("r="+tf.getText());
					if(tf.getText().isEmpty()|| tf.getText()==" "||tf.getText()==null) {
						System.out.println("HAHA");
						newword+=" ";
						hindex.add(j);
						vindex.add(i);
					}
					else {
						newword+=tf.getText();
						hindex.add(j);
						vindex.add(i);
					}
				}
				else {
					if(newword.length()>=2) {
					System.out.println("newword="+newword+"newword");
					for(int m=0;m<vindex.size();m++) {
						System.out.print("Index: "+vindex.get(m)+" "+hindex.get(m));
					}
					try {
						if(hasWord(newword)) {
							System.out.print("find");
						}
						else {
							for(int m=0;m<hindex.size();m++) {
								for(int n=0;n<vindex.size();n++) {
									TextField tf1 = (TextField) Gb.getNodeFromGridPane(hindex.get(m), vindex.get(n));
									tf1.setBackground(Gb.red);
								}
							}
						}
					} 
					catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
						}
					newword="";
					}	
				}
			}
		}
		// vertical 
		for(int j=0;j<20;j++) {
			List<Integer> hindex = new ArrayList<Integer>();
			List<Integer> vindex = new ArrayList<Integer>();
			String newword1 = "";
			for(int i=0;i<20;i++) {
				
				TextField tf = (TextField) Gb.getNodeFromGridPane(j, i);
				if(!tf.getBackground().equals(Gameboard.white)) {
					System.out.println("r="+tf.getText());
					if(tf.getText().isEmpty()|| tf.getText()==" "||tf.getText()==null) {
						System.out.println("HAHA");
						newword1+=" ";
						hindex.add(j);
						vindex.add(i);
					}
					else {
						newword1+=tf.getText();
						hindex.add(j);
						vindex.add(i);
					}
				}
				else {
					if(newword1.length()>=2) {
					System.out.println("newword="+newword1+"newword");
					for(int m=0;m<vindex.size();m++) {
						System.out.print("Index: "+vindex.get(m)+" "+hindex.get(m));
					}
					try {
						if(hasWord(newword1)) {
							System.out.print("find");
						}
						else {
							for(int m=0;m<hindex.size();m++) {
								for(int n=0;n<vindex.size();n++) {
									TextField tf1 = (TextField) Gb.getNodeFromGridPane(hindex.get(m), vindex.get(n));
									tf1.setBackground(Gb.red);
								}
							}
						}
					} 
					catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
						}
					newword1="";
					}	
				}
			}
		}
		//vertical
	}
	public static boolean hasWord(String str) throws IOException{
		Wordsearch.wordsearch(str);
		try(BufferedReader fin = new BufferedReader(new FileReader("rst.txt"))){
			if((fin.readLine()) != null) {
				return true;
			}
			else
			return false;
			
		}
	}
	public HBox checkHBox() {
		HBox hbox = new HBox();
		hbox.setPadding(new Insets(50,50,10,10));
		hbox.setSpacing(5);
		Button check = new Button("Check");
		check.setOnAction(e->checkhandler());
		hbox.setAlignment(Pos.TOP_LEFT);
		hbox.getChildren().add(check);
		return hbox;
		
	}
	
}
