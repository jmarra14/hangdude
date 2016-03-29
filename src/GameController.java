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
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.text.Text;

public class GameController{
	
	public Game currentGame = new Game();
	
	@FXML
	private Text textArea;
    
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
    }

    @FXML
    void quit(ActionEvent event) {
    	System.exit(0);
    }
    
    @FXML
    void letterGuess(ActionEvent event){
    	if(currentGame.phrase==null){
    		return;
    	}
    	
    	char letter;
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
    	} else{
    		letter='z';
    		btnZ.setVisible(false);
    	}
		if(currentGame.checkLetter(letter)){
		}
		else{
			currentGame.guessLetter(letter);
			textArea.setText(currentGame.phrase.toUpperCase());
			checkWin(event);
			checkLose(event);
		}
		
    }
    
    @FXML
    void pressKey(KeyEvent event){
    	if(currentGame.phrase==null){
    		return;
    	}
    	
    	char letter;
    	if (event.getCode()==KeyCode.A){
    		letter='a';
    		btnA.setVisible(false);
    	} else if (event.getCode()==KeyCode.B){
    		letter='b';
    		btnB.setVisible(false);
    	} else if (event.getCode()==KeyCode.C){
    		letter='c';
    		btnC.setVisible(false);
    	} else if (event.getCode()==KeyCode.D){
    		letter='d';
    		btnD.setVisible(false);
    	} else if (event.getCode()==KeyCode.E){
    		letter='e';
    		btnE.setVisible(false);
    	} else if (event.getCode()==KeyCode.F){
    		letter='f';
    		btnF.setVisible(false);
    	} else if (event.getCode()==KeyCode.G){
        	letter='g';
        	btnG.setVisible(false);
    	} else if (event.getCode()==KeyCode.H){
    		letter='h';
    		btnH.setVisible(false);
    	} else if (event.getCode()==KeyCode.I){
    		letter='i';
    		btnI.setVisible(false);
    	} else if (event.getCode()==KeyCode.J){
    		letter='j';
    		btnJ.setVisible(false);
    	} else if (event.getCode()==KeyCode.K){
    		letter='k';
    		btnK.setVisible(false);
    	} else if (event.getCode()==KeyCode.L){
    		letter='l';
    		btnL.setVisible(false);
    	} else if (event.getCode()==KeyCode.M){
    		letter='m';
    		btnM.setVisible(false);
    	} else if (event.getCode()==KeyCode.N){
    		letter='n';
    		btnN.setVisible(false);
    	} else if (event.getCode()==KeyCode.O){
    		letter='o';
    		btnO.setVisible(false);
    	} else if (event.getCode()==KeyCode.P){
    		letter='p';
    		btnP.setVisible(false);
    	} else if (event.getCode()==KeyCode.Q){
    		letter='q';
    		btnQ.setVisible(false);
    	} else if (event.getCode()==KeyCode.R){
    		letter='r';
    		btnR.setVisible(false);
    	} else if (event.getCode()==KeyCode.S){
    		letter='s';
    		btnS.setVisible(false);
    	} else if (event.getCode()==KeyCode.T){
    		letter='t';
    		btnT.setVisible(false);
    	} else if (event.getCode()==KeyCode.U){
        	letter='u';
        	btnU.setVisible(false);
    	} else if (event.getCode()==KeyCode.V){
    		letter='v';
    		btnV.setVisible(false);
    	} else if (event.getCode()==KeyCode.W){
    		letter='w';
    		btnW.setVisible(false);
    	} else if (event.getCode()==KeyCode.X){
    		letter='x';
    		btnX.setVisible(false);
    	} else if (event.getCode()==KeyCode.Y){
    		letter='y';
    		btnY.setVisible(false);
    	} else if (event.getCode()==KeyCode.Z){
    		letter='z';
    		btnZ.setVisible(false);
    	}
    	else{ 
    		return;
    	}
    	if(currentGame.checkLetter(letter)){
		}
		else{
			currentGame.guessLetter(letter);
			textArea.setText(currentGame.phrase.toUpperCase());
			checkWin(new ActionEvent());
			checkLose(new ActionEvent());
		}
    }
    
    
    void checkWin(ActionEvent event){
    	if (currentGame.checkAnswer()){
			Alert alert = new Alert(AlertType.CONFIRMATION);
			alert.setTitle("You won!");
			alert.setHeaderText("GREAT JOB! YOU WON!");
			alert.setContentText(String.format("The answer was: %s%n%nWould you like to play again?%n",currentGame.phrase.toUpperCase()));

			ButtonType buttonTypeYes = new ButtonType("Yes! Start New Game.");
			ButtonType buttonTypeNo = new ButtonType("No. Close Game.");
			
			alert.getButtonTypes().setAll(buttonTypeYes,buttonTypeNo);
			
			Optional<ButtonType> result = alert.showAndWait();
			if (result.get() == buttonTypeYes){
			    startGame(event);
			} else {
			    System.exit(0);
			}
		}
    }
    
    void checkLose(ActionEvent event){
    	switch(currentGame.wrong){
    		case 0: break;
    		case 1: head.setVisible(true);
    				eyes.setVisible(true);
    				mouth.setVisible(true);
    				break;
    		case 2: body.setVisible(true);
    				break;
    		case 3: leftArm.setVisible(true);
    				break;
    		case 4: rightArm.setVisible(true);
    				break;
    		case 5: leftLeg.setVisible(true);
    				break;
    		case 6: rightLeg.setVisible(true);
		    		Alert alert = new Alert(AlertType.CONFIRMATION);
					alert.setTitle("You LOSE!");
					alert.setHeaderText("Sorry, YOU LOST!");
					alert.setContentText("Would you like to play again?");
		
					ButtonType buttonTypeYes = new ButtonType("Yes! Start New Game.");
					ButtonType buttonTypeNo = new ButtonType("No. Close Game.");
					
					alert.getButtonTypes().setAll(buttonTypeYes,buttonTypeNo);
					
					Optional<ButtonType> result = alert.showAndWait();
					if (result.get() == buttonTypeYes){
					    startGame(event);
					} else {
					    System.exit(0);
					}
					break;
    	}
    }
    
    @FXML
    void resetGame(){
    	currentGame.wrong=0;
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
    	btnY.setVisible(true);
    	btnZ.setVisible(true);
    }

}
