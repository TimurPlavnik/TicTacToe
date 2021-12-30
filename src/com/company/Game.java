package com.company;

public class Game {
    public static void StartGame(){
        Board board=new Board();
        Control ControlUnit=new Control();
        board.PrintBoard();
        int on=1;//Variable that is used to finish the game when winning condition is met
        char symb;
        Player player=new Player();
        while (on==1){
            player.symbolChecker();
            ControlUnit.placing(board.board, player.symb);
            board.PrintBoard();
            on=ControlUnit.winCheck(board.board, player.symb);
        }
    }
}
