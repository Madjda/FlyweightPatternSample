package application;


import javafx.scene.text.Font ;

import java.awt.font.TextAttribute;
import java.text.AttributedString;

import com.sun.javafx.css.Style;

import Flyweight.Character;
import Flyweight.CharacterFactory;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.text.Text;
import javafx.scene.text.TextFlow;

public class KeyboardController {
	String btn ;
	String lettre ;
    @FXML
    private TextFlow screen;

    @FXML
    private RadioButton italic;

    @FXML
    private RadioButton bold;
    @FXML 
    private Text t ;



        @FXML 
		void print( Event e) {
        	CharacterFactory charfactory = CharacterFactory.instance();
        	btn = ((Button) e.getSource()).getText() ;
        	int style ;
        	Character ch = charfactory.getCharacter(btn.charAt(0)) ;
        	lettre=java.lang.Character.toString(ch.getChar());
        	t=new Text();
        	t.setText(lettre);
        	t.setFont(Font.font("Verdana",20));
        	if (italic.isSelected())
        	t.setStyle("-fx-font-style: italic");
        	if (bold.isSelected())
        	t.setStyle("-fx-font-weight: bold");
        	if ((bold.isSelected()) &&  (italic.isSelected()))
        	{
        		t.setStyle("-fx-font-weight: bold ; -fx-font-style: italic");
        	}
        	screen.getChildren().add(t);
      
	
		}
        
        @FXML 
		void clear ( ) {
        	screen.getChildren().clear();
        	
        }
       
        	   @FXML 
       		void delete ( ) {
               
               	screen.getChildren().remove(screen.getChildren().size()-1);        
                  
        }
        	   
        	   @FXML
        	    void espace() {
        		   t=new Text();
               	t.setText(" ");
               	screen.getChildren().add(t);

        	    }
        	   @FXML
       	    void enter() {
       		   t=new Text();
              	t.setText("\n");
              	screen.getChildren().add(t);

       	    }
       
        
}
