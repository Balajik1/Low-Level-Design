package org.example;

import org.example.Model.*;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;


public class TicTacToeGame {
    //To Start the game we need new board and player
    //Game has a board and player
    Deque<Player> players;
    Board gameBoard;
    public TicTacToeGame(){
        initializeGame();
    }
    public void initializeGame(){
        //initialize Players for the game and add to the Deque
        players=new LinkedList<>();
        PlayerPiece crossPiece=new PlayerPieceX();
        Player player1=new Player("Player1",crossPiece);
        players.add(player1);
        PlayerPiece noughtsPiece=new PlayerPieceO();
        Player player2=new Player("Player2",noughtsPiece);
        players.add(player2);

        // initialize the board
        gameBoard=new Board(3);
    }
    public String startGame(){
        System.out.println("=== TicTacToe Game is started ===");
        boolean noWinner=false;
        while(!noWinner){
            // get the current player for Queue out for its turn
            Player playerTurn=players.removeFirst();

            //Each time printing the board to get view of Board
            gameBoard.printBoard();
            //get the free space from the Board
            List<Pair> freeSpaces=gameBoard.getFreeCells();
            //it there is no empty space in board
            //we break the loop
            if(freeSpaces.isEmpty()){
                noWinner=true;
                continue;
            }
            // read the user input
            System.out.println("Player : "+playerTurn.name+" Enter row,column: ");
            Scanner sc=new Scanner(System.in);
            String s=sc.nextLine();
            String[] values=s.trim().split(",");
            int inputRow=Integer.valueOf(values[0]);
            int inputCol=Integer.valueOf(values[1]);

            boolean pieceAddedSuccessfully= gameBoard.addPiece(inputRow,inputCol,playerTurn.playerPiece);

            if(!pieceAddedSuccessfully){
                //player cannot at the place where one of the player already placed value
                //need to reselect position
                System.out.println("Incorrect position Entered, try again!");
                players.addFirst(playerTurn);
                continue;
            }
            players.addLast(playerTurn);
            boolean winner=isThereIsWinner(inputRow,inputCol,playerTurn.playerPiece.pieceType);
            if(winner){
                return playerTurn.name;
            }
        }
        return "tie";
    }
    private boolean isThereIsWinner(int row, int col, PieceType pieceType ){
        boolean rowMatch=true;
        boolean colMatch=true;
        boolean diagonalMatch=true;
        boolean antiDiagonalMatch=true;

        // need to check in row
        for(int i=0;i<gameBoard.size;i++){
            // current player is not winner in row if its null or filled by other player
            if(gameBoard.board[row][i] ==null || gameBoard.board[row][i].pieceType !=pieceType) {
                rowMatch = false;
                break;
            }
        }

        // need to check in column
        for(int i=0;i<gameBoard.size;i++){
            // current player is not winner in row if its null or filled by other player
            if(gameBoard.board[i][col] ==null || gameBoard.board[i][col].pieceType !=pieceType) {
                colMatch = false;
                break;
            }
        }

        // need to check in diagonal
        for(int i=0;i<gameBoard.size;i++){
            //current is not winner if its null or filled by other player
            if(gameBoard.board[i][i] ==null || gameBoard.board[i][i].pieceType != pieceType) {
                diagonalMatch = false;
                break;
            }
        }

        // need to check in anti-diagoal
        for(int i=0,j= gameBoard.size-1;i<gameBoard.size && j>=0;i++,j--){
            //current is not winner if its null or filled by other player
            if(gameBoard.board[i][j] ==null || gameBoard.board[i][j].pieceType != pieceType) {
                antiDiagonalMatch = false;
                break;
            }
        }

        return  rowMatch || colMatch || diagonalMatch || antiDiagonalMatch;

    }

}
