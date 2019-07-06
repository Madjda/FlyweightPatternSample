package application;
	
import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;



public class Main extends Application {
	@FXML
	 static  AnchorPane Layout;
	static Stage primaryStage ;
	@Override
	public void start(Stage primaryStage ) {
		try {
		  //scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			FXMLLoader loader = new FXMLLoader ();
			loader.setLocation(Main.class.getResource("keyboard.fxml"));
	        Layout = loader.load();
			Scene scene = new Scene(Layout);
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

    
	public static void main(String[] args) {
		launch(args);
	}
}
