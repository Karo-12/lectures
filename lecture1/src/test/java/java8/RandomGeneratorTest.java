package java8;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

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
        int countSameNumbers = 0;
        int countDifference = 0;
        int previousDifference = 0;
        int previousNumber = 0;
        int countSumPreviousNumbers=0;
        int [] randomArray = new int[maxValue];
        for(int i = 0; i < maxValue ; i++){
            randomArray[i] = randomGenerator.generate(maxValue);
        }
        for(int i = 0; i < maxValue-1; i++) {
            int difference = Math.abs(randomArray[i] - randomArray[i+1]);
            if(randomArray[i] == randomArray[i+1]) countSameNumbers++;
            else if(previousDifference == difference) countDifference++;
            else if(previousNumber + randomArray[i] == randomArray[i+1]) countSumPreviousNumbers++;
            previousDifference = difference;
            previousNumber = randomArray[i];
        }
        assertTrue(countSameNumbers <(maxValue*0.01));
        assertTrue(countDifference < (maxValue*0.01));
        assertTrue(countSumPreviousNumbers < (maxValue*0.01));
    }
}
