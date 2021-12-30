package com.company;

public class Board {//board is 2d array
    static char [] [] board= {{' ','|', ' ', '|', ' '},
            {'-', '+', '-', '+', '-'},
            {' ','|', ' ', '|', ' '},
            {'-', '+', '-', '+', '-'},
            {' ','|', ' ', '|', ' '}};
    public static void PrintBoard(){
        for (char[] row:board){
            System.out.println(row);
        }
    }
}
