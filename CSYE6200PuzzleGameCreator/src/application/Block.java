package application;

public class Block {
	//one block of the board 
	public char c;
	//empty block c = '?'
	public boolean isSelected_;
	public boolean isPartOfGame_;
	public boolean inWrongWord_;
	//isSelected_ = true if and only if it is selected by user 
	//isPartOfBoard_ = true if and only if the block is a part of puzzle game
	Block(){
		c='?';
		isSelected_=false;
		isPartOfGame_ = false;
		inWrongWord_=false;
	}
	public void clear() {
		//reset a block 
		c='?';
		isSelected_=false;
		isPartOfGame_ = false;
		inWrongWord_=false;
	}
	public void printS() {
		if(isSelected_) {
			  System.out.print("S");
			  return;
		}
		System.out.print(c);
	}
	public void printP(){
		if(isPartOfGame_) {
			  System.out.print("P");
			  return;
		}
		System.out.print(c);
	}
}
