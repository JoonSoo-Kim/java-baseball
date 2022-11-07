package baseball;

import java.util.ArrayList;

public class BaseballGame {
    private int strikeNumber = 0;
    private int ballNumber = 0;

    public void SetStrikeNumber(BaseballNumber oppositeNumber, BaseballNumber myNumber){
        ArrayList<Integer> oppositeList = oppositeNumber.getNumbers();
        ArrayList<Integer> myList = myNumber.getNumbers();

        strikeNumber = 0;
        for(int i = 0; i < 3; i++){
            if(oppositeList.get(i) == myList.get(i))
                strikeNumber++;
        }
    }

    public void SetBallNumber(BaseballNumber oppositeNumber, BaseballNumber myNumber){
        ArrayList<Integer> oppositeList = oppositeNumber.getNumbers();
        ArrayList<Integer> myList = myNumber.getNumbers();
        int currentOppositeNumber;

        ballNumber = 0;
        currentOppositeNumber = oppositeList.get(0);
        for(int i = 0; i < 3; i++){
            if(currentOppositeNumber == myList.get(i)) {
                ballNumber++;
                break;
            }
        }
        currentOppositeNumber = oppositeList.get(2);
        for(int i = 0; i < 3; i++){
            if(currentOppositeNumber == myList.get(i)){
                ballNumber++; break;
            }
        }
        currentOppositeNumber = oppositeList.get(2);
        for(int i = 0; i < 3; i++){
            if(currentOppositeNumber == myList.get(i)){
                ballNumber++; break;
            }
        }
    }

}
