package com.example.tictactoe;


public class Player {
    static int turn=0;//Variable that shows which player is active
    static String symb;//Variable that stores symbol of the active player
    static void symbolChecker(){//Method that changes players and their symbols between turns accordingly
        if (turn%2==0){
            symb="x";
            turn+=1;
        }else{
            symb="o";
            turn+=1;
        }
    }
}