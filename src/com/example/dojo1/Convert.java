package com.example.dojo1;

import java.security.InvalidParameterException;

public class Convert {
    public int binaryToDecimal(String binary) throws InvalidParameterException {
        int result = 0;
        for (Character digit : binary.toCharArray()) {
            if (!digit.equals('0') && !digit.equals('1')) {
                throw new InvalidParameterException(
                        "parameter is not a binary number");
            }
            result = result * 2 + (digit == '1' ? 1 : 0);
        }
        return result;
    }
}
