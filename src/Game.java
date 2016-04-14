/**
 *  __  __                           ____                __            
 * /\ \/\ \                         /\  _`\             /\ \           
 * \ \ \_\ \     __      ___      __\ \ \/\ \  __  __   \_\ \     __   
 *  \ \  _  \  /'__`\  /' _ `\  /'_ `\ \ \ \ \/\ \/\ \  /'_` \  /'__`\ 
 *   \ \ \ \ \/\ \L\.\_/\ \/\ \/\ \L\ \ \ \_\ \ \ \_\ \/\ \L\ \/\  __/ 
 *    \ \_\ \_\ \__/.\_\ \_\ \_\ \____ \ \____/\ \____/\ \___,_\ \____\
 *     \/_/\/_/\/__/\/_/\/_/\/_/\/___L\ \/___/  \/___/  \/__,_ /\/____/
 *                                /\____/                              
 *                                \_/__/                               
 * 			Above text generated from http://patorjk.com/software/taag/
 * 
 * Game Class for HangDude game
 * 
 * @author Jacob Marra
 * @author Kristin Johnson
 * @author Sarah Nolan
 *
 */

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Random;

public class Game {
	
	//String for storing game answer
	private String answer;
	
	//String for storing current phrase displayed on screen
	private String phrase;
	
	//Collection of guesses using ArrayList
	private Collection<Character> guesses = new ArrayList<Character>();
	
	//Number of wrong guesses
	private int wrong;
	
	//Default constructor
	public Game(){
		wrong=0;
	}
	
	//Generates new phrase for game based on passed in level dictionary
	public void generatePhrase(String lev){
		Random r = new Random();
		try{
			//The following lines were changed from using a Scanner
			//to allow reading dictionaries from a .jar file
			InputStream in = getClass().getResourceAsStream(lev); 
			BufferedReader reader = new BufferedReader(new InputStreamReader(in));
			
			//Add all phrases in dictionary to an ArrayList
			ArrayList<String> dict = new ArrayList<String>();
			while(reader.readLine()!=null){
				dict.add(reader.readLine());
			}

			//Set answer to a random phrase in the ArrayList
			for (int i = 0; i<=r.nextInt(dict.size()); i++){
				answer = dict.get(i);
				answer = answer.toLowerCase();
			}
			
			//Call changePhrase() to create phrase to be displayed
			phrase = "";
			changePhrase();
		
		} catch (Exception ex) {
			System.out.println("Selected dictionary not found!");
		}
				
	}
	
	//Executed when a letter is pressed or entered
	public void guessLetter(char letter){
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
	public void changePhrase(){
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
	public boolean checkLetter(char letter){
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
	public boolean letterExists(char ch){
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
	public boolean checkAnswer(){
		if (phrase.equals(answer)){
			return true;
		} else{
			return false;
		}
	}
	
	//Clears the guesses Collection
	public void clearGuesses(){
		guesses.clear();
		guesses.add(' ');
	}
	
	//Resets wrong guesses to 0
	public void resetWrong(){
		wrong=0;
	}

	//Returns number of wrong guesses
	public int getWrong(){
		return wrong;
	}
	
	//Returns current phrase based on guesses
	public String getPhrase(){
		changePhrase();
		return phrase;
	}
	
	//Getter method for the answer
	public String getAnswer(){
		return answer;
	}
	
	
}
