import java.util.Scanner;

public class diceGame {
	static int Dices, Throws;
	private static Scanner k;
	public static void main(String[] args) {
		
		System.out.println("Welcome to Dice Game");
		System.out.println("How many dices would you like to roll?");
		
		k = new Scanner(System.in); 
		Dices = k.nextInt();
		
		System.out.println("How many times?");
		Throws = k.nextInt();
		
		Dice.Throw(Dices, Throws);
		System.out.println("your average was " + Dice.average);


	}

}
// Good try
