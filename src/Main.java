public class Main {
    public static void main(String[] args) {
        String[][] board = new String[10][10];
        for(int i = 0; i < board.length; i++){
            for(int f = 0; f < board[i].length; f++){
                board[i][f] = " ";
            }
        }

        Board.printAllBoards(board, board);
        Board.printPlayerBoard(board);
        Board.printTacticalBoard(board);
    }
}