package Game;

import Vessels.*;
import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class Player {

    //Statement's
    private String color;
    private String name;
    private int victories;
    private ArrayList<Vessel> vessels = new ArrayList<>();
    private String[][] ownBoard = new String[10][10];
    private String[][] tacticalBoard = new String[10][10];
    private final String[] topCoordinates = new String[]{"A", "B", "C", "D", "E", "F", "G", "H", "I", "J"};

    //Constructor's
    public Player(String color, String name){
        //Set Game.Board's to an empty space
        for (int i = 0; i < ownBoard.length; i++){
            for (int f = 0; f < ownBoard[i].length; f++){
                ownBoard[i][f] = " ";
                tacticalBoard[i][f] = " ";
            }
        }

        this.color = color;
        this.name = name;
        this.victories = 0;

        //Set the vessel's of player
        vessels.add(new AeroCarrier());
        vessels.add(new Corvettes());
        vessels.add(new TorpedoBoat());
        for (int i = 0; i < 2; i++){
            vessels.add(new Caravel());
        }
        for (int i = 0; i < 3; i++){
            vessels.add(new Submarine());
        }
    }

    //Method's
    private void setVessel(Scanner scanner, Vessel vessel){
        String position;
        Board.printPlayerBoard(this.ownBoard);
        do {
            System.out.println("Where do you want to put the vessel?");
            position = scanner.next();
        }while (!checkPositionInput(position));
    }

    //Check if input is valid
    private boolean checkPositionInput(String position){
        boolean checked = false;

        //Check if input position is null
        if (Objects.isNull(position)){
            System.out.println("\nNothing was typed\n");
            return false;
        }

        //Check if input position size is more than 2
        if (position.length() > 2){
            System.out.println("\nNot Valid Position\n");
            return false;
        }

        //Separates in two the coordinates
        String[] coordinates = new String[]{position.substring(0,1), position.substring(1)};

        //Check if the second letter is a number
        try {
            int i = Integer.parseInt(coordinates[1]);
        }catch (NumberFormatException nfe) {
            System.out.println("\nNot Valid Number\n");
            return false;
        }

        //Check if first letter is a valid coordinate letter
        for (String t : topCoordinates){
            if (coordinates[0].equals(t)){
                checked = true;
                break;
            }
        }

        //Check if the second letter that is a number is between 1 and 10 and return true if the checker on Top is true too
        if (checked && ((Integer.parseInt(coordinates[1]) < 1) && (Integer.parseInt(coordinates[1]) > 10))){
            System.out.println("\nNot Valid letter\n");
            return true;
        }

        return false;
    }

    //Getter's
    public String getColor() {
        return color;
    }

    public String getName() {
        return name;
    }

    public int getVictories() {
        return victories;
    }

    public ArrayList<Vessel> getVessels() {
        return vessels;
    }

    public String[][] getOwnBoard() {
        return ownBoard;
    }

    public String[][] getTacticalBoard() {
        return tacticalBoard;
    }

    //Setter's
    public void setColor(String color) {
        this.color = color;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setVictories(int victories) {
        this.victories = victories;
    }

    public void setVessels(ArrayList<Vessel> vessels) {
        this.vessels = vessels;
    }

    public void setOwnBoard(String[][] ownBoard) {
        this.ownBoard = ownBoard;
    }

    public void setTacticalBoard(String[][] tacticalBoard) {
        this.tacticalBoard = tacticalBoard;
    }
}
