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
			int ttl = 0;
			ArrayList<String> dict = new ArrayList<String>();
			while(read.hasNext()){
				ttl++;
				dict.add(read.nextLine());
			}
			for (int i = 0; i<r.nextInt(ttl); i++){
				answer = dict.get(i);
			}
		} catch(FileNotFoundException ex){
			System.out.println("file error.");
		}
				
	}
	
	void guessLetter(char letter){
		guesses.add(letter);
	}
	
	
}
