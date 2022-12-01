package Game;

import Vessels.Vessel;

import java.util.ArrayList;
import java.util.Scanner;

public class Match {
    private static int victoriesP1;
    private static int victoriesP2;
    private static String playerOneName;
    private static String playerTwoName;

    public static void start(){
        Scanner sc = new Scanner(System.in);

        //Print player one Name Question
        {
            System.out.println("""
                     ____  _     ____ ___  _ _____ ____    ____  _      _____   _      ____  _      _____     \s
                    /  __\\/ \\   /  _ \\\\  \\///  __//  __\\  /  _ \\/ \\  /|/  __/  / \\  /|/  _ \\/ \\__/|/  __/  __ \s
                    |  \\/|| |   | / \\| \\  / |  \\  |  \\/|  | / \\|| |\\ |||  \\    | |\\ ||| / \\|| |\\/|||  \\    \\/ \s
                    |  __/| |_/\\| |-|| / /  |  /_ |    /  | \\_/|| | \\|||  /_   | | \\||| |-||| |  |||  /_   __ \s
                    \\_/   \\____/\\_/ \\|/_/   \\____\\\\_/\\_\\  \\____/\\_/  \\|\\____\\  \\_/  \\|\\_/ \\|\\_/  \\|\\____\\  \\/ \s
                                                                                                              \s""");
        }
        playerOneName = sc.next();
        sc.nextLine();
        clearScreen();
        //Print player two Name Question
        {
            System.out.println("""
                     ____  _     ____ ___  _ _____ ____    _____  _      ____    _      ____  _      _____     \s
                    /  __\\/ \\   /  _ \\\\  \\///  __//  __\\  /__ __\\/ \\  /|/  _ \\  / \\  /|/  _ \\/ \\__/|/  __/  __ \s
                    |  \\/|| |   | / \\| \\  / |  \\  |  \\/|    / \\  | |  ||| / \\|  | |\\ ||| / \\|| |\\/|||  \\    \\/ \s
                    |  __/| |_/\\| |-|| / /  |  /_ |    /    | |  | |/\\||| \\_/|  | | \\||| |-||| |  |||  /_   __ \s
                    \\_/   \\____/\\_/ \\|/_/   \\____\\\\_/\\_\\    \\_/  \\_/  \\|\\____/  \\_/  \\|\\_/ \\|\\_/  \\|\\____\\  \\/ \s
                                                                                                               \s""");
        }
        playerTwoName = sc.next();
        sc.nextLine();
        clearScreen();

        do{
            //Print Player's Score
            {
                System.out.println(" ____  _     ____ ___  _ _____ ____    ____  _      _____       \n" +
                        "/  __\\/ \\   /  _ \\\\  \\///  __//  __\\  /  _ \\/ \\  /|/  __/  __   \n" +
                        "|  \\/|| |   | / \\| \\  / |  \\  |  \\/|  | / \\|| |\\ |||  \\    \\/   \n" +
                        "|  __/| |_/\\| |-|| / /  |  /_ |    /  | \\_/|| | \\|||  /_   __   " + victoriesP1 + "\n" +
                        "\\_/   \\____/\\_/ \\|/_/   \\____\\\\_/\\_\\  \\____/\\_/  \\|\\____\\  \\/   \n" +
                        "                                                                \n" +
                        " ____  _     ____ ___  _ _____ ____    _____  _      ____       \n" +
                        "/  __\\/ \\   /  _ \\\\  \\///  __//  __\\  /__ __\\/ \\  /|/  _ \\  __  \n" +
                        "|  \\/|| |   | / \\| \\  / |  \\  |  \\/|    / \\  | |  ||| / \\|  \\/  \n" +
                        "|  __/| |_/\\| |-|| / /  |  /_ |    /    | |  | |/\\||| \\_/|  __  " + victoriesP1 + "\n" +
                        "\\_/   \\____/\\_/ \\|/_/   \\____\\\\_/\\_\\    \\_/  \\_/  \\|\\____/  \\/  \n" +
                        "                                                                ");
            }
            sc.nextLine();
            clearScreen();

            Player[] players = new Player[]{new Player("\033[44m", playerOneName), new Player("\033[41m", playerTwoName)};
            players[0].setVictories(victoriesP1);
            players[1].setVictories(victoriesP2);
            System.out.println();

            //Print who's the player setting vessel's
            {
                System.out.println("""
                         ____  _     ____ ___  _ _____ ____    ____  _____ _____  _____  _  _      _____            \s
                        /  __\\/ \\   /  _ \\\\  \\///  __//  __\\  / ___\\/  __//__ __\\/__ __\\/ \\/ \\  /|/  __/            \s
                        |  \\/|| |   | / \\| \\  / |  \\  |  \\/|  |    \\|  \\    / \\    / \\  | || |\\ ||| |  _            \s
                        |  __/| |_/\\| |-|| / /  |  /_ |    /  \\___ ||  /_   | |    | |  | || | \\||| |_//            \s
                        \\_/   \\____/\\_/ \\|/_/   \\____\\\\_/\\_\\  \\____/\\____\\  \\_/    \\_/  \\_/\\_/  \\|\\____\\            \s
                                                                                                                    \s
                         _     _____ ____  ____  _____ _     ____    ____  _        ____  ____  ____  ____  ____    \s
                        / \\ |\\/  __// ___\\/ ___\\/  __// \\   / ___\\  /  _ \\/ \\  /|  /  __\\/  _ \\/  _ \\/  __\\/  _ \\  __
                        | | //|  \\  |    \\|    \\|  \\  | |   |    \\  | / \\|| |\\ ||  | | //| / \\|| / \\||  \\/|| | \\|  \\/
                        | \\// |  /_ \\___ |\\___ ||  /_ | |_/\\\\___ |  | \\_/|| | \\||  | |_\\\\| \\_/|| |-|||    /| |_/|  __
                        \\__/  \\____\\\\____/\\____/\\____\\\\____/\\____/  \\____/\\_/  \\|  \\____/\\____/\\_/ \\|\\_/\\_\\\\____/  \\/
                                                                                                                    \s""");
            }
            System.out.println(players[0].getName()+"\n");
            sc.nextLine();
            setAllVessels(sc, players[0]);
            sc.nextLine();
            clearScreen();

            //Print who's the player setting vessel's
            {
                System.out.println("""
                         ____  _     ____ ___  _ _____ ____    ____  _____ _____  _____  _  _      _____            \s
                        /  __\\/ \\   /  _ \\\\  \\///  __//  __\\  / ___\\/  __//__ __\\/__ __\\/ \\/ \\  /|/  __/            \s
                        |  \\/|| |   | / \\| \\  / |  \\  |  \\/|  |    \\|  \\    / \\    / \\  | || |\\ ||| |  _            \s
                        |  __/| |_/\\| |-|| / /  |  /_ |    /  \\___ ||  /_   | |    | |  | || | \\||| |_//            \s
                        \\_/   \\____/\\_/ \\|/_/   \\____\\\\_/\\_\\  \\____/\\____\\  \\_/    \\_/  \\_/\\_/  \\|\\____\\            \s
                                                                                                                    \s
                         _     _____ ____  ____  _____ _     ____    ____  _        ____  ____  ____  ____  ____    \s
                        / \\ |\\/  __// ___\\/ ___\\/  __// \\   / ___\\  /  _ \\/ \\  /|  /  __\\/  _ \\/  _ \\/  __\\/  _ \\  __
                        | | //|  \\  |    \\|    \\|  \\  | |   |    \\  | / \\|| |\\ ||  | | //| / \\|| / \\||  \\/|| | \\|  \\/
                        | \\// |  /_ \\___ |\\___ ||  /_ | |_/\\\\___ |  | \\_/|| | \\||  | |_\\\\| \\_/|| |-|||    /| |_/|  __
                        \\__/  \\____\\\\____/\\____/\\____\\\\____/\\____/  \\____/\\_/  \\|  \\____/\\____/\\_/ \\|\\_/\\_\\\\____/  \\/
                                                                                                                    \s""");
            }
            System.out.println(players[1].getName()+"\n");
            sc.nextLine();
            setAllVessels(sc, players[1]);

            match(sc, players);
        }while (quit(sc));
    }

    //Print a lot of blank spaces
    private static void clearScreen(){
        for(int i = 0; i < 100; i++){
            System.out.println();
        }
    }

    //Player plays
    private static void playerPlay(Scanner scanner, Player playerPlaying, Player enemy){
        int previousNumberOfPieces;
        do {
            previousNumberOfPieces = enemy.getNumberOfPieces();
            playerPlaying.attackEnemy(scanner, enemy);
            System.out.println("Player playing is: "+playerPlaying.getName());
            Board.printAllBoards(playerPlaying.getOwnBoard(), playerPlaying.getTacticalBoard());
            if(enemy.getNumberOfPieces() == 0){
                return;
            }
        } while (previousNumberOfPieces != enemy.getNumberOfPieces());
    }

    //Attack
    private static void match(Scanner scanner, Player[] players){
        int playerPlay = (int) Math.round(Math.random());

        while (true) {
            if (playerPlay == 0) {
                System.out.println("Player playing is: "+players[0].getName());
                Board.printAllBoards(players[0].getOwnBoard(), players[0].getTacticalBoard());
                playerPlay(scanner, players[0], players[1]);
                playerPlay = 1;
            }
            if(players[1].getNumberOfPieces() == 0){
                whoWin(players[0]);
                victoriesP1++;
                return;
            }

            System.out.println("Player playing is: "+players[1].getName());
            Board.printAllBoards(players[1].getOwnBoard(), players[1].getTacticalBoard());
            playerPlay(scanner, players[1], players[0]);
            playerPlay = 0;
            if (players[0].getNumberOfPieces() == 0){
                whoWin(players[1]);
                victoriesP2++;
                return;
            }


        }
    }

    //Who win
    private static void whoWin(Player player){
        System.out.println("         _      _  _      _      _____ ____           \n" +
                "        / \\  /|/ \\/ \\  /|/ \\  /|/  __//  __\\          \n" +
                "        | |  ||| || |\\ ||| |\\ |||  \\  |  \\/|          \n" +
                "        | |/\\||| || | \\||| | \\|||  /_ |    /          \n" +
                "        \\_/  \\|\\_/\\_/  \\|\\_/  \\|\\____\\\\_/\\_\\          \n" +
                "                                                      \n" +
                "                       _  ____                        \n" +
                "                      / \\/ ___\\                       \n" +
                "                      | ||    \\                       \n" +
                "                      | |\\___ |                       \n" +
                "                      \\_/\\____/                       \n" +
                "                  "+player.getName()+"                         \n");
    }

    //Set all Vessels
    private static void setAllVessels(Scanner scanner, Player player){
        String input;
        int index = 0;

        while (true) {
            System.out.println();
            for (int i = index; i < player.getVessels().size(); i++) {
                System.out.println("[ " + (i + 1) + " ] === " + player.getVessels().get(i).getName());
            }
            System.out.println();

            player.setVessel(scanner, player.getVessels().get(index));
            if (index == (player.getVessels().size() - 1)){
                Board.printAllBoards(player.getOwnBoard(), player.getTacticalBoard());
                scanner.nextLine();
                return;
            }
            index++;
        }
    }

    private static boolean quit(Scanner scanner){
        String input;
        do {
            System.out.println();
            System.out.println("Do you wanna play again?");
            System.out.println();
            System.out.println(" 1 - YES");
            System.out.println(" 0 - NO");
            System.out.println();
            input = scanner.next();
        }while (!input.equals("1") && !input.equals("0"));

        return input.equals("1");
    }
}
