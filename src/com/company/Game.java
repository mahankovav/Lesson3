package com.company;

import java.util.Random;
import java.util.Scanner;

public class Game {
    public void play() {
        final Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        while (true) {

            System.out.print("Выберете камень: 1, ножницы: 2 или бумагу: 3. (Выход: 0)");

            int choice = scanner.nextInt();

            if (choice == 0) {
                System.out.println("На выход...");
                break;
            }

            System.out.println("Вы выбрали " + choice);

            int computerChoice = random.nextInt(3) + 1;
            System.out.println("Компьютер выбрал " + computerChoice);

            if (choice == computerChoice) {
                System.out.println("Ничья");
            } else if(choice == 1){
                if(computerChoice == 2){
                    System.out.println("You win");
                } else {
                    System.out.println("You los");
                }
            } else if(choice == 2){
                if(computerChoice == 1){
                    System.out.println("You lose");
                } else {
                    System.out.println("You win");
                }
            } else if(choice == 3){
                if(computerChoice == 1){
                    System.out.println("You win");
                } else {
                    System.out.println("You lose");
                }
            }

        }
    }
}
