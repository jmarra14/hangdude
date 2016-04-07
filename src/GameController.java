import java.util.Optional;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.text.Text;

public class GameController{
	
	//Create a new Game object called currentGame
	private Game currentGame = new Game();
	
	@FXML
	private Text prompt;
	
	@FXML
	private Text textArea;
	
	@FXML
	private Text WrongGuesses;
    
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
      
    //This method is run when the Start New Game button is clicked
    @FXML
    void startGame(ActionEvent event) {
    	
    	//Runs resetGame method
    	resetGame();
    	
    	//Runs generatePhrase method of currentGame based on 
    	//the difficulty selected
    	if(rdoHard.isSelected()){
    		currentGame.generatePhrase("Dictionaries/HardDict.txt");
    	}else if (rdoMedium.isSelected()){
    		currentGame.generatePhrase("Dictionaries/MedDict.txt");
    	}else{
    		currentGame.generatePhrase("Dictionaries/EasyDict.txt");
    	}
    	
    	//Display the blanks for the new phrase in the window
    	textArea.setText(new String(currentGame.getPhrase()));
    }

    //This method ends the program with the Quit button is clicked
    @FXML
    void quit(ActionEvent event) {
    	System.exit(0);
    }
    
    //This method is run when a letter button is pressed
    @FXML
    void letterGuess(ActionEvent event){
    	//If a phrase has not been generated, do not run this method
    	if(currentGame.getAnswer()==null){
    		return;
    	}
    	
    	//Declare character for this guess
    	char letter;
    	
    	//Determine which letter was pressed
    	//Set the character variable to the pressed letter
    	//And hide the respective letter button from the screen
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
    	} else{
    		return;
    	}
    
    	//If the guessed letter has already been guessed,
    	//End the method.
		if(currentGame.checkLetter(letter)){
			return;
		}
		
		//Or else,
		else{
			//Pass the letter to the currentGame's guessLetter method
			currentGame.guessLetter(letter);
			
			//Change the displayed phrase to reflect the guesses
			textArea.setText(currentGame.getPhrase().toUpperCase());
			
			//Check for a win
			checkWin(event);
			
			//Check for a lose
			checkLose(event);
		}
		
    }
    

    //This method is run when a key is pressed from the keyboard
    @FXML
    void pressKey(KeyEvent event){
    	//If a phrase is not yet generated, end method
    	if(currentGame.getAnswer()==null){
    		return;
    	}
    	
    	//Declare character variable
    	char letter;
    	
    	//Determine which key was pressed
    	//Set the letter variable to the key value
    	//Hide the respective letters' button on the screen
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
    	
    	//If the guessed letter has already been guessed,
    	//End the method.
		if(currentGame.checkLetter(letter)){
			return;
		}
		
		//Or else,
		else{
			//Pass the letter to the currentGame's guessLetter method
			currentGame.guessLetter(letter);
			
			//Change the displayed phrase to reflect the guesses
			textArea.setText(currentGame.getPhrase().toUpperCase());
			
			//Check for a win
			checkWin(new ActionEvent());
			
			//Check for a lose
			checkLose(new ActionEvent());
		}
    }
    
    
    //This method checks to see if the user has won on the last guess
    void checkWin(ActionEvent event){
    	//If the game is a winner, display winning prompt
    	if (currentGame.checkAnswer()){
			Alert alert = new Alert(AlertType.CONFIRMATION);
			alert.setTitle("You won!");
			alert.setHeaderText("GREAT JOB! YOU WON!");
			alert.setContentText(String.format("The answer was: %s%n%nWould you like to play again?%n",currentGame.getAnswer().toUpperCase()));

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
    
    //This method checks to see if the user has lost, or has a new incorrect guess
    void checkLose(ActionEvent event){
    	//Change wrong guesses prompt
    	WrongGuesses.setText((5-currentGame.getWrong())+"  wrong guesses remaining!");
    	
    	switch(currentGame.getWrong()){
    		//Display parts of body based on number of wrong guesses
    		case 0: break;
    		case 1: head.setVisible(true);
    				break;
    		case 2:	body.setVisible(true);
    				break;
    		case 3: leftArm.setVisible(true);
    				break;
    		case 4: rightArm.setVisible(true);
    				break;
    		case 5: leftLeg.setVisible(true);
    				break;
    		case 6: rightLeg.setVisible(true);
    				eyes.setVisible(true);
    				mouth.setVisible(true);
    		
    				//Display losing prompt
		    		Alert alert = new Alert(AlertType.CONFIRMATION);
					alert.setTitle("You LOSE!");
					alert.setHeaderText("Sorry, YOU LOST!");
					alert.setContentText(String.format("The answer was: %s%n%nWould you like to play again?%n",currentGame.getAnswer().toUpperCase()));
		
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
					
    		default : break;
    	}
    }
    
    //This method resets the game (when the "Play New Game" button is clicked)
    @FXML
    void resetGame(){
    	//Set wrong guesses to 0
    	currentGame.resetWrong();
    	
    	//Set wrong guesses prompt to 5
    	WrongGuesses.setText("5  Wrong Guesses Remaining!");
    	
    	//Clear guesses and add space
    	currentGame.clearGuesses();
    	
    	//Set body parts to non-visible
    	prompt.setVisible(false);
    	head.setVisible(false);
    	eyes.setVisible(false);
    	mouth.setVisible(false);
    	body.setVisible(false);
    	leftArm.setVisible(false);
    	rightArm.setVisible(false);
    	leftLeg.setVisible(false);
    	rightLeg.setVisible(false);
    	
    	//Set all buttons to visible
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
