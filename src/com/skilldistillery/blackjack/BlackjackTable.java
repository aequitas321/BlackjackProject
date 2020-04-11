package com.skilldistillery.blackjack;

import java.util.Scanner;

public class BlackjackTable {
    Dealer dealer = new Dealer();
    Player player1 = new Player();

    public void run() {
        System.out.println("Dealer: Welcome to the game!");
        dealer.getDeck().shuffle();
        openingHand();
        displayHand();

    }


    public void menu() {
        Scanner kb = new Scanner(System.in);
        boolean tryAgain = true;
        while (tryAgain)
            try {
                System.out.println("What would you like to do?");
                System.out.println("───────────────────────────");
                System.out.println("\tMenu");
                System.out.println("┍-------------------------------------------┑");
                System.out.println("| 1) - Play Blackjack                       |");
                System.out.println("| 2) - Quit Application                     |");
                System.out.println("┗-------------------------------------------┙");
                System.out.print("choice: ");
                switch (kb.nextInt()) {
                    case 1:
                        run();
                        tryAgain = false;
                        break;
                    case 2:
                        System.exit(0);
                }
            } catch (Exception e) {
                System.out.println("Invalid input! Please try again.");

                tryAgain = true;
            }
        kb.close();
    }

    //DEALS THE DEALER AND PLAYER OPENING HAND AND CHECKS BLACKJACK
    public void openingHand() {
        dealer.deal(player1.getHand());
        dealer.deal(player1.getHand());
        dealer.deal(dealer.getHand());
        dealer.deal(dealer.getHand());
        if(player1.getHand().isBlackjack()){
            System.out.println("You win");
            menu();
        }
    }

    public void displayHand() {
        System.out.println(player1.getHand());
        System.out.println(player1.getHand().getHandValue());
    }

    public void play(){
        Scanner kb = new Scanner(System.in);
        System.out.println("What would you like to do?");
        System.out.println("┍-----------┑");
        System.out.println("| 1) - Hit  |");
        System.out.println("| 2) - Hold |");
        System.out.println("┗-----------┙");
        System.out.print("choice: ");

        try{
            if(kb.nextInt() == 1){
                dealer.deal(player1.getHand());
            }
        }catch (Exception e){
            System.out.println("Invalid input! Please try again");
        }
    }
}
