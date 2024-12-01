package org.example;

public class Main {
    public static void main(String[] args) {

        TicTacToeGame game=new TicTacToeGame();
        String result=game.startGame();
        if(result.equalsIgnoreCase("tie")){
            System.out.println("Match is tied!!! No Result");
        }else{
            System.out.println("Winner is : "+result);
        }
    }
}