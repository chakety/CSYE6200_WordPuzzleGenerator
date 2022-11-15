package application;
import java.util.ArrayList;
public class puzzleBoard {
	//puzzle that can handle all the actions in the back end
	private ArrayList<ArrayList <Block> > board;
	int width;
	int height;
	puzzleBoard(){
		width = 50;
		height=50;
		board=new ArrayList<ArrayList <Block> >();
		for(int i=0;i<height;i++) {
			ArrayList<Block> row= new ArrayList<Block>();
			for(int j = 0;j<width;j++) {
				row.add(new Block());
			}
			board.add(row);
		}
	}
	puzzleBoard(int w, int h){
		width = w;
		height=h;
		board=new ArrayList<ArrayList <Block> >();
		for(int i=0;i<height;i++) {
			ArrayList<Block> row= new ArrayList<Block>();
			for(int j = 0;j<width;j++) {
				row.add(new Block());
			}
			board.add(row);
		}
	}
	public Block get(int i,int j){
		return board.get(i).get(j);
	}
	public void clear() {
		for(int i=0;i<height;i++) {
			for(int j = 0;j<width;j++) {
				board.get(i).get(j).clear();
			}
		}
	}
	public void printP() {
		System.out.print("PartOfGame---------------------\n");
		for(int i=0;i<height;i++) {
			for(int j = 0;j<width;j++) {
				board.get(i).get(j).printP();
			}
			System.out.print('\n');
		}
		System.out.print("---------------------------\n");
	}
	public void printS() {
		System.out.print("Selected---------------------\n");
		for(int i=0;i<height;i++) {
			for(int j = 0;j<width;j++) {
				board.get(i).get(j).printS();
			}
			System.out.print('\n');
		}
		System.out.print("---------------------------\n");
	}
	public void print() {
		System.out.print("board---------------------\n");
		for(int i=0;i<height;i++) {
			for(int j = 0;j<width;j++) {
				System.out.print(board.get(i).get(j).c);;
			}
			System.out.print('\n');
		}
		System.out.print("---------------------------\n");
	}
	public static void main(String[] args) {
		// board test
		puzzleBoard b = new puzzleBoard(10,10);
		b.print();
		
		//you can change block value by get() in board
		b.get(1, 1).c = 'a';
		b.get(1, 1).isPartOfGame_=true;
		b.get(1, 1).isSelected_=true;
		
		b.print();
		b.printP();
		b.printS();
		
	}
}
