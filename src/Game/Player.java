package Game;

import Vessels.*;
import java.util.ArrayList;

public class Player {

    //Statement's
    private String color;
    private String name;
    private int victories;
    private ArrayList<Vessel> vessels = new ArrayList<>();
    private String[][] ownBoard = new String[10][10];
    private String[][] tacticalBoard = new String[10][10];

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
