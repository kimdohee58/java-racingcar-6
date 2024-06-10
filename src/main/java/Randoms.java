import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Randoms {
    private static final Random defaultRandom = ThreadLocalRandom.current();

    private Randoms(){

    }

    private static void validateRange(final int startInclusive, final int endInclusive){
        if(startInclusive > endInclusive){
            try {
                throw new IllegalAccessException("startInclusive cannot bo greater than endInclusive");
            } catch (IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }
        if(endInclusive == Integer.MAX_VALUE){
            try {
                throw new IllegalAccessException("endInclusice cannot be greater than Integer.MAX_VALUE.");
            } catch (IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }
        if(endInclusive-startInclusive>=Integer.MAX_VALUE){
            try {
                throw new IllegalAccessException("the input range is too large.");
            } catch (IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public static int pickNumberInRange(final int startInclusive, final int endInclusive){
        validateRange(startInclusive, endInclusive);
        return startInclusive + defaultRandom.nextInt(endInclusive-startInclusive+1);
    }
}