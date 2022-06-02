package stacktest;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import stack.Validator;

public class ValidatorTest {

    @Test
    @Order(1)
    void test_validator_canValidateBrackets1() {

        // Arrange
        String expression = "(3+{5{99{*}}[23[{67}67]]})";
        Validator validator = new Validator();

        // Act & Assert
        assertTrue(validator.validateBrackets(expression));
    }

    @Test
    @Order(2)
    void test_validator_canValidateBrackets2() {

        // Arrange
        String expression = "(}){)))";
        Validator validator = new Validator();

        // Act & Assert
        assertFalse(validator.validateBrackets(expression));
    }
}
