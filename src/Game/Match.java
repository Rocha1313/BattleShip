package Game;

import java.util.Scanner;

public class Match {

    public void start(){
        Scanner sc = new Scanner();
        do{



        }while (quit(sc));
    }

    private boolean quit(Scanner scanner){
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
