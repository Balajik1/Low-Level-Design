package Components;

import java.util.concurrent.ThreadLocalRandom;

public class Board {
    Cell[][] cells;
    public Board(int boardSize,int numberOfLadders,int numberOfSnakes){
        initializeCells(boardSize);
        addLadderAndSnakes(numberOfLadders,numberOfSnakes);
    }
    public void initializeCells(int boardSize){
        cells=new Cell[boardSize][boardSize];
        // initialize board
        for(int i=0;i<boardSize;i++){
            for(int j=0;j<boardSize;j++){
                cells[i][j]=new Cell();
            }
        }
    }
    private void addLadderAndSnakes(int numberOfLadders,int numberOfSnakes){
        System.out.println("snake count: "+numberOfSnakes);
        while(numberOfSnakes > 0){
            int snakeHead= ThreadLocalRandom.current().nextInt(1,cells.length*cells.length-1);
            int snakeTail=ThreadLocalRandom.current().nextInt(1,cells.length* cells.length-1);
            if(snakeTail >= snakeHead){
                continue;
            }

            Jump snakeObj=new Jump(snakeHead,snakeTail);
            Cell cell=getCell(snakeHead);
             cell.jump=snakeObj;
            System.out.println("snake defined at : start "+cell.jump.start+" end : "+cell.jump.end);
            numberOfSnakes--;
        }

        while(numberOfLadders > 0){
            int ladderHead= ThreadLocalRandom.current().nextInt(1,cells.length*cells.length-1);
            int ladderTail=ThreadLocalRandom.current().nextInt(1,cells.length* cells.length-1);
            if(ladderHead >= ladderTail){
                continue;
            }
            Jump ladderObj=new Jump(ladderHead,ladderTail);
            Cell cell = getCell(ladderHead);
            cell.jump=ladderObj;
            numberOfLadders--;
        }
    }
    public Cell getCell(int position){
        int row=position/cells.length;
        int col=position%cells.length;
        return cells[row][col];
    }
}
