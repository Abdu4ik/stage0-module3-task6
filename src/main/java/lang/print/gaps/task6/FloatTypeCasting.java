package lang.print.gaps.task6;

public class FloatTypeCasting {
    public void roundNumber(float numberToBeRounded) {

        float lastBit = numberToBeRounded - ((int) numberToBeRounded);
        
        if (lastBit < 0.5){

            System.out.println((int) numberToBeRounded);
            
        }else{

            System.out.println(((int) numberToBeRounded) + 1);
            
        }

    }
}
