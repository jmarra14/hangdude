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
