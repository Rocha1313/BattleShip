package Game;

class Board {

    public static final String RESET = "\033[0m";
    public static final String ANSI_RED_BACKGROUND = "\u001B[41m";
    public static final String ANSI_BLUE_BACKGROUND = "\u001B[44m";
    public static final String ANSI_WHITE_BACKGROUND = "\033[0;107m";   // WHITE
    public static final String ANSI_BLACK = "\u001B[30m";

    static void printPlayerBoard(Player player){
        String[][] position = new String[10][10];

        for (int i = 0 ; i < position.length; i++){
            for (int f = 0; f < position[i].length; f++){
                if (player.getOwnBoard()[i][f].equals(" ")){
                    position[i][f] = ANSI_BLUE_BACKGROUND + " " + RESET;
                    continue;
                }

                if (player.getOwnBoard()[i][f].equals("W")){
                    position[i][f] = ANSI_WHITE_BACKGROUND + ANSI_BLACK + " " + RESET;
                    continue;
                }

                if (player.getOwnBoard()[i][f].equals("O")){
                    position[i][f] = player.getColor() + " " + RESET;
                    continue;
                }

                position[i][f] = ANSI_RED_BACKGROUND + ANSI_BLACK + " " + RESET;
            }
        }
        System.out.println();
        System.out.print("      A   B   C   D   E   F   G   H   I   J \n");
        System.out.print("    |---|---|---|---|---|---|---|---|---|---|\n");
        System.out.print("  1 | "+position[0][0]+" | "+position[0][1]+" | "+position[0][2]+" | "+position[0][3]+" | "+position[0][4]+" | "+position[0][5]+" | "+position[0][6]+" | "+position[0][7]+" | "+position[0][8]+" | "+position[0][9]+" |\n");
        System.out.print("    |---|---|---|---|---|---|---|---|---|---|\n");
        System.out.print("  2 | "+position[1][0]+" | "+position[1][1]+" | "+position[1][2]+" | "+position[1][3]+" | "+position[1][4]+" | "+position[1][5]+" | "+position[1][6]+" | "+position[1][7]+" | "+position[1][8]+" | "+position[1][9]+" |\n");
        System.out.print("    |---|---|---|---|---|---|---|---|---|---|\n");
        System.out.print("  3 | "+position[2][0]+" | "+position[2][1]+" | "+position[2][2]+" | "+position[2][3]+" | "+position[2][4]+" | "+position[2][5]+" | "+position[2][6]+" | "+position[2][7]+" | "+position[2][8]+" | "+position[2][9]+" |\n");
        System.out.print("    |---|---|---|---|---|---|---|---|---|---|\n");
        System.out.print("  4 | "+position[3][0]+" | "+position[3][1]+" | "+position[3][2]+" | "+position[3][3]+" | "+position[3][4]+" | "+position[3][5]+" | "+position[3][6]+" | "+position[3][7]+" | "+position[3][8]+" | "+position[3][9]+" |\n");
        System.out.print("    |---|---|---|---|---|---|---|---|---|---|\n");
        System.out.print("  5 | "+position[4][0]+" | "+position[4][1]+" | "+position[4][2]+" | "+position[4][3]+" | "+position[4][4]+" | "+position[4][5]+" | "+position[4][6]+" | "+position[4][7]+" | "+position[4][8]+" | "+position[4][9]+" |\n");
        System.out.print("    |---|---|---|---|---|---|---|---|---|---|\n");
        System.out.print("  6 | "+position[5][0]+" | "+position[5][1]+" | "+position[5][2]+" | "+position[5][3]+" | "+position[5][4]+" | "+position[5][5]+" | "+position[5][6]+" | "+position[5][7]+" | "+position[5][8]+" | "+position[5][9]+" |\n");
        System.out.print("    |---|---|---|---|---|---|---|---|---|---|\n");
        System.out.print("  7 | "+position[6][0]+" | "+position[6][1]+" | "+position[6][2]+" | "+position[6][3]+" | "+position[6][4]+" | "+position[6][5]+" | "+position[6][6]+" | "+position[6][7]+" | "+position[6][8]+" | "+position[6][9]+" |\n");
        System.out.print("    |---|---|---|---|---|---|---|---|---|---|\n");
        System.out.print("  8 | "+position[7][0]+" | "+position[7][1]+" | "+position[7][2]+" | "+position[7][3]+" | "+position[7][4]+" | "+position[7][5]+" | "+position[7][6]+" | "+position[7][7]+" | "+position[7][8]+" | "+position[7][9]+" |\n");
        System.out.print("    |---|---|---|---|---|---|---|---|---|---|\n");
        System.out.print("  9 | "+position[8][0]+" | "+position[8][1]+" | "+position[8][2]+" | "+position[8][3]+" | "+position[8][4]+" | "+position[8][5]+" | "+position[8][6]+" | "+position[8][7]+" | "+position[8][8]+" | "+position[8][9]+" |\n");
        System.out.print("    |---|---|---|---|---|---|---|---|---|---|\n");
        System.out.print(" 10 | "+position[9][0]+" | "+position[9][1]+" | "+position[9][2]+" | "+position[9][3]+" | "+position[9][4]+" | "+position[9][5]+" | "+position[9][6]+" | "+position[9][7]+" | "+position[9][8]+" | "+position[9][9]+" |\n");
        System.out.print("    |---|---|---|---|---|---|---|---|---|---|\n");
        System.out.println();
    }

    static void printAllBoards(Player player){
        String[][] position = new String[10][10];
        String[][] attackPosition = new String[10][10];

        for (int i = 0 ; i < position.length; i++){
            for (int f = 0; f < position[i].length; f++){
                if (player.getOwnBoard()[i][f].equals(" ")){
                    position[i][f] = ANSI_BLUE_BACKGROUND + " " + RESET;
                    continue;
                }

                if (player.getOwnBoard()[i][f].equals("W")){
                    position[i][f] = ANSI_WHITE_BACKGROUND + ANSI_BLACK + " " + RESET;
                    continue;
                }

                if (player.getOwnBoard()[i][f].equals("O")){
                    position[i][f] = player.getColor() + " " + RESET;
                    continue;
                }

                position[i][f] = ANSI_RED_BACKGROUND + ANSI_BLACK + " " + RESET;
            }
        }

        for (int i = 0 ; i < attackPosition.length; i++){
            for (int f = 0; f < attackPosition[i].length; f++){

                if (player.getTacticalBoard()[i][f].equals(" ")){
                    attackPosition[i][f] = ANSI_BLUE_BACKGROUND + " " + RESET;
                    continue;
                }

                if (player.getTacticalBoard()[i][f].equals("W")){
                    attackPosition[i][f] = ANSI_WHITE_BACKGROUND + " " + RESET;
                    continue;
                }

                attackPosition[i][f] = ANSI_RED_BACKGROUND + ANSI_BLACK + " " + RESET;
            }
        }
        System.out.println();
        System.out.print("      A   B   C   D   E   F   G   H   I   J                         A   B   C   D   E   F   G   H   I   J \n");
        System.out.print("    |---|---|---|---|---|---|---|---|---|---|                     |---|---|---|---|---|---|---|---|---|---|\n");
        System.out.print("  1 | "+position[0][0]+" | "+position[0][1]+" | "+position[0][2]+" | "+position[0][3]+" | "+position[0][4]+" | "+position[0][5]+" | "+position[0][6]+" | "+position[0][7]+" | "+position[0][8]+" | "+position[0][9]+" |                   1 | "+attackPosition[0][0]+" | "+attackPosition[0][1]+" | "+attackPosition[0][2]+" | "+attackPosition[0][3]+" | "+attackPosition[0][4]+" | "+attackPosition[0][5]+" | "+attackPosition[0][6]+" | "+attackPosition[0][7]+" | "+attackPosition[0][8]+" | "+attackPosition[0][9]+" |\n");
        System.out.print("    |---|---|---|---|---|---|---|---|---|---|                     |---|---|---|---|---|---|---|---|---|---|\n");
        System.out.print("  2 | "+position[1][0]+" | "+position[1][1]+" | "+position[1][2]+" | "+position[1][3]+" | "+position[1][4]+" | "+position[1][5]+" | "+position[1][6]+" | "+position[1][7]+" | "+position[1][8]+" | "+position[1][9]+" |                   2 | "+attackPosition[1][0]+" | "+attackPosition[1][1]+" | "+attackPosition[1][2]+" | "+attackPosition[1][3]+" | "+attackPosition[1][4]+" | "+attackPosition[1][5]+" | "+attackPosition[1][6]+" | "+attackPosition[1][7]+" | "+attackPosition[1][8]+" | "+attackPosition[1][9]+" |\n");
        System.out.print("    |---|---|---|---|---|---|---|---|---|---|                     |---|---|---|---|---|---|---|---|---|---|\n");
        System.out.print("  3 | "+position[2][0]+" | "+position[2][1]+" | "+position[2][2]+" | "+position[2][3]+" | "+position[2][4]+" | "+position[2][5]+" | "+position[2][6]+" | "+position[2][7]+" | "+position[2][8]+" | "+position[2][9]+" |                   3 | "+attackPosition[2][0]+" | "+attackPosition[2][1]+" | "+attackPosition[2][2]+" | "+attackPosition[2][3]+" | "+attackPosition[2][4]+" | "+attackPosition[2][5]+" | "+attackPosition[2][6]+" | "+attackPosition[2][7]+" | "+attackPosition[2][8]+" | "+attackPosition[2][9]+" |\n");
        System.out.print("    |---|---|---|---|---|---|---|---|---|---|                     |---|---|---|---|---|---|---|---|---|---|\n");
        System.out.print("  4 | "+position[3][0]+" | "+position[3][1]+" | "+position[3][2]+" | "+position[3][3]+" | "+position[3][4]+" | "+position[3][5]+" | "+position[3][6]+" | "+position[3][7]+" | "+position[3][8]+" | "+position[3][9]+" |                   4 | "+attackPosition[3][0]+" | "+attackPosition[3][1]+" | "+attackPosition[3][2]+" | "+attackPosition[3][3]+" | "+attackPosition[3][4]+" | "+attackPosition[3][5]+" | "+attackPosition[3][6]+" | "+attackPosition[3][7]+" | "+attackPosition[3][8]+" | "+attackPosition[3][9]+" |\n");
        System.out.print("    |---|---|---|---|---|---|---|---|---|---|                     |---|---|---|---|---|---|---|---|---|---|\n");
        System.out.print("  5 | "+position[4][0]+" | "+position[4][1]+" | "+position[4][2]+" | "+position[4][3]+" | "+position[4][4]+" | "+position[4][5]+" | "+position[4][6]+" | "+position[4][7]+" | "+position[4][8]+" | "+position[4][9]+" |                   5 | "+attackPosition[4][0]+" | "+attackPosition[4][1]+" | "+attackPosition[4][2]+" | "+attackPosition[4][3]+" | "+attackPosition[4][4]+" | "+attackPosition[4][5]+" | "+attackPosition[4][6]+" | "+attackPosition[4][7]+" | "+attackPosition[4][8]+" | "+attackPosition[4][9]+" |\n");
        System.out.print("    |---|---|---|---|---|---|---|---|---|---|                     |---|---|---|---|---|---|---|---|---|---|\n");
        System.out.print("  6 | "+position[5][0]+" | "+position[5][1]+" | "+position[5][2]+" | "+position[5][3]+" | "+position[5][4]+" | "+position[5][5]+" | "+position[5][6]+" | "+position[5][7]+" | "+position[5][8]+" | "+position[5][9]+" |                   6 | "+attackPosition[5][0]+" | "+attackPosition[5][1]+" | "+attackPosition[5][2]+" | "+attackPosition[5][3]+" | "+attackPosition[5][4]+" | "+attackPosition[5][5]+" | "+attackPosition[5][6]+" | "+attackPosition[5][7]+" | "+attackPosition[5][8]+" | "+attackPosition[5][9]+" |\n");
        System.out.print("    |---|---|---|---|---|---|---|---|---|---|                     |---|---|---|---|---|---|---|---|---|---|\n");
        System.out.print("  7 | "+position[6][0]+" | "+position[6][1]+" | "+position[6][2]+" | "+position[6][3]+" | "+position[6][4]+" | "+position[6][5]+" | "+position[6][6]+" | "+position[6][7]+" | "+position[6][8]+" | "+position[6][9]+" |                   7 | "+attackPosition[6][0]+" | "+attackPosition[6][1]+" | "+attackPosition[6][2]+" | "+attackPosition[6][3]+" | "+attackPosition[6][4]+" | "+attackPosition[6][5]+" | "+attackPosition[6][6]+" | "+attackPosition[6][7]+" | "+attackPosition[6][8]+" | "+attackPosition[6][9]+" |\n");
        System.out.print("    |---|---|---|---|---|---|---|---|---|---|                     |---|---|---|---|---|---|---|---|---|---|\n");
        System.out.print("  8 | "+position[7][0]+" | "+position[7][1]+" | "+position[7][2]+" | "+position[7][3]+" | "+position[7][4]+" | "+position[7][5]+" | "+position[7][6]+" | "+position[7][7]+" | "+position[7][8]+" | "+position[7][9]+" |                   8 | "+attackPosition[7][0]+" | "+attackPosition[7][1]+" | "+attackPosition[7][2]+" | "+attackPosition[7][3]+" | "+attackPosition[7][4]+" | "+attackPosition[7][5]+" | "+attackPosition[7][6]+" | "+attackPosition[7][7]+" | "+attackPosition[7][8]+" | "+attackPosition[7][9]+" |\n");
        System.out.print("    |---|---|---|---|---|---|---|---|---|---|                     |---|---|---|---|---|---|---|---|---|---|\n");
        System.out.print("  9 | "+position[8][0]+" | "+position[8][1]+" | "+position[8][2]+" | "+position[8][3]+" | "+position[8][4]+" | "+position[8][5]+" | "+position[8][6]+" | "+position[8][7]+" | "+position[8][8]+" | "+position[8][9]+" |                   9 | "+attackPosition[8][0]+" | "+attackPosition[8][1]+" | "+attackPosition[8][2]+" | "+attackPosition[8][3]+" | "+attackPosition[8][4]+" | "+attackPosition[8][5]+" | "+attackPosition[8][6]+" | "+attackPosition[8][7]+" | "+attackPosition[8][8]+" | "+attackPosition[8][9]+" |\n");
        System.out.print("    |---|---|---|---|---|---|---|---|---|---|                     |---|---|---|---|---|---|---|---|---|---|\n");
        System.out.print(" 10 | "+position[9][0]+" | "+position[9][1]+" | "+position[9][2]+" | "+position[9][3]+" | "+position[9][4]+" | "+position[9][5]+" | "+position[9][6]+" | "+position[9][7]+" | "+position[9][8]+" | "+position[9][9]+" |                  10 | "+attackPosition[9][0]+" | "+attackPosition[9][1]+" | "+attackPosition[9][2]+" | "+attackPosition[9][3]+" | "+attackPosition[9][4]+" | "+attackPosition[9][5]+" | "+attackPosition[9][6]+" | "+attackPosition[9][7]+" | "+attackPosition[9][8]+" | "+attackPosition[9][9]+" |\n");
        System.out.print("    |---|---|---|---|---|---|---|---|---|---|                     |---|---|---|---|---|---|---|---|---|---|\n");
        System.out.println();
    }
}
