package game;

import java.util.Scanner;

public class DiceThrowing {

    Scanner in = new Scanner(System.in);

    public void cubes() {
        System.out.print("Enter your name > "); String name = in.next();

        System.out.print("\nDice throwing game: you take turns to roll the dice with PC. " +
                "Who has more points after three throws wins.\nIf you want to play - tap 1 > ");
        String process = in.next();
        while (process.equals("1")) {

            int res_player = 0, res_pc = 0;

            int queue = random();
            if (queue == 1) {
                System.out.println("\nYou roll first!");

                for (int i = 0; i < 3; i++) {
                    if (i != 0) {
                        System.out.print("\nTap any key to start next lep > ");
                        String useless = in.next();
                    }

                    System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                    System.out.print("To roll dice tap any key > ");
                    String useless = in.next();
                    res_player += throw_cubes();

                    System.out.println("\nPC's turn:");
                    res_pc += throw_cubes();

                    if (i != 2) {
                        System.out.println("\nCurrent score:\n" +
                                name + ": " + res_player + "\tPC: " + res_pc);
                    }
                    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                }
            }
            if (queue == 2) {
                System.out.println("\nPC roll first!");

                for (int i = 0; i < 3; i++) {
                    if(i != 0) {
                        System.out.print("\nTap any key to start next lep > ");
                        String useless = in.next();
                    }

                    System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                    System.out.println("Ход компьютера:");
                    res_pc += throw_cubes();

                    System.out.print("\nTo roll dice tap any key > ");
                    String useless = in.next();
                    res_player += throw_cubes();

                    if (i != 2) {
                        System.out.println("\nCurrent score:\n" +
                                name + ": " + res_player + "\tPC: " + res_pc);
                    }
                    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                }
            }
            System.out.println("\nFinal score:\n" +
                    name + ": " + res_player + "\tPC: " + res_pc);

            if (res_player > res_pc) System.out.println("\nCongratulations! You win");
            else if (res_player < res_pc) System.out.println("\nYou lost! You will be lucky next time!");
            else System.out.println("\nDraw!");

            System.out.print("\nIf you want to play one more time tap 1 > ");
            process = in.next();

        }
        System.out.println("\nGoodbye!");

    }

    public int random() {
        int min = 1, max = 2;
        return (min + (int) (Math.random() * max));
    }

    public int throw_cubes() {
        int max = 6, min = 1, res;
        res = min + (int) (Math.random() * max);
        switch (res) {
            case 1:
                System.out.println("\n		@@@@@@@@@@\n" +
                        "		@@@@@@@@@@\n" +
                        "		@@@@  @@@@\n" +
                        "		@@@@@@@@@@\n" +
                        "		@@@@@@@@@@");
                res = 1;
                break;
            case 2:
                System.out.println("\n		@@@@@@@@@@\n" +
                        "		@  @@@@@@@\n" +
                        "		@@@@@@@@@@\n" +
                        "		@@@@@@@  @\n" +
                        "		@@@@@@@@@@");
                res = 2;
                break;
            case 3:
                System.out.println("\n		@@@@@@@@@@\n" +
                        "		@  @@@@@@@\n" +
                        "		@@@@  @@@@\n" +
                        "		@@@@@@@  @\n" +
                        "		@@@@@@@@@@");
                res = 3;
                break;
            case 4:
                System.out.println("\n		@@@@@@@@@@\n" +
                        "		@  @@@@  @\n" +
                        "		@@@@@@@@@@\n" +
                        "		@  @@@@  @\n" +
                        "		@@@@@@@@@@");
                res = 4;
                break;
            case 5:
                System.out.println("\n		@@@@@@@@@@\n" +
                        "		@  @@@@  @\n" +
                        "		@@@@  @@@@\n" +
                        "		@  @@@@  @\n" +
                        "		@@@@@@@@@@");
                res = 5;
                break;
            case 6:
                System.out.println("\n		@@@@@@@@@@\n" +
                        "		@  @  @  @\n" +
                        "		@@@@@@@@@@\n" +
                        "		@  @  @  @\n" +
                        "		@@@@@@@@@@");
                res = 6;
                break;
        }
        return res;
    }
}