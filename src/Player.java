public class Player {

    //Statement's
    private String color;
    private String name;
    private int victories;
    private Vessel vessels;
    private String[][] ownBoard = new String[10][10];
    private String[][] tacticalBoard = new String[10][10];

    //Constructor's
    public Player(String color, String name){
        this.color = color;
        this.name = name;
        this.victories = 0;
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

    public void setOwnBoard(String[][] ownBoard) {
        this.ownBoard = ownBoard;
    }

    public void setTacticalBoard(String[][] tacticalBoard) {
        this.tacticalBoard = tacticalBoard;
    }
}
