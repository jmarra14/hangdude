import java.util.Optional;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.RadioButton;
import javafx.scene.control.SplitPane;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.AnchorPane;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.text.Text;

public class GameController {
	
	public Game currentGame = new Game();
	
	@FXML
	private Text textArea;
	
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
    private Circle head;
    
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
    private Line body;
    
    @FXML
    void startGame(ActionEvent event) {
    	resetGame();
    
    	if(rdoHard.isSelected()){
    		currentGame.generatePhrase("HardDict.txt");
    	}else if (rdoMedium.isSelected()){
    		currentGame.generatePhrase("MedDict.txt");
    	}else{
    		currentGame.generatePhrase("EasyDict.txt");
    	}
    	textArea.setText(new String(currentGame.phrase));
    	System.out.println("Answer is: " + currentGame.answer);
    	System.out.println("Current phrase is: " + currentGame.phrase);
    	
    }

    @FXML
    void quit(ActionEvent event) {
    	System.exit(0);
    }
    
    @FXML
    void letterGuess(ActionEvent event){
    	char letter = 0;
    	if (event.getSource()==btnA){
    		letter='a';
    		btnA.setVisible(false);
    	} else if (event.getSource()==btnB){
    		letter='b';
    		btnB.setVisible(false);
    	} else if (event.getSource()==btnC){
    		letter='c';
    		btnC.setVisible(false);
    	} else if (event.getSource()==btnD){
    		letter='d';
    		btnD.setVisible(false);
    	} else if (event.getSource()==btnE){
    		letter='e';
    		btnE.setVisible(false);
    	} else if (event.getSource()==btnF){
    		letter='f';
    		btnF.setVisible(false);
    	} else if (event.getSource()==btnG){
        	letter='g';
        	btnG.setVisible(false);
    	} else if (event.getSource()==btnH){
    		letter='h';
    		btnH.setVisible(false);
    	} else if (event.getSource()==btnI){
    		letter='i';
    		btnI.setVisible(false);
    	} else if (event.getSource()==btnJ){
    		letter='j';
    		btnJ.setVisible(false);
    	} else if (event.getSource()==btnK){
    		letter='k';
    		btnK.setVisible(false);
    	} else if (event.getSource()==btnL){
    		letter='l';
    		btnL.setVisible(false);
    	} else if (event.getSource()==btnM){
    		letter='m';
    		btnM.setVisible(false);
    	} else if (event.getSource()==btnN){
    		letter='n';
    		btnN.setVisible(false);
    	} else if (event.getSource()==btnO){
    		letter='o';
    		btnO.setVisible(false);
    	} else if (event.getSource()==btnP){
    		letter='p';
    		btnP.setVisible(false);
    	} else if (event.getSource()==btnQ){
    		letter='q';
    		btnQ.setVisible(false);
    	} else if (event.getSource()==btnR){
    		letter='r';
    		btnR.setVisible(false);
    	} else if (event.getSource()==btnS){
    		letter='s';
    		btnS.setVisible(false);
    	} else if (event.getSource()==btnT){
    		letter='t';
    		btnT.setVisible(false);
    	} else if (event.getSource()==btnU){
        	letter='u';
        	btnU.setVisible(false);
    	} else if (event.getSource()==btnV){
    		letter='v';
    		btnV.setVisible(false);
    	} else if (event.getSource()==btnW){
    		letter='w';
    		btnW.setVisible(false);
    	} else if (event.getSource()==btnX){
    		letter='x';
    		btnX.setVisible(false);
    	} else if (event.getSource()==btnY){
    		letter='y';
    		btnY.setVisible(false);
    	} else if (event.getSource()==btnZ){
    		letter='z';
    		btnZ.setVisible(false);
    	}
		currentGame.guessLetter(letter);
		textArea.setText(currentGame.phrase);
		if (currentGame.checkAnswer()){
			Alert alert = new Alert(AlertType.CONFIRMATION);
			alert.setTitle("You won!");
			alert.setHeaderText("GREAT JOB! YOU WON!");
			alert.setContentText("Would you like to play again?");

			Optional<ButtonType> result = alert.showAndWait();
			if (result.get() == ButtonType.OK){
			    startGame(event);
			} else {
			    System.exit(0);
			}
		}
  
    }
    
    void resetGame(){
    	currentGame.guesses.clear();
    	currentGame.guesses.add(' ');
    	head.setVisible(false);
    	eyes.setVisible(false);
    	mouth.setVisible(false);
    	body.setVisible(false);
    	leftArm.setVisible(false);
    	rightArm.setVisible(false);
    	leftLeg.setVisible(false);
    	rightLeg.setVisible(false);
    	btnA.setVisible(true);
    	btnB.setVisible(true);
    	btnC.setVisible(true);
    	btnD.setVisible(true);
    	btnE.setVisible(true);
    	btnF.setVisible(true);
    	btnG.setVisible(true);
    	btnH.setVisible(true);
    	btnI.setVisible(true);
    	btnJ.setVisible(true);
    	btnK.setVisible(true);
    	btnL.setVisible(true);
    	btnM.setVisible(true);
    	btnN.setVisible(true);
    	btnO.setVisible(true);
    	btnP.setVisible(true);
    	btnQ.setVisible(true);
    	btnR.setVisible(true);
    	btnS.setVisible(true);
    	btnT.setVisible(true);
    	btnU.setVisible(true);
    	btnV.setVisible(true);
    	btnW.setVisible(true);
    	btnX.setVisible(true);
    	btnZ.setVisible(true);
    }

}
