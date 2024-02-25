package org.example.view;

import org.example.model.*;

import java.util.Scanner;

public class View {
    public static void displayWelcomeMessage() {
        System.out.println("<---Welcome to the Bulls and Cows Game!--->");
        System.out.println("Available game modes:\n1. Numbers\n2. Russian Alphabet\n3. English Alphabet");
    }

    public static int promptGameMode(Scanner scanner) {
        System.out.print("Enter a number: ");
        return scanner.nextInt();
    }

    public static void displayInvalidInputMessage() {
        System.out.println("Invalid input! Please try again.");
    }

    public static int promptSizeWordChoice(Scanner scanner) {
        System.out.println("Great! Now choose the size of the secret word!");
        System.out.print("Enter a value: ");
        return scanner.nextInt();
    }

    public static int promptCountLifeChoice(Scanner scanner) {
        System.out.print("Now specify your number of attempts: ");
        return scanner.nextInt();
    }

    public static String promptUserInput(Scanner scanner) {
        System.out.print("Enter a value: ");
        return scanner.next().toLowerCase();
    }

    public static void displayAnswer(Answer answer) {
        System.out.println(answer);
    }

    public static void displayWinMessage() {
        System.out.println("You won! Hooray!");
    }

    public static void displayLoseMessage(String word) {
        System.out.println("You lost!");
        System.out.println("The secret word was: " + word);
    }

    public static boolean promptShowHistory(Scanner scanner) {
        System.out.print("Do you want to see your game history? (yes/no) ");
        String choice = scanner.next();
        return choice.equalsIgnoreCase("yes");
    }

    public static void displayHistory(History history) {
        System.out.println("Game history:");
        for (String action : history.getActions()) {
            System.out.println(action);
        }
    }

    public static boolean promptPlayAgain(Scanner scanner) {
        System.out.print("Play again? (yes/no) ");
        String choice = scanner.next();
        return choice.equalsIgnoreCase("yes");
    }
}
