import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;

public class Game {
	
	//String for storing game answer
	private String answer;
	
	//String for storing current phrase displayed on screen
	String phrase;
	
	//Collection of guesses using ArrayList
	Collection<Character> guesses = new ArrayList<Character>();
	
	//Number of wrong guesses
	int wrong;
	
	//Generates new phrase for game based on passed in level dictionary
	public void generatePhrase(String lev){
		Random r = new Random();
		try(Scanner read = new Scanner(new File(lev))){
			//Add all phrases in dictionary to an ArrayList
			ArrayList<String> dict = new ArrayList<String>();
			while(read.hasNext()){
				dict.add(read.nextLine());
			}
			//Set answer to a random phrase in the ArrayList
			for (int i = 0; i<=r.nextInt(dict.size()); i++){
				answer = dict.get(i);
				answer = answer.toLowerCase();
			}
			
			//Call changePhrase() to create phrase to be displayed
			phrase = "";
			changePhrase();
			
		} catch(FileNotFoundException ex){
			//Display error if dictionary file can't be found
			System.out.println("file error.");
		}
				
	}
	
	//Executed when a letter is pressed or entered
	void guessLetter(char letter){
		//add letter to guesses collection
		guesses.add(letter);
		//if letter is in the answer, change the phrase
		if (letterExists(letter)){
			changePhrase();
		}
		//if letter is not in the answer, add 1 to wrong
		else {
			wrong++;
		}
	}
	
	//Changes on-screen phrase
	void changePhrase(){
		//resets phrase to no characters
		phrase = "";
		//loop through the characters in the answer
		//If the character has been guessed, add it to the phrase
		//If not, add a dash to the phrase
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
	
	//Checks if the letter has already been guessed
	boolean checkLetter(char letter){
		//Create iterator from guesses collection
		Iterator<Character> check = guesses.iterator();
		
		//Loop through iterator, if the passed in letter exists, return true
		while(check.hasNext()){
			if (check.next().equals(letter)){
				return true;
			}
		}
		return false;
	}
	
	//Checks if the letter is in the answer
	boolean letterExists(char ch){
		//Create string of the letter
		String let = ""+ch;
		//If the answer contains the letter string, return true
		if (answer.contains(let)){
			return true;
		}
		else{
			return false;
		}
	}
	
	//Checks to see if the current phrase is the answer.
	//In other words, return true if the answer has been solved
	boolean checkAnswer(){
		if (phrase.equals(answer)){
			return true;
		} else{
			return false;
		}
	}
	
	//Getter method for the answer
	public String getAnswer(){
		return answer;
	}
	
	
}
