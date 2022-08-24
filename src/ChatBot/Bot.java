package ChatBot;

import java.util.Scanner;

public class Bot {
    private String botName;
    private int botBitrthday;
    private Scanner scanner = new Scanner(System.in);

    public Bot(String botName, int botBitrthday) {
        this.botName = botName;
        this.botBitrthday = botBitrthday;
    }

    public void greeting() {
        System.out.println("Hello! My name is " + botName + ".");
        System.out.println("I was created in " + botBitrthday + ".");
    }

    public void remindName() {
        System.out.println("Please, remind me your name.");
        String name = scanner.nextLine();
        System.out.println("What a great name you have, " + name + "!");
    }

    public void guessAge() {
        System.out.println("Let me guess your age.");
        System.out.println("Enter remainders of dividing your age by 3, 5 and 7.");
        int reminder3 = scanner.nextInt();
        int reminder5 = scanner.nextInt();
        int reminder7 = scanner.nextInt();
        int userAge = (reminder3 * 70 + reminder5 * 21 + reminder7 * 15) % 105;
        System.out.println("Your age is " + userAge + "; that's a good time to start programming!");
    }

    public void count() {
        System.out.println("Now I will prove to you that I can count to any number you want.");
        int number = scanner.nextInt();
        for (int i = 0; i <= number; i++)
            System.out.printf("%d!\n", i);
    }

    public void test() {
        System.out.println("Let's test your programming knowledge.");
        System.out.println("Why do we use methods?");
        System.out.println("1. To repeat a statement multiple times.");
        System.out.println("2. To decompose a program into several small subroutines.");
        System.out.println("3. To determine the execution time of a program.");
        System.out.println("4. To interrupt the execution of a program.");
        while (true) {
            int answer = scanner.nextInt();
            if (answer == 4) {
                System.out.println("Congratulations, have a nice day!");
                break;
            }
            System.out.println("Please, try again.");
        }

    }

    public void end() {
        System.out.println("Congratulations, have a nice day!");
    }
}
