package java8;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotEquals;


public class RandomGeneratorTest {

    RandomGenerator randomGenerator;

    @BeforeEach
    void setup() {
        randomGenerator = new RandomGenerator();
    }

    @Test
    @DisplayName("Check if number is random")
    void generate_IfTwoNumbersAreNotTheSame(){
        int numberOne = randomGenerator.generate(1000);
        int numberTwo = randomGenerator.generate(1000);
        assertNotEquals(numberOne, numberTwo);
    }

}
