package org.example._2024_02_19;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class ComplexOperationsServiceTest {

    private final ComplexOperationsService service = new ComplexOperationsService();


    @ParameterizedTest
    @ValueSource(strings = {"strongPassword1@", "ABCde1234*", "JAVAPro123+"})
    void validatePasswordStrengthTest(String password) {
        Assertions.assertTrue(service.validatePasswordStrength(password));
    }

    @ParameterizedTest
    @ValueSource(strings = {"weak", "noDigit!", "NoSpecialChar1"})
    void validatePasswordStrengthTestTwo(String password) {
        Assertions.assertThrows(IllegalArgumentException.class, () ->
                service.validatePasswordStrength(password));
    }

    /* @ParameterizedTest
     @ValueSource(strings = {"This text contains error", "fail is not good", "wrong way"})
     void processTextTestTwo(String text) {
         if (text.contains("error") || text.contains("fail") || text.contains("wrong")) {
             assertThrows(IllegalArgumentException.class, () -> service.processText(text));
         } else {
             Assertions.assertThrows(IllegalArgumentException.class, () -> service.processText(text));
         }
     } */
    @ParameterizedTest
    @ValueSource (strings = {"Database", "Java Virtual Machine", "Java Development Kit"})
    void processTextTest (String text) {
        Assertions.assertFalse(service.processText(text));
    }

    @ParameterizedTest
    @ValueSource (strings = {"This text contains error", "fail is not good", "wrong way"})
    void processTextTestTwo (String text) {
        Assertions.assertThrows(IllegalArgumentException.class, ()->service.processText(text));
    }


}

