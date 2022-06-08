package java8;

import java.util.Random;


//TODO
//Write unit-tests for this class
//that check its functionality and especially that the class returns random values
public class RandomGenerator {

    private int counter = 0;
    private final Random random = new Random();

    public int generate(int max) {
        //if(counter <= max) counter++;
        //return counter;
        return random.nextInt(max);
    }
}
