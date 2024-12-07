package Components;

import java.util.concurrent.ThreadLocalRandom;

public class Diece {
    public  int dieceCount;
    int min=1;
    int max=6;
    public  Diece(int ct){
        dieceCount=ct;
    }
    public int rollDeice(){
        int sum=0;
        for(int i=0;i<dieceCount;i++){
            sum+= ThreadLocalRandom.current().nextInt(min,max+1);
        }
        return sum;
    }
}
