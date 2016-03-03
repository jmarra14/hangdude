import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Gameplay extends Application{
	
	public static void launchGame(){
		Application.launch();
	}
	
	@Override
	public void start(Stage PrimaryStage) throws Exception {
		Parent rootGame = FXMLLoader.load(getClass().getResource("GamePlay.fxml"));
		Scene sceneGame = new Scene(rootGame);
		PrimaryStage.setTitle("HangDude");
			PrimaryStage.setScene(sceneGame);
			PrimaryStage.show();
		
		}
	}


