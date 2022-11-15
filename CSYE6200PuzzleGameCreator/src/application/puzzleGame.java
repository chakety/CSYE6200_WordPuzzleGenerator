package application;
import java.util.ArrayList;

import javafx.util.Pair;
public class puzzleGame {
	private int current_board;
	private int current_index;
	private ArrayList<puzzleBoard> log;//for later use prepare for goback method
	String file;// need update
	
	puzzleGame(){
		current_index=0;
		log = new ArrayList<puzzleBoard>();
		log.add(new puzzleBoard());
	}
	puzzleBoard getCurrentBoard() {
		//!!!!!!!!!!IMPORTANT pls use this to get current board,
		//all the changes you make should only be on this board
		return log.get(current_index);
	}
	ArrayList<String> find_all_words(){
		//TODO: find all words in current board,only count when isPartOfGame = true
		// output words in this format: "a???b?c" when '?' is empty space
		return null;
	}
	public ArrayList<String> unValidWords(ArrayList<String> allWords){
		//TODO: check if all words in allWords are valid 
		//find a dictionary online,download it in this project,
		//add its name/route in String file, and import file and do the compare
		//your input may contain "a???b?c", "?" can match to any letter
		//return all unValid words your output should also be in this format "a???b??c"
		return null;
	}
	public static ArrayList<String> dicSearchFor(String input,int n) {
		//TODO: search in the dictionary,return first n matching words or a empty ArrayList if cannot find any
		////your input may contain "a???b?c", "?" can match to any letters
		return null;
	}
	void save() {
		//TODO you need to check current_board,
		//outline the wrong words in current_board (Block.inWrongWord = true) do not forget to reset wrong words at beginning
		//put current_board in log,update current_index(no matter it has wrong words or not)
	}
	void saveSelected() {
		//TODO change all selected to PartOfGame
	}
	void Selected(ArrayList<Pair> indexs) {
		//TODO change all blocks locates in provided indexes selected_ = true
	}
	//TODO design log algorithm,go back method
	
}
