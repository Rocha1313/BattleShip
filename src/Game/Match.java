package Game;

import Vessels.Vessel;

import java.util.ArrayList;
import java.util.Scanner;

public class Match {

    public static void start(){
        Scanner sc = new Scanner(System.in);
        do{
            Player player = new Player("sss", "ssss");

            Board.printPlayerBoard(player.getOwnBoard());
            player.setVessel(sc, player.getVessels().get(2));
            Board.printPlayerBoard(player.getOwnBoard());


            Board.printPlayerBoard(player.getTacticalBoard());
            player.attackEnemy(sc, player.getOwnBoard(), player.getVessels());
            Board.printPlayerBoard(player.getTacticalBoard());
            player.attackEnemy(sc, player.getOwnBoard(), player.getVessels());
            Board.printPlayerBoard(player.getTacticalBoard());
            player.attackEnemy(sc, player.getOwnBoard(), player.getVessels());
            Board.printPlayerBoard(player.getTacticalBoard());
        }while (quit(sc));
    }

    //Set all Vessels
    private static void setAllVessels(Scanner scanner, Player player){
        System.out.println();
        for (int i = 0; i < player.getVessels().size(); i++){
            System.out.println("[ "+(i+1)+" ] === "+player.getVessels().get(i).getName());
        }
        System.out.println();

        player.setVessel(scanner, player.getVessels().get(2));
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
