package com.company;

import java.util.Scanner;

public class Control {
    public static int PlaceReader(){//Method that reades input concerning a position of a new symbol
        Scanner scanner=new Scanner(System.in);
        int j=scanner.nextInt();
        if (j==4||j==2||j==0){
            return j;
        }else{
            System.out.println("Pick number:0,2,4");
            int i=PlaceReader();
            return i;
        }
    }
    public static void placing(char [] [] board, char symb){//Method that places a symbol of a current active player into free cell
        System.out.println("Select a row:0,2,4");
        int row=PlaceReader();
        System.out.println("Select a column:0,2,4");
        int column=PlaceReader();
        if (board[row][column]==' '){
            board[row][column]=symb;
        }else{
            System.out.println("Pick another cell");
            placing(board, symb);
        }
    }
    public static int winCheck(char [] [] board,  char symb){//Method that checks if winning condition is met
        if (((board[0][0]==board[2][0]&&board[0][0]==board[4][0])&&(board[0][0]=='x'||board[0][0]=='o'))||
                ((board[0][2]==board[2][2]&&board[0][2]==board[4][2])&&(board[0][2]=='x'||board[0][2]=='o'))||
                ((board[0][4]==board[2][4]&&board[0][4]==board[4][4])&&(board[0][4]=='x'||board[0][4]=='o'))||
                ((board[0][0]==board[0][2]&&board[0][0]==board[0][4])&&(board[0][0]=='x'||board[0][0]=='o'))||
                ((board[2][0]==board[2][2]&&board[2][0]==board[2][4])&&(board[2][0]=='x'||board[2][0]=='o'))||
                ((board[4][0]==board[4][2]&&board[4][0]==board[4][4])&&(board[4][0]=='x'||board[4][0]=='o'))||
                ((board[0][0]==board[2][2]&&board[0][0]==board[4][4])&&(board[0][0]=='x'||board[0][0]=='o'))||
                ((board[0][4]==board[2][2]&&board[0][4]==board[4][0])&&(board[0][4]=='x'||board[0][4]=='o'))){
            System.out.println(symb+" wins!");
            return 0;
        }else{
            return 1;
        }
    }
}
