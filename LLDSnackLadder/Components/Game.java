package Components;

import java.util.ArrayDeque;
import java.util.Deque;

public class Game {
    Deque<Player> playersList=new ArrayDeque<>();;
    Board board;
    Diece diece;
    Player winner;
    public Game(){
        initializeGame();
    }
    private void initializeGame(){
        board=new Board(10,5,4);
        diece=new Diece(1);
        winner=null;
        addPlayers();
    }
    private void addPlayers(){
        Player p1=new Player(1);
        Player p2=new Player(2);
        playersList.add(p1);
        playersList.add(p2);
    }
    public void startGame(){
        while(winner == null){
            Player playerTurn= findPlayerTurn();
            System.out.println("Player turn is : "+playerTurn.id+" player Position : "+playerTurn.currentPosition);

            //roll the deice
            int deiceNumbers=diece.rollDeice();
            System.out.println(" deice number :"+deiceNumbers);
            //get new position
            int playerNewPosition= playerTurn.currentPosition+deiceNumbers;
            playerNewPosition=jumpCheck(playerNewPosition);
            System.out.println("Player turn is : "+playerTurn.id+" Player New Position : "+playerNewPosition);
            playerTurn.currentPosition=playerNewPosition;
            //check winning condition
            if(playerNewPosition >= board.cells.length*board.cells.length -1){
                winner=playerTurn;
            }
        }
        System.out.println("winner is : "+winner.id);
    }
    public Player findPlayerTurn(){
        System.out.println("players : "+playersList);
        Player playerTurn=playersList.removeFirst();
        playersList.addLast(playerTurn);
        return  playerTurn;
    }
    private int jumpCheck(int playerPosition){
        if(playerPosition > board.cells.length*board.cells.length-1){
            return playerPosition;
        }
        Cell cell=board.getCell(playerPosition);
        if(cell.jump!=null){
            System.out.println("current position : "+cell.jump.start);
            System.out.println(" cell "+playerPosition+" has jump as "+cell.jump.end);
        }
        if(cell.jump!=null && cell.jump.start==playerPosition){
            String jumpBy=cell.jump.start > cell.jump.end ? "Snake" : "Ladder";
            System.out.println("jump done by : "+jumpBy);
            return cell.jump.end;
        }
        return playerPosition;
    }
}
