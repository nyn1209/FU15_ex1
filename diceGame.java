import java.util.Random;
import java.util.Scanner;

public class diceGame{
    public static void main(String[] args) {
	System.out.println("What is your name?");
	Scanner scanner = new Scanner(System.in);
	String name = scanner.nextLine();
	System.out.println("Hello, " + name + "!");
	roll();
    }

    public static void roll() {
	System.out.println("Rolling dice...");
	Random random = new Random();

	int die1 = random.nextInt(6) + 1;
	int die2 = random.nextInt(6) + 1;

	System.out.println("Die 1: " + die1);
	System.out.println("Die 2: " + die2);

	int totalVal = die1 + die2;
	System.out.println("Total value: " + totalVal);

	if (totalVal > 7){
	    System.out.println(name + " won.");
	} else {
	    System.out.println(name + " lost.");
	}
    }
}
