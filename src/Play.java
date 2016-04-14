/**
 *  __  __                           ____                __            
 * /\ \/\ \                         /\  _`\             /\ \           
 * \ \ \_\ \     __      ___      __\ \ \/\ \  __  __   \_\ \     __   
 *  \ \  _  \  /'__`\  /' _ `\  /'_ `\ \ \ \ \/\ \/\ \  /'_` \  /'__`\ 
 *   \ \ \ \ \/\ \L\.\_/\ \/\ \/\ \L\ \ \ \_\ \ \ \_\ \/\ \L\ \/\  __/ 
 *    \ \_\ \_\ \__/.\_\ \_\ \_\ \____ \ \____/\ \____/\ \___,_\ \____\
 *     \/_/\/_/\/__/\/_/\/_/\/_/\/___L\ \/___/  \/___/  \/__,_ /\/____/
 *                                /\____/                              
 *                                \_/__/                               
 * 			Above text generated from http://patorjk.com/software/taag/
 * 
 * Play Class for HangDude game
 * 
 * This class is used to load the FXML, create the scene and launch the game.
 * 
 * @author Jacob Marra
 * @author Kristin Johnson
 * @author Sarah Nolan
 *
 */

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Play extends Application{
	
	
	public static void main(String[] args){
		//Launch
		launch(args);
	}
	
	@Override
	public void start(Stage PrimaryStage) throws Exception {
		//Load FXML Document
		Parent root = FXMLLoader.load(getClass().getResource("Play.fxml"));
		
		//Create scene from FXML
		Scene scene = new Scene(root);
		
		//Set Window Title
		PrimaryStage.setTitle("HangDude");
		
		//Set Stage with Scene
		PrimaryStage.setScene(scene);
		
		//Make window non-resizable
		PrimaryStage.setResizable(false);
		
		//Show Stage
		PrimaryStage.show();
	}

}
