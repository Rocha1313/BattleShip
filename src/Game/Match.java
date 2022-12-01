package Game;

import java.util.Scanner;

public class Match {
    private static int victoriesP1;
    private static int victoriesP2;

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
        String playerOneName = sc.next();
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
        String playerTwoName = sc.next();
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
                        "|  __/| |_/\\| |-|| / /  |  /_ |    /    | |  | |/\\||| \\_/|  __  " + victoriesP2 + "\n" +
                        "\\_/   \\____/\\_/ \\|/_/   \\____\\\\_/\\_\\    \\_/  \\_/  \\|\\____/  \\/  \n" +
                        "                                                                ");
            }
            sc.nextLine();
            sc.nextLine();
            clearScreen();

            Player[] players = new Player[]{new Player("\u001B[42m\u001B[30m", playerOneName), new Player("\u001B[43m\u001B[30m", playerTwoName)};
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
            sc.nextLine();
            clearScreen();

            match(sc, players);
        }while (quit(sc));
    }

    //Print a lot of blank spaces
    private static void clearScreen(){
        for(int i = 0; i < 35; i++){
            System.out.println();
        }
    }

    //Player plays
    private static void playerPlay(Scanner scanner, Player playerPlaying, Player enemy){
        int previousNumberOfPieces;
        do {
            previousNumberOfPieces = enemy.getNumberOfPieces();
            playerPlaying.attackEnemy(scanner, enemy);
            //Print the player is playing
            {
                System.out.println(" ____  _     ____ ___  _ _____ ____    ____  _     ____ ___  _ _  _      _____      \n" +
                        "/  __\\/ \\   /  _ \\\\  \\///  __//  __\\  /  __\\/ \\   /  _ \\\\  \\/// \\/ \\  /|/  __/  __  \n" +
                        "|  \\/|| |   | / \\| \\  / |  \\  |  \\/|  |  \\/|| |   | / \\| \\  / | || |\\ ||| |  _  \\/    " + playerPlaying.getName()+"\n" +
                        "|  __/| |_/\\| |-|| / /  |  /_ |    /  |  __/| |_/\\| |-|| / /  | || | \\||| |_//  __  \n" +
                        "\\_/   \\____/\\_/ \\|/_/   \\____\\\\_/\\_\\  \\_/   \\____/\\_/ \\|/_/   \\_/\\_/  \\|\\____\\  \\/  \n" +
                        "                                                                                    ");
            }
            Board.printAllBoards(playerPlaying);

            //Verify if enemy already died
            if(enemy.getNumberOfPieces() == 0){
                return;
            }

            //Verify if player that is playing miss the target
        } while (previousNumberOfPieces != enemy.getNumberOfPieces());
    }

    //Attack
    private static void match(Scanner scanner, Player[] players){
        int playerPlay = (int) Math.round(Math.random());

        while (true) {
            if (playerPlay == 0) {
                //Print the player is playing
                {
                    System.out.println(" ____  _     ____ ___  _ _____ ____    ____  _     ____ ___  _ _  _      _____      \n" +
                            "/  __\\/ \\   /  _ \\\\  \\///  __//  __\\  /  __\\/ \\   /  _ \\\\  \\/// \\/ \\  /|/  __/  __  \n" +
                            "|  \\/|| |   | / \\| \\  / |  \\  |  \\/|  |  \\/|| |   | / \\| \\  / | || |\\ ||| |  _  \\/    " + players[0].getName()+"\n" +
                            "|  __/| |_/\\| |-|| / /  |  /_ |    /  |  __/| |_/\\| |-|| / /  | || | \\||| |_//  __  \n" +
                            "\\_/   \\____/\\_/ \\|/_/   \\____\\\\_/\\_\\  \\_/   \\____/\\_/ \\|/_/   \\_/\\_/  \\|\\____\\  \\/  \n" +
                            "                                                                                    ");
                }
                scanner.nextLine();
                Board.printAllBoards(players[0]);
                scanner.nextLine();
                playerPlay(scanner, players[0], players[1]);
            }

            //Verify if player One Win
            if(players[1].getNumberOfPieces() == 0){
                whoWin(players[0]);
                victoriesP1++;
                return;
            }

            //Print the player is playing
            {
                System.out.println(" ____  _     ____ ___  _ _____ ____    ____  _     ____ ___  _ _  _      _____      \n" +
                        "/  __\\/ \\   /  _ \\\\  \\///  __//  __\\  /  __\\/ \\   /  _ \\\\  \\/// \\/ \\  /|/  __/  __  \n" +
                        "|  \\/|| |   | / \\| \\  / |  \\  |  \\/|  |  \\/|| |   | / \\| \\  / | || |\\ ||| |  _  \\/    " + players[1].getName()+"\n" +
                        "|  __/| |_/\\| |-|| / /  |  /_ |    /  |  __/| |_/\\| |-|| / /  | || | \\||| |_//  __  \n" +
                        "\\_/   \\____/\\_/ \\|/_/   \\____\\\\_/\\_\\  \\_/   \\____/\\_/ \\|/_/   \\_/\\_/  \\|\\____\\  \\/  \n" +
                        "                                                                                    ");
            }
            scanner.nextLine();
            clearScreen();
            Board.printAllBoards(players[1]);
            scanner.nextLine();
            playerPlay(scanner, players[1], players[0]);
            playerPlay = 0;

            //Verify if player Two Win
            if (players[0].getNumberOfPieces() == 0){
                whoWin(players[1]);
                victoriesP2++;
                return;
            }
            scanner.nextLine();
            clearScreen();
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

    //Set all Game.Vessels
    private static void setAllVessels(Scanner scanner, Player player){
        int index = 0;

        while (true) {
            System.out.println();
            for (int i = index; i < player.getVessels().size(); i++) {
                System.out.println("[ " + (i + 1) + " ] === " + player.getVessels().get(i).getName());
            }
            System.out.println();

            Board.printPlayerBoard(player);
            player.setVessel(scanner, player.getVessels().get(index));
            if (index == (player.getVessels().size() - 1)){
                Board.printAllBoards(player);
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
            //Print the quit
            {
                System.out.println("""
                         ____  ____   ___  _ ____  _       _      ____  _      _      ____    ____  _     ____ ___  _   ____  _____ ____  _  _        ____\s
                        /  _ \\/  _ \\  \\  \\///  _ \\/ \\ /\\  / \\  /|/  _ \\/ \\  /|/ \\  /|/  _ \\  /  __\\/ \\   /  _ \\\\  \\//  /  _ \\/  __//  _ \\/ \\/ \\  /|  / _  \\
                        | | \\|| / \\|   \\  / | / \\|| | ||  | |  ||| / \\|| |\\ ||| |\\ ||| / \\|  |  \\/|| |   | / \\| \\  /   | / \\|| |  _| / \\|| || |\\ ||  \\/ \\ |
                        | |_/|| \\_/|   / /  | \\_/|| \\_/|  | |/\\||| |-||| | \\||| | \\||| |-||  |  __/| |_/\\| |-|| / /    | |-||| |_//| |-||| || | \\||     / /
                        \\____/\\____/  /_/   \\____/\\____/  \\_/  \\|\\_/ \\|\\_/  \\|\\_/  \\|\\_/ \\|  \\_/   \\____/\\_/ \\|/_/     \\_/ \\|\\____\\\\_/ \\|\\_/\\_/  \\|     \\/\s
                                                                                                                                                        \\/\s
                                                                                                                                                          \s
                                                                                                                                                          \s
                                                                                                                                                          \s
                                                                                                                                                          \s
                         _             ___  _ _____ ____                                                                                                  \s
                        / \\            \\  \\///  __// ___\\                                                                                                 \s
                        | |    _____    \\  / |  \\  |    \\                                                                                                 \s
                        | |    \\____\\   / /  |  /_ \\___ |                                                                                                 \s
                        \\_/            /_/   \\____\\\\____/                                                                                                 \s
                                                                                                                                                          \s
                         ____            _      ____                                                                                                      \s
                        /  _ \\          / \\  /|/  _ \\                                                                                                     \s
                        | / \\|  _____   | |\\ ||| / \\|                                                                                                     \s
                        | \\_/|  \\____\\  | | \\||| \\_/|                                                                                                     \s
                        \\____/          \\_/  \\|\\____/                                                                                                     \s
                                                                                                                                                          \s""");
            }
            System.out.println();
            input = scanner.next();

            //Input Verifier
        }while (!input.equals("1") && !input.equals("0"));

        return input.equals("1");
    }
}
