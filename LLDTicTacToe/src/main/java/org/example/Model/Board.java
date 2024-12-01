package org.example.Model;

import java.util.ArrayList;
import java.util.List;

public class Board {
    public int size;
    public PlayerPiece[][] board;
    public Board(int size){
        this.size=size;
        board=new PlayerPiece[size][size];
    }
    public void printBoard(){
        for(int i=0;i<size;i++){
            System.out.print("|");
            for(int j=0;j<size;j++){
                System.out.printf("%s |",board[i][j]!=null ? board[i][j].pieceType : " ");
            }
            System.out.println();
        }
    }
    public List<Pair> getFreeCells() {
        List<Pair> list = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if(board[i][j] == null) {
                    list.add(new Pair(i,j));
                }
            }
        }
        return list;
    }
    // add the piece if its not present already
    // !=null means peace is there
    public boolean addPiece(int row,int col,PlayerPiece playerPiece){
        if(board[row][col] !=null ){
            return false;
        }
        //otherwise add the piece at the location
        board[row][col]=playerPiece;
        return true;
    }

}
