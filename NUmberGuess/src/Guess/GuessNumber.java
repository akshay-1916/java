package Guess;
import java.util.*;
public class GuessNumber {
	public static void main(String arg[]) {
		int targetNumber=(int)(Math.random()*50)+1;
		Scanner sc=new Scanner(System.in);
		int UserGuess=0;
		
		while(targetNumber!=UserGuess) {
			System.out.println("Guess the Number:");
		UserGuess=sc.nextInt();
			if(UserGuess>targetNumber) {
				System.out.println("Too High");
			}
			else if(UserGuess<targetNumber) {
				System.out.println("Too Low");
			}
			else {
				System.out.println("Congratulation,You won!!! You Guess Correct Number:"+targetNumber);
			}
		}
	}

}
