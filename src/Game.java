import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Game {
	
	public String answer;
	
	public String phrase;
	
	public ArrayList<Character> guesses = new ArrayList<Character>();
	
	public Game(){
		
	}
	
	public void generatePhrase(String lev){
		Random r = new Random();
		try(Scanner read = new Scanner(new File(lev))){
			ArrayList<String> dict = new ArrayList<String>();
			while(read.hasNext()){
				dict.add(read.nextLine());
			}
			for (int i = 0; i<r.nextInt(dict.size()-1); i++){
				answer = dict.get(i);
			}
			phrase = "";
			changePhrase();
			
		} catch(FileNotFoundException ex){
			System.out.println("file error.");
		}
				
	}
	
	void guessLetter(char letter){
		guesses.add(letter);
		changePhrase();
	}
	
	void changePhrase(){
		phrase = "";
		for (int i=0; i<answer.length(); i++){
			char current = answer.charAt(i);
			if (checkLetter(current)){
				phrase += current;
			}
			else {
				phrase += '-';
			}
		}
	}
	
	boolean checkLetter(char letter){
		for(int i=0; i<guesses.size(); i++){
			if (guesses.get(i)==(letter)){
				return true;
			}
		}
		return false;
	}
	
	boolean checkAnswer(){
		if (phrase.equals(answer)){
			return true;
		} else{
			return false;
		}
	}
	
	
}
