import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.stage.Stage;

public class Play extends Application{
	
	
	public static void main(String[] args){
		launch(args);
	}
	
	@Override
	public void start(Stage PrimaryStage) throws Exception {
		Parent root = FXMLLoader.load(getClass().getResource("Play.fxml"));
		Scene scene = new Scene(root);
		PrimaryStage.setTitle("HangDude");
		PrimaryStage.setScene(scene);
		PrimaryStage.show();
	}

}
