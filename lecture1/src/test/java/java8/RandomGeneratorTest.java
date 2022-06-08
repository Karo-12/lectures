package java8;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;


public class RandomGeneratorTest {

    RandomGenerator randomGenerator;

    @BeforeEach
    void setup() {
        randomGenerator = new RandomGenerator();
    }

    @Test
    @DisplayName("Check if number is random")
    void generate_IfNumbersAreGeneratedRandomly_ResultIsPositive() {
        final int maxValue = 500;
        int [] randomArray = new int[maxValue];
        for(int i = 0; i < maxValue ; i++){
            randomArray[i] = randomGenerator.generate(maxValue);
        }
        int counterSame = 0;
        int counterDifference = 0;
        int difference = 0;
        for(int i = 0; i < maxValue-1; i++) {
            if(randomArray[i] == randomArray[i+1]) counterSame++;
            if(difference == Math.abs(randomArray[i] - randomArray[i+1])) counterDifference++;
            difference = Math.abs(randomArray[i] - randomArray[i+1]);
        }
        assertTrue(counterSame <(maxValue*0.01));
        assertTrue(counterDifference < (maxValue*0.01));
    }
}
