
import kareltherobot.*; 


/**
 * @author :  D. Appel
 */
public class Problem1 extends Robot
{
    public Problem1(int st, int av, Direction dir, int numBeepers) {
        super(st, av, dir, numBeepers);
    }
    
    int[] columns = new int [7];
    public int beepers;
    
    public void sortBeepers() {
        move();
        turnLeft();
        checkBeepersInRow();
        recordRowNmbers();
        collectBeepers();
        layDownBeepersOrder();
    }
    
    public void checkBeepersInRow(){
        
    }
   
    public void turnRight() {
        turnLeft();
        turnLeft();
        turnLeft();
    }
    
    public void localVariable() {
        int beepers = 4;
        
        while (beepers > 0) {
             move();
             beepers--;
        }

    }
}

