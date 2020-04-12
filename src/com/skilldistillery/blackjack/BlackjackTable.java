package com.skilldistillery.blackjack;

import java.util.Scanner;

public class BlackjackTable {
    Dealer dealer = new Dealer();
    Player player1 = new Player();

    //    ONLY RUNS WHEN PLAYER SELECTS PLAY BLACKJACK
    public void run() {
        System.out.println("Dealer: Welcome to the game!");
        dealer.getDeck().shuffle();
        openingHand();
        player1.displayHand();
        dealer.displayDealerHand();
        play();

    }

    //STARTS GAME AND RUNS AFTER EVERY ROUND
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
        if (player1.getHand().isBlackjack()) {
            player1.displayHand();
            System.out.println("You win");
            clearAllHands();
            menu();
        } else if (dealer.getHand().isBlackjack()) {
            dealer.dealerTurnDisplayDealerHand();
            System.out.println("Dealer wins, better luck next time.");
            clearAllHands();
            menu();
        }
    }

    //LOGIC OF GAME
    public void play() {
        boolean selection = false;
        while (!selection) {

            try {
                Scanner kb = new Scanner(System.in);
                System.out.println("What would you like to do?");
                System.out.println("┍-----------┑");
                System.out.println("| 1) - Hit  |");
                System.out.println("| 2) - Stay |");
                System.out.println("┗-----------┙");
                System.out.print("choice: ");

                switch (kb.next()) {
                    case "1":
                        if (!player1.getHand().isBust()) {
                            if (player1.getHand().getHandValue() < 21) {
                                dealer.deal(player1.getHand());
                                player1.displayHand();
                                dealer.displayDealerHand();
                            } else {
                                System.out.println("You are at 21. Hitting again would put you at bust.");
                                selection = true;
                            }
                        }
                        if (player1.getHand().isBust()) {
                            System.out.println("You bust. Better luck next time");
                            clearAllHands();
                            menu();
                        }
                        break;
                    case "2":
                        selection = true;
                        break;
                    default:
                        System.out.println("Invalid input! Please try again");

                }
            } catch (Exception e) {
                System.out.println("Invalid input! Please try again");
            }
            System.out.println(" ");
        }

//          START OF DEALER TURN
        if (dealer.getHand().getHandValue() >= 17) {
            dealer.dealerTurnDisplayDealerHand();
        }

        while (dealer.getHand().getHandValue() < 17 && !dealer.getHand().isBust()) {
            dealer.dealerTurnDisplayDealerHand();
            System.out.println();
            System.out.println("Dealer will hit.\n");
            dealer.deal(dealer.getHand());
        }
        if (dealer.getHand().isBust()) {
            dealer.dealerTurnDisplayDealerHand();
            System.out.println("Dealer bust, You win!!!");
            clearAllHands();
            menu();
        } else if (player1.getHand().getHandValue() > dealer.getHand().getHandValue()) {
            dealer.dealerTurnDisplayDealerHand();
            System.out.println("You win!!!");
            clearAllHands();
            menu();
        } else if (player1.getHand().getHandValue() == dealer.getHand().getHandValue()) {
            player1.displayHand();
            dealer.dealerTurnDisplayDealerHand();
            System.out.println("This hand is a tie");
            clearAllHands();
            menu();
        } else {
            dealer.dealerTurnDisplayDealerHand();
            System.out.println("Dealer wins, better luck next time.");
            clearAllHands();
            menu();
        }

    }

    public void clearAllHands() {
        player1.getHand().clearHand();
        dealer.getHand().clearHand();
    }


}
