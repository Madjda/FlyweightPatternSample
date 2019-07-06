package Flyweight;
import java.util.ArrayList;

/**
 * This is Flyweight factory that given a unicode code point returns the Flyweight
character object for the character.
* It have single point of access       
 */

public class CharacterFactory   {
	
	private ArrayList<Character> characterArray = new ArrayList<Character>();
	
	private CharacterFactory() {}
	
	private static class SingletonHolder {
		 
		private final static CharacterFactory  Instance = new CharacterFactory ();
		 
		 }
	public static CharacterFactory instance() {
		 
		return SingletonHolder.Instance;
		
		 }

	public Character getCharacter(char currentChar){
		
			for (Character character : characterArray) {
				if(character.getChar() == currentChar){
					return character;
				}
		    }
			
			Character character = new Character(currentChar);
			characterArray.add(character);
			return 	character;
        
	}
}