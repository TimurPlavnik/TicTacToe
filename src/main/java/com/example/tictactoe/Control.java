package com.example.tictactoe;

public class Control {
    static Board board=new Board();
    static Player player=new Player();
    static int on=1;
    public static int placeChecker(String [] [] board, int row, int column){
        if (board[row][column]!=" "){
            System.out.println("Press another button!");
            int check=0;
            return check;
        }else{
            int check=1;
            return check;
        }
    }

    public static void placing(String [] [] board, String symb, int row, int column){//Method that places a symbol of a current active player into free cell
        board[row][column]=symb;
    }
    public static void winCheck(String[][] board, String symb){//Method that checks if winning condition is met
        if (((board[0][0]==board[1][0]&&board[0][0]==board[2][0])&&(board[0][0]=="x"||board[0][0]=="o"))||
                ((board[0][1]==board[1][1]&&board[0][1]==board[2][1])&&(board[0][1]=="x"||board[0][1]=="o"))||
                ((board[0][2]==board[1][2]&&board[0][2]==board[2][2])&&(board[0][2]=="x"||board[0][2]=="o"))||
                ((board[0][0]==board[0][1]&&board[0][0]==board[0][2])&&(board[0][0]=="x"||board[0][0]=="o"))||
                ((board[1][0]==board[1][1]&&board[1][0]==board[1][2])&&(board[1][0]=="x"||board[1][0]=="o"))||
                ((board[2][0]==board[2][1]&&board[2][0]==board[2][2])&&(board[2][0]=="x"||board[2][0]=="o"))||
                ((board[0][0]==board[1][1]&&board[0][0]==board[2][2])&&(board[0][0]=="x"||board[0][0]=="o"))||
                ((board[0][2]==board[1][1]&&board[0][2]==board[2][0])&&(board[0][2]=="x"||board[0][2]=="o"))){

            on=0;
        }else if (Player.turn==9){

            on=2;
        }else{
            on=1;
        }
    }
}
