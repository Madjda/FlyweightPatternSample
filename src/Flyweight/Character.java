package Flyweight;
public class Character {

	private int uniCode;
	
	Character(char currentChar){
		
      uniCode = (int) currentChar;
	}
	
	public char getChar(){
		return (char)uniCode;
	}

	public int getUniCode() {
		return uniCode;
	}

	public void setUniCode(int uniCode) {
		this.uniCode = uniCode;
	}
	
	public void draw(){
		//for fututre enhancements 
	}
	
}