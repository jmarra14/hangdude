import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.SplitPane;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.AnchorPane;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.text.Text;

public class GameController {

    @FXML
	private SplitPane pane;

    @FXML
    private AnchorPane levelPane;

    @FXML 
    private SplitPane gamePane;

    @FXML
    private AnchorPane keyPane;
    
    @FXML
    private AnchorPane phrasePane;
    
    @FXML
    private AnchorPane hangPane;
    
    @FXML
    private Text eyes;

    @FXML
    private Text mouth;
    
	
    @FXML
    private RadioButton rdoEasy;
    
    @FXML
    private RadioButton rdoMedium;
    

    @FXML
    private RadioButton rdoHard;
    
    @FXML
    private ToggleGroup Level;

    @FXML
    private Button startButton;
    
    @FXML
    private Button quitButton;

    @FXML
    private Button btnA;

    @FXML
    private Button btnB;

    @FXML
    private Button btnC;

    @FXML
    private Button btnD;

    @FXML
    private Button btnE;

    @FXML
    private Button btnF;

    @FXML
    private Button btnG;

    @FXML
    private Button btnH;
    
    @FXML
    private Button btnI;
    
    @FXML
    private Button btnJ;

    @FXML
    private Button btnK;

    @FXML
    private Button btnL;

    @FXML
    private Button btnM;

    @FXML
    private Button btnN;

    @FXML
    private Button btnO;

    @FXML
    private Button btnP;

    @FXML
    private Button btnQ;

    @FXML
    private Button btnR;

    @FXML
    private Button btnS;

    @FXML
    private Button btnT;

    @FXML
    private Button btnU;

    @FXML
    private Button btnV;

    @FXML
    private Button btnW;

    @FXML
    private Button btnX;

    @FXML
    private Button btnY;

    @FXML
    private Button btnZ;
    
    
    
    
    @FXML
    private Line head;
    
    @FXML
    private Line hang;
    
    @FXML
    private Line leftArm;
    
    @FXML
    private Line rightArm;
    
    @FXML
    private Line rightLeg;
    
    @FXML
    private Line leftLeg;
    
    @FXML
    void startGame(ActionEvent event) {
    	if(rdoHard.isSelected()){
    		Game game = new Game("hard");
    	}else if (rdoMedium.isSelected()){
    		Game game = new Game("medium");
    	}else{
    		Game game = new Game("easy");
    	}
    }

    @FXML
    void quit(ActionEvent event) {
    	System.exit(0);
    }
    
    @FXML
    void letterGuess(ActionEvent event){
    	
    }
    

}
