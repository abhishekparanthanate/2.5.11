import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.lang.reflect.Array; 

public class Expert extends Player{
    Random rand = new Random();
    private int score = 0;

    public Expert(){

    }

    public int returnScore(){
        return score;
    }

    public int takeSticks(int totalSticks){
        List<Integer> magicNums = Arrays.asList(1, 3, 7, 15);
        int sticksLeft = 0;
        
        for (int loseSticks : magicNums){
            if (totalSticks == loseSticks){
                sticksLeft = rand.nextInt(totalSticks/2) + 1;
                if (sticksLeft == 0){
                    sticksLeft++;
                }
            }
        }

        for (int index = 0; index < magicNums.size()-1; index++){
            try {
                if ((totalSticks >= Array.getInt(magicNums, index)) && (totalSticks <= Array.getInt(magicNums, index + 1))){
                sticksLeft = Array.getInt(magicNums, index);
                }
            }

            catch (Exception e){
                sticksLeft = 15;
            }
        }

        return sticksLeft;
    }


}
