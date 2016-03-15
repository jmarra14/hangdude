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
	
	public Game currentGame = new Game();
	
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
    	System.out.println("Phrase is: " + currentGame.phrase);
    	
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
    	} else if (event.getSource()==btnB){
    		letter='b';
    	} else if (event.getSource()==btnC){
    		letter='c';
    	} else if (event.getSource()==btnD){
    		letter='d';
    	} else if (event.getSource()==btnE){
    		letter='e';
    	} else if (event.getSource()==btnF){
    		letter='f';
    	} else if (event.getSource()==btnG){
        		letter='g';
    	} else if (event.getSource()==btnH){
    		letter='h';
    	} else if (event.getSource()==btnI){
    		letter='i';
    	} else if (event.getSource()==btnJ){
    		letter='j';
    	} else if (event.getSource()==btnK){
    		letter='k';
    	} else if (event.getSource()==btnL){
    		letter='l';
    	} else if (event.getSource()==btnM){
    		letter='m';
    	} else if (event.getSource()==btnN){
    		letter='n';
    	} else if (event.getSource()==btnO){
    		letter='o';
    	} else if (event.getSource()==btnP){
    		letter='p';
    	} else if (event.getSource()==btnQ){
    		letter='q';
    	} else if (event.getSource()==btnR){
    		letter='r';
    	} else if (event.getSource()==btnS){
    		letter='s';
    	} else if (event.getSource()==btnT){
    		letter='t';
    	} else if (event.getSource()==btnU){
        	letter='u';
    	} else if (event.getSource()==btnV){
    		letter='v';
    	} else if (event.getSource()==btnW){
    		letter='w';
    	} else if (event.getSource()==btnX){
    		letter='x';
    	} else if (event.getSource()==btnY){
    		letter='y';
    	} else if (event.getSource()==btnZ){
    		letter='z';
    	}
		currentGame.guessLetter(letter);
  
    }
    
    void resetGame(){
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
