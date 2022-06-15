package machine;
import java.util.Scanner;

public class CoffeeMachine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int water = 400;
        int milk = 540;
        int coffeeBeans = 120;
        int disCups = 9;
        int money = 550;
        final int ew = 250;
        final int ecb = 16;
        final int ec = 4;
        final int lw = 350;
        final int lm = 75;
        final int lcb = 20;
        final int lc = 7;
        final int cw = 200;
        final int cm = 100;
        final int ccb = 12;
        final int cc = 6;
        int uw;
        int um;
        int udc;
        int ucb;
        String inp;
        String x;
        do {
            System.out.println("Write action (buy, fill, take, remaining, exit):");
            inp = scanner.nextLine();

            if (inp.equals("")){
                inp = scanner.nextLine();
            }
            System.out.println();
            switch (inp) {
                case "remaining":
                    System.out.println("The coffee machine has:");
                    System.out.println(water + " ml of water");
                    System.out.println(milk + " ml of milk");
                    System.out.println(coffeeBeans + " g of coffee beans");
                    System.out.println(disCups + " disposable cups");
                    System.out.println("$" + money + " of money");
                    System.out.println();
                    break;
                case "buy":
                    System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu: ");
                    x = scanner.next();

                    switch (x) {
                        case "1":
                            if (water > ew && coffeeBeans > ecb) {
                                System.out.println("I have enough resources, making you a coffee!");
                                System.out.println();
                                water -= ew;
                                coffeeBeans -= ecb;
                                money += ec;
                                --disCups;
                            } else {
                                System.out.print("Sorry, not enough ");
                                if (water < ew) {
                                    System.out.print("water!");
                                }
                                if (coffeeBeans < ecb) {
                                    System.out.print("coffee beans!");
                                }
                                System.out.println();
                            }
                            break;
                        case "2":
                            if (water > lw && milk > lm && coffeeBeans > lcb) {
                                System.out.println("I have enough resources, making you a coffee!");
                                System.out.println();
                                water -= lw;
                                milk -= lm;
                                coffeeBeans -= lcb;
                                money += lc;
                                --disCups;
                            } else {
                                System.out.print("Sorry, not enough ");
                                if (water < lw) {
                                    System.out.print("water!");
                                }
                                if (milk < lm) {
                                    System.out.print("milk!");
                                }
                                if (coffeeBeans < lcb) {
                                    System.out.print("coffee beans!");
                                }
                                System.out.println();
                            }
                            break;
                        case "3":
                            if (water > cw && milk > cm && coffeeBeans > ccb) {
                                System.out.println("I have enough resources, making you a coffee!");
                                System.out.println();
                                water -= cw;
                                milk -= cm;
                                coffeeBeans -= ccb;
                                money += cc;
                                --disCups;
                            } else {
                                System.out.print("Sorry, not enough ");
                                if (water < cw) {
                                    System.out.print("water!");
                                }
                                if (milk < cm) {
                                    System.out.print("milk!");
                                }
                                if (coffeeBeans < ccb) {
                                    System.out.print("coffee beans!");
                                }
                                System.out.println();
                            }
                            break;
                        case "back" : break;
                    }

                    break;
                case "fill":
                    System.out.println("Write how many ml of water you want to add: ");
                    uw = scanner.nextInt();
                    System.out.println("Write how many ml of milk you want to add: ");
                    um = scanner.nextInt();
                    System.out.println("Write how many grams of coffee beans you want to add: ");
                    ucb = scanner.nextInt();
                    System.out.println("Write how many disposable cups of coffee you want to add: ");
                    udc = scanner.nextInt();
                    System.out.println();

                    water += uw;
                    milk += um;
                    coffeeBeans += ucb;
                    disCups += udc;

                    break;
                case "take": System.out.println("I gave you $" + money);
                    System.out.println();
                    money = 0;
                    break;
                case "exit": break;
            }

        } while (!inp.equals("exit"));

    }
}
