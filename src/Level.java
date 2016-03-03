import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Level extends Application{
	
	public static void main(String[] args){
		launch(args);
		
		
	}
	
	@Override
	public void start(Stage PrimaryStage) throws Exception {
		Parent rootLevel = FXMLLoader.load(getClass().getResource("Level.fxml"));
		Scene sceneLevel = new Scene(rootLevel);
		PrimaryStage.setTitle("Choose A Level");
		PrimaryStage.setScene(sceneLevel);
		PrimaryStage.show();
	
	}
}
