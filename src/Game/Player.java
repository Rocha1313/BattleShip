package Game;

import Vessels.*;
import java.util.ArrayList;
import java.util.Dictionary;
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
    public void setVessel(Scanner scanner, Vessel vessel){
        boolean checkInputDirection = true;
        String position;
        String inputDirection;
        String direction = "";

        Board.printPlayerBoard(this.ownBoard);

        do {
            System.out.println("Where do you want to put the vessel?");
            position = scanner.next();
            while(checkInputDirection) {
                System.out.println("\nWhich direction do you want him to look?");
                System.out.println("\n 1 - UP\n 2 - RIGHT\n 3 - DOWN\n 4 - LEFT\n\n");
                inputDirection = scanner.next();
                switch (inputDirection) {
                    case "1" -> {
                        direction = "UP";
                        checkInputDirection = false;
                    }
                    case "2" -> {
                        direction = "RIGHT";
                        checkInputDirection = false;
                    }
                    case "3" -> {
                        direction = "DOWN";
                        checkInputDirection = false;
                    }
                    case "4" -> {
                        direction = "LEFT";
                        checkInputDirection = false;
                    }
                    default -> {
                    }
                }
            }
            checkInputDirection = true;
        }while (!checkPositionIsFree(position, vessel, direction));
    }

    //Give us the index's of coordinates
    private int[] coordinatesIndex(String position){
        int topIndex = 0;

        //Split the string to give as each coordinate
        String[] coordinates = new String[]{position.substring(0,1), position.substring(1)};

        //Set the exact coordinate of left Index
        int leftIndex = (Integer.parseInt(coordinates[1]) - 1);

        //Set the exact coordinate of top Index
        for (int i = 0; i < topCoordinates.length; i++){
            if (topCoordinates[i].equals(coordinates[0].toUpperCase())){
                topIndex = i;
                break;
            }
        }

        return new int[]{topIndex, leftIndex};
    }

    //Check if position is free
    private boolean checkPositionIsFree(String position, Vessel vessel, String direction){
        //Check the input
        if (checkPositionInput(position)){
            return false;
        }

        //Store the exact coordinates to be used later
        int[] coordinatesIndex = coordinatesIndex(position);

        //Check if the exact coordinate is blocked
        if (!ownBoard[coordinatesIndex[0]][coordinatesIndex[1]].equals(" ")){
            System.out.println("The position is blocked!!\nChoose another one!");
            return false;
        }

        return true;
    };

    //Check if input is valid
    private boolean checkPositionInput(String position){
        boolean checked = false;

        //Check if input position is null
        if (Objects.isNull(position)){
            System.out.println("\nNothing was typed\n");
            return true;
        }

        //Check if input position size is more than 2
        if (position.length() > 2){
            System.out.println("\nNot Valid Input\n");
            return true;
        }

        //Separates in two the coordinates
        String[] coordinates = new String[]{position.substring(0,1), position.substring(1)};

        //Check if the second letter is a number
        try {
            int i = Integer.parseInt(coordinates[1]);
        }catch (NumberFormatException nfe) {
            System.out.println("\nNot Valid Input\n");
            return true;
        }

        //Check if first letter is a valid coordinate letter
        for (String t : topCoordinates){
            if (coordinates[0].equals(t)){
                checked = true;
                break;
            }
        }
        //Print the error if is false
        if(!checked){
            System.out.println("\nNot Valid Input\n");
            return true;
        }

        //Check if the second letter that is a number is between 1 and 10 and return true if the checker on Top is true too
        if ((Integer.parseInt(coordinates[1]) >= 1) && (Integer.parseInt(coordinates[1]) <= 10)){
            return false;
        }

        System.out.println("\nNot Valid Input\n");
        return true;
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
