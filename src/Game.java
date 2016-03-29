import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;

public class Game {

	private String answer;
	
	public String phrase;
	
	public Collection<Character> guesses = new ArrayList<Character>();
	
	int wrong;
	
	public void generatePhrase(String lev){
		Random r = new Random();
		try(Scanner read = new Scanner(new File(lev))){
			ArrayList<String> dict = new ArrayList<String>();
			while(read.hasNext()){
				dict.add(read.nextLine());
			}
			for (int i = 0; i<=r.nextInt(dict.size()); i++){
				answer = dict.get(i);
				answer = answer.toLowerCase();
			}
			phrase = "";
			changePhrase();
			
		} catch(FileNotFoundException ex){
			System.out.println("file error.");
		}
				
	}
	
	void guessLetter(char letter){
		guesses.add(letter);
		if (letterExists(letter)){
			changePhrase();
		}
		else {
			wrong++;
		}
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
		Iterator<Character> check = guesses.iterator();
		while(check.hasNext()){
			if (check.next().equals(letter)){
				return true;
			}
		}
		return false;
	}
	
	boolean letterExists(char ch){
		String let = ""+ch;
		if (answer.contains(let)){
			return true;
		}
		else{
			return false;
		}
	}
	
	boolean checkAnswer(){
		if (phrase.equals(answer)){
			return true;
		} else{
			return false;
		}
	}
	
	
}
