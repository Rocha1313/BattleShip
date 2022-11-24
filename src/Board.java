public class Board {

    public static void printPlayerBoard(String[][] playerBoard){
        System.out.println();
        System.out.print("      A   B   C   D   E   F   G   H   I   J \n");
        System.out.print("    |---|---|---|---|---|---|---|---|---|---|\n");
        System.out.print("  1 | "+playerBoard[0][0]+" | "+playerBoard[0][1]+" | "+playerBoard[0][2]+" | "+playerBoard[0][3]+" | "+playerBoard[0][4]+" | "+playerBoard[0][5]+" | "+playerBoard[0][6]+" | "+playerBoard[0][7]+" | "+playerBoard[0][8]+" | "+playerBoard[0][9]+" |\n");
        System.out.print("    |---|---|---|---|---|---|---|---|---|---|\n");
        System.out.print("  2 | "+playerBoard[1][0]+" | "+playerBoard[1][1]+" | "+playerBoard[1][2]+" | "+playerBoard[1][3]+" | "+playerBoard[1][4]+" | "+playerBoard[1][5]+" | "+playerBoard[1][6]+" | "+playerBoard[1][7]+" | "+playerBoard[1][8]+" | "+playerBoard[1][9]+" |\n");
        System.out.print("    |---|---|---|---|---|---|---|---|---|---|\n");
        System.out.print("  3 | "+playerBoard[2][0]+" | "+playerBoard[2][1]+" | "+playerBoard[2][2]+" | "+playerBoard[2][3]+" | "+playerBoard[2][4]+" | "+playerBoard[2][5]+" | "+playerBoard[2][6]+" | "+playerBoard[2][7]+" | "+playerBoard[2][8]+" | "+playerBoard[2][9]+" |\n");
        System.out.print("    |---|---|---|---|---|---|---|---|---|---|\n");
        System.out.print("  4 | "+playerBoard[3][0]+" | "+playerBoard[3][1]+" | "+playerBoard[3][2]+" | "+playerBoard[3][3]+" | "+playerBoard[3][4]+" | "+playerBoard[3][5]+" | "+playerBoard[3][6]+" | "+playerBoard[3][7]+" | "+playerBoard[3][8]+" | "+playerBoard[3][9]+" |\n");
        System.out.print("    |---|---|---|---|---|---|---|---|---|---|\n");
        System.out.print("  5 | "+playerBoard[4][0]+" | "+playerBoard[4][1]+" | "+playerBoard[4][2]+" | "+playerBoard[4][3]+" | "+playerBoard[4][4]+" | "+playerBoard[4][5]+" | "+playerBoard[4][6]+" | "+playerBoard[4][7]+" | "+playerBoard[4][8]+" | "+playerBoard[4][9]+" |\n");
        System.out.print("    |---|---|---|---|---|---|---|---|---|---|\n");
        System.out.print("  6 | "+playerBoard[5][0]+" | "+playerBoard[5][1]+" | "+playerBoard[5][2]+" | "+playerBoard[5][3]+" | "+playerBoard[5][4]+" | "+playerBoard[5][5]+" | "+playerBoard[5][6]+" | "+playerBoard[5][7]+" | "+playerBoard[5][8]+" | "+playerBoard[5][9]+" |\n");
        System.out.print("    |---|---|---|---|---|---|---|---|---|---|\n");
        System.out.print("  7 | "+playerBoard[6][0]+" | "+playerBoard[6][1]+" | "+playerBoard[6][2]+" | "+playerBoard[6][3]+" | "+playerBoard[6][4]+" | "+playerBoard[6][5]+" | "+playerBoard[6][6]+" | "+playerBoard[6][7]+" | "+playerBoard[6][8]+" | "+playerBoard[6][9]+" |\n");
        System.out.print("    |---|---|---|---|---|---|---|---|---|---|\n");
        System.out.print("  8 | "+playerBoard[7][0]+" | "+playerBoard[7][1]+" | "+playerBoard[7][2]+" | "+playerBoard[7][3]+" | "+playerBoard[7][4]+" | "+playerBoard[7][5]+" | "+playerBoard[7][6]+" | "+playerBoard[7][7]+" | "+playerBoard[7][8]+" | "+playerBoard[7][9]+" |\n");
        System.out.print("    |---|---|---|---|---|---|---|---|---|---|\n");
        System.out.print("  9 | "+playerBoard[8][0]+" | "+playerBoard[8][1]+" | "+playerBoard[8][2]+" | "+playerBoard[8][3]+" | "+playerBoard[8][4]+" | "+playerBoard[8][5]+" | "+playerBoard[8][6]+" | "+playerBoard[8][7]+" | "+playerBoard[8][8]+" | "+playerBoard[8][9]+" |\n");
        System.out.print("    |---|---|---|---|---|---|---|---|---|---|\n");
        System.out.print(" 10 | "+playerBoard[9][0]+" | "+playerBoard[9][1]+" | "+playerBoard[9][2]+" | "+playerBoard[9][3]+" | "+playerBoard[9][4]+" | "+playerBoard[9][5]+" | "+playerBoard[9][6]+" | "+playerBoard[9][7]+" | "+playerBoard[9][8]+" | "+playerBoard[9][9]+" |\n");
        System.out.print("    |---|---|---|---|---|---|---|---|---|---|\n");
        System.out.println();
    }

    public static void printTacticalBoard(String[][] tacticalBoard){
        System.out.println();
        System.out.print("      A   B   C   D   E   F   G   H   I   J \n");
        System.out.print("    |---|---|---|---|---|---|---|---|---|---|\n");
        System.out.print("  1 | "+tacticalBoard[0][0]+" | "+tacticalBoard[0][1]+" | "+tacticalBoard[0][2]+" | "+tacticalBoard[0][3]+" | "+tacticalBoard[0][4]+" | "+tacticalBoard[0][5]+" | "+tacticalBoard[0][6]+" | "+tacticalBoard[0][7]+" | "+tacticalBoard[0][8]+" | "+tacticalBoard[0][9]+" |\n");
        System.out.print("    |---|---|---|---|---|---|---|---|---|---|\n");
        System.out.print("  2 | "+tacticalBoard[1][0]+" | "+tacticalBoard[1][1]+" | "+tacticalBoard[1][2]+" | "+tacticalBoard[1][3]+" | "+tacticalBoard[1][4]+" | "+tacticalBoard[1][5]+" | "+tacticalBoard[1][6]+" | "+tacticalBoard[1][7]+" | "+tacticalBoard[1][8]+" | "+tacticalBoard[1][9]+" |\n");
        System.out.print("    |---|---|---|---|---|---|---|---|---|---|\n");
        System.out.print("  3 | "+tacticalBoard[2][0]+" | "+tacticalBoard[2][1]+" | "+tacticalBoard[2][2]+" | "+tacticalBoard[2][3]+" | "+tacticalBoard[2][4]+" | "+tacticalBoard[2][5]+" | "+tacticalBoard[2][6]+" | "+tacticalBoard[2][7]+" | "+tacticalBoard[2][8]+" | "+tacticalBoard[2][9]+" |\n");
        System.out.print("    |---|---|---|---|---|---|---|---|---|---|\n");
        System.out.print("  4 | "+tacticalBoard[3][0]+" | "+tacticalBoard[3][1]+" | "+tacticalBoard[3][2]+" | "+tacticalBoard[3][3]+" | "+tacticalBoard[3][4]+" | "+tacticalBoard[3][5]+" | "+tacticalBoard[3][6]+" | "+tacticalBoard[3][7]+" | "+tacticalBoard[3][8]+" | "+tacticalBoard[3][9]+" |\n");
        System.out.print("    |---|---|---|---|---|---|---|---|---|---|\n");
        System.out.print("  5 | "+tacticalBoard[4][0]+" | "+tacticalBoard[4][1]+" | "+tacticalBoard[4][2]+" | "+tacticalBoard[4][3]+" | "+tacticalBoard[4][4]+" | "+tacticalBoard[4][5]+" | "+tacticalBoard[4][6]+" | "+tacticalBoard[4][7]+" | "+tacticalBoard[4][8]+" | "+tacticalBoard[4][9]+" |\n");
        System.out.print("    |---|---|---|---|---|---|---|---|---|---|\n");
        System.out.print("  6 | "+tacticalBoard[5][0]+" | "+tacticalBoard[5][1]+" | "+tacticalBoard[5][2]+" | "+tacticalBoard[5][3]+" | "+tacticalBoard[5][4]+" | "+tacticalBoard[5][5]+" | "+tacticalBoard[5][6]+" | "+tacticalBoard[5][7]+" | "+tacticalBoard[5][8]+" | "+tacticalBoard[5][9]+" |\n");
        System.out.print("    |---|---|---|---|---|---|---|---|---|---|\n");
        System.out.print("  7 | "+tacticalBoard[6][0]+" | "+tacticalBoard[6][1]+" | "+tacticalBoard[6][2]+" | "+tacticalBoard[6][3]+" | "+tacticalBoard[6][4]+" | "+tacticalBoard[6][5]+" | "+tacticalBoard[6][6]+" | "+tacticalBoard[6][7]+" | "+tacticalBoard[6][8]+" | "+tacticalBoard[6][9]+" |\n");
        System.out.print("    |---|---|---|---|---|---|---|---|---|---|\n");
        System.out.print("  8 | "+tacticalBoard[7][0]+" | "+tacticalBoard[7][1]+" | "+tacticalBoard[7][2]+" | "+tacticalBoard[7][3]+" | "+tacticalBoard[7][4]+" | "+tacticalBoard[7][5]+" | "+tacticalBoard[7][6]+" | "+tacticalBoard[7][7]+" | "+tacticalBoard[7][8]+" | "+tacticalBoard[7][9]+" |\n");
        System.out.print("    |---|---|---|---|---|---|---|---|---|---|\n");
        System.out.print("  9 | "+tacticalBoard[8][0]+" | "+tacticalBoard[8][1]+" | "+tacticalBoard[8][2]+" | "+tacticalBoard[8][3]+" | "+tacticalBoard[8][4]+" | "+tacticalBoard[8][5]+" | "+tacticalBoard[8][6]+" | "+tacticalBoard[8][7]+" | "+tacticalBoard[8][8]+" | "+tacticalBoard[8][9]+" |\n");
        System.out.print("    |---|---|---|---|---|---|---|---|---|---|\n");
        System.out.print(" 10 | "+tacticalBoard[9][0]+" | "+tacticalBoard[9][1]+" | "+tacticalBoard[9][2]+" | "+tacticalBoard[9][3]+" | "+tacticalBoard[9][4]+" | "+tacticalBoard[9][5]+" | "+tacticalBoard[9][6]+" | "+tacticalBoard[9][7]+" | "+tacticalBoard[9][8]+" | "+tacticalBoard[9][9]+" |\n");
        System.out.print("    |---|---|---|---|---|---|---|---|---|---|\n");
        System.out.println();
    }

    public static void printAllBoards(String[][] playerBoard, String[][] tacticalBoard){
        System.out.println();
        System.out.print("      A   B   C   D   E   F   G   H   I   J                         A   B   C   D   E   F   G   H   I   J \n");
        System.out.print("    |---|---|---|---|---|---|---|---|---|---|                     |---|---|---|---|---|---|---|---|---|---|\n");
        System.out.print("  1 | "+playerBoard[0][0]+" | "+playerBoard[0][1]+" | "+playerBoard[0][2]+" | "+playerBoard[0][3]+" | "+playerBoard[0][4]+" | "+playerBoard[0][5]+" | "+playerBoard[0][6]+" | "+playerBoard[0][7]+" | "+playerBoard[0][8]+" | "+playerBoard[0][9]+" |                   1 | "+tacticalBoard[0][0]+" | "+tacticalBoard[0][1]+" | "+tacticalBoard[0][2]+" | "+tacticalBoard[0][3]+" | "+tacticalBoard[0][4]+" | "+tacticalBoard[0][5]+" | "+tacticalBoard[0][6]+" | "+tacticalBoard[0][7]+" | "+tacticalBoard[0][8]+" | "+tacticalBoard[0][9]+" |\n");
        System.out.print("    |---|---|---|---|---|---|---|---|---|---|                     |---|---|---|---|---|---|---|---|---|---|\n");
        System.out.print("  2 | "+playerBoard[1][0]+" | "+playerBoard[1][1]+" | "+playerBoard[1][2]+" | "+playerBoard[1][3]+" | "+playerBoard[1][4]+" | "+playerBoard[1][5]+" | "+playerBoard[1][6]+" | "+playerBoard[1][7]+" | "+playerBoard[1][8]+" | "+playerBoard[1][9]+" |                   2 | "+tacticalBoard[1][0]+" | "+tacticalBoard[1][1]+" | "+tacticalBoard[1][2]+" | "+tacticalBoard[1][3]+" | "+tacticalBoard[1][4]+" | "+tacticalBoard[1][5]+" | "+tacticalBoard[1][6]+" | "+tacticalBoard[1][7]+" | "+tacticalBoard[1][8]+" | "+tacticalBoard[1][9]+" |\n");
        System.out.print("    |---|---|---|---|---|---|---|---|---|---|                     |---|---|---|---|---|---|---|---|---|---|\n");
        System.out.print("  3 | "+playerBoard[2][0]+" | "+playerBoard[2][1]+" | "+playerBoard[2][2]+" | "+playerBoard[2][3]+" | "+playerBoard[2][4]+" | "+playerBoard[2][5]+" | "+playerBoard[2][6]+" | "+playerBoard[2][7]+" | "+playerBoard[2][8]+" | "+playerBoard[2][9]+" |                   3 | "+tacticalBoard[2][0]+" | "+tacticalBoard[2][1]+" | "+tacticalBoard[2][2]+" | "+tacticalBoard[2][3]+" | "+tacticalBoard[2][4]+" | "+tacticalBoard[2][5]+" | "+tacticalBoard[2][6]+" | "+tacticalBoard[2][7]+" | "+tacticalBoard[2][8]+" | "+tacticalBoard[2][9]+" |\n");
        System.out.print("    |---|---|---|---|---|---|---|---|---|---|                     |---|---|---|---|---|---|---|---|---|---|\n");
        System.out.print("  4 | "+playerBoard[3][0]+" | "+playerBoard[3][1]+" | "+playerBoard[3][2]+" | "+playerBoard[3][3]+" | "+playerBoard[3][4]+" | "+playerBoard[3][5]+" | "+playerBoard[3][6]+" | "+playerBoard[3][7]+" | "+playerBoard[3][8]+" | "+playerBoard[3][9]+" |                   4 | "+tacticalBoard[3][0]+" | "+tacticalBoard[3][1]+" | "+tacticalBoard[3][2]+" | "+tacticalBoard[3][3]+" | "+tacticalBoard[3][4]+" | "+tacticalBoard[3][5]+" | "+tacticalBoard[3][6]+" | "+tacticalBoard[3][7]+" | "+tacticalBoard[3][8]+" | "+tacticalBoard[3][9]+" |\n");
        System.out.print("    |---|---|---|---|---|---|---|---|---|---|                     |---|---|---|---|---|---|---|---|---|---|\n");
        System.out.print("  5 | "+playerBoard[4][0]+" | "+playerBoard[4][1]+" | "+playerBoard[4][2]+" | "+playerBoard[4][3]+" | "+playerBoard[4][4]+" | "+playerBoard[4][5]+" | "+playerBoard[4][6]+" | "+playerBoard[4][7]+" | "+playerBoard[4][8]+" | "+playerBoard[4][9]+" |                   5 | "+tacticalBoard[4][0]+" | "+tacticalBoard[4][1]+" | "+tacticalBoard[4][2]+" | "+tacticalBoard[4][3]+" | "+tacticalBoard[4][4]+" | "+tacticalBoard[4][5]+" | "+tacticalBoard[4][6]+" | "+tacticalBoard[4][7]+" | "+tacticalBoard[4][8]+" | "+tacticalBoard[4][9]+" |\n");
        System.out.print("    |---|---|---|---|---|---|---|---|---|---|                     |---|---|---|---|---|---|---|---|---|---|\n");
        System.out.print("  6 | "+playerBoard[5][0]+" | "+playerBoard[5][1]+" | "+playerBoard[5][2]+" | "+playerBoard[5][3]+" | "+playerBoard[5][4]+" | "+playerBoard[5][5]+" | "+playerBoard[5][6]+" | "+playerBoard[5][7]+" | "+playerBoard[5][8]+" | "+playerBoard[5][9]+" |                   6 | "+tacticalBoard[5][0]+" | "+tacticalBoard[5][1]+" | "+tacticalBoard[5][2]+" | "+tacticalBoard[5][3]+" | "+tacticalBoard[5][4]+" | "+tacticalBoard[5][5]+" | "+tacticalBoard[5][6]+" | "+tacticalBoard[5][7]+" | "+tacticalBoard[5][8]+" | "+tacticalBoard[5][9]+" |\n");
        System.out.print("    |---|---|---|---|---|---|---|---|---|---|                     |---|---|---|---|---|---|---|---|---|---|\n");
        System.out.print("  7 | "+playerBoard[6][0]+" | "+playerBoard[6][1]+" | "+playerBoard[6][2]+" | "+playerBoard[6][3]+" | "+playerBoard[6][4]+" | "+playerBoard[6][5]+" | "+playerBoard[6][6]+" | "+playerBoard[6][7]+" | "+playerBoard[6][8]+" | "+playerBoard[6][9]+" |                   7 | "+tacticalBoard[6][0]+" | "+tacticalBoard[6][1]+" | "+tacticalBoard[6][2]+" | "+tacticalBoard[6][3]+" | "+tacticalBoard[6][4]+" | "+tacticalBoard[6][5]+" | "+tacticalBoard[6][6]+" | "+tacticalBoard[6][7]+" | "+tacticalBoard[6][8]+" | "+tacticalBoard[6][9]+" |\n");
        System.out.print("    |---|---|---|---|---|---|---|---|---|---|                     |---|---|---|---|---|---|---|---|---|---|\n");
        System.out.print("  8 | "+playerBoard[7][0]+" | "+playerBoard[7][1]+" | "+playerBoard[7][2]+" | "+playerBoard[7][3]+" | "+playerBoard[7][4]+" | "+playerBoard[7][5]+" | "+playerBoard[7][6]+" | "+playerBoard[7][7]+" | "+playerBoard[7][8]+" | "+playerBoard[7][9]+" |                   8 | "+tacticalBoard[7][0]+" | "+tacticalBoard[7][1]+" | "+tacticalBoard[7][2]+" | "+tacticalBoard[7][3]+" | "+tacticalBoard[7][4]+" | "+tacticalBoard[7][5]+" | "+tacticalBoard[7][6]+" | "+tacticalBoard[7][7]+" | "+tacticalBoard[7][8]+" | "+tacticalBoard[7][9]+" |\n");
        System.out.print("    |---|---|---|---|---|---|---|---|---|---|                     |---|---|---|---|---|---|---|---|---|---|\n");
        System.out.print("  9 | "+playerBoard[8][0]+" | "+playerBoard[8][1]+" | "+playerBoard[8][2]+" | "+playerBoard[8][3]+" | "+playerBoard[8][4]+" | "+playerBoard[8][5]+" | "+playerBoard[8][6]+" | "+playerBoard[8][7]+" | "+playerBoard[8][8]+" | "+playerBoard[8][9]+" |                   9 | "+tacticalBoard[8][0]+" | "+tacticalBoard[8][1]+" | "+tacticalBoard[8][2]+" | "+tacticalBoard[8][3]+" | "+tacticalBoard[8][4]+" | "+tacticalBoard[8][5]+" | "+tacticalBoard[8][6]+" | "+tacticalBoard[8][7]+" | "+tacticalBoard[8][8]+" | "+tacticalBoard[8][9]+" |\n");
        System.out.print("    |---|---|---|---|---|---|---|---|---|---|                     |---|---|---|---|---|---|---|---|---|---|\n");
        System.out.print(" 10 | "+playerBoard[9][0]+" | "+playerBoard[9][1]+" | "+playerBoard[9][2]+" | "+playerBoard[9][3]+" | "+playerBoard[9][4]+" | "+playerBoard[9][5]+" | "+playerBoard[9][6]+" | "+playerBoard[9][7]+" | "+playerBoard[9][8]+" | "+playerBoard[9][9]+" |                  10 | "+tacticalBoard[9][0]+" | "+tacticalBoard[9][1]+" | "+tacticalBoard[9][2]+" | "+tacticalBoard[9][3]+" | "+tacticalBoard[9][4]+" | "+tacticalBoard[9][5]+" | "+tacticalBoard[9][6]+" | "+tacticalBoard[9][7]+" | "+tacticalBoard[9][8]+" | "+tacticalBoard[9][9]+" |\n");
        System.out.print("    |---|---|---|---|---|---|---|---|---|---|                     |---|---|---|---|---|---|---|---|---|---|\n");
        System.out.println();
    }
}
